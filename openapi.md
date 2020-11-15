%title: Openapi - Presentation
%author: ddebode
%date: 2020-11-07

-> # OpenAPI - definition <-
==============================

The OpenAPI Specification (OAS) defines a standard, language-agnostic interface to RESTful APIs 
which allows both humans and computers to discover and understand the capabilities of the service 
without access to source code, documentation, or through network traffic inspection. 
When properly defined, a consumer can understand and interact with the remote service with a minimal
amount of implementation logic.

An OpenAPI definition can then be used by documentation generation tools to display the API, 
code generation tools to generate servers and clients in various programming languages, 
testing tools, and many other use cases.

http://spec.openapis.org/oas/v3.0.3
https://swagger.io/specification/

-------------------------------------------------

-> # History <-

*2011* first version released of Swagger specification
*2015* Acquired by Smartbear
*2016* Swagger specification renamed to OpenAPI Specification
*2017* OpenAPI 3.0.0 is released

-------------------------------------------------

-> # 3.0 vs 2.0 <-

What are the main differences?

-------------------------------------------------

-> # 3.0 vs 2.0 <-

3.0 has a more simplified structure

openapiv2-v3.jpeg 

-------------------------------------------------

-> # 3.0 vs 2.0 <-

In 3.0 you can define multiple url's

3.0
```
servers:
  - url: https://api.example.com/v1
    description: Production server (uses live data)
  - url: https://sandbox-api.example.com:8443/v1
    description: Sandbox server (uses test data)
```  

2.0
```
host: "api.example.com"
basePath: "/v1"
```

-------------------------------------------------

-> # 3.0 vs 2.0 <-

3.0 has support for describing callbacks

```
paths:
  /subscribe:
    post:
      summary: Subscribe to a webhook
      requestBody:
        …
      callbacks:   # Callback definition
        myEvent:   # Event name
          '{$request.body#/callbackUrl}':   # The callback URL,
                                            # Refers to the passed URL
            post:
              requestbody:   # contents of the callback message
                required: true
                content:
                  application/json:
                    schema:
                      type: object
                      properties:
                        message:
                          type: string
                          example: some event happened
                      required:
                        - message
              responses:   # expected responses to the callback message
                '200':
                  description: your server returns this code if it accepts the callback
```

-------------------------------------------------


-> # 3.0 vs 2.0 <-

In 3.0 links are introduced

```
paths:
  /users:
    post:
      summary: Creates a user and returns the user ID
      operationId: createUser
      requestBody:
        required: true
        description: A JSON object that contains the user name and age.
        content:
          application/json:
            schema:
              $ref: '#/components/schemas/User'
      responses:
        '201':
          ...
          links:
            GetUserByUserId:   # <---- arbitrary name for the link
              operationId: getUser
              parameters:
                userId: '$response.body#/id'
              description: >
                The `id` value returned in the response can be used as
                the `userId` parameter in `GET /users/{userId}`.
```

-------------------------------------------------

-> # Demo tools <-

- OpenApi-Generator 
- Swagger Codegen   
- Swagger UI 

https://github.com/OpenAPITools/openapi-generator
https://swagger.io/tools/swagger-codegen/
https://openapi.tools/

-------------------------------------------------
