pipeline {
    agent any

    tools {
        jdk 'JDK-11'
        maven 'Maven-3.9'
    }

    stages {
        stage('Build Java App') {
            steps {
                echo 'Building Java application from GitHub'
                bat 'mvn clean package'
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
