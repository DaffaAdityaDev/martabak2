package bsi.ac.id.martabak2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class FinisPayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finis_payment);

        int Total = getIntent().getIntExtra("total", 0);
        String MartabakName = getIntent().getStringExtra("martabakName");
        int MartabakImg = getIntent().getIntExtra("martabakImg", 0);
//        int position = getIntent().getIntExtra("position", 0);

        TextView namaMartabak = findViewById(R.id.namaMartabak);
        TextView totalPayment = findViewById(R.id.totalPayment);
        ImageView ViewMartabakImg = findViewById(R.id.martabakImgPayment);

        EditText Alamatfinis = findViewById(R.id.alamatfinis);
        Editable AlamatS = Alamatfinis.getText();

        Button selesaiPayment = findViewById(R.id.selesaiPayment);

        namaMartabak.setText(MartabakName);
        ViewMartabakImg.setImageResource(MartabakImg);
        totalPayment.setText(String.valueOf(Total));

        selesaiPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                    totalPayment.setText(AlamatS.toString());
                Intent intent = new Intent(FinisPayment.this, FinisPage.class);
                intent.putExtra("alamat", AlamatS.toString());
                startActivity(intent);
            }
        });

    }
}