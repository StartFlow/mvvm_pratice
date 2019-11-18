package zzs.example.demo.navigationtemp.kit;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 * ThreadPool.class
 *
 * 用于后台任务的线程池
 *
 * @author zzs
 * @date 2019-11-18
 */
public class ThreadPool {


    private static ExecutorService pool  ;

    private  static ThreadPool INSTANCE;

    public static ThreadPool getInstance(){
        if (INSTANCE==null){
            synchronized (ThreadPool.class){
                if (INSTANCE==null){
                    if (pool==null){
                        throw new IllegalStateException("pool  does't call init");
                    }
                    INSTANCE = new ThreadPool();
                }
            }
        }
        return INSTANCE;
    }

    public static void init(){
        pool = Executors.newSingleThreadExecutor();
        //positive to do
//        pool = new ThreadPoolExecutor(2,50,200L,
//                TimeUnit.MILLISECONDS,new LinkedBlockingDeque<Runnable>(512),new ThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
    }


    public  void execute(Runnable runnable){
        pool.execute(runnable);
    }

    public static void shutDownPool(){
        if (pool!=null){
            pool.shutdown();
        }
    }
}
