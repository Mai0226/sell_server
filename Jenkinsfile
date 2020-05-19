pipeline {
   agent any
   stages {
       stage('Clean') {
         steps {

         }
      }
      stage('Pull') {
         steps {
            checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '232b4bfa-bda1-45aa-8bf7-e6815ee8334d', url: 'https://github.com/Mai0226/sell_server.git']]])
         }
      }
      stage('Deploy') {
         steps {

         }
      }
   }
}