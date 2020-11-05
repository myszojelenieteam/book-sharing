package pl.polsl.bookSharing.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @OneToOne
    private RealShelf realShelf;

    @OneToOne
    private RealShelf virtualRealShelf;

    private String name;
    private String surname;
    private String email;
    private String nick;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "userId"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "roleId"))
    private Collection<Role> roles;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public RealShelf getRealShelf() {
        return realShelf;
    }

    public void setRealShelf(RealShelf realShelf) {
        this.realShelf = realShelf;
    }

    public RealShelf getVirtualRealShelf() {
        return virtualRealShelf;
    }

    public void setVirtualRealShelf(RealShelf virtualRealShelf) {
        this.virtualRealShelf = virtualRealShelf;
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

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
