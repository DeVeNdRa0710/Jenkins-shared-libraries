def call(String url, String branch){
  git url: url, branch: branch
  // git url : "${url}" , branch : "${branch}"
  echo 'Code cloning successful'
}
