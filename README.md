# TASK--2-REST-API-CLIENT

*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: Haaritha S

*INTERN ID*: CTIS0443

*DOMAIN*: Java Programming

*DURATION*: 4 Weeks

*MENTOR*: Neela Santhosh Kumar

##**Task Description**

During my professional internship at **CODTECH IT Solutions**, I was tasked with developing a **REST API Client** using Java. In the modern era of software development, applications rarely exist in isolation; they must communicate with external databases, cloud services, and third-party platforms to provide real-time value. This project served as a comprehensive introduction to the **Client-Server architecture**, focusing specifically on how a Java application can act as a consumer of web-based data. The core of this task involved creating a bridge between my local environment and a remote server. By targeting a public REST endpoint, I practiced the lifecycle of a web request: initializing a connection, defining the request parameters, handling the network latency, and finally, decoding the response into a format that a human user can understand. This project highlights my ability to integrate networking libraries and handle data interchange formats like **JSON**, which is the industry standard for web communication.

### Features

1. **Modern HTTP Request Management**
Instead of relying on outdated connection methods like `HttpURLConnection`, I implemented the **Java HttpClient API** introduced in Java 11. This modern approach allows for cleaner, more readable code and supports both synchronous and asynchronous communication. By utilizing `HttpRequest.newBuilder()`, I learned how to define target **URIs** and configure the necessary HTTP methods to fetch data from a "Todo" management service. This feature demonstrates a firm grasp of how the internet functions at a protocol level.
2. **JSON Object-Relational Mapping**
Raw data from a server is typically returned as a long, unformatted string of text. To make this data useful, I integrated the **org.json library**. My program specifically handles **JSONArrays**—a collection of multiple data entries—and breaks them down into individual **JSONObjects**. By extracting specific keys such as `userId`, `id`, and `completed`, I demonstrated the ability to navigate complex nested data structures and map them to local variables for further processing.
3. **Dynamic Presentation Logic**
A key part of this utility is how it handles the "Presentation Layer." I implemented logic that selects the first five items from the API response and pairs them with a custom array of readable titles. This simulates a real-world scenario where a developer might need to "clean" or "overwrite" backend data to make it more professional or relevant for the end-user. It shows an understanding of data manipulation and the importance of user-centric output in software design.
4. **Network Resilience and Error Handling**
Networking is inherently unpredictable due to potential issues like server downtime, DNS failures, or local internet outages. To address this, I wrapped the entire execution flow in a robust **Try-Catch** block. This ensures that the program can intercept exceptions during the `client.send` process. Rather than the application crashing, it provides a structured error report, which is essential for debugging and maintaining software in a professional production environment.

### What I Learned

* **The RESTful Paradigm:** I gained a deep understanding of how REST allows different software systems to talk to each other regardless of the language they are written in.
* **Stream Handling:** I learned how to use **BodyHandlers** to convert byte streams from the web into manageable Java Strings effectively.
* **Dependency Integration:** I practiced the process of adding external `.jar` files to a project to extend Java's native capabilities, specifically for JSON processing.
* **Asynchronous Mindset:** Working with APIs taught me to consider the time it takes for data to travel across a network, emphasizing the need for efficient code.
* **Data Transparency:** I explored how to filter out unnecessary metadata from an API response to display only the information that is relevant to the user.

### Conclusion

This project was a transformative experience during my time at **CODTECH IT Solutions**. It successfully shifted my perspective from building "standalone" desktop tools to developing "connected" applications. By mastering the ability to fetch, parse, and display live web data, I have gained a foundational skill set required for **Full-Stack Development** and **Backend Engineering**. The REST API Client is more than just a simple script; it is a proof of concept for how modern apps—from weather trackers to social media feeds—operate. This task has prepared me to tackle more advanced challenges, such as implementing authentication tokens, handling POST requests, and building my own APIs. This experience has significantly boosted my confidence in handling the complexities of the modern web ecosystem.

#OUTPUT
<img width="939" height="646" alt="Image" src="https://github.com/user-attachments/assets/d75bf466-c5e2-4a88-99b2-566fbfcca1af" />
