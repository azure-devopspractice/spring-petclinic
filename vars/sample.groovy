def call () {
    pipeline {
    agent any
    stages{
        stage('git') {
            steps {
                git branch: 'develop', 
                url: 'git@github.com:azure-devopspractice/spring-petclinic.git'
            }
        }
        stage('build')  {
            steps {
                sh 'mvn package'
            }
        }
   }
}
        
            
        