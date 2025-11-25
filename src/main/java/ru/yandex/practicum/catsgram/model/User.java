package ru.yandex.practicum.catsgram.model;

import java.time.Instant;

public class User {
    private Long id;
    private String email;
    private String username;
    private String password;
    private Instant registrationDate;

    // Конструкторы
    public User() {
    }

    public User(Long id, String email, String username, String password, Instant registrationDate) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Instant getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Instant registrationDate) {
        this.registrationDate = registrationDate;
    }
}
