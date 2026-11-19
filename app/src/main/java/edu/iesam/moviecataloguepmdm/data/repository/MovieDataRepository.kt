package edu.iesam.moviecataloguepmdm.data.repository

import edu.iesam.moviecataloguepmdm.data.remote.mock.MovieMockRemoteDataSource
import edu.iesam.moviecataloguepmdm.domain.model.Movie
import edu.iesam.moviecataloguepmdm.domain.repository.MovieRepository

class MovieDataRepository(
    val mockRemoteDataSource: MovieMockRemoteDataSource
) : MovieRepository {
    override fun getAll(): List<Movie> {
        return mockRemoteDataSource.getAll()
    }
}