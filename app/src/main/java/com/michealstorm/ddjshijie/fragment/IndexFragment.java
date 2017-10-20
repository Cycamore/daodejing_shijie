package com.michealstorm.ddjshijie.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.michealstorm.ddjshijie.R;

import java.util.List;

/**
 * Author       : Michealstorm@aliyun.com
 * Project Name ：DdjShijie
 * Created Time : 2017/10/19 21:42
 * Description  : //
 */

public class IndexFragment extends Fragment {
    Toolbar toolbar;
    RecyclerView mRecyclerView;
    List<String> mTitles;
    List<View> mViewList;
    FragmentManager mFragmentManager;
    Context mContext;
    View view1,view2,view3;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_index, container, false);
        initView();
        TabLayout mIndexTablayout = rootview.findViewById(R.id.index_tablayout);
        ViewPager mIndexViewPager = rootview.findViewById(R.id.index_viewpager);
        mIndexViewPager.setAdapter(new PagerAdapter() {
            @Override
            public int getCount() {
                return 0;
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view == object;
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                ((ViewPager) container).addView(mViewList.get(position));
                return mViewList.get(position);

            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mTitles.get(position);
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                ((ViewPager) container).removeView(mViewList.get(position));

            }
        });

        mIndexTablayout.setupWithViewPager(mIndexViewPager);

        return rootview;
    }

    private void initView() {
        //Tablayout标题
        mTitles.add(getString(R.string.mululiebiao));
        mTitles.add(getString(R.string.shoucang));
        mTitles.add(getString(R.string.liulanjilu));

        //初始化ViewPager的ViewList
        view1 = View.inflate(mContext, R.layout.mululiebiao, null);
        RecyclerView mMuluRecyclerView = view1.findViewById(R.id.mululiebiao_recyclerview);




    }
}
