package com.sayed.navcomponentapp.ui;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.navigation.Navigation;

import com.sayed.navcomponentapp.R;
import com.sayed.navcomponentapp.databinding.FragmentThirdBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdFragment extends Fragment {


    //Data
    FragmentThirdBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_third, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("Third","On Create");

        binding.btnFourth.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.third_to_four));
    }
}
