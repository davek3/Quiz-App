package com.Krishna.Quiz_app.Act;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.Krishna.Quiz_app.MainActivity;
import com.Krishna.Quiz_app.R;

public class ResultActivity extends AppCompatActivity {
    private TextView score_detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        setTitle("Result");
        score_detail=(TextView)findViewById(R.id.your_score);
        score_detail.setText("Your Score : "+getIntent().getIntExtra("Score",0));
        findViewById(R.id.pa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ResultActivity.this, MainActivity.class));
        finish();
    }
}
