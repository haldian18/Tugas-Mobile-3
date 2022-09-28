package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void panggil(View view) {
        String nomor = "08xxxxxxxxx" ;
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel",nomor,null));
        startActivity(panggil);
    }

    public void share(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(intent.EXTRA_TEXT, "Hai Saya Haldian Boleh Kenalan ???");
        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent, "Share to :"));
    }

    public void buka(View view) {
        String url = "https://youtube.com" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }

    public void tentang(View view) {
        Intent tentang= new Intent(MainActivity.this, Tentang.class);
        startActivity(tentang);
    }


}