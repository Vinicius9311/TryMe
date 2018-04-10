package examplecolor.com.tryme;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View windowView;
    private Button tryMeButton;
    private int[] colors;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.CYAN, Color.GRAY, Color.GREEN, Color.RED,
                Color.MAGENTA, Color.YELLOW, Color.DKGRAY, Color.LTGRAY};

        windowView = findViewById(R.id.windowViewID);
        tryMeButton = findViewById(R.id.tryMebuttonId);

        //windowView.setBackgroundColor(colors[2]);

        tryMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int randomNum = random.nextInt(colors.length);
                Log.d("Random", String.valueOf(randomNum));
                windowView.setBackgroundColor(colors[randomNum]);
            }
        });
    }
}
