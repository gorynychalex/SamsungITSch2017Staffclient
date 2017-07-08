package recordbook.itschool.samsung.ru.staffclient;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * App request
 */

public class App extends Application {

    //URL API
    private static final String url = "http://195.19.44.155/";

    private static ITSchoolAPI itSchoolAPI;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        //Build retrofit
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        itSchoolAPI = retrofit.create(ITSchoolAPI.class);
    }

    public static ITSchoolAPI getItSchoolAPI(){
        return itSchoolAPI;
    }

}
