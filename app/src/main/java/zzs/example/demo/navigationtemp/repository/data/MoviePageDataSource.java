package zzs.example.demo.navigationtemp.repository.data;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.paging.PositionalDataSource;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import zzs.example.demo.navigationtemp.bean.MovieBean;
import zzs.example.demo.navigationtemp.network.MovieNetWorkRequest;

public class MoviePageDataSource extends PositionalDataSource<MovieBean.SubjectsBean> {
    private MovieNetWorkRequest mMovieNetWorkRequest;
    private final String TAG = "MoviePageDataSource";
    private String movieType ;

    public MoviePageDataSource(MovieNetWorkRequest mMovieNetWorkRequest,String movieType) {
        this.mMovieNetWorkRequest = mMovieNetWorkRequest;
        this.movieType = movieType;
    }

    @Override
    public void loadInitial(@NonNull LoadInitialParams params, @NonNull final LoadInitialCallback<MovieBean.SubjectsBean> callback) {
        final int position = computeInitialLoadPosition(params, params.pageSize);
        fetch(position, params.pageSize, new Callback<MovieBean>() {
            @Override
            public void onResponse(Call<MovieBean> call, Response<MovieBean> response) {
                final MovieBean bean = response.body();
                if (bean != null) {
                    List<MovieBean.SubjectsBean> movieBeans = bean.getSubjects();
                    callback.onResult(movieBeans, position, bean.getTotal());

                }
            }

            @Override
            public void onFailure(Call<MovieBean> call, Throwable t) {
                Log.e(TAG,t.getMessage());
            }
        });

    }

    @Override
    public void loadRange(@NonNull LoadRangeParams params, @NonNull final LoadRangeCallback<MovieBean.SubjectsBean> callback) {
        fetch(params.startPosition, params.loadSize, new Callback<MovieBean>() {
            @Override
            public void onResponse(Call<MovieBean> call, Response<MovieBean> response) {
                final MovieBean bean = response.body();
                if (bean != null) {
                    List<MovieBean.SubjectsBean> movieBeans = bean.getSubjects();
                    callback.onResult(movieBeans);
                }
            }

            @Override
            public void onFailure(Call<MovieBean> call, Throwable t) {
                    Log.e(TAG,t.getMessage());
            }
        });
        Log.e(TAG,"LoadFrom = " + params.startPosition);
    }

    private void fetch(int position,int count,Callback<MovieBean> callback){
        mMovieNetWorkRequest.fetchMovie(movieType,position, count,callback);
    }
}
