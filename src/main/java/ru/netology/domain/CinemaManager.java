package ru.netology.domain;

public class CinemaManager {
    protected String[] movies = new String[0];

    protected int limit; //movieLimit

    public CinemaManager(int limit) {
        this.limit = limit;
    }

    public CinemaManager() {
        limit = 10;
    }

    public void add(String film) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = film; // movie
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {

        int resultLength;
        if (movies.length > limit) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        String[] res = new String[resultLength];
        for (int i = 0; i < res.length; i++) {
            res[i] = movies[movies.length - i - 1];
        }
        return res;
    }
}