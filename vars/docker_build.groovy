def call(String name, String tag){
  sh "docker build -t ${name}:${tag} ."
  echo 'Docker image built successfully'
}
