package ru.hw.restauthservice.repository;

import org.springframework.stereotype.Repository;
import ru.hw.restauthservice.model.Authorities;
import ru.hw.restauthservice.model.User;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> usersList;

    public UserRepository() {
        this.usersList = List.of(
                new User("John", "Doe24", List.of(Authorities.DELETE, Authorities.READ, Authorities.WRITE)),
                new User("Mike", "miki56747", List.of(Authorities.WRITE)),
                new User("Sam", "samy4", List.of(Authorities.READ)),
                new User("Anna", "anna12", List.of(Authorities.READ, Authorities.WRITE))
        );
    }

    public List<Authorities> getUserAuthorities(String name, String password) {
        return usersList.stream().filter(user -> user.getUser().equals(name) && user.getPassword().equals(password)).findFirst().map(User::getAuthorities).orElse(Collections.emptyList());

    }

}