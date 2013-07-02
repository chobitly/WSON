package com.w.json;

import org.json.JSONException;

import com.w.json.JSONArray;
import com.w.json.JSONObject;

/**
 * 提供与用字符串1和0表示布尔值的服务器端适配的方法。
 * 
 * @author 汪璐
 * @since 1.0
 * @version 1.0
 */
public class JSONHelper {
	/**
	 * 为了服务器端发来的全部字段都是String的JSON字符串做适配（- -）。
	 */
	public static boolean optBoolean(JSONObject jsonObject, String name) {
		return jsonObject.optBoolean(name)
				|| "1".equals(jsonObject.optString(name));
	}

	/**
	 * 为了服务器端发来的全部字段都是String的JSON字符串做适配（- -）。
	 */
	public static JSONObject putBoolean(JSONObject jsonObject, String name,
			boolean value) {
		try {
			jsonObject.put(name, value ? 1 : 0);
		} catch (JSONException e) {
		}
		return jsonObject;
	}

	/**
	 * 为了服务器端发来的全部字段都是String的JSON字符串做适配（- -）。
	 */
	public static boolean optBoolean(JSONArray jsonArray, int index) {
		return jsonArray.optBoolean(index)
				|| "1".equals(jsonArray.optString(index));
	}

	/**
	 * 为了服务器端发来的全部字段都是String的JSON字符串做适配（- -）。
	 */
	public static JSONArray putBoolean(JSONArray jsonArray, int index,
			boolean value) {
		try {
			jsonArray.put(index, value ? 1 : 0);
		} catch (JSONException e) {
		}
		return jsonArray;
	}
}
