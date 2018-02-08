package diabla.org.diabla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //malditoviruscxsvwdfvsdvsdfvcASCASDCASD
          findViewById(R.id.enviar).setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Toast.makeText(getApplicationContext(),"tu mensaje se envio ",Toast.LENGTH_LONG).show();
              }
          });
    }
}
