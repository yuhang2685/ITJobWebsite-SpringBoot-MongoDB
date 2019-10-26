## ITJobWebsite-SpringBoot-MongoDB
Construct an IT Job website with `SpringBoot` and `MongoDB`.

Author: Dr. Yuhang Zhao

[![PyPI license](https://img.shields.io/pypi/l/ansicolortags.svg)](https://pypi.python.org/pypi/ansicolortags/)
[![Open Source Love svg3](https://badges.frapsoft.com/os/v3/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)

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

### Register MongoDB
Add `mongoDB/bin` to `Path` and we can use `Mongo Shell` and `Mongo Server` from anywhere.

### Construct the app using MongoDB with CRUD functionality through RESTful APIs. 

![Architecture](https://github.com/yuhang2685/ITJobWebsite-SpringBoot-MongoDB/blob/master/ApplicationLayers.png)

- Create a `controller` used in `RESTful` web services to handle `HTTP` requests and annotated by `@RestController`.

- Create a `service` annotated by `@Service`, which writes business logic in the service layer separated from `@RestController`.

- Create the `entity` class for job posting and annotated by `@Document`.
Ref: https://schema.org/JobPosting

- Create the interface `repository` which extends `MongoRepository` using
the entity class and its `Id` type. 

- Use `dependency injection` annotated by `@Autowired` for the repository in service,
similarly for service in controller. 

- Implement the method to create job postings annotated by `@PostMapping`. 
Annotation `@RequestBody` is used to bind the `HTTP` request body 
with a domain object in the method parameter. 

- So far we have implemented `Create` and `Read` in `CRUD`. We use `PostMan` to test the methods.

![Post](https://github.com/yuhang2685/ITJobWebsite-SpringBoot-MongoDB/blob/master/Post.png)

- Below is what we obtain from `Http` `Get` method:

![GetAll](https://github.com/yuhang2685/ITJobWebsite-SpringBoot-MongoDB/blob/master/Get.png)

- Add "spring.data.mongodb.database=JobPostings" in `application.properties`.
Thereafter, we use the database "JobPostings" to maintain collections which are
corresponding to concept `tables` in `relational DB`.

- Implement the method to get a job posting by id, 
and the method for deleting a job posting by id.

- Implement the method to update a posting by id.
First we need to introduce a new class `JobPostingNoId` which is the JobPosting class but without attribute `Id`.
When calling the method to update a posting,
beside the id we also have to supply an object of `JobPostingNoId`.
In this way, we can update a posting except its id.
The method returns the updated copy of the posting.
Note that although the parameter is of type `JobPostingNoId`,
it doesn't have to supply the complete list of attributes.
See the following example.

![Update](https://github.com/yuhang2685/ITJobWebsite-SpringBoot-MongoDB/blob/master/Update.png)

Response from the method for updating:

![UpdateResponse](https://github.com/yuhang2685/ITJobWebsite-SpringBoot-MongoDB/blob/master/UpdateResponse.png)

### That's it! We've implemented all "CRUD" methods. Cheers!

### Reference:
- "What is MongoDB? Spring Data MongoDB in Spring Boot Application with Example" by "Tech Primers" @ https://www.youtube.com/watch?v=l5KC6OcbuOI
- "Spring Boot Tutorial - CRUD Operations using MongoDB" by "Code with Kris" @ https://www.youtube.com/watch?v=WT-2KWCa1l8
