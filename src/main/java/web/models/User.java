package web.models;



import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "users")
public class User {
    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id")
    private long id;


    public User(long id, String name, String surname, String email, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
    }


    @Column(name = "name")
    @NotEmpty(message = "Name can't be empty")
    @Pattern(regexp = "^[\\p{L}]+(?: [\\p{L}]+)*$", message = "Имя может содержать только буквы")
    @Size(min = 2, max = 20, message = "Имя в пределах от 2 до 20 знаков")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "lastname can't be empty")
    @Pattern(regexp = "^[\\p{L}]+(?: [\\p{L}]+)*$", message = "Фамилия может содержать только буквы")
    @Size(min = 2, max = 20, message = "Фамилия в пределах от 2 до 20 знаков")
    private String surname;
    @Column(name = "email")
    @NotEmpty(message = "Почта не может быть пустой")
    @Email(message = "Почта должна быть валидная")
    private String email;
    @Column(name = "age")
    @Min(value = 1, message = "Возраст должен быть больше 0")
    private int age;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public void setSurname(String lastName) {
        this.surname = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("firstname = %s  lastname = %s age = %d email = %s", name, surname, age ,email);
    }
}
