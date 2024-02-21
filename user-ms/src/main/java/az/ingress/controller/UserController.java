package az.ingress.controller;


import az.ingress.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class UserController {

    private final UserService userService;


    @GetMapping
    public String getCount(){
        return "User Count: " + userService.increaseCount();
    }



}
