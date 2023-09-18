pipeline {
    agent {
        docker { image 'gradle:8.2.0-jdk17-alpine' }
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building....'
                sh 'gradle build .'
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