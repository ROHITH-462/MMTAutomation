package com.htc.makemytrip.listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import com.htc.makemytrip.base.BaseTest;

public class SuiteListener extends BaseTest implements ISuiteListener{

	@Override
	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		ISuiteListener.super.onStart(suite);
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		ISuiteListener.super.onFinish(suite);
	}

}
