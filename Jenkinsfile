pipeline {

 agent any 
 

 
 stages{
 
  stage('Maven Code Build') { 
  	
  	steps {
       	sh "mvn clean package"
     }
  	
  }
  
  stage('Docker Image Build') { 
  	
  	steps {
       	sh "docker build -t kapilshekharraina/clouddatalayer:${env.BUILD_ID} ."
     }
  	
  }
 
 
 
 
 }
}
