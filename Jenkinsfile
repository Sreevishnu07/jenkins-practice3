pipeline{
  agent any
  stages{
    stage('1.Build from maven'){
      steps{
        bat 'mvn clean install'
      }
    }
    stage('2.Build docker image'){
      steps{
        bat 'docker build -t maven-jenkins-docker .'
      }
    }
    stage('3.Run containers'){
      steps{
        bat 'docker run --rm maven-jenkins-docker'
      }
    }
}
  post{
    success{
      echo 'Build and Docker run successful'
    }
    failure{
      emailext( 
        subject: "Build failed: ${env.JOB_NAME}",
        body: "Check logs: ${env.BUILD_URL}",
        to: "sreevishnu0407@gmail.com"
      )
    }
  }
}


