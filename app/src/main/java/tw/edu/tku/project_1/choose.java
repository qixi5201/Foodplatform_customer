package tw.edu.tku.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class choose extends AppCompatActivity {
    private Button mbutton1,mbutton2,mbutton3,mbutton4;
    private TextView textView1;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose);
        mbutton1=findViewById(R.id.button8);
        mbutton2=findViewById(R.id.button9);
        mbutton3=findViewById(R.id.button11);
        mbutton4=findViewById(R.id.button12);
        textView1=findViewById(R.id.textView12);
        imageView=findViewById(R.id.imageView13);
        mbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(choose.this,selectitem.class);
                startActivity(intent);
            }
        });
        mbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(choose.this,selectitem.class);
                startActivity(intent);
            }
        });
        mbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(choose.this,selectitem.class);
                startActivity(intent);
            }
        });
        mbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(choose.this,selectitem.class);
                startActivity(intent);
            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(choose.this,enterestaurant.class);
                startActivity(intent);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(choose.this,checkout.class);
                startActivity(intent);
            }
        });
    }
}
