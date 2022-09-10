pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/gyamanoNisum/DevOpsAssignment1.git'
                sh './mvnw clean compile'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
        stage('Jar') {
            steps {
                sh './mvnw package'
                sh 'ls target/test-classes/'
            }
        }
    }

}