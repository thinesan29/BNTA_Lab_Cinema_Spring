package com.btna.cinema.services;


import com.btna.cinema.models.Movie;
import com.btna.cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll(); }

    public Movie getMovieById(int id){
        return movieRepository.findById(id).get();

    }
    public Movie createMovie(Movie newMovie){

        return movieRepository.save(newMovie);
    }
}
