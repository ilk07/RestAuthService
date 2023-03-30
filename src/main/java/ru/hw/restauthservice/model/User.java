package ru.hw.restauthservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;
import ru.hw.restauthservice.validation.ValidateUserPassword;

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

    @ValidateUserPassword
    private String password;
}
