package ru.yandex.practicum.catsgram.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api") // Базовая часть пути для всех эндпоинтов этого контроллера
public class HomeController {

    // Простой GET-запрос
    @GetMapping("/home")
    public String homePage() {
        return "<h1>Приветствуем вас в приложении Котограм</h1>";
    }

    // GET-запрос для получения информации о приложении
    @GetMapping("/about")
    public String about() {
        return "Котограм - социальная сеть для котиков и их хозяев";
    }

    // GET-запрос с параметром
    @GetMapping("/greeting")
    public String greeting(@RequestParam(defaultValue = "Гость") String name) {
        return "<h2>Привет, " + name + "! Добро пожаловать в Котограм!</h2>";
    }
}