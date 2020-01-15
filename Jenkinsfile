pipeline {

 agent any 
 
 environment{
 	PATH = "/opt/maven/apache-maven-3.6.3/bin;$PATH"
 }
 
 stages{
 
  stage('Maven Code Build') { 
  	
  	steps {
       	sh 'mvn clean package'
     }
  	
  }
 
 
 
 
 }
}
