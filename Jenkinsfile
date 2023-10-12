pipeline {
     agent any
     environment {
        DOCKERHUB_CREDENTIALS = credentials('docker-hub')
     }
     parameters {
         string(name: 'imageName', defaultValue: 'oyashiz/shibaqueue-mail', description: 'Docker image name')
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
                              sh 'docker image rm ${imageName} -f'
                              sh 'docker build -t ${imageName} .'
                         }
                    }
          stage('Docker Login') {
            steps {
                sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
            }
          }
          stage('Docker Push') {
                      steps {
                          sh 'docker push ${imageName}'
                          sh 'docker image rm ${imageName} -f'
                      }
          }
     }
     post {
        always {
            sh 'docker logout'
        }
     }
}
