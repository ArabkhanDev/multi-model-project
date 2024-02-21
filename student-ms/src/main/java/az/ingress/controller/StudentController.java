package az.ingress.controller;


import az.ingress.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class StudentController {

    private final StudentService studentService;


    @GetMapping
    public String getCount(){
        return "Student Count: " + studentService.increaseCount();
    }



}
