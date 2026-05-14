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
    


    
