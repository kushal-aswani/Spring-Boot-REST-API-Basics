package com.project.hello.controller;

import com.project.hello.bean.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {

    @GetMapping("student")
//    public Student getStudent(){
//        Student student = new Student("1","Kushal","Aswani");
//        return student;
//    }S
    public ResponseEntity<Student> getStudent(){
        Student student = new Student("1","Kushal","Aswani");
        return ResponseEntity.ok(student);
    }

    @GetMapping
//    public List<Student> getStudents(){
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("1","Kushal","Aswani"));
//        students.add(new Student("2","Rahul","Bodha"));
//        students.add(new Student("3","Ritik","Chaouhan"));
//        students.add(new Student("4","Suraj","Maharana"));
//        return students;
//    }

    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("1","Kushal","Aswani"));
        students.add(new Student("2","Rahul","Bodha"));
        students.add(new Student("3","Ritik","Chaouhan"));
        students.add(new Student("4","Suraj","Maharana"));
        return ResponseEntity.ok()
                .header("kushal","aswani")
                .body(students);
    }

    //Spring Boot REST API with Path Variable
    @GetMapping("{id}/{first-name}/{last-name}")
//    public Student studentPathVariable(@PathVariable("id") String id,
//                                       @PathVariable("first-name") String firstName,
//                                       @PathVariable("last-name") String lastName){
//
//        return new Student(id,firstName,lastName);
//    }
    public ResponseEntity<Student> studentPathVariable(@PathVariable("id") String id,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName){

        Student s = new Student(id,firstName,lastName);
        return ResponseEntity.ok(s);
    }

    //Spring Boot Rest API with Request Parameter
    @GetMapping("query")
//    public Student studentRequestParameter(@RequestParam String id,
//                                           @RequestParam String firstName,
//                                           @RequestParam String lastName){
//        return new Student(id,firstName,lastName);
//    }
    public ResponseEntity<Student> studentRequestParameter(@RequestParam String id,
                                           @RequestParam String firstName,
                                           @RequestParam String lastName){
        Student s = new Student(id,firstName,lastName);
        return ResponseEntity.ok(s);
    }

    //Spring Boot Rest API that handles Post Mapping
    @PostMapping("create")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Student createStudent(@RequestBody Student student){
//        System.out.println(student.getId());
//        System.out.println(student.getFirst_name());
//        System.out.println(student.getLast_name());
//        return student;
//    }
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        System.out.println(student.getId());
        System.out.println(student.getFirst_name());
        System.out.println(student.getLast_name());
        return new ResponseEntity<>(student,HttpStatus.CREATED);
    }

    //Spring Boot Rest API that handles Put Mapping --updating existing resource
    @PutMapping("{id}/update")
//    public Student updateStudent(@RequestBody Student student,@PathVariable("id") String id){
//        System.out.println(student.getFirst_name());
//        System.out.println(student.getLast_name());
//        return student;
//    }
    public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable("id") String id){
        System.out.println(student.getFirst_name());
        System.out.println(student.getLast_name());
        return ResponseEntity.ok(student);
    }

    //Spring Boot Rest API that handles Delete Mapping
    @DeleteMapping("{id}/delete")
//    public String deleteStudent(@PathVariable("id") String studentId){
//        System.out.println(studentId);
//        return "Student deleted successfully";
//    }
    public ResponseEntity<String> deleteStudent(@PathVariable("id") String studentId){
        System.out.println(studentId);
        return ResponseEntity.ok("Student deleted successfully");
    }
}
