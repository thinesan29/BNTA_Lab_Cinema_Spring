package com.btna.cinema.repositories;

import com.btna.cinema.models.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}