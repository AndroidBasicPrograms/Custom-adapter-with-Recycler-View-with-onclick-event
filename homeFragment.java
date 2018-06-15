package com.example.jayhind.meditationapp.user.Fragements;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.jayhind.meditationapp.Adapter.homeAdapter;
import com.example.jayhind.meditationapp.Model.homeModel;
import com.example.jayhind.meditationapp.R;

import java.util.ArrayList;
public class homeFragment extends Fragment implements homeAdapter.homeListener {
    RecyclerView rv;
    ArrayList<homeModel> al;
    private Context context;

    public homeFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home, container, false);
        getActivity().setTitle("Home");
        al=new ArrayList<>();
        context=getActivity();
        rv=view.findViewById(R.id.rview);
        rv.setLayoutManager(new LinearLayoutManager(context));
        homeModel hm=new homeModel();
        homeModel hm1=new homeModel();
        homeModel hm2=new homeModel();

        //hm.setImageUrl(R.drawable.bamboo);
        //hm1.setImageUrl(R.drawable.bg);
        //hm2.setImageUrl(R.drawable.meditation);

        hm.setImageUrl("http://192.168.43.55/Meditation/admin/image/bamboo.jpg");
        hm1.setImageUrl("http://192.168.43.55/Meditation/admin/image/meditation.jpg");
        hm2.setImageUrl("http://192.168.43.55/Meditation/admin/image/bg.jpg");

        hm.setTopic("Meditation");
        hm1.setTopic("What is Meditation ?");
        hm2.setTopic("Why Meditation ?");
        al.add(hm);
        al.add(hm1);
        al.add(hm2);

        homeAdapter hAdapter=new homeAdapter(al,this);
        rv.setAdapter(hAdapter);
        return view;
    }

    @Override
    public void onUserClick(homeModel hModel) {
        Toast.makeText(context, hModel.getTopic(), Toast.LENGTH_SHORT).show();
    }
}
