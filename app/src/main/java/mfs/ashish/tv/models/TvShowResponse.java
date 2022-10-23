package mfs.ashish.tv.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import mfs.ashish.tv.models.TvShow;

public class TvShowResponse {
    @SerializedName("page")
    private int page;

    @SerializedName("pages")
    private int totalpages;

    @SerializedName("tv_show")
    private List<TvShow>tvShows;

    public int getPage() {
        return page;
    }

    public int getTotalpages() {
        return totalpages;
    }

    public List<TvShow> getTvShows() {
        return tvShows;
    }
}
