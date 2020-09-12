package com.devstrings.elearning.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devstrings.elearning.R;
import com.stepstone.stepper.Step;
import com.stepstone.stepper.VerificationError;

import static com.devstrings.elearning.Adapter.FragmentAdapter.POSITION;

public class FrontFragment extends Fragment implements Step {

   int position;

    public FrontFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            position = getArguments().getInt(POSITION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return  inflater.inflate(R.layout.fragment_front, container, false);
    }

    @Nullable
    @Override
    public VerificationError verifyStep() {
        return null;
    }

    @Override
    public void onSelected() {

    }

    @Override
    public void onError(@NonNull VerificationError error) {
        Log.i("front frgment", "onError: ");

    }
}