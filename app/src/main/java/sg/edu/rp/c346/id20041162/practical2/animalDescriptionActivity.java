package sg.edu.rp.c346.id20041162.practical2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class animalDescriptionActivity extends AppCompatActivity {

    ImageView animalImg;
    TextView animalNameTv, animalDescriptionTv, animalUrlTv;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_description);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        animalImg = findViewById(R.id.animalImg);
        animalNameTv = findViewById(R.id.animalNameTv);
        animalDescriptionTv = findViewById(R.id.animalDescriptionTv);
        animalUrlTv = findViewById(R.id.animalUrlTv);

        Intent intentGot = getIntent();

        //insert animal image
        String animalRec = intentGot.getStringExtra("image");
        int id = getResources().getIdentifier(animalRec, "drawable", getPackageName());
        animalImg.setImageResource(id);

        //insert animal name
        String animalName = intentGot.getStringExtra("name");
        animalNameTv.setText(animalName.toUpperCase());

        //insert animal description
        String animalDescription = intentGot.getStringExtra("description");
        animalDescriptionTv.setText(animalDescription);

        //insert animal URL
        animalUrlTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String animalUrl = intentGot.getStringExtra("url");
                Intent goWeb = new Intent(Intent.ACTION_VIEW, Uri.parse(animalUrl));
                startActivity(goWeb);
            }
        });

        //increase font size
        registerForContextMenu(animalDescriptionTv);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.add(0,0,0,"Increase font");
        menu.add(0,1,1,"Decrease font");
    }

    float currentSize = 15f;
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {

            if(item.getItemId() == 0){
                if(currentSize >=27f){
                    Toast.makeText(animalDescriptionActivity.this,"Can't increase font size anymore",Toast.LENGTH_SHORT).show();
                }
                else{
                    currentSize +=4f;
                    animalDescriptionTv.setTextSize(TypedValue.COMPLEX_UNIT_SP,currentSize);
                }
            }
            else if(item.getItemId() == 1){
                if(currentSize <=15f){
                    Toast.makeText(animalDescriptionActivity.this,"Can't decrease font size anymore",Toast.LENGTH_SHORT).show();
                }
                else{
                    currentSize -=4f;
                    animalDescriptionTv.setTextSize(TypedValue.COMPLEX_UNIT_SP,currentSize);
                }
            }

        return super.onContextItemSelected(item);
    }
}