package edu.iesam.moviecataloguepmdm.domain.usecase

import edu.iesam.moviecataloguepmdm.domain.model.Movie
import edu.iesam.moviecataloguepmdm.domain.repository.MovieRepository

class GetMoviesUseCase(val movieRepository: MovieRepository) {
    operator fun invoke(): List<Movie>{
        return movieRepository.getAll()
    }
}