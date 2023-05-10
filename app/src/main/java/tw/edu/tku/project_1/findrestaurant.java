package tw.edu.tku.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class findrestaurant extends AppCompatActivity {
    private ImageView imageView1,imageView2,imageView3,imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.findrestaurant);
        imageView1=findViewById(R.id.imageView);
        imageView2=findViewById(R.id.imageView3);
        imageView3=findViewById(R.id.imageView4);
        imageView4=findViewById(R.id.imageView5);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(findrestaurant.this,userview.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(findrestaurant.this,enterestaurant.class);
                startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(findrestaurant.this,enterestaurant.class);
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(findrestaurant.this,enterestaurant.class);
                startActivity(intent);
            }
        });
    }
}
