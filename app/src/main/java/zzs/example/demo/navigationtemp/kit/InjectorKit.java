package zzs.example.demo.navigationtemp.kit;

import zzs.example.demo.navigationtemp.factory.MovieFactory;
import zzs.example.demo.navigationtemp.factory.WordFactory;
import zzs.example.demo.navigationtemp.factory.WordHandleFactory;

public class InjectorKit {



    private static WordFactory mWordFactory;



    private static MovieFactory mMovieFactory;

    public static WordHandleFactory getmWordHandleFactory() {
        if (mWordHandleFactory==null){
            mWordHandleFactory = new WordHandleFactory();
        }
        return mWordHandleFactory;
    }

    private static WordHandleFactory mWordHandleFactory;

    public static WordFactory getmWordFactory() {
        if (mWordFactory==null){
            mWordFactory = new WordFactory();
        }
        return mWordFactory;
    }

    public static MovieFactory getmMovieFactory() {
        if (mMovieFactory==null){
            mMovieFactory = new MovieFactory();
        }
        return mMovieFactory;
    }


}
