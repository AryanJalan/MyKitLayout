package aryan.com.mykitapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     // Toolbar toolbar=(Toolbar) findViewById(R.id.);
        tabLayout=(TabLayout)findViewById(R.id.tab);
        viewpager=(ViewPager)findViewById(R.id.viewpager);
        MyPagerAdapter mpa=new MyPagerAdapter(getSupportFragmentManager());
        mpa.al1.add(new HOME());
        mpa.al1.add(new Dashboard());
        mpa.al2.add("Home");
        mpa.al2.add("DashBoard");
        viewpager.setAdapter(mpa);
        tabLayout.setupWithViewPager(viewpager);
    }

    ArrayList<Fragment> al1=new ArrayList<Fragment>();
    ArrayList<String> al2=new ArrayList<String>();

    public class MyPagerAdapter extends FragmentPagerAdapter{

        ArrayList<Fragment> al1=new ArrayList<Fragment>();
        ArrayList<String> al2=new ArrayList<String>();
        MyPagerAdapter(FragmentManager fm)
        {
            super(fm);
        }
        @Override
        public int getCount() {
            return al1.size();
        }

        @Override
        public Fragment getItem(int position) {
            return al1.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return al2.get(position);
        }
    }
}
