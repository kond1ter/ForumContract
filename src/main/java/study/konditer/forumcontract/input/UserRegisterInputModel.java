package study.konditer.forumcontract.input;

import jakarta.validation.constraints.Size;

public record UserRegisterInputModel(
    @Size(min = 3, max = 128, message = "Username length must be at least 3 characters")
    String username,
    @Size(min = 6, max = 128, message = "Password length must be at least 3 characters")
    String password,
    @Size(min = 6, max = 128, message = "Password length must be at least 3 characters")
    String confirmPassword
) {}
