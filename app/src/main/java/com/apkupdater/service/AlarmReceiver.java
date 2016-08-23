package com.apkupdater.service;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.apkupdater.event.InstalledAppTitleChange;
import com.apkupdater.util.MyBus;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EReceiver;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@EReceiver
public class AlarmReceiver
	extends BroadcastReceiver
{
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void onReceive(
		Context context,
		Intent intent
	) {
		UpdaterService_.intent(context).start();
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////