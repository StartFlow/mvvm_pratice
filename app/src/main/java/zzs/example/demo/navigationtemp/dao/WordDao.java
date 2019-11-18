package zzs.example.demo.navigationtemp.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

import zzs.example.demo.navigationtemp.bean.Word;

@Dao
public interface WordDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Word word);

    @Query("DELETE FROM word_table")
    void deletaAll();

    /**
     * @return all the words in th table
     * */
    @Query("SELECT * FROM word_table")
    List<Word> getAllWords();

    @Delete
    void delete(Word word);
}
