# spring-boot-rest-api


http://localhost:8080/swagger-ui.html


mvn clean package

docker build . -t spring-boot-rest-api:1.0.3

docker images

docker login --username=samaanfilho

#Password:

docker tag 078df3c14e57 samaanfilho/spring-boot-rest-api:1.0.3

docker push samaanfilho/spring-boot-rest-api:1.0.3

"Copy Login Command"

oc login --token=XXX --server=YYY

oc delete all --selector app=spring-boot-rest-api

oc new-app samaanfilho/spring-boot-rest-api:1.0.3

oc expose service/spring-boot-rest-api







crc cleanup

crc setup

crc start

@FOR /f "tokens=*" %i IN ('crc oc-env') DO @call %i

oc login -u developer https://api.crc.testing:6443

oc new-project projeto1

oc new-build --binary=true --name spring-boot-rest-api

oc start-build spring-boot-rest-api --from-dir .

oc new-app spring-boot-rest-api --allow-missing-imagestream-tags

oc expose service/apt
