package com.dalingge.gankio.module.girl;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

import com.dalingge.gankio.R;
import com.dalingge.gankio.common.base.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class GirlFragment extends BaseFragment {


    public GirlFragment() {
        // Required empty public constructor
    }


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_girl;
    }

    @Override
    protected void initView(View view) {

    }

    public static GirlFragment newInstance(String param1) {
        GirlFragment fragment = new GirlFragment();
        Bundle args = new Bundle();
        args.putString("agrs1", param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Bundle bundle = getArguments();
        String agrs1 = bundle.getString("agrs1");
        TextView tv = (TextView)view.findViewById(R.id.tv_location);
        tv.setText(agrs1);
    }

}