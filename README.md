# math-service-demo
Simple REST service calculating numbers and builds a Docker container.

Run container as:

```
$ docker run -d -p 8080:8080 olatheander/spring-math-service-demo
```

and test the API by:

```
$ curl "http://localhost:8080/add?v1=3&v2=7"
{"result":10,"host":"a8102543fedc","timestamp":"2017-01-12 11:57:33"}
```

Build a new Docker image by:

```
$ mvn clean package docker:build
```

or push the image to the repo:

```
$ mvn clean package docker:build -DpushImage
```

See Spotify's Docker Maven plug-in [usage section](https://github.com/spotify/docker-maven-plugin#usage) for more details.
