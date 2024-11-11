FROM openjdk:17-jdk-alpine

WORKDIR /app

COPY . .

RUN javac *.java

CMD ["java", "Main"]
