package mx.edu.tesoem.isc.cesar.prac2njrc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Frm_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm__main);
    }

    public void pantalla3(View v) {
        Intent frm3 = new Intent(this, Frm3_MainActivity.class);
        startActivity(frm3);
        finish();
    }
}
