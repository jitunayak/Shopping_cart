package com.cvrce.jitunayak715.shoppingcart.TabLayout;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cvrce.jitunayak715.shoppingcart.R;

public class TwoFragment extends Fragment
{
    View view;
    public TwoFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.item_two,container,false);
        return view;
    }


}
