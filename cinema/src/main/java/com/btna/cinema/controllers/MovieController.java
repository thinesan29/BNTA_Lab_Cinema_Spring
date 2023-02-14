package com.btna.cinema.controllers;

import com.btna.cinema.models.Movie;
import com.btna.cinema.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/movies") //localhost:8080/movies

public class MovieController {

    @Autowired
    MovieService movieService;

    // GET /movies
    @GetMapping //localhost:8080/movies
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    // GET /movies/{id}
    @GetMapping(value = "/{id}") //localhost:8080/movies/1
    public ResponseEntity<Movie> getMovieById(@PathVariable int id){
        Movie movie = movieService.getMovieById(id);
        return new ResponseEntity<>(movie, HttpStatus.OK);

    }

    // POST /movies
    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
        Movie movieToBeSaved = movieService.createMovie(movie);
        return new ResponseEntity<>(movieToBeSaved, HttpStatus.CREATED);
    }

}
