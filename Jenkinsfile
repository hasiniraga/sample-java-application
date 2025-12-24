pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                deleteDir()
                git branch: 'main',
                    url: 'https://github.com/hasiniraga/sample-java-application.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully 🎉'
        }
        failure {
            echo 'Pipeline failed ❌'
        }
    }
}
