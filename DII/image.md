# Building Docker Image for the First time Ever

### Step 1 : Create Docker Image
---
#### FROM (Specifies the Base Image)
```
FROM python

CMD [ "python","-c","print('hello from container')" ]
```

To Build Docker Image

```
docker build -t my-python:v0.0.1 .
```

Show all Images
```
docker images
```

Running Docker Image 
```
docker run my-python:v0.0.1
```
---
#### WORKDIR (Set working directry in Docker Image)
syntax
```
WORKDIR /app
```

---
#### COPY (Copies files from your host to the image)
Copy your project to image
```
COPY ./hello.py .
```


---
#### ENTRYPOINT (its alwys execute)

Syntax
```
ENTRYPOINT [ "python", "hello.py" ]
```

### using maven



---
## Docker images using maven 

to create image
```
.\mvnw.cmd clean install spring-boot:build-image
```



# Pushing our first image to Docker Hub
Step 1 : create account on docker hub \
step 2 : loging docker hub using CLI
```
docker login
```

after its syas to enter and authenticate 

Step 3 : tag the image
```
docker tag  <imagename>:<version> <username>/<imagename>
```

Step 4 : Push the image 
```
docker push aniketmokal29/dockerdemo
```