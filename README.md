# Spring-Boot-REST-API-Basics

This repository consists of Spring Boot Rest API Basics and understanding of various annotations in Spring Boot.

## @RestController:
Spring 4.0 introduced the @RestController annotation in order to simplify the creation of RESTful web services. 
It’s a convenient annotation that combines @Controller and @ResponseBody, which eliminates the need to annotate every request handling method of the controller class with the @ResponseBody annotation.

## @GetMapping("Your_API_Endpoint")
This annotation will help you handle your GET request.

## @PostMapping("Your_API_Endpoint")
This annotation will help you handle your POST request.

## @PutMapping("Your_API_Endpoint")
This annotation will help you handle your PUT request.

## @DeleteMapping("Your_API_Endpoint")
This annotation will help you handle your DELETE request.

## @RequestMapping("Your_API_Endpoint")
This annotation will help you define your base api endpoint.

## @PathVariable("parameter_name")
PathVariable annotation can be used to handle template variables in the request URI mapping.
### Example:
@GetMapping("/api/employees/{id}")
@ResponseBody
public String getEmployeesById(@PathVariable String id) {
    return "ID: " + id;
}

## @RequestParam("parameter_name")
This annotation helps to extract query parameters, form parameters, and even files from the request.
### Example:
@GetMapping("/api/foos")
@ResponseBody
public String getFoos(@RequestParam String id) {
    return "ID: " + id;
}

## @RequestBody(Object object_name)
This annotation helps to convert the JSON response into Java Object.
### Example:
@RequestBody Student student

## @ResponseEntity
This annotation helps to define a HTTP response: status code, headers and body. As a result, we can use it to fully configure the HTTP response.
### Example:
public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") String id){
        System.out.println(student.getFirst_name());
        System.out.println(student.getLast_name());
        return ResponseEntity.ok(student);
    }
