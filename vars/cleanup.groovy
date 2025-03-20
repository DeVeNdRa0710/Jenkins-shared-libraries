def call(){
  sh 'docker system prune -a -f || true'
  sh 'docker builder prune -f || true'
  sh 'docker volume prune -f || true'
  sh 'docker network prune -f || true'
}
