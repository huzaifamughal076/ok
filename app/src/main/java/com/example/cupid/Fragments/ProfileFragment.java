package com.example.cupid.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.cupid.Activities.EditProfile;
import com.example.cupid.Activities.Profile_Preferences;
import com.example.cupid.Activities.Profile_Settings;
import com.example.cupid.Adapter.ViewPagerAdaper;
import com.example.cupid.R;
import com.google.android.material.tabs.TabLayout;

import java.util.Timer;
import java.util.TimerTask;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ProfileFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ProfileFragment extends Fragment {

    ImageView editprofile;

    ViewPager viewPager;
    ViewPagerAdaper viewPagerAdapter;


    LinearLayout preferences;
    LinearLayout settings;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ProfileFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ProfileFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ProfileFragment newInstance(String param1, String param2) {
        ProfileFragment fragment = new ProfileFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_profile, container, false);
        TabLayout tabLayout;

        preferences=v.findViewById(R.id.preferences);
        settings= v.findViewById(R.id.settings);

       viewPagerAdapter = new ViewPagerAdaper(this,getChildFragmentManager());

        viewPager = v.findViewById(R.id.viewPager);
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout = (TabLayout) v.findViewById(R.id.tabing);
        tabLayout.setupWithViewPager(viewPager, true);





        preferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getActivity(), Profile_Preferences.class);
                startActivity(i);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getActivity(), Profile_Settings.class);
                startActivity(i);
            }
        });



        editprofile = v.findViewById(R.id.edit_profile);

        editprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getActivity(), EditProfile.class);
                startActivity(i);

            }
        });


        return v;
    }
}