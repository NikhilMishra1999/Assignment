package com.example.assignment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SavedFragment extends Fragment {

    public SavedFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_saved, container, false);

        //ArrayList<post> postArrayList=new ArrayList<>();

        explorepost[] posts = new explorepost[] {
                new explorepost("Issac Morgan","Jeo Pipes Ltd, HR","Orci phasellus egestas tellus rutrum tellus pellentesque eu tincidunt. Ut ornare lectus sit amet est placerat. Sit amet commodo nulla facilisi nullam vehicula ipsum a arcu.","#guruji #covid19 #foodie",R.drawable.p3),
                new explorepost("Ellen Michelle","Arc Vive Ltd, CEO","Cursus in hac habitasse platea dictumst quisque. Morbi tristique senectus et netus et malesuada fames ac. Condimentum lacinia quis vel eros donec ac odio.","#startups #covid19 #lockdown",R.drawable.p1),
                new explorepost("Issac Morgan","Jeo Pipes Ltd, HR","Orci phasellus egestas tellus rutrum tellus pellentesque eu tincidunt. Ut ornare lectus sit amet est placerat. Sit amet commodo nulla facilisi nullam vehicula ipsum a arcu.","#guruji #covid19 #foodie",R.drawable.p2)

        };

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.savedrecyclerview);
        SavedAdapter adapter = new SavedAdapter(posts);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}