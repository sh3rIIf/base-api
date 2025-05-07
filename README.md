# BASIC API
## About
The idea of this repo is to set a standard that can be followed for the creation of any new API. It includes some examples and how to approach coding. Each module focuses on a specific concept and I have tried as much as possible to exclude any other concepts to keep the module simple and easy to understand. It is a work in progress and will be updated with more basics and examples.

## Modules
I'm making use of a multi-module project to be able to split functionality and keep examples to the point. Following this approach allows me to split any of the modules into its own microservice. It's a good way to start any new project that quickly allows for scalability. Project follows the typical gateway microservice pattern. More on each module below:

### application
This module allows the entire project to start up as a single monolith. This is where the spring boot application sits. All other modules are added as dependencies to this module to allow them to act as one.

### gateway - TODO
This module contains the gateway service that acts as the main entry point for clients. From here inter-service(modules) communication is done with REST endpoints. The gateway will be responsible for authentication, rate limiting and circuit breaker.

### basic
This module contains a basic "hello world" example. Good place to start for use as a skeleton and shows coding standards and naming conventions. Controller and service layers.

### database
This module makes use of a database and includes the repo layer. It has a "customer" endpoint where customers and can be added and retrieved from the database. Focus being on the database part and excludes any other complications.

### caching - TODO
This module shows how to make use of caching.

### validation
This module includes request validation. It also shows how to create custom "Enumeration" validation.

### security - TODO
This module will show how to implement basic authentication on endpoints.

### allinone - TODO
This module combines all other concepts into a single module. For example with this module we can shows what an endpoint looks like that has request validation and makes use of a database.

## Folders
Explanation of folders within the repo.

### docs
All documentation related to the repo can be found here.

### testing
Files related to testing eg. postman scripts can be found here.

### docker - TODO
Docker compose files to startup relevant infrastructure for use with the repo eg. redis server for caching. Also add dockerfile to containerise the monolith.

## TODO
Following to be included in future releases(excludes items marked as TODO in other sections):
```diff
+ Items marked as green still has to be done
- Items marked as red have been done in a previous release
+ 1. Encryption of secrets in properties file
+ 2. Security and vulnerability scanning
+ 3. Test containers
+ 4. Code coverage
+ 5. Exception handling
+ 6. CI/CD scripts
+ 7. Update architecture diagram to fit in with this code base
+ 8. Add logging
```