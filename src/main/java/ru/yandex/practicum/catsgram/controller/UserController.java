package ru.yandex.practicum.catsgram.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users") // Все эндпоинты будут начинаться с /api/users
public class UserController {

    // GET /api/users - получить информацию о пользователях
    @GetMapping
    public String getUsers() {
        return "Список пользователей Котограма";
    }

    // GET /api/users/{userId} - получить пользователя по ID
    @GetMapping("/{userId}")
    public String getUserById(@PathVariable int userId) {
        return "Информация о пользователе с ID: " + userId;
    }

    // GET /api/users/{userId}/posts - получить посты пользователя
    @GetMapping("/{userId}/posts")
    public String getUserPosts(@PathVariable int userId) {
        return "Посты пользователя с ID: " + userId;
    }

    // POST /api/users - создать нового пользователя
    @PostMapping
    public String createUser(@RequestBody String userData) {
        return "Пользователь создан: " + userData;
    }
}