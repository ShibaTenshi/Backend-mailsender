pipeline {
     agent any
     stages {
          stage('Build') {
               steps {
                    sh 'mvn clean'
                    sh 'mvn package -DskipTests'
               }
          }
          stage('Deploy') {
               steps {
                    sh 'docker build -t oyashiz/shibaqueue-mail .'
               }
          }
     }
}
