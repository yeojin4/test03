package com.example.admin.test01.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.admin.test01.R;

/**
 * Created by Admin on 2015-08-12.
 */
public class SearchFragment extends Fragment {

    private View mView;
    private Context mContext;
    private Spinner mSpinnerLocationFirst;
    private Spinner mSpinnerLocationSecond;
    private Spinner mSpinnerMember;
    private Spinner mSpinnerLanguage;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mView = inflater.inflate(R.layout.fragment_search, container, false);
        mContext = mView.getContext();
        mSpinnerLocationFirst = (Spinner) mView.findViewById(R.id.search_location_si);
        mSpinnerLocationSecond = (Spinner) mView.findViewById(R.id.search_location_gu);

        mSpinnerLanguage = (Spinner) mView.findViewById(R.id.search_want_language_spinner);
        String[] mLanguage = getResources().getStringArray(R.array.spinnerSetLanguage);
        ArrayAdapter<String> mLanguageAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_dropdown_item, mLanguage);
        mSpinnerLanguage.setAdapter(mLanguageAdapter);

        mSpinnerMember = (Spinner) mView.findViewById(R.id.search_pick_member);
        String[] mMember = getResources().getStringArray(R.array.spinnerSetMaxMember);
        ArrayAdapter<String> mMemberAdapter = new ArrayAdapter<String>(mContext, android.R.layout.simple_spinner_dropdown_item, mMember);
        mSpinnerMember.setAdapter(mMemberAdapter);


        return mView;
    }

}
