package vitortellesescame.com.atividadereflexiva;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import vitortellesescame.com.atividadereflexiva.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    ArrayList<String> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        items = new ArrayList<>();
        items.add("KIT DE FESTA 1");
        items.add("KIT DE FESTA 2");
        items.add("KIT DE FESTA 3");
        items.add("KIT DE FESTA 4");
        items.add("KIT DE FESTA 5");
        items.add("KIT DE FESTA 6");

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, items);
        recyclerView.setAdapter(adapter);




    }


}