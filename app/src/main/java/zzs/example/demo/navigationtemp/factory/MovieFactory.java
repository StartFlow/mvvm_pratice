package zzs.example.demo.navigationtemp.factory;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import zzs.example.demo.navigationtemp.dao.MovieDao;
import zzs.example.demo.navigationtemp.network.MovieNetWorkRequest;
import zzs.example.demo.navigationtemp.repository.MovieRepository;
import zzs.example.demo.navigationtemp.viewmodel.MovieViewModel;

public class MovieFactory implements ViewModelProvider.Factory {
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T)new MovieViewModel(new MovieRepository(MovieNetWorkRequest.getRequest(), MovieDao.getInstance()));
    }
}
