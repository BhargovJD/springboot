// Defines the package where this Java class belongs.
package com.example.demo;


// Imports @GetMapping.
// @GetMapping is used to handle HTTP GET requests.
import org.springframework.web.bind.annotation.GetMapping;

// Imports @RestController.
// @RestController tells Spring that this class will handle web/API requests
// and return data directly as the HTTP response.
import org.springframework.web.bind.annotation.RestController;


// Marks this class as a REST Controller.
// Spring Boot will automatically detect this class and use it
// to handle HTTP requests.
@RestController
public class MyClass {

    // This is the URL endpoint we are creating:
    // http://localhost:8080/abc
    //
    // localhost = your own computer
    // 8080     = default Spring Boot port
    // /abc     = endpoint/path


    // @GetMapping("abc") means:
    // When someone sends a GET request to /abc,
    // execute the method below.
    @GetMapping("abc")
    public String sayHello() {

        // This text "Hello" will be sent back to the browser/client
        // as the HTTP response.
        return "Hello";
    }
}