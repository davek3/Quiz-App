package com.Krishna.Quiz_app.Act;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.Krishna.Quiz_app.MainActivity;
import com.Krishna.Quiz_app.Questions.Question;
import com.Krishna.Quiz_app.R;

public class StartQuizeActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView Score_t,Question_t;
    private Button bt1,bt2,bt3,bt4;
    private Question questions;
    private String answer;
    public static int grandtotal;
    private int questionno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
        setTitle("Questions");
        questions=new Question();
        Score_t = (TextView) findViewById(R.id.total);
        Question_t = (TextView) findViewById(R.id.question);
        bt1= (Button) findViewById(R.id.op1);
        bt2 = (Button) findViewById(R.id.op2);
        bt3 = (Button) findViewById(R.id.op3);
        bt4 = (Button) findViewById(R.id.op4);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        questionno=0;
        load_questions();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.op1:
                op1();
                break;
            case R.id.op2:
                op2();
                break;
            case R.id.op3:
                op3();
                break;
            case R.id.op4:
                op4();
                break;
        }
    }

    private void op1() {
        if (bt1.getText().equals(answer)) {
            grandtotal = grandtotal + 1;
            updatescoreData(grandtotal);
            load_questions();
            Toast.makeText(StartQuizeActivity.this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(StartQuizeActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
            load_questions();
        }
    }
    private void op2() {
        if (bt2.getText().equals(answer)) {
            grandtotal = grandtotal + 1;
            updatescoreData(grandtotal);
            load_questions();
            Toast.makeText(StartQuizeActivity.this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(StartQuizeActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
            load_questions();
        }
    }
    private void op3() {
        if (bt3.getText().equals(answer)) {
            grandtotal = grandtotal + 1;
            updatescoreData(grandtotal);
            load_questions();
            Toast.makeText(StartQuizeActivity.this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(StartQuizeActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
            load_questions();
        }
    }

    private void op4() {
        if (bt4.getText().equals(answer)) {
            grandtotal = grandtotal + 1;
            updatescoreData(grandtotal);
            load_questions();
            Toast.makeText(StartQuizeActivity.this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(StartQuizeActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
            load_questions();
        }
    }
    private void load_questions() {
        if (questionno < questions.getLength()) {
            Question_t.setText(questions.getQuestion(questionno));
            bt1.setText(questions.getChoice1(questionno));
            bt2.setText(questions.getChoice2(questionno));
            bt3.setText(questions.getChoice3(questionno));
            bt4.setText(questions.getChoice4(questionno));
            answer = questions.getCorrectAnswer(questionno);
            questionno++;
        } else {
            Log.d("error","The er"+grandtotal);
            startActivity(new Intent(StartQuizeActivity.this, ResultActivity.class).putExtra("Score",grandtotal));
            finish();
        }
    }
    private void updatescoreData(int point) {
        Score_t.setText("" + grandtotal);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(StartQuizeActivity.this, MainActivity.class));
        finish();
    }
}
