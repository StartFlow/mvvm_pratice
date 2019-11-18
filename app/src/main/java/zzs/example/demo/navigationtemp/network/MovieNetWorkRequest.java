package zzs.example.demo.navigationtemp.network;

import retrofit2.Callback;
import zzs.example.demo.navigationtemp.bean.MovieBean;
import zzs.example.demo.navigationtemp.bean.MovieDetailBean;
import zzs.example.demo.navigationtemp.network.api.MovieService;
import zzs.example.demo.navigationtemp.network.engine.NetWorkEngine;

public class MovieNetWorkRequest {

    private final String inTheater = "in_theaters";
    private final String apiKey ="0b2bdeda43b5688921839c8ecb20399b";
    private final String city = "广州";

    private static MovieNetWorkRequest request;

    private MovieService mMovieService = NetWorkEngine.create(MovieService.class);

    public static MovieNetWorkRequest getRequest() {
        if (request==null){
            synchronized (MovieNetWorkRequest.class){
                if (request==null){
                    request = new MovieNetWorkRequest();
                }
            }
        }
        return request;
    }

    public void fetchMovie(String movieType, int start, int count , Callback<MovieBean> callback){
        mMovieService.fetchMovie(movieType,apiKey,city,start,count).enqueue(callback);
    }

    public void fetchMovie(String id,String apiKey,Callback<MovieDetailBean> callback){
        mMovieService.fetchMovieDetail(id,apiKey).enqueue(callback);
    }

//    public void fetchHistory(int start, int count , Callback<MovieBean> callback){
//        mMovieService.getHistoryMovie(apiKey,city,start,count).enqueue(callback);
//
//    }

}
