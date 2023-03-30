package ru.hw.restauthservice.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hw.restauthservice.dto.UserDTO;
import ru.hw.restauthservice.model.Authorities;
import ru.hw.restauthservice.model.User;
import ru.hw.restauthservice.service.AuthorizationService;

import javax.validation.Valid;
import java.util.List;

@Validated
@RestController
public class AuthorizationController {
    AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")

    public List<Authorities> getAuthorities(@Valid @UserDTO User user) {
        return service.getAuthorities(user);
    }

}
