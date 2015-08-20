package com.example.admin.test01.Activity;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;

import com.example.admin.test01.R;

import org.w3c.dom.Text;

/**
 * Created by Admin on 2015-08-19.
 */
public class ProfileDetailEditActivity extends ActionBarActivity {

    private Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_profile_edit);

        mToolBar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolBar);

        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_keyboard_arrow_left_black_24dp);
        ab.setDisplayHomeAsUpEnabled(true);

        TextView mName = (TextView) findViewById(R.id.profile_detail_user_name);
        mName.setVisibility(View.INVISIBLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }
}
