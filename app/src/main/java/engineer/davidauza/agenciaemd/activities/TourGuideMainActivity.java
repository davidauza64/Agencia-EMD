package engineer.davidauza.agenciaemd.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import engineer.davidauza.agenciaemd.R;
import engineer.davidauza.agenciaemd.adapters.LocationPagerAdapter;

/**
 * This class displays a {@link ViewPager} where each page shows a different list of locations.
 */
public class TourGuideMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_guide_main);
        setUpToolBar();
        setUpViewPager();
    }

    /**
     * This method sets the ToolBar to display the UP button.
     */
    private void setUpToolBar() {
        Toolbar toolbar = findViewById(R.id.ly_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    /**
     * This method sets the ViewPager to properly display fragments.
     */
    private void setUpViewPager() {
        ViewPager viewPager = findViewById(R.id.ly_view_pager);
        LocationPagerAdapter adapter =
                new LocationPagerAdapter(getSupportFragmentManager(),
                        TourGuideMainActivity.this);
        viewPager.setAdapter(adapter);
        setUpTabLayout(viewPager);
    }

    /**
     * This method sets up the TabLayout.
     *
     * @param pViewPager is the ViewPager to associate with.
     */
    private void setUpTabLayout(ViewPager pViewPager) {
        TabLayout tabLayout = findViewById(R.id.ly_tabs);
        tabLayout.setupWithViewPager(pViewPager);
    }
}
