package ru.hw.restauthservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Validated
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotNull(message = "User name must be not null")
    @NotBlank(message = "User name must be not blank")
    @Size(min = 2, max = 40)
    private String user;

    @NotNull(message = "Password must be not null")
    @NotBlank(message = "Password must be not blank")
    @Size(min = 4, max = 20)
    private String password;
}
