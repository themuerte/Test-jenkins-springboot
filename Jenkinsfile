pipeline {
    agent any
    stages {
        stage('Build') {
            agent {
                docker {
                    image 'gradle:8.2.0-jdk17-alpine'
                    // Run the container on the node specified at the
                    // top-level of the Pipeline, in the same workspace,
                    // rather than on a new node entirely:
                    echo 'Building....'
                    sh 'gradle build'
                    reuseNode true
                }
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'java -jar build/libs/test-jenkis-0.0.1-SNAPSHOT.jar'
            }
       }
    }
}