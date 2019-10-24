## ITJobWebsite-SpringBoot-MongoDB
Construct an IT Job website with `SpringBoot` and `MongoDB`.

Author: Dr. Yuhang Zhao


### What is MongoDB?
MongoDB is `document-DB`. 
Unlike `relational database`,
it does not require creating `table` before inserting data with pre-defined data structure.
With MongoDB we can store data with flexible structures. E.g., `JSON`-like document. 

### Install MongoDB from the official website.
Encountered problem: installation never ends on `windows 7` X64 bit.
Solution: See "Install MongoDB With Compass On Windows" 
@ https://vegibit.com/install-mongodb-with-compass-on-windows/

### Start MongoDB server
Open Command Prompt and navigate to your MongoDB Bin folder,
run `mongod.exe`. 
Encountered problem: `Mongo Server` fails to up.
Solution: see "How to Install MongoDB on Windows 10"
@ https://www.youtube.com/watch?v=FwMwO8pXfq0
Then it will start MongoDB main process 
and then keep waiting for connections message in the console.

### Add mongoDB/bin to Path
Therefore we can use `Mongo Shell` and `Mongo Server` from anywhere.

### Construct the app using MongoDB with CRUD functionality through RESTful APIs. 

#### 1. controller
Create a controller used in RESTful web services to handle HTTP requests.
Annotated by `@RestController`.
