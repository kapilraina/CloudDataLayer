pipeline {

 agent any 
 stages{
 
  stage('Maven Code Build') { 
  	
  	steps {
       maven(maven: 'maven')
       {
       		sh 'mvn clean compile'
       }
     }
  	
  }
 
 
 
 
 }
}
