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



