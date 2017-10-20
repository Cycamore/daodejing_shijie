package com.michealstorm.ddjshijie.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.michealstorm.ddjshijie.R;
import com.michealstorm.ddjshijie.adapter.MuluRecycerViewAdatper;
import com.michealstorm.ddjshijie.network.NetworkTool;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuluFragment extends Fragment {


    public MuluFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_mulu, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.mulu_recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(container.getContext()));
        recyclerView.setAdapter(new MuluRecycerViewAdatper(NetworkTool.getArticlList()));
        return view;
    }

}
