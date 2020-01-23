package com.example.tictactoe;
import java.lang.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //ImageView mg
    int player=0;
Button bt;
   private int[][] win ={{1,2,3},{4,5,6},{7,8,9},{1,4,7},{2,5,8},{3,6,9},{1,5,9},{3,5,7}};
   char [ ] pos= {'a','b','c','d','e','f','g','h','k','r'} ;
 public void Tap(View view){


        ImageView mg = (ImageView) view;

        int Getposition = Integer.parseInt(mg.getTag().toString());

        if (player == 0) {
            mg.setImageResource(R.drawable.o);
            pos[Getposition]='o';
            player = 1;
        } else {
            mg.setImageResource(R.drawable.x);
            pos[Getposition]='x';
            player = 0;
        }

        for(int i=0;i<8;i++) {

            if (pos[win[i][0]]==pos[win[i][1]]&&pos[win[i][0]]==pos[win[i][2]]) {
                Toast.makeText(this, "you Won", Toast.LENGTH_SHORT).show();

            }
        }
 }
public void reset(View view){
    bt=findViewById(R.id.button4);


    ((ImageView)findViewById(R.id.imageView9)).setImageResource(0);
    ((ImageView)findViewById(R.id.imageView1)).setImageResource(0);
    ((ImageView)findViewById(R.id.imageView2)).setImageResource(0);
    ((ImageView)findViewById(R.id.imageView3)).setImageResource(0);
    ((ImageView)findViewById(R.id.imageView4)).setImageResource(0);
    ((ImageView)findViewById(R.id.imageView5)).setImageResource(0);
    ((ImageView)findViewById(R.id.imageView6)).setImageResource(0);
    ((ImageView)findViewById(R.id.imageView7)).setImageResource(0);
    ((ImageView)findViewById(R.id.imageView8)).setImageResource(0);
    int[][] win ={{1,2,3},{4,5,6},{7,8,9},{1,4,7},{2,5,8},{3,6,9},{1,5,9},{3,5,7}};


    Toast.makeText(MainActivity.this, "o will start first", Toast.LENGTH_SHORT).show();
    // making a new variable due to chr hence not workimg :  char [ ] pos= {'a','b','c','d','e','f','g','h','k','r'} ;

     // doesnot work without placing values manually pos [] = {'a','b','c','d','e','f','g','h','k','r'} ;

pos[9]='r';
    pos[0]='a';
    pos[1]='b';
    pos[2]='c';
    pos[3]='d';
    pos[4]='e';
    pos[5]='f';
    pos[6]='g';
    pos[7]='h';
    pos[8]='k';


}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "o will start first", Toast.LENGTH_SHORT).show();

    }
}
