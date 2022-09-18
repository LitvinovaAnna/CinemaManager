package ru.netology.test;

import org.junit.jupiter.api.Test;
import ru.netology.domain.CinemaManager;

import static org.junit.jupiter.api.Assertions.*;

public class CinemaManagerTest {

    String movie1 = "1";
    String movie2 = "2";
    String movie3 = "3";
    String movie4 = "4";
    String movie5 = "5";
    String movie6 = "6";
    String movie7 = "7";
    String movie8 = "8";
    String movie9 = "9";
    String movie10 = "10";
    String movie11 = "11";


    @Test
    public void shouldAddMovies() {

        CinemaManager manager = new CinemaManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        String[] expected = {movie1, movie2, movie3};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindMovies() {

        CinemaManager manager = new CinemaManager(6);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRChangeOrder() { //изменить последовательность
        CinemaManager manager = new CinemaManager(10);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        String[] expected = {movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldChangeOrderFiveMovies() { // меняем последовательность у пяти фильмов
        CinemaManager manager = new CinemaManager(5);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {movie5, movie4, movie3, movie2, movie1};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void zero() {
        CinemaManager manager = new CinemaManager();
        String[] expected = {};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void lessThanLimit() { //В менеджере меньше фильмов, чем лимит
        CinemaManager manager = new CinemaManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void moreThanLimit() { //В менеджере больше фильмов, чем лимит
        CinemaManager manager = new CinemaManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);

        String[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void likeLimit() { // кол-во фильмов равно лимиту
        CinemaManager manager = new CinemaManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }


}
