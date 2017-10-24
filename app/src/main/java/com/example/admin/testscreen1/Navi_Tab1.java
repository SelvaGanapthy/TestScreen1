package com.example.admin.testscreen1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Admin on 10/5/2017.
 */

public class Navi_Tab1 extends Fragment {
    View view;
    RecyclerView rv;
    public Navi_Tab1() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_recyclerview, container, false);
         rv = (RecyclerView) view.findViewById(R.id.rv_recycler_view);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(container.getContext()));
        rv.setAdapter(new Tab1_Data_Adapter(new String[]{"LEAD 1", "LEAD 2", "LEAD 3", "LEAD 4", "LEAD 5", "LEAD 6", "LEAD 7", "LEAD 8", "LEAD 9", "LEAD 10"}));
        return view;
    }
}
