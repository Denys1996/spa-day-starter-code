package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {

    @NotBlank
    @NotNull
    @Size(min=5, max=15)
    private String username;

    @Email
    private String email;

    @NotBlank
    @NotNull(message = "Passwords do not match")
    @Size(min=6)
    private String password;


    @NotNull(message = "Passwords do not match")
    private String verifyPassword;

    public User() {

    }

    public User(String username, String email, String password, String verifyPassword) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        this.checkPassword();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        this.checkPassword();

    }

    private void checkPassword() {
        if(this.password != null &&
                this.verifyPassword != null &&
                !this.password.equals(this.verifyPassword)) {
            verifyPassword = null;
        }
    }
}
