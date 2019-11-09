This project is a simple app for sorting a string list
- There is a server part that offers a REST+JSON interface with a method that receives a list of Strings and returns the Strings sorted
- There is a client part that transfers an unsorted list of Strings to the server and ensures that the returned list is sorted\
\
\
This project has implemented by:\
***-Java 8***\
***-Spring Boot 2.2.0***\
***-Maven 3.3.9***\
***-Bootstrap 4.2.1***\
***-Swagger 2.9.2***\
***-Jacoco 0.8.2***\
***-JUnit 5***

The Project Structure:\
![image](https://drive.google.com/uc?export=view&id=1OgVVWvJft45i8q-wpO9dBZY280s52Sfn)
\
For run this project, the following command is needed (run from the main folder):\
`mvn clean package`\
`java -jar target/challenge-0.0.1-SNAPSHOT.jar`\
After executing these commands,You will be able to see the application on http://localhost:8080/sorting-app (like the next picture)


Let's begin with the client side view of the app\
Here we can enter data as a comma seprated unsorted list, we have client side verification for valid or invalid returned list\
![image](https://drive.google.com/uc?export=view&id=14Z6JSZg3OJ6xxcUYsmmqjk4Rn3xMXMhH)
\
If the return list is unsorted, an appropriate message will be displayed.
\
 ![image](https://drive.google.com/uc?export=view&id=1GkldIYnAI8qZ2OZcNRWy0s3dT0ZlcnT5)
 
Beside the UI(client) we can use the curl command:\
`curl -d "@data.json"  -H "Content-Type: application/json"  -X POST http://localhost:8080/sorting-app/sort`\
![image](https://drive.google.com/uc?export=view&id=1SL2qzdSvV15Ro67e-0N3EZaagzv5GyLf)

Also, we can use the swagger ui to request to the sort endpoint(http://localhost:8080/swagger-ui.html)\
The swagger ui for this project:
![image](https://drive.google.com/uc?export=view&id=1KHn-8lD35K3JDC-__9A6L3rPZwe9NiaJ)
However I have embed Swagger-ui in this project,But you can use Postman or any kinds of Rest Client applications to request to this app and use data.json for input list.
![image](https://drive.google.com/uc?export=view&id=1w74SQi6zSPtyt-82sqHpay-K29IOk-3R)
postman sample.


More Information:\
I have used jacoco for reporting the project test coverage:\
![image](https://drive.google.com/uc?export=view&id=1drx1VBen9ft40PiIzZfaPBI9NS9FpiJl)\
For see the report and further details you can check it out on /target/site/jacoco/index.html\
***Important points:***\
 For ensuring that the returned list is sorted or not I have wrriten Integration Test on server side and also check it on client side separately.\
 One more thing I would to say I could write another spring boot project for client But I have tried to keep the solution as simple as possible.\
 The last thing I would to say is that, at the beginning I had written a custom merge sort method before I wrote this version becuase as far as I know merge sort is one of the best sorting algorithms (O(n log n) for time and O(n) for space) But after I checked Arrays.sort() method's source code from java.util I changed my mind, becuase they have already written merge sort for Arrays.sort().\
Have a nice review :) \
If you have any questions or anything else please do not hesitate to contact me.\
Email:mostafa.jamshid@gmail.com




 
