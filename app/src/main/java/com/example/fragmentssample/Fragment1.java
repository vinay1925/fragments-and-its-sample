package com.example.fragmentssample;

import android.media.FaceDetector;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public  class Fragment1 extends Fragment {

@Override
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
    return inflater.inflate(R.layout.fragment_fragment1, container, false);
}}