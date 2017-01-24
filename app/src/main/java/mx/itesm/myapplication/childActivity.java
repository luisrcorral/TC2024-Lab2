package mx.itesm.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class childActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        TextView myTextView = (TextView) findViewById(R.id.textView3);
        myTextView.setText("The message sent was: " + id);
    }
}
