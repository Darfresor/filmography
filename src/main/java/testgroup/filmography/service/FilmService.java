package testgroup.filmography.service;

import testgroup.filmography.model.Film;

import java.util.List;

/**
 * Created by User on 01.11.2020.
 */
public interface FilmService {
    List<Film> allFilms();
    void add(Film film);
    void delete(Film film);
    void edit(Film film);
    Film getById(int id);
}
