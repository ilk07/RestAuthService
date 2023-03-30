package ru.hw.restauthservice.service;

import org.springframework.stereotype.Service;
import ru.hw.restauthservice.exception.UnauthorizedUser;
import ru.hw.restauthservice.model.Authorities;
import ru.hw.restauthservice.model.User;
import ru.hw.restauthservice.repository.UserRepository;

import java.util.List;

@Service
public class AuthorizationService {
    UserRepository userRepository;

    public AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(User user) {
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user.getUser(), user.getPassword());
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user.getUser());
        }
        return userAuthorities;
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}