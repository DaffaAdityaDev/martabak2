package bsi.ac.id.martabak2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinisPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finis_page);

        String Text = "test";

        String alamat = getIntent().getStringExtra("alamat");

        TextView alamatText = findViewById(R.id.alamatfinispage);
        Button buttonKembali = findViewById(R.id.kembaliButtonFinis);

        alamatText.setText(alamat);
        buttonKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinisPage.this, MartabakVariant.class));
            }
        });
    }
}