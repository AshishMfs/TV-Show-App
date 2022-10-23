package mfs.ashish.tv.network;

import mfs.ashish.tv.models.TvShowResponse;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

public interface ApiService {
    @GET("most-popular")
    Call<TvShowResponse> getMostPopularTvShow(@Query("page") int page);
}
