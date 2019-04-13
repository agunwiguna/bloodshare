package id.ciamiscode.bloodshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    /**
     * Tanggal Pengerjaan : 12/4/2019
     * NIM : 10116388
     * Nama : Agun Wiguna
     * Kelas : AKB-9
     */

    TextView tv_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_register = findViewById(R.id.tv_register);
        tv_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_register){
            Intent reg = new Intent(this,RegisterActivity.class);
            startActivity(reg);
        }
    }
}
