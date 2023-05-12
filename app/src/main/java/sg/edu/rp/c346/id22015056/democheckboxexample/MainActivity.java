package sg.edu.rp.c346.id22015056.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbEnabled=findViewById(R.id.checkBoxDiscount);
        btnCheck=findViewById(R.id.buttonCheck);
        tvShow=findViewById(R.id.textView);


        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String said="";
                if (cbEnabled.isChecked()) {
                    btnCheck.setEnabled(true);
                    tvShow.setText("The discount is given");
                } else {
                    btnCheck.setEnabled(false);
                    tvShow.setText("The discount is not given");

                }
                Toast.makeText(MainActivity.this, "Click Button", Toast.LENGTH_LONG).show();

            }
        });

    }
}