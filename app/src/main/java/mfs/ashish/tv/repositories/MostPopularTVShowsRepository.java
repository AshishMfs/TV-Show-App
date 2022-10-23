package mfs.ashish.tv.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import mfs.ashish.tv.models.TvShow;
import mfs.ashish.tv.network.ApiClient;
import mfs.ashish.tv.network.ApiService;
import mfs.ashish.tv.models.TvShowResponse;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

public class MostPopularTVShowsRepository {

    private ApiService apiService;

    public MostPopularTVShowsRepository(){
        apiService = ApiClient.getRetrofit().create(ApiService.class);
    }

    public LiveData<TvShowResponse> getMostPopularTvShows(int page) {
        MutableLiveData<TvShowResponse> data = new MutableLiveData();
        
        apiService.getMostPopularTvShow(page).enqueue(new Callback<TvShowResponse>() {
            @Override
            public void onResponse(Response<TvShowResponse> response, Retrofit retrofit) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                data.setValue(null);
            }
        });

        return data;
    }
}
