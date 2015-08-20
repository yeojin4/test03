package com.example.admin.test01.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.ToggleButton;

import com.example.admin.test01.R;

/**
 * Created by Admin on 2015-08-12.
 */
public class SettingFragment extends Fragment {

    private View mView;
    private Switch mSwitchButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_setting, container, false);
        mSwitchButton = (Switch)container.findViewById(R.id.activity_setting_switch);

        return mView;
    }

}
