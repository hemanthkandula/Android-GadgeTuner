package com.hemanthkumar.gadgetuner;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BlogPagesFragment extends Fragment {
	
	public BlogPagesFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_pages, container, false);
         
        return rootView;
    }
}
