package com.spring.studentportal.controller;

import com.spring.studentportal.dto.request.SignUpRequest;
import com.spring.studentportal.model.SignUpModel;
import com.spring.studentportal.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/student/")
public class StudentSignInAndSignUpController {
private final StudentRepository studentRepository;

    public StudentSignInAndSignUpController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @PostMapping("student/signUp")
    public void signUp (@RequestBody SignUpRequest signUpRequest)
    {
        SignUpModel signUpModel = new SignUpModel();
        signUpModel.setStudentId(signUpRequest.getStudentId());
        signUpModel.setName(signUpRequest.getStudentName());
        signUpModel.setDept(signUpRequest.getStudentDept());
        signUpModel.setPassword(signUpRequest.getStudentPass());
        studentRepository.save(signUpModel);
    }
   @GetMapping("student/singIn")
    public String singIn()
    {
     return "ergdfg" ;
    }

}
