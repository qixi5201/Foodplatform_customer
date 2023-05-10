package tw.edu.tku.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class enterestaurant extends AppCompatActivity {
    private Button mbutton1,mbutton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enterestaurant);
        mbutton1=findViewById(R.id.button5);
        mbutton2=findViewById(R.id.button6);
        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(enterestaurant.this,waiting.class);
                startActivity(intent);
            }
        });
        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(enterestaurant.this,choose.class);
                startActivity(intent);
            }
        });
    }
}
