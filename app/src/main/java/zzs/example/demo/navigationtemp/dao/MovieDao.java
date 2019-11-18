package zzs.example.demo.navigationtemp.dao;

public class MovieDao {

    private static MovieDao dao;

    public static MovieDao getInstance(){
        if (dao==null){
            synchronized (MovieDao.class){
                if (dao==null){
                    dao = new MovieDao();
                }
            }
        }

        return dao;
    }
}
