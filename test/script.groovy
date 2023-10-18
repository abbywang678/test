def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t abbywang678/test:3.0 home/abby/my-app/test/'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push abbywang678/my-app:3.0'
    }
} 

def deployApp() {
    echo 'deploying the application...'
} 

return this