package ru.hw.restauthservice.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = UserPasswordValidator.class)
public @interface ValidateUserPassword {


    public String message() default "Password must be ... -> and long list of conditions for valid password ...";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
