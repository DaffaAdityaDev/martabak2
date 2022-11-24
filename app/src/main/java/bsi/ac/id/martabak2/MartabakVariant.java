package bsi.ac.id.martabak2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MartabakVariant extends AppCompatActivity implements View.OnClickListener {

    private Button manis, telur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_martabak_variant);

        manis = (Button) findViewById(R.id.manis);
        manis.setOnClickListener(this);

        telur = (Button) findViewById(R.id.telur);
        telur.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.manis:
                startActivity(new Intent(this, MartabakManisMenu.class));
        }
    }
}