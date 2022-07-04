package com.example.easetudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class quiz extends AppCompatActivity {

    private String selectedTopicName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        
        final LinearLayout java = findViewById(R.id.javaLayout);
        final LinearLayout php = findViewById(R.id.phpLayout);
        final LinearLayout html = findViewById(R.id.htmlLayour);
        final LinearLayout cplusplus = findViewById(R.id.cplusplusLayout);

        final Button startBtn = findViewById(R.id.startquizbtn);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                selectedTopicName = "java";

                java.setBackgroundResource(R.drawable.round_back_white_stroke10);

                php.setBackgroundResource(R.drawable.quizround_backwhite);
                html.setBackgroundResource(R.drawable.quizround_backwhite);
                cplusplus.setBackgroundResource(R.drawable.quizround_backwhite);




            }
        });

            php.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    selectedTopicName = "php";

                    php.setBackgroundResource(R.drawable.round_back_white_stroke10);

                    java.setBackgroundResource(R.drawable.quizround_backwhite);
                    html.setBackgroundResource(R.drawable.quizround_backwhite);
                    cplusplus.setBackgroundResource(R.drawable.quizround_backwhite);
                }
            });

            html.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    selectedTopicName = "html";

                    html.setBackgroundResource(R.drawable.round_back_white_stroke10);

                    php.setBackgroundResource(R.drawable.quizround_backwhite);
                    java.setBackgroundResource(R.drawable.quizround_backwhite);
                    cplusplus.setBackgroundResource(R.drawable.quizround_backwhite);

                }
            });

            cplusplus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    selectedTopicName = "cplusplus";

                    cplusplus.setBackgroundResource(R.drawable.round_back_white_stroke10);

                    php.setBackgroundResource(R.drawable.quizround_backwhite);
                    java.setBackgroundResource(R.drawable.quizround_backwhite);
                    html.setBackgroundResource(R.drawable.quizround_backwhite);

                }
            });

            startBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (selectedTopicName.isEmpty()){
                        Toast.makeText(quiz.this, "Please select the Topic", Toast.LENGTH_SHORT).show();
                    }
                    else {

                        Intent intent = new Intent(quiz.this, quizsecondpage.class);
                        intent.putExtra("selectedTopic", selectedTopicName);
                        startActivity(intent);
                    }
                }
            });

    }
}