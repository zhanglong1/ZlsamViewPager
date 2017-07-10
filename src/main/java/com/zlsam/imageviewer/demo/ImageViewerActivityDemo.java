package com.zlsam.imageviewer.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zlsam.imageviewer.demo.R;
import com.zlsam.imageviewer.ZLPagerAdapter;
import com.zlsam.imageviewer.ZLViewPager;

public class ImageViewerActivityDemo extends Activity {

    private ZLViewPager mViewPager;
    private ImageViewerActivityDemo mContext;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mContext = this;

        initViews();
    }

    private void initViews() {
        // Instances
        mViewPager = (ZLViewPager) findViewById(R.id.zlviewpager_demo);

        mViewPager.setAdapter(new DemoPagerAdapter());
    }

    private class DemoPagerAdapter extends ZLPagerAdapter {

        @Override
        public int getCount() {
            return 5;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }

        @Override
        public float getPageWidth(int position) {
            return super.getPageWidth(position);

            // TODO ?
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            ImageView img = new ImageView(mContext);
            ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ZLViewPager.LayoutParams.MATCH_PARENT, ZLViewPager.LayoutParams.MATCH_PARENT);
            img.setLayoutParams(params);
            img.setImageResource(getImgResId(position));
            container.addView(img);
            return img;
        }

        private int getImgResId(int position) {
            switch (position) {
                case 0:
                    return R.drawable.img0;
                case 1:
                    return R.drawable.img1;
                case 2:
                    return R.drawable.img2;
                case 3:
                    return R.drawable.img3;
                case 4:
                    return R.drawable.img0;
                default:
                    return R.drawable.img0;
            }
        }
    }
}
