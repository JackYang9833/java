package com.android.stepline.utils;
/**
 * @Author:YTZ
 * @ProjectName:
 * @Version:1.0
 */
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;

public class UiUtils {

    public static void setStatusBarLightMode(final Activity activity,
                                             final boolean isLightMode) {
        setStatusBarLightMode(activity.getWindow(), isLightMode);
    }

    public static void setStatusBarLightMode(final Window window,
                                             final boolean isLightMode) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            View decorView = window.getDecorView();
            int vis = decorView.getSystemUiVisibility();
            if (isLightMode) {
                vis |= View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            } else {
                vis &= ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            }
            decorView.setSystemUiVisibility(vis);
        }
    }
public static String getTimeHMS(long time){
	time=time/1000;//总秒数
	int s= (int) (time%60);//秒
	int m= (int) (time/60)%60;//分
	int h=(int) (time/3600)%60;//小时
	return String.format("%02d,%02d,%02d",h,m,s);
}
}

