def call(String url, String branch){
  sh 'whoami'
  git url: url, branch: branch
  // git url : "${url}" , branch : "${branch}"
  echo 'Code cloning successful'
}
