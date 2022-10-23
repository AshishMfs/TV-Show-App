package mfs.ashish.tv.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import mfs.ashish.tv.models.TvShowResponse;
import mfs.ashish.tv.repositories.MostPopularTVShowsRepository;

public class MostPopularTvShowsViewModel extends ViewModel {
    private MostPopularTVShowsRepository mostPopularTVShowsRepository;

    private MostPopularTvShowsViewModel(){
        mostPopularTVShowsRepository = new MostPopularTVShowsRepository();
    }

    public LiveData<TvShowResponse> getMostPopularTvShows(int page) {
        return mostPopularTVShowsRepository.getMostPopularTvShows(page);
    }

}
