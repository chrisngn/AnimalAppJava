package com.example.songbird.animalappjava;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CatFragment extends Fragment {

    private RecyclerView recyclerView;
    private PhotoAdapter adater = new PhotoAdapter(new ArrayList<Photo>());

    public static CatFragment newInstance() {
        CatFragment fragment = new CatFragment();
        return fragment;
    }

    public CatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cat, container, false);

        setupUI(view);
        loadPhotos();

        return view;
    }

    private void loadPhotos() {

    }

    private void setupUI(View view) {
        recyclerView = view.findViewById(R.id.photoRV);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adater);
    }

}
