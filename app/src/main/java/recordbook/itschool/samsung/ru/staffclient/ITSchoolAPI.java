package recordbook.itschool.samsung.ru.staffclient;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * API Interface for ITSchool
 */

public interface ITSchoolAPI {

    @GET("samsung/api/patient/list")
    Call<List<Person>> getChildrens();

    @GET("samsung/api/patient/{idi}")
    Call<Person> getChildren(@Path("idi") int id);

    @GET("samsung/api/patient/general/last")
    Call<List<Person>> getChildrensState();

    @GET("samsung/api/patient/general/list/{id}")
    Call<List<PersonStateOfHealth>> getHealth(@Path("id") int id);
}
