package web.models;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @NotEmpty(message = "Имя не не может быть пустым")
    @Pattern(regexp = "^[\\p{L}]+(?: [\\p{L}]+)*$", message = "Имя может содержать только буквы")
    @Size(min = 2, max = 20, message = "Имя в пределах от 2 до 20 знаков")
    private String name;

    @Column(name = "surname")
    @NotEmpty(message = "Фамилия не может быть пустой ")
    @Pattern(regexp = "^[\\p{L}]+(?: [\\p{L}]+)*$", message = "Фамилия может содержать только буквы")
    @Size(min = 2, max = 20, message = "Фамилия в пределах от 2 до 20 знаков")
    private String surName;

    @Column(name = "age")
    @Min(value = 1, message = "Возраст должен быть больше 0")
    private int age;

    @Column(name = "email")
    @NotEmpty(message = "Почта не может быть пустой")
    @Email(message = "Почта должна быть валидная")
    private String email;

        public User() {}

    public User(long id, String name, String surName, String email, int age) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.age = age;
    }

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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String lastName) {
        this.surName = lastName;
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
        return String.format("firstname = %s  lastname = %s age = %d email = %s", name, surName, age, email);
    }
}
