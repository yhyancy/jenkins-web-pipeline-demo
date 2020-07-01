pipeline {
   agent any

   stages {
      stage('pull code') {
         steps {
           checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'e1c84be2-1b79-47d8-9e4f-c158c796fd0b', url: 'git@github.com:yhyancy/jenkins-web-pipeline-demo.git']]])
         }
      }
       stage('build project') {
         steps {
           bat label: '', script: 'mvn clean package'
         }
      }
       stage('publish  project') {
         steps {
           deploy adapters: [tomcat8(credentialsId: '7975c8db-e8a5-4574-828f-9796f777dd0b', path: '', url: 'http://localhost:8080/')], contextPath: null, war: 'target/*.war'
         }
      }
   }
}
