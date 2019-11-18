package zzs.example.demo.navigationtemp;

import android.app.Application;

import zzs.example.demo.navigationtemp.database.WordRoomDatabase;
import zzs.example.demo.navigationtemp.kit.ThreadPool;

public class app extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        WordRoomDatabase.init(getApplicationContext());
        ThreadPool.init();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        WordRoomDatabase.release();
        ThreadPool.shutDownPool();
    }
}
