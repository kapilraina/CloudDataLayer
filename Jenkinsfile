pipeline {

 agent any 
 

 
 stages{
 
  stage('Maven Code Build') { 
  	
  	steps {
       	sh "/opt/maven/apache-maven-3.6.3/bin/mvn clean package"
     }
  	
  }
  
  stage('Docker Image Build') { 
  	
  	steps {
       	sh "docker build -t kapilshekharraina/clouddatalayer:1.0.0"
     }
  	
  }
 
 
 
 
 }
}
