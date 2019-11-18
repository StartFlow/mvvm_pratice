package zzs.example.demo.navigationtemp.kit;

import android.util.Log;
/**
 *
 * @author zzs
 * 后台任务线程
 * */
public class ThreadFactory implements java.util.concurrent.ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setName("background-task-thread");
        Log.e("MyThread","name = " +thread.getName());
        return thread;
    }
}
