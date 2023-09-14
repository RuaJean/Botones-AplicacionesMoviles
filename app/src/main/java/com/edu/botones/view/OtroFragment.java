package com.edu.botones.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.edu.botones.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OtroFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class OtroFragment extends Fragment {


    public OtroFragment() {
    }


    public static OtroFragment newInstance() {
        OtroFragment fragment = new OtroFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_otro, container, false);
    }
}