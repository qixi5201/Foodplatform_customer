package tw.edu.tku.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class userview extends AppCompatActivity {
    private TextView mtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userview);
        mtext=findViewById(R.id.textView3);
        mtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(userview.this, MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}
