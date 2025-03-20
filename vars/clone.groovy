def call(String jenkinsGithubCredID, String url, String branch){
  withCredentials([usernamePassword(credentialsId: jenkinsGithubCredID, passwordVariable: 'GIT_PASSWORD', usernameVariable: 'GIT_USERNAME')]) {
      git credentialsId: jenkinsGithubCredID, url: url, branch: branch
  }
  echo 'Code cloning successful'
}
