 package com.example.space;

 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.view.animation.Animation;
 import android.view.animation.AnimationUtils;
 import android.widget.Button;
 import android.widget.TextView;


 import androidx.appcompat.app.AppCompatActivity;


 public class Beginning<l> extends AppCompatActivity {
     public int l = 0;
     Background text1 = new Background();


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         TextView text = findViewById(R.id.textView);
         TextView text2 = findViewById(R.id.textView2);
         TextView text3 = findViewById(R.id.textView3);
         TextView text4 = findViewById(R.id.textView4);
         TextView text5 = findViewById(R.id.textView5);
         TextView text6 = findViewById(R.id.textView6);
         TextView text7 = findViewById(R.id.textView7);
         TextView text8 = findViewById(R.id.textView8);
         Button button = findViewById(R.id.button);

         text.setText(text1.text_s[0]);
         text2.setText(text1.text_s2[0]);
         text3.setText(text1.text_s3[0]);
         text4.setText(text1.text_s4[0]);
         text5.setText(text1.text_s5[0]);
         text6.setText(text1.text_s6[0]);
         text7.setText(text1.text_s7[0]);
         text8.setText(text1.text_s8[0]);

         text.setVisibility(View.INVISIBLE);
         text2.setVisibility(View.INVISIBLE);
         text3.setVisibility(View.INVISIBLE);
         text4.setVisibility(View.INVISIBLE);
         text5.setVisibility(View.INVISIBLE);
         text6.setVisibility(View.INVISIBLE);
         text7.setVisibility(View.INVISIBLE);
         text8.setVisibility(View.INVISIBLE);
         button.setVisibility(View.INVISIBLE);

         init();
     }

     private void init() {
         Animation textAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
         Animation textAnim2 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha2);
         Animation textAnim3 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha3);
         Animation textAnim4 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha4);
         Animation textAnim5 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha5);
         Animation textAnim6 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha6);
         Animation textAnim7 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha7);
         Animation textAnim8 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha8);
         Animation butAnim9 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha9);

         TextView text = findViewById(R.id.textView);
         TextView text2 = findViewById(R.id.textView2);
         TextView text3 = findViewById(R.id.textView3);
         TextView text4 = findViewById(R.id.textView4);
         TextView text5 = findViewById(R.id.textView5);
         TextView text6 = findViewById(R.id.textView6);
         TextView text7 = findViewById(R.id.textView7);
         TextView text8 = findViewById(R.id.textView8);
         Button button = findViewById(R.id.button);

         text.setVisibility(View.VISIBLE);
         text.startAnimation(textAnim);

         text2.setVisibility(View.VISIBLE);
         text2.startAnimation(textAnim2);

         text3.setVisibility(View.VISIBLE);
         text3.startAnimation(textAnim3);

         text4.setVisibility(View.VISIBLE);
         text4.startAnimation(textAnim4);

         text5.setVisibility(View.VISIBLE);
         text5.startAnimation(textAnim5);

         text6.setVisibility(View.VISIBLE);
         text6.startAnimation(textAnim6);

         text7.setVisibility(View.VISIBLE);
         text7.startAnimation(textAnim7);

         text8.setVisibility(View.VISIBLE);
         text8.startAnimation(textAnim8);

         button.setVisibility(View.VISIBLE);
         button.startAnimation(butAnim9);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 try {
                     Intent intent = new Intent(Beginning.this, Story.class);
                     startActivity(intent);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }

             }
         });

         default:
         break;

     }
 }
