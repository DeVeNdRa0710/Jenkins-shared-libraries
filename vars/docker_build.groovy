def call(String DockerHubUser, String ImageName, String ImageTag){
  
  timeout(time: 20, unit: 'MINUTES') {
    sh "docker buildx build --platform linux/amd64,linux/arm64 -t ${DockerHubUser}/${ImageName}:${ImageTag} --push ."
  }

  echo 'Docker image built successfully'
}
