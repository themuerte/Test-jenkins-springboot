pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code here (e.g., from Git)
                // Replace with your repository URL and checkout commands
                echo 'Checking out code...'
            }
        }
        stage('Build') {
            agent {
                docker {
                    // Use a Docker image with Java and Maven pre-installed
                    image 'gradle:8.2.0-jdk17-alpine'

                    // You can specify any other Docker-related configuration here

                }
            }
            steps {
                echo 'Building....'
                sh 'java --version'
                sh 'gradle build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing....'
                // Add test commands here
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'java --version'
                sh 'java -jar build/libs/test-jenkis-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
