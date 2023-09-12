pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'gradle clean build'
                echo 'Build completed....'
            }
        }`
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                sh 'gradle bootRun'
            }
        }
    }
}