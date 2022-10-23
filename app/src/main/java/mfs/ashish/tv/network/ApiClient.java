package mfs.ashish.tv.network;


import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class ApiClient {
    private static Retrofit retrofit;

    public static  Retrofit getRetrofit(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://www.episodate.com/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
