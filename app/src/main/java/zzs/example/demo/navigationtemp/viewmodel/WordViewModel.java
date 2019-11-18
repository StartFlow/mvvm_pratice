package zzs.example.demo.navigationtemp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import zzs.example.demo.navigationtemp.bean.Word;
import zzs.example.demo.navigationtemp.repository.WordRepository;

public class WordViewModel extends ViewModel {

    private WordRepository mWordRepository;


    public WordViewModel(WordRepository mWordRepository) {
        this.mWordRepository = mWordRepository;
    }

    public LiveData<List<Word>> fetchAllWords (){
        return mWordRepository.fetchAllWords();
    }

    public void insertWord(Word word){
        mWordRepository.insertWord(word);
    }

}
