pipeline {
    agent any 
    stages {
        stage('Maven Code Build') { 
            steps {
                withMaven(maven: 'maven')
                {
                	sh 'mvn clean compile'
            }
        }
        stage('Docker Image Build') { 
            steps {
                // 
            }
        }
        stage('Deploy Image') { 
            steps {
                // 
            }
        }
    }
}