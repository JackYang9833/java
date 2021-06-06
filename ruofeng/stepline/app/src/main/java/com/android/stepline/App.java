package com.android.stepline;

import android.app.Application;
/**
*ytz
*
*/
public class App extends Application {

	private static App sApp;

	@Override
	public void onCreate() {
		super.onCreate();
		sApp = this;
	}

	public static App getApp() {
		return sApp;
	}

}
