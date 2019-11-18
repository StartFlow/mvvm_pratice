package zzs.example.demo.navigationtemp.viewmodel;

import androidx.lifecycle.ViewModel;

import zzs.example.demo.navigationtemp.bean.Word;
import zzs.example.demo.navigationtemp.repository.WordRepository;

public class WordHandleViewModel extends ViewModel {

    private WordRepository wordRepository;

    public WordHandleViewModel(WordRepository wordRepository) {
        this.wordRepository = wordRepository;
    }

    public void insertWord(Word word){
        wordRepository.insertWord(word);
    }

    public void deleteWord(Word word){
        wordRepository.deleteWord(word);
    }
}
