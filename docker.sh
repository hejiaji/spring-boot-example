./gradlew build

docker build -t spring-boot-restful:v1 .

docker run -p:7767:7767 -t spring-boot-restful:v1