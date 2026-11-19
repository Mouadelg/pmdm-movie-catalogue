package edu.iesam.moviecataloguepmdm.domain.repository

import edu.iesam.moviecataloguepmdm.domain.model.Movie

interface MovieRepository {
    fun getAll(): List<Movie>
}