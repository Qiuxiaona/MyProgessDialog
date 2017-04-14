package com.xiaona.myprogessdialog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;

public class progessdialog extends Activity {

    private ProgressBar firstBar=null;
    private ProgressBar secondBar=null;
    private Button myButton=null;
    private int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        firstBar = (ProgressBar) findViewById(R.id.firstBar);
        secondBar = (ProgressBar) findViewById(R.id.secondBar);
        myButton = (Button) findViewById(R.id.myButton);
        myButton.setOnClickListener(new ButtonListener());
    }
    class ButtonListener implements OnClickListener{
        @Override
        public void onClick(View view) {
            if(i==0){
                firstBar.setVisibility(view.VISIBLE);
                secondBar.setVisibility(view.VISIBLE);
                firstBar.setMax(150);
            }else if(i<firstBar.getMax()){
                firstBar.setProgress(i);
                firstBar.setSecondaryProgress(i+10);
            }else{
                firstBar.setVisibility(view.GONE);
                secondBar.setVisibility(view.GONE);
            }
            i=i+10;
        }
    }


}
