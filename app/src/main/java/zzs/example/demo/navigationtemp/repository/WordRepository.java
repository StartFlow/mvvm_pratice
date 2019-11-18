package zzs.example.demo.navigationtemp.repository;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.Date;
import java.util.List;

import zzs.example.demo.navigationtemp.bean.Word;
import zzs.example.demo.navigationtemp.dao.WordDao;
import zzs.example.demo.navigationtemp.database.WordRoomDatabase;
import zzs.example.demo.navigationtemp.kit.ThreadPool;

public class WordRepository {

    final String TAG = "WordRepository";
    private WordDao mWordDao;

    public WordRepository() {
        mWordDao = WordRoomDatabase.getInstance().wordDao();
    }


    public LiveData<List<Word>> fetchAllWords(){
        final MutableLiveData<List<Word>> wordLiveData = new MutableLiveData<>();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                List<Word> allWords = mWordDao.getAllWords();
                wordLiveData.postValue(allWords);
                Log.e(TAG, Thread.currentThread().getName() + " time = " + new Date().toString());

            }
        };
       ThreadPool.getInstance().execute(runnable);
        return  wordLiveData;
    }



    public void insertWord(final Word word){
        Runnable insertWord  = new Runnable() {
            @Override
            public void run() {
                mWordDao.insert(word);
            }
        };
        ThreadPool.getInstance().execute(insertWord);
    }

    public void deleteWord(final Word word){
        Runnable deleteWord = new Runnable() {
            @Override
            public void run() {
             mWordDao.delete(word);
            }
        };
        ThreadPool.getInstance().execute(deleteWord);
    }

}
