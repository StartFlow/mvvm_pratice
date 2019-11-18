package zzs.example.demo.navigationtemp.network.engine;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetWorkEngine {

    private static final  String  Base_url = "https://api.douban.com/v2/movie/";
    private static OkHttpClient.Builder client = new OkHttpClient.Builder();
    private static Retrofit.Builder builder =new Retrofit.Builder()
            .client(client.build())
            .baseUrl(Base_url)
            .addConverterFactory(GsonConverterFactory.create());
    private static Retrofit retrofit ;

    static {
        retrofit = builder.build();
    }

    public static <T> T create(Class<T> api){
        return retrofit.create(api);
    }
}
