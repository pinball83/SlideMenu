package me.tangke.slidemenudemo.activity;

import me.tangke.slidemenudemo.BaseSlideMenuActivity;
import me.tangke.slidemenudemo.R;
import me.tangke.slidemenudemo.widget.DragableFragmentPagerAdapter;
import android.support.v4.view.ViewPager;


public class SlideMenuWithViewPager extends BaseSlideMenuActivity {

	@Override
	public void onContentChanged() {
		super.onContentChanged();
		setSlideRole(R.layout.layout_slidemenu_with_view_pager);
		setSlideRole(R.layout.layout_primary_menu);
		setSlideRole(R.layout.layout_secondary_menu);

		ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
		viewPager.setAdapter(new DragableFragmentPagerAdapter(this,
				getSupportFragmentManager()));
	}

}
