pipeline {
    agent any
    triggers { pollSCM('* * * * *') }
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
        stage('test results') {
            steps {
               junit testResults: '**/surefire-reports/*.xml'
        }
            }
        stage('archive artifacts') {
            steps {
                archiveArtifacts '**/target/*.jar'
            }
        }   
            
        }
    }
