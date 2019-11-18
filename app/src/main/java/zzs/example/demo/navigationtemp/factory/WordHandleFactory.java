package zzs.example.demo.navigationtemp.factory;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import zzs.example.demo.navigationtemp.repository.WordRepository;
import zzs.example.demo.navigationtemp.viewmodel.WordHandleViewModel;

public class WordHandleFactory implements ViewModelProvider.Factory {

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T)new WordHandleViewModel(new WordRepository());
    }
}
