package zzs.example.demo.navigationtemp.repository;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import zzs.example.demo.navigationtemp.bean.MovieBean;
import zzs.example.demo.navigationtemp.bean.MovieDetailBean;
import zzs.example.demo.navigationtemp.dao.MovieDao;
import zzs.example.demo.navigationtemp.network.MovieNetWorkRequest;
import zzs.example.demo.navigationtemp.repository.data.MovieDataSourceFactory;
import zzs.example.demo.navigationtemp.repository.data.MoviePageDataSource;

public class MovieRepository {

    private final String apiKey ="0b2bdeda43b5688921839c8ecb20399b";
    private final String city = "广州";
    private final int onePageSize = 8;

    private MovieNetWorkRequest mMovieNetWorkRequest;

    private MovieDao mMovieDao;

    private final String TAG = "MovieRepository";


    public MovieRepository(MovieNetWorkRequest mMoviewNetWorkRequest, MovieDao mMovieDao) {
        this.mMovieNetWorkRequest = mMoviewNetWorkRequest;
        this.mMovieDao = mMovieDao;
    }

    public LiveData<PagedList<MovieBean.SubjectsBean>> fetchMovie(String type){
    final MoviePageDataSource source = new MoviePageDataSource(mMovieNetWorkRequest,type);
        MovieDataSourceFactory factory = new MovieDataSourceFactory(source);
        PagedList.Config config =new PagedList.Config.Builder()
                .setPageSize(8)
                .setEnablePlaceholders(false)
                .setInitialLoadSizeHint(10)
                .build();

        return new LivePagedListBuilder<Integer,MovieBean.SubjectsBean>(factory,config).build();
    }

    public LiveData<MovieDetailBean> fetchMovieDetail(String id){
        final MutableLiveData<MovieDetailBean> liveData = new MutableLiveData<>();
        mMovieNetWorkRequest.fetchMovie(id, apiKey, new Callback<MovieDetailBean>() {
            @Override
            public void onResponse(Call<MovieDetailBean> call, Response<MovieDetailBean> response) {
                    final MovieDetailBean bean = response.body();
                    liveData.postValue(bean);
            }

            @Override
            public void onFailure(Call<MovieDetailBean> call, Throwable t) {

            }
        });
        return liveData;

    }
}
