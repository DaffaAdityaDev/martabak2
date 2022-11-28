package bsi.ac.id.martabak2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MartabakManisMenu extends AppCompatActivity implements RecyclerViewInterface{
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
        String[] MartabakName = {"martabak Pandan", "manis biasa", "manis Red velved",
        "Keju", "Kacang coklat"};
        String[] MartabakPrice = {"15000", "10000", "20000", "15000", "15000"};
        String[] MartabakBintang = {"4", "5", "5", "4", "5"};
        int[] martabakImage = {R.drawable.martabakmanis, R.drawable.martabakmanis1,
                R.drawable.martabakmanis2, R.drawable.martabaktelur3, R.drawable.martabakmanis4,};

        for(int i = 0; i < MartabakName.length; i++) {
            MartabakModel.add(new Martabak(MartabakName[i], MartabakPrice[i], MartabakBintang[i],
                    martabakImage[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MartabakManisMenu.this, MartabakPayment.class);

        intent.putExtra("MartabakName", MartabakModel.get(position).getNama());
        intent.putExtra("MartabakImage", MartabakModel.get(position).getImage());
        intent.putExtra("MartabakPrice", MartabakModel.get(position).getHarga());
        intent.putExtra("position", position);

        startActivity(intent);
    }
}