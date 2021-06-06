package com.android.stepline.activity;
import android.os.Bundle;
import com.android.stepline.BaseActivity;
import com.android.stepline.R;
import android.widget.TextView;
import android.os.Handler;
import com.android.stepline.utils.UiUtils;
/**
 * @Author:YTZ
 * @ProjectName:
 * @Version:1.0
 */
public class MainActivity extends BaseActivity {
TextView showTime;
private long currenrSecond=0;
private Handler mHandler;
private boolean pause=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	public int setLayout() {
		return R.layout.activity_main;
	}
	@Override
	public void initView() {
		showTime=(TextView)bindView(R.id.showtimes);
	}

	@Override
	public void archieve() {
		
		//showTime.setText("若风");
	}
	Runnable timeRunnable=new Runnable(){
		UiUtils ut=new UiUtils();
		private Handler mhandler = new Handler();
		@Override
		public void run() {
			currenrSecond = currenrSecond+1;
			showTime.setText(ut.getTimeHMS(currenrSecond));
			if(!pause){
				mhandler.postDelayed(timeRunnable,1000);
			}
		}
	};
	@Override
	protected void onResume() {
		super.onResume();
	}

}
