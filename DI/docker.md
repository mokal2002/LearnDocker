# Docker Basics

```
docker run nginx     // run docker image
```

```
docker run -p 8090:80 nginx  // forword port 
```

```
docker run -d -p 8090:80 nginx  // [-d] in ditach mode
```

```
docker ps   // show all running images aka conatiners
```

```
docker ps -a    // show all images aka containers not just running but all who terminate or stop
```

```
docker run -d -p 8091:80 --name=aniketContainer nginx  // assign name to the conatiner
```

```
docker ps -q // to get onaly conatiners id
```

``` 
docker ps -a -q // get all conatiners id with stoped also
```

``` 
docker stop {dockerName/dockerId} // replace{} with your value to stop conatiner
```

```
docker stop $(docker ps -q) // docker stops all conatiner 
````

```
docker rm {dockername/dockerId}  // removes conatiner
```

```
docker rm $(docker ps -q) // remover all conatiners
```

```
docker images // list all images you have
```

```
docker rmi nginx  // remove image from our local machine
```

```
docker run ubuntu  // but it was not running continualy
```

```
docker run -it ubuntu // its run docker in interractive mode
```

```
docker run ubuntu echo "ubuntu running inside docker" // after running conatiner flags event
```

``` 
docker container prune  // delete all inactive conatiner 
```

```
docker logs {conatinename/Id}  //get logs of mentioned container
```

```
docker inspect {conatinename/Id} // inspect conainer config
```

```
docker stats //get overview of docker containrs
```