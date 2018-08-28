package hibernet.entity;

import javax.persistence.*;


@Entity
@Table(name = "user")
public class UserHibernetUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "firstName")
    private String first;
    @Column(name = "lastName")
    private String last;

    public UserHibernetUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "UserHibernetUser{" +
                "id=" + id +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }
}
