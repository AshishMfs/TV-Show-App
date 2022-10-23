package mfs.ashish.tv.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;

import mfs.ashish.tv.R;
import mfs.ashish.tv.models.TvShowResponse;
import mfs.ashish.tv.viewmodels.MostPopularTvShowsViewModel;

public class MainActivity extends AppCompatActivity {
    private MostPopularTvShowsViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MostPopularTvShowsViewModel.class);

        viewModel.getMostPopularTvShows(0).observe(this, obj ->
            Log.e("Rajneesh", obj.toString())
        );
    }
}