package com.example.test.listviewnotificationadapter;

import android.content.Context;
import android.content.SharedPreferences;


/**
 * Sp封装
 * 
 */
public class PrefUtils {

	public static void putBoolean(Context ctx, String key, boolean value) {
		SharedPreferences sp = ctx.getSharedPreferences("config",
				Context.MODE_PRIVATE);
		sp.edit().putBoolean(key, value).commit();
	}

	public static boolean getBoolean(Context ctx, String key, boolean defValue) {
		SharedPreferences sp = ctx.getSharedPreferences("config",
				Context.MODE_PRIVATE);
		return sp.getBoolean(key, defValue);
	}

	public static void putString(Context ctx, String key, String value) {
		SharedPreferences sp = ctx.getSharedPreferences("config",
				Context.MODE_PRIVATE);
		sp.edit().putString(key, value).commit();
	}

	public static String getString(Context ctx, String key, String defValue) {
		SharedPreferences sp = ctx.getSharedPreferences("config",
				Context.MODE_PRIVATE);
		return sp.getString(key, defValue);
	}

	public static void putInt(Context ctx, String key, int value) {
		SharedPreferences sp = ctx.getSharedPreferences("config",
				Context.MODE_PRIVATE);
		sp.edit().putInt(key, value).commit();
	}

	public static int getInt(Context ctx, String key, int defValue) {
		SharedPreferences sp = ctx.getSharedPreferences("config",
				Context.MODE_PRIVATE);
		return sp.getInt(key, defValue);
	}
	
	  public static void putLong(Context ctx, String key, long value) {
	        SharedPreferences sp = ctx.getSharedPreferences("config",
	                Context.MODE_PRIVATE);
	        sp.edit().putLong(key, value).commit();
	    }

	    public static long getLong(Context ctx, String key, long defValue) {
	        SharedPreferences sp = ctx.getSharedPreferences("config",
	                Context.MODE_PRIVATE);
	        return sp.getLong(key, defValue);
	    }
	
//	public static boolean getLogin() {
//		return getBoolean(UiUtils.getContext(), "isLogin", false);
//	}
//	public static String getUid() {
//
//		return PrefUtils.getString(BaseApplication.getContext(), "u_id", "");
//	}

}
