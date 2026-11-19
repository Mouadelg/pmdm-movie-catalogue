package edu.iesam.moviecataloguepmdm.domain.usecase

import edu.iesam.moviecataloguepmdm.domain.repository.MovieRepository

class GetMoviesUseCase(val movieRepository: MovieRepository) {
    fun getMoviesUseCase(){
        movieRepository.getAll()
    }
}