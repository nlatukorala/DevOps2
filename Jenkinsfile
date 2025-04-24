pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                 sh 'python3 HelloWorld.py'
                sh 'javac SimpleCalculatorTest.java'
                 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'python3 test_calculator.py'
                sh 'java SimpleCalculatorTest'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
