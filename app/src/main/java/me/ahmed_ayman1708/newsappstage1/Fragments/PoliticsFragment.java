package me.ahmed_ayman1708.newsappstage1.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.ahmed_ayman1708.newsappstage1.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PoliticsFragment extends Fragment {


    public PoliticsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_politics, container, false);
    }

}
