pipeline {
    agent any
    stages {
        stage('build') {
            steps { sh 'mvn clean package' }
        }
        stage('Unit Test') {
            steps { sh 'mvn test' }
        }
        stage('Deploy in DEV') {
			when { branch 'dev' }
            steps { echo 'DEV deployment in progress' }
        }
        stage('Deploy in Prod') {
			when { branch 'main' }
            steps { echo 'PROD deployment in progress' }
        }
    }
}
