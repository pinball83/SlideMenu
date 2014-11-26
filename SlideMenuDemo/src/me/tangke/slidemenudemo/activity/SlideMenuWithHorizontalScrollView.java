package me.tangke.slidemenudemo.activity;

import me.tangke.slidemenudemo.BaseSlideMenuActivity;
import me.tangke.slidemenudemo.R;

public class SlideMenuWithHorizontalScrollView extends BaseSlideMenuActivity {
	@Override
	public void onContentChanged() {
		super.onContentChanged();
		setSlideRole(R.layout.layout_slidemenu_with_horizontal_scroll_view);
		setSlideRole(R.layout.layout_primary_menu);
		setSlideRole(R.layout.layout_secondary_menu);
	}

}
