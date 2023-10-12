pipeline {
     agent any
     environment {
        DOCKERHUB_CREDENTIALS = credentials('docker-hub')
     }
     stages {
          stage('Mvn Build') {
               steps {
                    sh 'mvn clean'
                    sh 'mvn package -DskipTests'
               }
          }
          stage('Docker Build') {
                         steps {
                              sh 'docker image rm oyashiz/shibaqueue-mail -f'
                              sh 'docker build -t oyashiz/shibaqueue-mail .'
                         }
                    }
          stage('Docker Login') {
            steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
          }
          stage('Docker Push') {
                      steps {
                          sh 'docker push oyashiz/shibaqueue-mail'
                      }
          }
     }
     post {
        always {
            sh 'docker logout'
        }
     }
}
