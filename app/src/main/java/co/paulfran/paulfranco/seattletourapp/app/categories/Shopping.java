package co.paulfran.paulfranco.seattletourapp.app.categories;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import co.paulfran.paulfranco.seattletourapp.R;
import co.paulfran.paulfranco.seattletourapp.app.adapters.ScrollTabsAdapter;
import co.paulfran.paulfranco.seattletourapp.app.fragments.Baleen;
import co.paulfran.paulfranco.seattletourapp.app.fragments.Digs;
import co.paulfran.paulfranco.seattletourapp.app.fragments.LuckyDryGoods;
import co.paulfran.paulfranco.seattletourapp.app.fragments.Prism;

public class Shopping extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> titleList = new ArrayList<>();

    // initialize viewPager (set as field variable)
    private ViewPager viewPager;

    // initialize adapter (set as field variable)
    private ScrollTabsAdapter adapter;

    // initialize TabLayout
    private TabLayout tabLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_tabs);

        initialize();

        prepareDataResource();

        // complete initialization of adapter
        adapter = new ScrollTabsAdapter(getSupportFragmentManager(), fragmentList, titleList);

        // Bind adapter to viewPager
        viewPager.setAdapter(adapter);

        // Bind tabLayout with viewPager
        tabLayout.setupWithViewPager(viewPager);

    }

    private void initialize() {

        // initialize toobar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.shopping_title);

        // complete initialization of viewPager
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        // complete initialization of tabLayout
        tabLayout = (TabLayout) findViewById(R.id.tabs);

    }

    private void prepareDataResource() {

        // This is the same as below with the use of addData()
        addData(new Baleen(), getString(R.string.baleen));
        addData(new Digs(), getString(R.string.digs));
        addData(new LuckyDryGoods(), getString(R.string.lucky));
        addData(new Prism(), getString(R.string.prism));


        // This is the same as above but with no use of addData()
        //fragmentList.add(new FragmentOne());
        //titleList.add("ONE");

        //fragmentList.add(new FragmentTwo());
        //titleList.add("TWO");

        //fragmentList.add(new FragmentThree());
        //titleList.add("THREE");

    }

    private void addData(Fragment fragment, String title) {
        fragmentList.add(fragment);
        titleList.add(title);
    }
}
