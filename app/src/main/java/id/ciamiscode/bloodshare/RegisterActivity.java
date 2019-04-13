package id.ciamiscode.bloodshare;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    /**
     * Tanggal Pengerjaan : 12/4/2019
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Kelas : AKB-9
     */

    Button btn_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        btn_register = findViewById(R.id.btn_register);
        btn_register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_register){
            Intent almost = new Intent(this,AlmostActivity.class);
            startActivity(almost);
        }
    }
}
