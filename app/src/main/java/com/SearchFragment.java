package com;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import com.example.bottomnavigationprep2.R;

public class SearchFragment extends Fragment {


    Button b1;
    Button b2;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_search, container , false);
        ChildFragment childfragment = new ChildFragment();
        FragmentManager fn = getChildFragmentManager();
        fn.beginTransaction().add(R.id.fragment,childfragment).commit();



        b1 = v.findViewById(R.id.button);
        b2 = v.findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChildFragment2 childfragment2 = new ChildFragment2();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment, childfragment2);
                transaction.commit();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChildFragment3 childfragment3 = new ChildFragment3();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment, childfragment3);
                transaction.commit();


            }
        });

        return v;
    }
}
