package kg.easy.apiadminservice.controllers;

import kg.easy.apiadminservice.models.SessionInfo;
import kg.easy.apiadminservice.services.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/auth")
@CrossOrigin
public class LoginController {

    @Autowired
    private SessionService sessionService;

    @GetMapping("/login")
    public SessionInfo auth(@RequestParam String login, @RequestParam String password){
        return sessionService.auth(login, password);
    }



}
