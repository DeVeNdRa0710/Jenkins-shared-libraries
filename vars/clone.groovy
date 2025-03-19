def code_clone(){
  echo 'Start the the cloning of code'
  sh 'whoami'
  git url: 'https://github.com/DeVeNdRa1910/django-notes-app.git', branch: 'main'
  echo 'Cloning of the code is successfull'
}
