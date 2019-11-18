package zzs.example.demo.navigationtemp.repository.data;

import androidx.annotation.NonNull;
import androidx.paging.DataSource;
import androidx.paging.PositionalDataSource;

import zzs.example.demo.navigationtemp.bean.MovieBean;

public class MovieDataSourceFactory extends DataSource.Factory<Integer, MovieBean.SubjectsBean> {
    private PositionalDataSource source;


    public MovieDataSourceFactory(PositionalDataSource source) {
        this.source = source;
    }

    @NonNull
    @Override
    public DataSource<Integer,MovieBean.SubjectsBean> create() {
        return source;
    }
}
