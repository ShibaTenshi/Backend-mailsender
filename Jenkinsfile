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
                    sh 'docker build -t oyashiz/shibaqueue-mail .'
               }
          }
     }
}
