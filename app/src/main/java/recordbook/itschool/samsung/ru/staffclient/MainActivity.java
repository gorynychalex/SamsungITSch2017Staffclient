package recordbook.itschool.samsung.ru.staffclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    //RecyclerView and Helpers
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    //DATA SETS NAMES
    List<Person> childFromServer = new ArrayList<>();
    List<PersonStateOfHealth> personStateOfHealths = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Prepare VIEW with RecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.childrenList);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //GET ALL CHILDRENS WITH STATE
        App.getItSchoolAPI().getChildrensState().enqueue(new Callback<List<Person>>() {
            @Override
            public void onResponse(Call<List<Person>> call, Response<List<Person>> response) {

                //Request body
                Log.d("LOG_MAIN ", " getChildrens() - On response!");
                childFromServer.addAll(response.body());

                //SHOW RESULT AT RecyclerVIEW
                mAdapter = new PersonRecyclerViewAdapter(childFromServer);
                mRecyclerView.setAdapter(mAdapter);

                Toast.makeText(MainActivity.this, "Childrens list loaded!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<List<Person>> call, Throwable t) {

            }
        });

        //GET HEALTH BY ID OF PERSON
        App.getItSchoolAPI().getHealth(1).enqueue(new Callback<List<PersonStateOfHealth>>() {
            @Override
            public void onResponse(Call<List<PersonStateOfHealth>> call, Response<List<PersonStateOfHealth>> response) {

                personStateOfHealths.addAll(response.body());
                Log.d("LOG_MAIN ", " getHealth() - On response!");
            }

            @Override
            public void onFailure(Call<List<PersonStateOfHealth>> call, Throwable t) {

            }
        });

    }

}
