pipeline {
     agent {
          docker {
               image 'maven:3-amazoncorretto-17'
               args '-p 5041:5041'
          }
     }
     stages {
          stage('Build') {
               steps {
                    sh 'mvn package -DskipTests'
               }
          }
          stage('Test') {
               steps {
                    echo 'testing...'
               }
          }
          stage('Deploy') {
               steps {
                    sh 'java -jar ./target/Backend-mailsender-0.0.1.jar'
               }
          }
     }
}