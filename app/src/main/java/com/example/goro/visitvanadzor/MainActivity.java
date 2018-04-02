package com.example.goro.visitvanadzor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Person> persons;
    private RecyclerView rv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Ամենօրյա", "23 years old", R.drawable.amenorya));
        persons.add(new Person("Քաղաքը անձրևին", "25 years old", R.drawable.andzrevayin));
        persons.add(new Person("Արցախ պուրակ", "35 years old", R.drawable.arcakh));
        persons.add(new Person("Ձմեռ", "35 years old", R.drawable.dzmerayin));
        persons.add(new Person("Վանաձորի 7 հրաշալիքները", "35 years old", R.drawable.hamajnapatker));
        persons.add(new Person("Լճեր", "35 years old", R.drawable.ljer_mets));
        persons.add(new Person("Վարպետ Մեհրաբ", "35 years old", R.drawable.mehrab_aghbyur));
        persons.add(new Person("Նավակ", "35 years old", R.drawable.ljer_navak));
        persons.add(new Person("Լուսաբաց", "35 years old", R.drawable.mtnshagh));
        persons.add(new Person("Հանգիստ", "35 years old", R.drawable.ljer_taghavar));
        persons.add(new Person("Արվեստ", "35 years old", R.drawable.patkerasrah));
        persons.add(new Person("Ղարաքիլիսա", "35 years old", R.drawable.sb_sargis));
        persons.add(new Person("Թռչնի թռիչք", "35 years old", R.drawable.verevic));
        persons.add(new Person("Գրականություն", "35 years old", R.drawable.zoryan));
    }

    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(persons, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Toast.makeText(MainActivity.this, "Clicked Item: "+position,Toast.LENGTH_SHORT).show();
            }
        });
        rv.setAdapter(adapter);
    }


}
