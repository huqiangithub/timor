call mvn clean install

call set docker_host=tcp://139.155.7.242:2375

docker stop timor

docker rm timor

docker rmi hq.com/timor:v0.0.1

docker build -t  hq.com/timor:v0.0.1 ./

docker run -d -p 8080:8080 --name=timor hq.com/timor:v0.0.1