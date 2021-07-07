package com.agung.sedated;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link com.agung.sedated.HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */


    public class HomeFragment extends Fragment {

        public static HomeFragment newInstance() {
            return new HomeFragment();
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_home, container, false);
            return view;
        }

    }