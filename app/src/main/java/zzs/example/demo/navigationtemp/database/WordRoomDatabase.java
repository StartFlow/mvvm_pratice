package zzs.example.demo.navigationtemp.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import zzs.example.demo.navigationtemp.bean.Word;
import zzs.example.demo.navigationtemp.dao.WordDao;

@Database(entities = {Word.class},version = 1)
public abstract class WordRoomDatabase  extends RoomDatabase {


    public abstract WordDao wordDao();

    private volatile static WordRoomDatabase INSTANCE;

    private static RoomDatabase.Callback callback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
        }
    };


    public static void init(final Context context){
//        String DATABASE_PATH = "/data/data/" + context.getPackageName() + "/databases/";
//        String dataBaseName = DATABASE_PATH+"/"+"qq.db";
//        final File db = new File(dataBaseName);
//        if (!db.exists()){
//            db.mkdir();
//        }
        if (INSTANCE == null) {
            synchronized (WordRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), WordRoomDatabase.class, "word_database.db")
                            .addCallback(callback)
                            .build();
                }
            }
        }
    }

    public static WordRoomDatabase getInstance(){
        if (INSTANCE==null){
            throw new IllegalStateException("word_database does't initialize");
        }
        return INSTANCE;
    }

    public static void release(){
        INSTANCE = null;
    }
}
