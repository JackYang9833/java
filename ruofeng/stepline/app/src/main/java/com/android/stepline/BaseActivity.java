package com.android.stepline;
 
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.android.stepline.utils.UiUtils;
import android.view.View;

public abstract class BaseActivity extends AppCompatActivity { 
     
public static Boolean screenRoate;
public static int SCREEN_WIDTH;
public static int SCREEN_HEIGHT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		UiUtils uit=new UiUtils();
		uit.setStatusBarLightMode(this,true);
		WindowManager manager = getWindowManager();
		Display display = manager.getDefaultDisplay();
		DisplayMetrics dm = new DisplayMetrics();
		display.getMetrics(dm);
		SCREEN_WIDTH = dm.widthPixels;
		SCREEN_HEIGHT = dm.heightPixels;
		setContentView(setLayout());
		initView();
		archieve();
    }
	public abstract int setLayout();
	public abstract void initView();

	protected View bindView(int id){
		return  findViewById(id);
	}

    /**
     * 设置屏幕横竖屏切换
     *
     * @param screenRoate true  竖屏     false  横屏
     */
    public void setScreenRoate() {
        if (screenRoate) {
            //设置竖屏模式
          setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        } else {
            //设置横屏模式
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }
	public abstract void archieve();
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		System.exit(-1);
	}
	
} 
