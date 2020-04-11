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
class post{
    String tag,nearby;

    public post(String tag, String nearby) {
        this.tag = tag;
        this.nearby = nearby;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getNearby() {
        return nearby;
    }

    public void setNearby(String nearby) {
        this.nearby = nearby;
    }
}

public class TrendingFragment extends Fragment {

    public TrendingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_trending, container, false);

        //ArrayList<post> postArrayList=new ArrayList<>();

        post[] posts = new post[] {
                new post("#techmonday","11 people nearby"),
                new post("#covid19","12 people nearby"),
                new post("#fifa cup","8 people nearby"),
                new post("#lockdown","7 people nearby"),
                new post("#foodie","4 people nearby"),
                new post("#guruji","2 people nearby"),
                new post("#startup","2 people nearby"),
                new post("#fifa cup","8 people nearby"),
                new post("#lockdown","7 people nearby"),
                new post("#foodie","4 people nearby"),
                new post("#guruji","2 people nearby"),
        };

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview);
        TrendingAdapter adapter = new TrendingAdapter(posts);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}
