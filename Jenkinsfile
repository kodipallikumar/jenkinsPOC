pipeline {
    agent any
    stages {
        stage('clean') {
            steps {
                echo "Clean"
            }
        }
stage ('test'){
steps{
    echo "test"
    }
  }
        stage ('build'){
        steps{
            echo "build"
            bat 'mvn -B clean verify'
            }

 }
}
}
