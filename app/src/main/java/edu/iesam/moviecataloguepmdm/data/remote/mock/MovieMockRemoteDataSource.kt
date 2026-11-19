package edu.iesam.moviecataloguepmdm.data.remote.mock

import edu.iesam.moviecataloguepmdm.domain.model.Movie

class MovieMockRemoteDataSource {
    fun getAll(): List<Movie>{
        return listOf(
            Movie(
                id = "1",
                title = "Interstellar",
                director = "Christopher Nolan",
                year = 2014,
                rating = 8.7
            ),
            Movie(
                id = "2",
                title = "The Matrix",
                director = "Lana Wachowski",
                year = 1999,
                rating = 8.7
            ),
            Movie(
                id = "3",
                title = "Inception",
                director = "Christopher Nolan",
                year = 2010,
                rating = 8.8
            )
        )
    }
}