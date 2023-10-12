pipeline {
     agent {
          docker {
               image 'maven:3-amazoncorretto-17'
               args '-p 5041:5041'
          }
     }
     environment {
          HOME = '.'
     }
     stages {
          stage('Source') {
               steps {
                    git branch: 'main',
                        url: 'https://github.com/ShibaTenshi/Backend-mailsender'
               }
          }
          stage('Build') {
               steps {
                    sh 'mvn package -DskipTests'
               }
          }
          stage('Test') {
               steps {
                    sh 'testing...'
               }
          }
          stage('Deploy') {
               steps {
                    sh 'java -jar ./target/Backend-mailsender-0.0.1.jar'
               }
          }
     }
}
