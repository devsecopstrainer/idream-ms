pipeline {
    agent any
    stages {
        stage('build') {
            steps { sh 'mvn clean package' }
        }
        stage('Unit Test') {
            steps { sh 'mvn test' }
        }
    }
}
