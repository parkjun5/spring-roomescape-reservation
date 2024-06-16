package roomescape.entity;

import roomescape.enums.UserRole;

public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private UserRole userRole;

    protected User() {}

    public User(String name, String email, String password, UserRole userRole) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userRole = userRole;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserRole getUserRole() {
        return userRole;
    }
}
