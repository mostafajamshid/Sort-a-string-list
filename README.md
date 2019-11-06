This project is a simple app for sorting a string list
- There is a server part that offers a REST+JSON interface with a method that receives a list of Strings and returns the Strings sorted
- There is a client part that transfers an unsorted list of Strings to the server and ensures that the returned list is sorted
This project has implemented by:

***-Java 8***\
***-Spring Boot 2.2.0***\
***-Maven 3.3.9***\
***-bootstrap 4.2.1***\
***-swagger 2.9.2***\
***-jacoco 0.8.2***\
***-JUnit 5***

The Project Structure:\
![image](https://drive.google.com/uc?export=view&id=1OgVVWvJft45i8q-wpO9dBZY280s52Sfn)
\
For run this project use below commands(run from the main folder):\
`mvn clean package`\
`java -jar target/challenge-0.0.1-SNAPSHOT.jar`\
After execute these commands you can see the application on http://localhost:8080/sorting-app (like next picture)
\

Let's begin with the client side view of the app\
Here we can enter data as a comma seprated unsorted list, we have client side verification for valid or invalid sorted list
![image](https://drive.google.com/uc?export=view&id=14Z6JSZg3OJ6xxcUYsmmqjk4Rn3xMXMhH)
\
If the return list is unsorted, a appropriate message will be displayed.
\
 ![image](https://drive.google.com/uc?export=view&id=1GkldIYnAI8qZ2OZcNRWy0s3dT0ZlcnT5)
 
Beside the UI(client) we can use the curl command:\
`curl -d "@data.json"  -H "Content-Type: application/json"  -X POST http://localhost:8080/sorting-app/sort` 



The swagger ui for this project:\
![image](https://drive.google.com/uc?export=view&id=1KHn-8lD35K3JDC-__9A6L3rPZwe9NiaJ)
  
![image](https://drive.google.com/uc?export=view&id=1drx1VBen9ft40PiIzZfaPBI9NS9FpiJl)
 




 
