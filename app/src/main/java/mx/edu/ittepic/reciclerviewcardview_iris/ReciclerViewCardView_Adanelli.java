package mx.edu.ittepic.reciclerviewcardview_iris;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReciclerViewCardView_Adanelli extends AppCompatActivity {

    //List<ObraMusical> obraMusicals;
    RecyclerView recycler;
    List<ObraMusical> obraMusicalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicler_view_card_view__adanelli);


        recycler=findViewById(R.id.recyclerviewc);

        recycler.setHasFixedSize(true);


        LinearLayoutManager llm = new LinearLayoutManager(ReciclerViewCardView_Adanelli.this);
        recycler.setLayoutManager(llm);


        AdapterDato adapter = new AdapterDato(obraMusicalList);
        //recycler.setAdapter(adapter);
    }
}
