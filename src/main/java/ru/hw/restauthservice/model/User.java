package ru.hw.restauthservice.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString

public class User {
    private final String user;
    private final String password;

    private List<Authorities> authorities;

    public User(String name, String password) {
        this.user = name;
        this.password = password;
    }
}
