package bsi.ac.id.martabak2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MartabakManisMenu extends AppCompatActivity {
    ArrayList<Martabak> MartabakModel = new ArrayList<>();
    int[] martabakImage = {R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_martabak_manis_menu);

        RecyclerView recyclerView = findViewById(R.id.mRecyclerview);

        setUpMartabak();

        MartabakRecyclerViewAdapter adapter = new MartabakRecyclerViewAdapter(this, MartabakModel);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setUpMartabak() {
        String[] MartabakName = {"manis", "manis pait"};
        String[] MartabakPrice = {"1", "2"};
        String[] MartabakBintang = {"5", "5"};

        for(int i = 0; i < MartabakName.length; i++) {
            MartabakModel.add(new Martabak(MartabakName[i], MartabakPrice[i], MartabakBintang[i],
                    martabakImage[i]));
        }
    }
}