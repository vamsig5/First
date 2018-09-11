package com.exilant.blog.forms;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {

    @Size(min = 2, max = 30,
            message = "Username size should be in the range [2...30]")
    private String username;

    @Size(min = 3)
   @NotNull
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
