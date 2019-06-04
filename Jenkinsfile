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
        stage ('package'){
steps{
    java -jar target/jenkinsPOC-0.0.1-SNAPSHOT.jar
    echo "packaged jar Successfully"
}

    }
}
}
