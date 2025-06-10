pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'Java 17'
    }

    environment {
        MAVEN_OPTS = "-Dmaven.test.failure.ignore=false"
    }

    stages {
        stage('Checkout Code') {
            steps {
            git branch: 'main',
                url: 'https://github.com/jadidimane/Expediation.git'
            }
        }
        stage('Build') {
                    steps {
                        bat 'mvn clean install'
                    }
                }
        stage('Test') {
            steps {
                bat 'mvn test'
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
