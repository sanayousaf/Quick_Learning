package com.devstrings.elearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.devstrings.elearning.Adapter.FragmentAdapter;
import com.stepstone.stepper.StepperLayout;
import com.stepstone.stepper.VerificationError;

public class MainActivity extends AppCompatActivity implements StepperLayout.StepperListener {

    private StepperLayout stepperLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        stepperLayout=findViewById(R.id.StepperLayout);
        stepperLayout.setAdapter(new FragmentAdapter(getSupportFragmentManager(),this));
        stepperLayout.setListener(this);



    }

    @Override
    public void onCompleted(View completeButton) {

    }

    @Override
    public void onError(VerificationError verificationError) {

    }

    @Override
    public void onStepSelected(int newStepPosition)
    {
       // Toast.makeText(this, " " + newStepPosition, Toast.LENGTH_SHORT).show();

       // getSupportFragmentManager().beginTransaction().replace().replace().commit();

    }

    @Override
    public void onReturn() {

    }
}

// requestWindowFeature(Window.FEATURE_NO_TITLE);
//  this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

