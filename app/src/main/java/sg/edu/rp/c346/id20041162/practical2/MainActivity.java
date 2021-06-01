package sg.edu.rp.c346.id20041162.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton catBtn, cowBtn, crocodileBtn, camelBtn, chickenBtn, dogBtn, deerBtn, donkeyBtn, duckBtn, dolphinBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}