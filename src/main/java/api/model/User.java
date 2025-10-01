package api.model;

import api.enums.Role;

import java.util.List;
import java.util.Objects;

public class User {

    private Long id;

    private String clientSurname;

    private String clientName;

    private String clientSecondName;

    private String email;

    private String username;

    private String phone;

    private String password;

    private Role role;

    private List<XmlFile> XmlFile;

    public User() {
    }

    public User(Long id, String clientSurname, String clientName, String clientSecondName, String email, String username, String phone, String password, Role role, List<XmlFile> xmlFile) {
        this.id = id;
        this.clientSurname = clientSurname;
        this.clientName = clientName;
        this.clientSecondName = clientSecondName;
        this.email = email;
        this.username = username;
        this.phone = phone;
        this.password = password;
        this.role = role;
        XmlFile = xmlFile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSecondName() {
        return clientSecondName;
    }

    public void setClientSecondName(String clientSecondName) {
        this.clientSecondName = clientSecondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<XmlFile> getXmlFile() {
        return XmlFile;
    }

    public void setXmlFile(List<XmlFile> xmlFile) {
        XmlFile = xmlFile;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(clientSurname, user.clientSurname) && Objects.equals(clientName, user.clientName) && Objects.equals(clientSecondName, user.clientSecondName) && Objects.equals(email, user.email) && Objects.equals(username, user.username) && Objects.equals(phone, user.phone) && Objects.equals(password, user.password) && role == user.role && Objects.equals(XmlFile, user.XmlFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientSurname, clientName, clientSecondName, email, username, phone, password, role, XmlFile);
    }
}
