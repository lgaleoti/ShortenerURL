# ShortenerURL

1. Description:
Most of us are familiar with seeing URLs like bit.ly or t.co on our Twitter or Facebook feeds. These are examples of shortened URLs, which are a short alias or pointer to a longer page link. The goal of this project is to generate short url so that they can be used by the most diverse systems, such as web applications, mobile applications, etc. To do this, the url's shortening service has been developed and exposed as a SOA webservice.


2. Architecture:
The best development practices were used, with separation of responsibilities in layers (MVC) and design patterns, like Factories, Singleton, etc, ensuring low coupling and high cohesion with each other.


3. Modules:

- ShortenerURL:Module responsible for implementing the URL shortening service.
The com.shortener.url.service.ServiceFactory class is responsible for providing the interface between business services and persistence services.
Currently the available persistence service is "in memory persistence" but new persistencies can be easily added since the classes have low coupling to each other.
The entry point for webservice implementation is: com.shortener.url.ShortenerURL

- ShortenerURLWeb: Module responsible for exposing the URL shortening service as a SOA webservice.
The servlet com.shortener.url.servlet.ShortenerURLServlet is responsible for starting the shortening service and making it available to listen user  requests.

- ShortenerURLWebClient: Module responsible for implementing a JSF/Primefaces client and consume the shortening webservice.

- ShortenerURLWebEAR: Module responsible for grouping all project components into a single and deployable Enterprise project.


4. Library dependencies:
- GSON version 2.6.2
- Primefaces version 6.0.0


5. Development environment
- Eclipse version Mars.2 Release 4.5.2
- JBoss AS 7.1.1.Final "Brontes"


6. TODO List: (Updated in: 01/20/2019)

- Implement security for webservice utilization;

- Improve operations performance;

- Implement shortened URL expiration mechanism;


