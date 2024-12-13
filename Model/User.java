import java.io.*;
import java.util.*;

public class User {

    protected int id;
    protected UserType userType;
    protected String role;
    protected String login;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected boolean isLogged;
    protected Date birthday;
    protected boolean gender;
    protected String nationality;
    protected String phone;

    public User() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public UserType getUserType() { return userType; }
    public void setUserType(UserType userType) { this.userType = userType; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isLogged() { return isLogged; }
    public void setLogged(boolean isLogged) { this.isLogged = isLogged; }

    public Date getBirthday() { return birthday; }
    public void setBirthday(Date birthday) { this.birthday = birthday; }

    public boolean isGender() { return gender; }
    public void setGender(boolean gender) { this.gender = gender; }

    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}
