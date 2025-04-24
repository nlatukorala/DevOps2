pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                 sh 'python3 HelloWorld.py'
                 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'python3 test_calculator.py'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
