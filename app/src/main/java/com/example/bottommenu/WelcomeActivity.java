package com.example.bottommenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {

    /*private ViewPager viewPager;
    private MyViewPagerAdapter myViewPagerAdapter;
    private LinearLayout dotsLayout;
    private TextView[] dots;
    private int[] layouts;
    private Button btnSkip, btnNext;
    private Session session;
    private Toolbar toolbar;*/
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        btn1 = findViewById(R.id.persiapan_haji1);
        btn2 = findViewById(R.id.persiapan_haji2);
        btn3 = findViewById(R.id.persiapan_haji3);
        btn4 = findViewById(R.id.persiapan_haji4);
        btn5 = findViewById(R.id.persiapan_haji5);
        btn6 = findViewById(R.id.persiapan_haji7);
        btn7 = findViewById(R.id.persiapan_haji8);
        btn8 = findViewById(R.id.persiapan_haji9);
        btn9 = findViewById(R.id.persiapan_haji10);
        btn10 = findViewById(R.id.persiapan_haji11);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.persiapan_haji1:
                final Dialog dialog = new Dialog(WelcomeActivity.this);
                dialog.setContentView(R.layout.hadist12);

                ImageButton closeButton = dialog.findViewById(R.id.close15);
                closeButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
                break;
            case R.id.persiapan_haji2:
                final Dialog dialog2 = new Dialog(WelcomeActivity.this);
                dialog2.setContentView(R.layout.hadits25);

                ImageButton closeButton2 = dialog2.findViewById(R.id.close15);
                closeButton2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog2.dismiss();
                    }
                });

                dialog2.show();
                break;
            case R.id.persiapan_haji3:
                final Dialog dialog3 = new Dialog(WelcomeActivity.this);
                dialog3.setContentView(R.layout.hadits24);

                ImageButton closeButton3 = dialog3.findViewById(R.id.close15);
                closeButton3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog3.dismiss();
                    }
                });

                dialog3.show();
                break;
            case R.id.persiapan_haji4:
                final Dialog dialog4 = new Dialog(WelcomeActivity.this);
                dialog4.setContentView(R.layout.hadits22);

                ImageButton closeButton4 = dialog4.findViewById(R.id.close15);
                closeButton4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog4.dismiss();
                    }
                });

                dialog4.show();
                break;
            case R.id.persiapan_haji5:
                final Dialog dialog5 = new Dialog(WelcomeActivity.this);
                dialog5.setContentView(R.layout.hadist14);

                ImageButton closeButton5 = dialog5.findViewById(R.id.close15);
                closeButton5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog5.dismiss();
                    }
                });

                dialog5.show();
                break;
            case R.id.persiapan_haji7:
                final Dialog dialog6 = new Dialog(WelcomeActivity.this);
                dialog6.setContentView(R.layout.hadits29);

                ImageButton closeButton6 = dialog6.findViewById(R.id.close15);
                closeButton6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog6.dismiss();
                    }
                });

                dialog6.show();
                break;
            case R.id.persiapan_haji8:
                final Dialog dialog7 = new Dialog(WelcomeActivity.this);
                dialog7.setContentView(R.layout.hadits28);

                ImageButton closeButton7 = dialog7.findViewById(R.id.close15);
                closeButton7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog7.dismiss();
                    }
                });

                dialog7.show();
                break;
            case R.id.persiapan_haji9:
                final Dialog dialog8 = new Dialog(WelcomeActivity.this);
                dialog8.setContentView(R.layout.hadits16);

                ImageButton closeButton8 = dialog8.findViewById(R.id.close15);
                closeButton8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog8.dismiss();
                    }
                });

                dialog8.show();
                break;
            case R.id.persiapan_haji10:
                final Dialog dialog9 = new Dialog(WelcomeActivity.this);
                dialog9.setContentView(R.layout.hadist15);

                ImageButton closeButton9 = dialog9.findViewById(R.id.close15);
                closeButton9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog9.dismiss();
                    }
                });

                dialog9.show();
                break;
            case R.id.persiapan_haji11:
                final Dialog dialog10 = new Dialog(WelcomeActivity.this);
                dialog10.setContentView(R.layout.hadits16);

                ImageButton closeButton10 = dialog10.findViewById(R.id.close15);
                closeButton10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog10.dismiss();
                    }
                });

                dialog10.show();
                break;
        }

    }
}

        /*viewPager = (ViewPager) findViewById(R.id.view_pager);
        // Checking for first time launch - before calling setContentView()
        session = new Session(this);
        if (!session.isFirstTimeLaunch()) {
            launchHomeScreen();
            finish();
        }

        // Making notification bar transparent
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        setContentView(R.layout.activity_welcome);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        dotsLayout = (LinearLayout) findViewById(R.id.layoutDots);
        btnSkip = (Button) findViewById(R.id.btn_skip);
        btnNext = (Button) findViewById(R.id.btn_next);


        // layouts of all welcome sliders
        // add few more layouts if you want
        layouts = new int[]{
                R.layout.slide1,
                R.layout.slide2,
                R.layout.slide3};

        // adding bottom dots
        addBottomDots(0);

        // making notification bar transparent
        changeStatusBarColor();

        myViewPagerAdapter = new MyViewPagerAdapter();
        viewPager.setAdapter(myViewPagerAdapter);
        viewPager.addOnPageChangeListener(viewPagerPageChangeListener);

        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchHomeScreen();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // checking for last page
                // if last page home screen will be launched
                int current = getItem(+1);
                if (current < layouts.length) {
                    // move to next screen
                    viewPager.setCurrentItem(current);
                } else {
                    launchHomeScreen();
                }
            }
        });



    }

    private void addBottomDots(int currentPage) {
        dots = new TextView[layouts.length];

        int[] colorsActive = getResources().getIntArray(R.array.array_dot_active);
        int[] colorsInactive = getResources().getIntArray(R.array.array_dot_inactive);

        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);
            dots[i].setTextColor(colorsInactive[currentPage]);
            dotsLayout.addView(dots[i]);
        }

        if (dots.length > 0)
            dots[currentPage].setTextColor(colorsActive[currentPage]);
    }

    private int getItem(int i) {
        return viewPager.getCurrentItem() + i;
    }

    private void launchHomeScreen() {
        session.setFirstTimeLaunch(false);
        startActivity(new Intent(WelcomeActivity.this, menupersiapan.class));
        finish();
    }

    //  viewpager change listener
    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            addBottomDots(position);

            // changing the next button text 'NEXT' / 'GOT IT'
            if (position == layouts.length + 1) {
                // last page. make button text to GOT IT
                btnNext.setText(getString(R.string.start));
                btnSkip.setVisibility(View.GONE);
            } else {
                // still pages are left
                btnNext.setText(getString(R.string.next));
                btnSkip.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    };*/

    /**
     * Making notification bar transparent
     */
    /*private void changeStatusBarColor() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.TRANSPARENT);
        }
    }


    public class MyViewPagerAdapter extends PagerAdapter {
        private LayoutInflater layoutInflater;

        public MyViewPagerAdapter() {
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = layoutInflater.inflate(layouts[position], container, false);
            container.addView(view);

            return view;
        }

        @Override
        public int getCount() {
            return layouts.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }


        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View view = (View) object;
            container.removeView(view);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.search){
            startActivity(new Intent(this, Searchview.class));
        }
        return true;
    }
    }*/
