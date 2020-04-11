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
class explorepost{
    String name,place,desc,tags;
    int imgId;

    public explorepost(String name, String place, String desc, String tags, int imgId) {
        this.name = name;
        this.place = place;
        this.desc = desc;
        this.tags = tags;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}

public class ExploreFragment extends Fragment {

    public ExploreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_explore, container, false);

        explorepost[] posts = new explorepost[] {
                new explorepost("Issac Morgan","Jeo Pipes Ltd, HR","Orci phasellus egestas tellus rutrum tellus pellentesque eu tincidunt. Ut ornare lectus sit amet est placerat. Sit amet commodo nulla facilisi nullam vehicula ipsum a arcu.","#guruji #covid19 #foodie",R.drawable.p2),
                new explorepost("Ellen Michelle","Arc Vive Ltd, CEO","Cursus in hac habitasse platea dictumst quisque. Morbi tristique senectus et netus et malesuada fames ac. Condimentum lacinia quis vel eros donec ac odio.","#startups #covid19 #lockdown",R.drawable.p1),
                new explorepost("Issac Morgan","Jeo Pipes Ltd, HR","Orci phasellus egestas tellus rutrum tellus pellentesque eu tincidunt. Ut ornare lectus sit amet est placerat. Sit amet commodo nulla facilisi nullam vehicula ipsum a arcu.","#guruji #covid19",R.drawable.p2)
        };

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.exprecyclerview);
        ExploreAdapter adapter = new ExploreAdapter(posts);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
