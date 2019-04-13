package id.ciamiscode.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerifActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Tanggal Pengerjaan : 13/4/2019
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Kelas : AKB-9
     */

    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verif);

        btn_send = findViewById(R.id.btn_send);
        btn_send.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_send){
            Intent send = new Intent(this,HomeActivity.class);
            startActivity(send);
        }
    }
}
