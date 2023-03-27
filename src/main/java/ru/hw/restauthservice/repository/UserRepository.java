package ru.hw.restauthservice.repository;

import org.springframework.stereotype.Repository;
import ru.hw.restauthservice.model.Authorities;
import java.util.*;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals("admin") && password.equals("pass")) {
            return Arrays.asList(Authorities.READ,Authorities.WRITE, Authorities.DELETE);
        }
        return Collections.emptyList();
    }

}