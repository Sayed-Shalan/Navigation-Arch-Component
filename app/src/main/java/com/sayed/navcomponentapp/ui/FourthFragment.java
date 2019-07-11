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
import com.sayed.navcomponentapp.databinding.FragmentFourthBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class FourthFragment extends Fragment {

    //Data Binding
    FragmentFourthBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.e("Fourth","On Create");

        binding= DataBindingUtil.inflate(inflater,R.layout.fragment_fourth, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnConfirm.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_fourthFragment_to_main2Activity));
    }
}
