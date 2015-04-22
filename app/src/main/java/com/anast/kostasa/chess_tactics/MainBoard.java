package com.anast.kostasa.chess_tactics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KostasA on 4/21/2015.
 */
public class MainBoard extends Activity implements View.OnClickListener {
    Button btn1,btn2;
    ImageView image;
    TextView tv;
    static int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainboard);

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        image = (ImageView) findViewById(R.id.iv1);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotation));

        image.setImageResource(R.drawable.cp1);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        btn1.startAnimation(AnimationUtils.loadAnimation(this,R.anim.rotation));
        switch (v.getId()){
            case R.id.btn1:
                switch (i){
                    case 1:
                        image.setImageResource(R.drawable.cp2);
                        i++;
                        break;
                    case 2:
                        image.setImageResource(R.drawable.cp3);
                        i++;
                        break;
                    case 3:
                        image.setImageResource(R.drawable.cp4);
                        i++;
                        break;


                }





                break;
            case R.id.btn2:

                Intent goToNextActivity = new Intent(getApplicationContext(),Cp2.class);
                startActivity(goToNextActivity);

                break;

        }
    }
}
