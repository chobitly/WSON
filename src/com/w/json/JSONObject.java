package com.w.json;

import java.util.Iterator;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONTokener;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 可以序列化的JSONObject。
 * 
 * @author 汪璐
 * @since 1.0
 * @version 1.0
 */
public class JSONObject implements Parcelable {

	private org.json.JSONObject mJSON;

	/**
	 * Creates a {@code JSONObject} with no name/value mappings.
	 */
	public JSONObject() {
		mJSON = new org.json.JSONObject();
	}

	@SuppressWarnings("rawtypes")
	public JSONObject(Map copyFrom) {
		this();
		mJSON = new org.json.JSONObject(copyFrom);
	}

	public JSONObject(JSONTokener readFrom) {
		this();
		try {
			mJSON = new org.json.JSONObject(readFrom);
		} catch (JSONException e) {
			mJSON = new org.json.JSONObject();
		}
	}

	public JSONObject(String json) {
		this(new JSONTokener(json));
	}

	public JSONObject(org.json.JSONObject copyFrom) {
		this();
		mJSON = copyFrom;
	}

	public JSONObject(org.json.JSONObject copyFrom, String[] names) {
		this();
		try {
			mJSON = new org.json.JSONObject(copyFrom, names);
		} catch (JSONException e) {
			mJSON = new org.json.JSONObject();
		}
	}

	public JSONObject(JSONObject copyFrom, String[] names) {
		this();
		try {
			mJSON = new org.json.JSONObject(copyFrom.mJSON, names);
		} catch (JSONException e) {
			mJSON = new org.json.JSONObject();
		}
	}

	public org.json.JSONObject getJSONObject() {
		return mJSON;
	}

	public static final Parcelable.Creator<JSONObject> CREATOR = new Parcelable.Creator<JSONObject>() {
		public JSONObject createFromParcel(Parcel parcel) {
			JSONObject json = new JSONObject();
			try {
				json.mJSON = new org.json.JSONObject(parcel.readString());
			} catch (JSONException e) {
			}
			return json;
		}

		public JSONObject[] newArray(int size) {
			return new JSONObject[size];
		}
	};

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(mJSON.toString());
	}

	public boolean equals(Object o) {
		return mJSON.equals(o);
	}

	public int length() {
		return mJSON.length();
	}

	public JSONObject put(String name, boolean value) throws JSONException {
		mJSON.put(name, value);
		return this;
	}

	public JSONObject put(String name, double value) throws JSONException {
		mJSON.put(name, value);
		return this;
	}

	public JSONObject put(String name, int value) throws JSONException {
		mJSON.put(name, value);
		return this;
	}

	public JSONObject put(String name, long value) throws JSONException {
		mJSON.put(name, value);
		return this;
	}

	public JSONObject put(String name, Object value) throws JSONException {
		mJSON.put(name, value);
		return this;
	}

	public JSONObject putOpt(String name, Object value) throws JSONException {
		mJSON.putOpt(name, value);
		return this;
	}

	public JSONObject accumulate(String name, Object value)
			throws JSONException {
		mJSON.accumulate(name, value);
		return this;
	}

	public int hashCode() {
		return mJSON.hashCode();
	}

	public Object remove(String name) {
		return mJSON.remove(name);
	}

	public boolean isNull(String name) {
		return mJSON.isNull(name);
	}

	public boolean has(String name) {
		return mJSON.has(name);
	}

	public Object get(String name) throws JSONException {
		return mJSON.get(name);
	}

	public Object opt(String name) {
		return mJSON.opt(name);
	}

	public boolean getBoolean(String name) throws JSONException {
		return mJSON.getBoolean(name);
	}

	public boolean optBoolean(String name) {
		return mJSON.optBoolean(name);
	}

	public boolean optBoolean(String name, boolean fallback) {
		return mJSON.optBoolean(name, fallback);
	}

	public double getDouble(String name) throws JSONException {
		return mJSON.getDouble(name);
	}

	public double optDouble(String name) {
		return mJSON.optDouble(name);
	}

	public double optDouble(String name, double fallback) {
		return mJSON.optDouble(name, fallback);
	}

	public int getInt(String name) throws JSONException {
		return mJSON.getInt(name);
	}

	public int optInt(String name) {
		return mJSON.optInt(name);
	}

	public int optInt(String name, int fallback) {
		return mJSON.optInt(name, fallback);
	}

	public long getLong(String name) throws JSONException {
		return mJSON.getLong(name);
	}

	public long optLong(String name) {
		return mJSON.optLong(name);
	}

	public long optLong(String name, long fallback) {
		return mJSON.optLong(name, fallback);
	}

	public String getString(String name) throws JSONException {
		return mJSON.getString(name);
	}

	public String optString(String name) {
		return mJSON.optString(name);
	}

	public String optString(String name, String fallback) {
		return mJSON.optString(name, fallback);
	}

	public JSONArray getJSONArray(String name) throws JSONException {
		return new JSONArray(mJSON.getJSONArray(name));
	}

	public JSONArray optJSONArray(String name) {
		return new JSONArray(mJSON.optJSONArray(name));
	}

	public JSONObject getJSONObject(String name) throws JSONException {
		return new JSONObject(mJSON.getJSONObject(name));
	}

	public JSONObject optJSONObject(String name) {
		return new JSONObject(mJSON.optJSONObject(name));
	}

	public JSONArray toJSONArray(org.json.JSONArray names) throws JSONException {
		return new JSONArray(mJSON.toJSONArray(names));
	}

	public JSONArray toJSONArray(JSONArray names) throws JSONException {
		return new JSONArray(mJSON.toJSONArray(names.getJSONArray()));
	}

	@SuppressWarnings("rawtypes")
	public Iterator keys() {
		return mJSON.keys();
	}

	public JSONArray names() {
		return new JSONArray(mJSON.names());
	}

	public String toString() {
		return mJSON.toString();
	}

	public String toString(int indentSpaces) throws JSONException {
		return mJSON.toString(indentSpaces);
	}

}