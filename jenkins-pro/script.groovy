def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t abbywang678/my-app:2.0 home/abby/my-app/docker-pro/'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push abbywang678/my-app:2.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this