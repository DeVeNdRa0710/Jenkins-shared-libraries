def call(String ImageName, String ImageTag){
  echo "start pushing Image on Docker Hub"
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred',passwordVariable: 'dockerHubPass',usernameVariable: 'dockerHubUser')]){
      sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
      sh "docker push ${dockerHubUser}/${ImageName}:${ImageTag}"
  }
  echo "Docker Image pushed on Dockerhub successfully"
}
