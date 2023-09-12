pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh './gradlew build'
                echo 'Build completed....'
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