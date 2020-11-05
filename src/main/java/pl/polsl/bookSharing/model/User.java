package pl.polsl.bookSharing.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @OneToOne
    private RealShelf realShelf;

    @OneToOne
    private RealShelf virtualRealShelf;

    private String name;
    private String surname;
    private String email;
    private String nick;
    private String password;
    private Role role;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
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

    public RealShelf getRealShelf() {
        return realShelf;
    }

    public void setRealShelf(RealShelf realShelf) {
        this.realShelf = realShelf;
    }

    public RealShelf getVirtualShelf() {
        return virtualRealShelf;
    }

    public void setVirtualShelf(RealShelf virtualRealShelf) {
        this.virtualRealShelf = virtualRealShelf;
    }
}
