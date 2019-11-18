package zzs.example.demo.navigationtemp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.paging.PagedList;

import zzs.example.demo.navigationtemp.bean.MovieBean;
import zzs.example.demo.navigationtemp.bean.MovieDetailBean;
import zzs.example.demo.navigationtemp.repository.MovieRepository;

public class MovieViewModel extends ViewModel {

    private MovieRepository mMovieRepository;

    public MovieViewModel(MovieRepository mMovieRepository) {
        this.mMovieRepository = mMovieRepository;
    }

    public LiveData<PagedList<MovieBean.SubjectsBean>> fetchMovie(String type){
        return mMovieRepository.fetchMovie(type);
    }

    public LiveData<MovieDetailBean> fetchMovieDetail(String id){
        return mMovieRepository.fetchMovieDetail(id);
    }


}
