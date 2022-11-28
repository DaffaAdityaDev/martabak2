package bsi.ac.id.martabak2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MartabakPayment extends AppCompatActivity  {
    int jumlah = 1;
    int harga = 0;
    int total = 0;
    TextView ViewTotal;
    TextView ViewMartabakJumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_martabak_payment);

        Button PaymentButton = (Button) findViewById(R.id.PaymentButton);
        PaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MartabakPayment.this, FinisPayment.class);
                startActivity(Intent);
            }
        });
        TextView increment = (TextView) findViewById(R.id.increment);
        TextView decrement = (TextView) findViewById(R.id.decrement);
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jumlah++;
                total = jumlah * harga;
                ViewMartabakJumlah.setText(String.valueOf(jumlah));
                ViewTotal.setText(String.valueOf(total));
            }
        });
        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(jumlah <= 0) {
                    return;
                }
                jumlah--;
                total = jumlah * harga;
                ViewMartabakJumlah.setText(String.valueOf(jumlah));
                ViewTotal.setText(String.valueOf(total));
            }
        });

        String MartabakName = getIntent().getStringExtra("MartabakName");
        String MartabakPrice = getIntent().getStringExtra("MartabakPrice");
        harga = Integer.parseInt(MartabakPrice);
        int MartabakImg = getIntent().getIntExtra("MartabakImage", 0);


        TextView TextMartabakName = findViewById(R.id.martabakNamaPaymen);
        TextView TextMartabakPrice = findViewById(R.id.MartabakPricePaymen);
        ImageView ViewMartabakImg = findViewById(R.id.martabakImg);
        ViewTotal = findViewById(R.id.totalHarga);
        ViewMartabakJumlah = findViewById(R.id.jumlahMartabak);

        TextMartabakName.setText(MartabakName);
        TextMartabakPrice.setText(MartabakPrice);
        ViewMartabakImg.setImageResource(MartabakImg);
        ViewMartabakJumlah.setText(String.valueOf(jumlah));
        ViewTotal.setText(String.valueOf(total));

    }
}