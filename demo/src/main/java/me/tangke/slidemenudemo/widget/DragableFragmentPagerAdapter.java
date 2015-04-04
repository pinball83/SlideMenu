package me.tangke.slidemenudemo.widget;

import me.tangke.slidemenudemo.fragment.BaseListFragment;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class DragableFragmentPagerAdapter extends FragmentPagerAdapter {
	private Context mContext;

	public DragableFragmentPagerAdapter(Context context, FragmentManager fm) {
		super(fm);
		mContext = context;
	}

	@Override
	public Fragment getItem(int position) {
		return Fragment.instantiate(mContext,
				BaseListFragment.class.getName());
	}

	@Override
	public int getCount() {
		return 5;
	}

}
