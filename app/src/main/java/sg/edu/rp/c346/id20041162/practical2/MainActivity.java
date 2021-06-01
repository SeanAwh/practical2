package sg.edu.rp.c346.id20041162.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton catBtn, cowBtn, crocodileBtn, camelBtn, chickenBtn, dogBtn, deerBtn, donkeyBtn, duckBtn, dolphinBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        catBtn = findViewById(R.id.catBtn);
        cowBtn = findViewById(R.id.cowBtn);
        crocodileBtn = findViewById(R.id.crocodileBtn);
        camelBtn = findViewById(R.id.camelBtn);
        chickenBtn = findViewById(R.id.chickenBtn);
        dogBtn = findViewById(R.id.dogBtn);
        deerBtn = findViewById(R.id.deerBtn);
        donkeyBtn = findViewById(R.id.donkeyBtn);
        duckBtn = findViewById(R.id.duckBtn);
        dolphinBtn = findViewById(R.id.dolphinBtn);

        //cat button
        catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,animalDescriptionActivity.class);
                intent.putExtra("image", "cat");
                intent.putExtra("name",getString(R.string.cat));
                intent.putExtra("description", getString(R.string.catDes));
                intent.putExtra("url", getString(R.string.catUrl));
                startActivity(intent);
            }
        });

        //cow button
        cowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,animalDescriptionActivity.class);
                intent.putExtra("image", "cow");
                intent.putExtra("name",getString(R.string.cow));
                intent.putExtra("description", getString(R.string.cowDes));
                intent.putExtra("url", getString(R.string.cowUrl));
                startActivity(intent);
            }
        });

        //crocodile button
        crocodileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,animalDescriptionActivity.class);
                intent.putExtra("image", "crocodile");
                intent.putExtra("name",getString(R.string.crocodile));
                intent.putExtra("description", getString(R.string.crocodileDes));
                intent.putExtra("url", getString(R.string.crocodileUrl));
                startActivity(intent);
            }
        });

        //camel button
        camelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,animalDescriptionActivity.class);
                intent.putExtra("image", "camel");
                intent.putExtra("name",getString(R.string.camel));
                intent.putExtra("description", getString(R.string.camelDes));
                intent.putExtra("url", getString(R.string.camelUrl));
                startActivity(intent);
            }
        });

        //chicken button
        chickenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,animalDescriptionActivity.class);
                intent.putExtra("image", "chicken");
                intent.putExtra("name",getString(R.string.chicken));
                intent.putExtra("description", getString(R.string.chickenDes));
                intent.putExtra("url", getString(R.string.chickenUrl));
                startActivity(intent);
            }
        });

        //dog button
        dogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,animalDescriptionActivity.class);
                intent.putExtra("image", "dog");
                intent.putExtra("name",getString(R.string.dog));
                intent.putExtra("description", getString(R.string.dogDes));
                intent.putExtra("url", getString(R.string.dogUrl));
                startActivity(intent);
            }
        });

        //deer button
        deerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,animalDescriptionActivity.class);
                intent.putExtra("image", "deer");
                intent.putExtra("name",getString(R.string.deer));
                intent.putExtra("description", getString(R.string.deerDes));
                intent.putExtra("url", getString(R.string.deerUrl));
                startActivity(intent);
            }
        });

        //donkey button
        donkeyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,animalDescriptionActivity.class);
                intent.putExtra("image", "donkey");
                intent.putExtra("name",getString(R.string.donkey));
                intent.putExtra("description", getString(R.string.donkeyDes));
                intent.putExtra("url", getString(R.string.donkeyUrl));
                startActivity(intent);
            }
        });

        //duck button
        duckBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,animalDescriptionActivity.class);
                intent.putExtra("image", "duck");
                intent.putExtra("name",getString(R.string.duck));
                intent.putExtra("description", getString(R.string.duckDes));
                intent.putExtra("url", getString(R.string.duckUrl));
                startActivity(intent);
            }
        });

        //dolphin button
        dolphinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,animalDescriptionActivity.class);
                intent.putExtra("image", "dolphin");
                intent.putExtra("name",getString(R.string.dolphin));
                intent.putExtra("description", getString(R.string.dolphinDes));
                intent.putExtra("url", getString(R.string.dolphinUrl));
                startActivity(intent);
            }
        });

    }
}