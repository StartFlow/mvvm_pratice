package zzs.example.demo.navigationtemp.network.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import zzs.example.demo.navigationtemp.bean.MovieBean;
import zzs.example.demo.navigationtemp.bean.MovieDetailBean;

public interface MovieService {

    @GET("{movie_type}")
    Call<MovieBean> fetchMovie(@Path ("movie_type")String movieType, @Query("apikey")String apikey, @Query("city")String city, @Query("start")int start, @Query("count")int count);

    @GET("subject/{movie_id}")
    Call<MovieDetailBean> fetchMovieDetail(@Path("movie_id")String id,@Query("apikey")String apiKey);
//    @GET("top250")
//    Call<MovieBean> getHistoryMovie(@Query("apikey")String apikey, @Query("city")String city, @Query("start")int start, @Query("count")int count);
    //subject/id
}

//https://api.douban.com/v2/movie/subject/30135113?apikey=0b2bdeda43b5688921839c8ecb20399b
//https://api.douban.com/v2/movie/%s?apikey=%s&city=%s&start=1&count=1
//https://api.douban.com/v2/movie/in_theaters?apikey=0b2bdeda43b5688921839c8ecb20399b&city=广州&start=1&count=1