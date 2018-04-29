package whaapps.belajarmembuatlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.textalay.AlayHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = "Reno pergi ke Bali";
        String textalay = AlayHelper.alaynize(text);


    }
}
