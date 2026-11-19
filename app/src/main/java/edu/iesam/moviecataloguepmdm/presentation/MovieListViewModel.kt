package edu.iesam.moviecataloguepmdm.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import edu.iesam.moviecataloguepmdm.domain.model.Movie
import edu.iesam.moviecataloguepmdm.domain.usecase.GetMoviesUseCase

class MovieListViewModel(
    private val getMoviesUseCase: GetMoviesUseCase
) : ViewModel() {
    companion object{
        fun factory(
            getMoviesUseCase: GetMoviesUseCase
        ) = viewModelFactory {
            initializer { MovieListViewModel(getMoviesUseCase) }
        }
    }

    private val _uiState =  MutableLiveData<UiState>()
    val uiState: LiveData<UiState> = _uiState

    data class UiState(
            val isLoading: Boolean = false,
            val hasError: Boolean = false,
            val listMovies: List<Movie>? = null,
            val movie: Movie? = null
    )

    fun loadMovies(){
        // Mostramos el Loading
        _uiState.value = UiState(isLoading = true)

        // Mostramos datos
        _uiState.value = UiState(
            listMovies = getMoviesUseCase.invoke()
        )

    }


}