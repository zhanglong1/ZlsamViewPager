#ZlsamViewPager  
## 效果图  
![Alt text](src/main/res/raw/device-2017-07-10-162444.png?raw=true "pic1")
![Alt text](src/main/res/raw/device-2017-07-10-162444.png?raw=true "pic2")

## 用法  
- 将libraries/ZlsamViewPagerLib拷贝到您的项目中

- 在您的项目脚本文件settings.gradle中添加ZlsamViewPagerLib, 类似如下：  
include ':libraries:ZlsamViewPagerLib'  
  
- 在您的布局文件中引入：  
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:custom="http://schemas.android.com/apk/res-auto"
    android:orientation="vertical"
    android:layout_width="fill_parent"
    android:layout_height="fill_parent"
    android:gravity="center">

    <com.zlsam.imageviewer.ZLViewPager
        android:id="@+id/zlviewpager_demo"
        android:layout_width="match_parent"
        android:layout_height="300dp"
        custom:dividerWidth="12dp"/>

</LinearLayout>

- OK，剩下的用法跟V4包中的ViewPager一模一样