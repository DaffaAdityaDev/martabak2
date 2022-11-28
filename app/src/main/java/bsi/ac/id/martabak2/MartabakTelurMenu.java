package bsi.ac.id.martabak2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import bsi.ac.id.martabak2.databinding.ActivityMartabakTelurMenuBinding;

public class MartabakTelurMenu extends AppCompatActivity implements RecyclerViewInterface {
    ArrayList<Martabak> MartabakModel = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_martabak_manis_menu);
        RecyclerView recyclerView = findViewById(R.id.mRecyclerview);

        setUpMartabak();

        MartabakRecyclerViewAdapter adapter = new MartabakRecyclerViewAdapter(this, MartabakModel, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpMartabak() {
        String[] MartabakName = {"Telur Biasa", "2 Telur Biasa", "3 Telur Biasa",
        "Telur bebek biasa", "2 Telur bebek"};
        String[] MartabakPrice = {"10000", "15000", "20000", "30000", "40000"};
        String[] MartabakBintang = {"5", "5", "5", "4", "5"};
        int[] martabakImage = {R.drawable.martabaktelur1, R.drawable.martabaktelur2,
        R.drawable.martabaktelur3, R.drawable.martabaktelur4, R.drawable.martabaktelur5};

        for(int i = 0; i < MartabakName.length; i++) {
            MartabakModel.add(new Martabak(MartabakName[i], MartabakPrice[i], MartabakBintang[i],
                    martabakImage[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MartabakTelurMenu.this, MartabakPayment.class);

        intent.putExtra("MartabakName", MartabakModel.get(position).getNama());
        intent.putExtra("MartabakImage", MartabakModel.get(position).getImage());
        intent.putExtra("MartabakPrice", MartabakModel.get(position).getHarga());

        startActivity(intent);

    }
}