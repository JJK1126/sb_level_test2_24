package com.board.basic.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {

    @Size(min = 3, max = 25)
    @NotEmpty(message = "사용자 ID는 필수 입력사항")
    private String username;

    @NotEmpty(message = "비밀번호는 필수 입력사항")
    private String password1;

    private String password2;

    @NotEmpty(message = "이메일을 입력하시오!")
    @Email
    private String email;
}
