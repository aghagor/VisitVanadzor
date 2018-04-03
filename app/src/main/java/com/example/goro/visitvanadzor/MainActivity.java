package com.example.goro.visitvanadzor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import shivam.developer.featuredrecyclerview.FeatureLinearLayoutManager;
import shivam.developer.featuredrecyclerview.FeaturedRecyclerView;

public class MainActivity extends AppCompatActivity {


    List<Manifacture> dummyData = new ArrayList<>();
    FeaturedRecyclerView featuredRecyclerView;
    private CustomRecyclerViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        featuredRecyclerView = (FeaturedRecyclerView) findViewById(R.id.rv);

        FeatureLinearLayoutManager layoutManager = new FeatureLinearLayoutManager(this);
        featuredRecyclerView.setLayoutManager(layoutManager);
        createDummyDataList();
        adapter = new CustomRecyclerViewAdapter(this, dummyData, new CustomItemClickListener() {
            @Override
            public void onItemClick(Manifacture obj) {
                Toast.makeText(MainActivity.this, obj.getTitle(), Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.root_layout, DitaileFragmentForManifacturies
                        .newInstanceForDitaileFragmentForManifacuries(MainActivity.this, obj)).addToBackStack(null)
                        .commit();

            }
        });
        featuredRecyclerView.setAdapter(adapter);

    }

    private void createDummyDataList() {
        Manifacture manifacture1 = new Manifacture("Վանաձորի 7 հրաշալիքները", R.drawable.sb_sargis,
                78.1, 75.2, "desc");
        Manifacture manifacture2 = new Manifacture("Վարպետաց դասեր", R.drawable.mehrab_aghbyur,
                88.1, 73.2, "desc2");
        Manifacture manifacture3 = new Manifacture("Մշակութային կենտրոններ", R.drawable.patkerasrah,
                68.1, 23.2, "desc3");
        Manifacture manifacture4 = new Manifacture("Արձաններ", R.drawable.arcakh,
                1268.1, 3223.2, "desc4");
        Manifacture manifacture5 = new Manifacture("Տեսարժան վայրեր", R.drawable.ljer_navak,
                123268.1, 32223.2, "desc5");
        Manifacture manifacture6 = new Manifacture("Հուշարձաններ", R.drawable.zoryan,
                1232.1, 3222.2, "desc6");
        Manifacture manifacture7 = new Manifacture("Պատմական", R.drawable.zoryan,
                6481232.1, 15483222.2, "desc7");

        dummyData.add(manifacture1);
        dummyData.add(manifacture2);
        dummyData.add(manifacture3);
        dummyData.add(manifacture4);
        dummyData.add(manifacture5);
        dummyData.add(manifacture6);
        dummyData.add(manifacture7);

    }

}






