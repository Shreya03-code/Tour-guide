package com.example.tourguide.hospital;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.tourguide.R;

public class FragGandhiInfo extends Fragment {
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

       View view = inflater.inflate(R.layout.gandhi_info_frag, container,false);

       return view;
   }
}
