pipeline {
    agent any
    stages {
        stage('clean') {
            steps {
                echo "Maven Clean Started"
                bat 'mvn -B clean verify'
                echo "Maven Clean Completed"
            }
        }
stage ('test'){
steps{
    echo "Maven Test Started"
    bat 'mvn -B test verify'
    echo "Maven test Completed"
    }
  }
        stage ('build'){
        steps{
            echo "Maven package Started"
                bat 'mvn -B package verify'
           echo "Maven package Completed"
            
            }

 }
}
}
