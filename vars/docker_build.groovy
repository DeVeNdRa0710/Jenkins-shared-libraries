def call(String name, String tag){
  
  timeout(time: 20, unit: 'MINUTES') {
    sh "docker build -t ${name}:${tag} ."
  }

  echo 'Docker image built successfully'
}
