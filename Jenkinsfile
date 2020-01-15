pipeline {

 agent any 
 stages{
 
  stage('Maven Code Build') { 
  	
  	steps {
       maven_invoker(maven: 'maven')
       {
       		sh 'mvn clean compile'
       }
     }
  	
  }
 
 
 
 
 }
}
