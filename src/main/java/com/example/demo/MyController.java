package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    @RequestMapping("/")
    public String home(){
        return "Welcom to my home";
    }
    @RequestMapping("/test")
    public String test(){
        return "This is a test";
    }

//    @Autowired
//    public StudentRepository studentRepository;
//    public BaseResponse baseResponse = new BaseResponse();
//
//    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
//    public ResponseEntity<?> getAll(){
//        List<Student> listStudent = (List<Student>) studentRepository.findAll();
//        if(listStudent.size()==0){
//            baseResponse.setStatus(1);
//            baseResponse.setMessage("No Student");
//            listStudent = new ArrayList<>();
//            baseResponse.setResult(listStudent);
//            return ResponseEntity.status(HttpStatus.OK).body(baseResponse);
//        }
//        baseResponse.setStatus(1);
//        baseResponse.setMessage("Success");
//        baseResponse.setResult(listStudent);
//        return ResponseEntity.status(HttpStatus.OK).body(baseResponse);
//    }
//
//    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
//    public ResponseEntity<?> addStudent(@Valid @RequestBody AddStudentRestRequest request){
//        studentRepository.save(new Student(request.getName(),Integer.valueOf(request.getAge())));
//        baseResponse.setStatus(1);
//        baseResponse.setMessage("Add Student Success");
//        System.out.println("ADd OKEEE");
//        return ResponseEntity.status(HttpStatus.OK).body(baseResponse);
//    }
//
//    @RequestMapping("/get/{id}")
//    public ResponseEntity<?> getStudentById(@PathVariable("id") int id){
//        if(studentRepository.existsById(id)){
//            Student student = studentRepository.findById(id).get();
//            baseResponse.setStatus(1);
//            baseResponse.setMessage("Success");
//            baseResponse.setResult(student);
//            return ResponseEntity.status(HttpStatus.OK).body(baseResponse);
//        }else{
//            baseResponse.setStatus(-1);
//            baseResponse.setMessage("This student not exits");
//            return ResponseEntity.status(HttpStatus.OK).body(baseResponse);
//        }
//    }
//
//
//    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
//    public ResponseEntity<?> deleteStudent(@PathVariable("id") int id){
//        if(studentRepository.existsById(id)){
//            studentRepository.deleteById(id);
//            baseResponse.setStatus(1);
//            baseResponse.setMessage("Success");
//            return ResponseEntity.status(HttpStatus.OK).body(baseResponse);
//        }else{
//            baseResponse.setStatus(-1);
//            baseResponse.setMessage("This student not exits");
//            return ResponseEntity.status(HttpStatus.OK).body(baseResponse);
//        }
//    }
}
