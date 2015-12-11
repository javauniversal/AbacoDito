package abako.dito.co.sinmovil.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import abako.dito.co.sinmovil.Adapters.AdapterRecyclerMenu;
import abako.dito.co.sinmovil.R;

public class ActMenu extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_menu);

        // Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.recyclerViewTurnos);
        recycler.setHasFixedSize(true);

        // Usar un administrador para LinearLayout
        RecyclerView.LayoutManager lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);

        adapter = new AdapterRecyclerMenu(this);
        recycler.setAdapter(adapter);

    }

}
