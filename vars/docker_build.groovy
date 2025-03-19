def call(String DockerHubUser, String imageName, String imageTag){
  
  timeout(time: 20, unit: 'MINUTES') {
    sh "docker build -t ${DockerHubUser}/${name}:${tag} ."
  }

  echo 'Docker image built successfully'
}
