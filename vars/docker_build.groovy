def call(String DockerHubUser, String ImageName, String ImageTag){
  
  timeout(time: 20, unit: 'MINUTES') {
    sh "docker build -t ${DockerHubUser}/${ImageName}:${ImageTag} ."
  }

  echo 'Docker image built successfully'
}
