pipeline {
   agent any
   stages {
    stage('Checkout') {
      steps {
        script {
           // Do a ls -lart to view all the files are cloned. It will be clonned. This is just for you to be sure about it.
           sh "ls -lart ./*" 
           // List all branches in your repo. 
           sh "git branch -a"
          }
       }
    }
  }
}
