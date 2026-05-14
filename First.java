print("Hello world") --->Sample.py
    
FROM python
WORKDIR /app
COPY . /app
CMD ["python","Sample.py]  -->dockerfile

python sample.py
docker build -t program .
docker run --name cont1 program
docker run --name cont2 program
docker images
docker image tag "   " monishavp25/program
docker push monishavp25/program:latest
--------------------------------------------------------------------------------------

cd "DevOps"
git clone "------"
cd DockerProgram
git add
git commit -m "Commit"
git push
docker build -t program .
docker run --name cont1 program
docker run --name cont2 program
docker images
docker image tag "   " monishavp25/program
docker push monishavp25/program:latest   -------------------> gitbash

in jenkins

Cloudbee docker custom build environment
docker
docker pipelines
docker compose

new item in pipeline
script

pipeline {
    agent any

    environment {
        registry = "monishavp25/test17:latest"
        registryCredential = "jenkin_docker_token"
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scmGit(
                    branches: [[name: '*/main']],
                    extensions: [],
                    userRemoteConfigs: [[
                        url: 'https://github.com/Monishavp25/docker.git'
                    ]]
                )
            }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    dockerImage = docker.build(registry)
                }
            }
        }
    }
}
     
        
freestyle
java --version
https://my.slack.com/services/new/jenkins-ci
build start 
success    
failure
