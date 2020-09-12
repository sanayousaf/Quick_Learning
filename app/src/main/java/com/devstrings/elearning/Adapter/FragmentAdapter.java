package com.devstrings.elearning.Adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

import com.devstrings.elearning.Fragments.FivthFragment;
import com.devstrings.elearning.Fragments.FourthFragment;
import com.devstrings.elearning.Fragments.FrontFragment;
import com.devstrings.elearning.Fragments.SecondFragment;
import com.devstrings.elearning.Fragments.ThirdFragment;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.adapter.AbstractFragmentStepAdapter;

public class FragmentAdapter extends AbstractFragmentStepAdapter {

    public static final String POSITION = "position";

    public FragmentAdapter(@NonNull FragmentManager fm, @NonNull Context context) {
        super(fm, context);
    }

    @Override
    public Step createStep(int position)
    {
        Step step;
        switch (position){
            case 0:
            step =new FrontFragment();
            break;
            case 1:
               step = new SecondFragment();
                break;
            case 2:
                step=new ThirdFragment();
                break;
            case 3:
                step=new FourthFragment();
                break;
            default:
                step=new FivthFragment();
                break;
        }
        return step;
    }

    @Override
    public int getCount() {
        return 5;
    }


}
