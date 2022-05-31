package com.kni.filmapi.controller;

import com.kni.filmapi.model.Film;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FilmApiController {

    @GetMapping("")
    @ResponseBody String getMainPage() {
        return "WITAMY W APLIKACJI SPRING";
    }

    @GetMapping("/films/best")
    @ResponseBody
    List<Film> getBestFilms() {
        Film film1 = new Film("Titanic", 194.0, "Dramat/Dokument");
        Film film2 = new Film("365 dni", 234.0, "Dramat/Komedia");
        List<Film> list = new ArrayList<>();
        list.add(film1);
        list.add(film2);
        return list;
    }

}
