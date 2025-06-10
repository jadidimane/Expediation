pipeline {
    agent any

    tools {
        maven 'Maven 3.8.8'
        jdk 'Java 17'
    }

    environment {
        MAVEN_OPTS = "-Dmaven.test.failure.ignore=false"
    }

    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/jadidimane/Expediation.git'
            }
        }

        stage('Build and Run Tests') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Allure Report') {
            steps {
                allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
            }
        }

        stage('Publish JUnit Results') {
            steps {
                junit 'target/surefire-reports/*.xml'
            }
        }

        stage('Archive Cucumber HTML Report') {
            steps {
                archiveArtifacts artifacts: 'target/cucumber-report.html', fingerprint: true
            }
        }
    }

    post {
        always {
            echo "Pipeline finished. You can check the test results above."
        }
        failure {
            echo "something"
        }
    }
}
