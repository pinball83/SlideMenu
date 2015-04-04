package me.tangke.slidemenudemo.activity;

import me.tangke.slidemenudemo.adapter.SlideMenuInListAdapter;
import android.app.ListActivity;
import android.os.Bundle;

public class SlideMenuInListView extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new SlideMenuInListAdapter());
	}
}
