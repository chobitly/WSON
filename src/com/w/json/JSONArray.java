package com.w.json;

import java.util.Collection;

import org.json.JSONException;
import org.json.JSONTokener;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 可以序列化的JSONArray。
 * 
 * @author 汪璐
 * @since 1.0
 * @version 1.0
 */
public class JSONArray implements Parcelable {

	private org.json.JSONArray mJSON;

	public JSONArray() {
		mJSON = new org.json.JSONArray();
	}

	@SuppressWarnings("rawtypes")
	public JSONArray(Collection copyFrom) {
		this();
		mJSON = new org.json.JSONArray(copyFrom);
	}

	public JSONArray(JSONTokener readFrom) throws JSONException {
		this();
		mJSON = new org.json.JSONArray(readFrom);
	}

	public JSONArray(org.json.JSONArray copyFrom) {
		this();
		mJSON = copyFrom;
	}

	public JSONArray(JSONArray copyFrom) {
		this();
		mJSON = copyFrom.mJSON;
	}

	public JSONArray(String json) throws JSONException {
		this(new JSONTokener(json));
	}

	public org.json.JSONArray getJSONArray() {
		return mJSON;
	}

	public static final Parcelable.Creator<JSONArray> CREATOR = new Parcelable.Creator<JSONArray>() {
		public JSONArray createFromParcel(Parcel parcel) {
			JSONArray json = new JSONArray();
			try {
				json.mJSON = new org.json.JSONArray(parcel.readString());
			} catch (JSONException e) {
			}
			return json;
		}

		public JSONArray[] newArray(int size) {
			return new JSONArray[size];
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

	public int length() {
		return mJSON.length();
	}

	public JSONArray put(boolean value) {
		mJSON.put(value);
		return this;
	}

	public JSONArray put(double value) throws JSONException {
		mJSON.put(value);
		return this;
	}

	public JSONArray put(int value) {
		mJSON.put(value);
		return this;
	}

	public JSONArray put(long value) {
		mJSON.put(value);
		return this;
	}

	public JSONArray put(Object value) {
		mJSON.put(value);
		return this;
	}

	public JSONArray put(int index, boolean value) throws JSONException {
		mJSON.put(index, value);
		return this;
	}

	public JSONArray put(int index, double value) throws JSONException {
		mJSON.put(index, value);
		return this;
	}

	public JSONArray put(int index, int value) throws JSONException {
		mJSON.put(index, value);
		return this;
	}

	public JSONArray put(int index, long value) throws JSONException {
		mJSON.put(index, value);
		return this;
	}

	public JSONArray put(int index, Object value) throws JSONException {
		mJSON.put(index, value);
		return this;
	}

	public boolean isNull(int index) {
		return mJSON.isNull(index);
	}

	public Object get(int index) throws JSONException {
		return mJSON.get(index);
	}

	public Object opt(int index) {
		return mJSON.opt(index);
	}

	public boolean getBoolean(int index) throws JSONException {
		return mJSON.getBoolean(index);
	}

	public boolean optBoolean(int index) {
		return mJSON.optBoolean(index);
	}

	public boolean optBoolean(int index, boolean fallback) {
		return mJSON.optBoolean(index, fallback);
	}

	public double getDouble(int index) throws JSONException {
		return mJSON.getDouble(index);
	}

	public double optDouble(int index) {
		return mJSON.optDouble(index);
	}

	public double optDouble(int index, double fallback) {
		return mJSON.optDouble(index, fallback);
	}

	public int getInt(int index) throws JSONException {
		return mJSON.getInt(index);
	}

	public int optInt(int index) {
		return mJSON.optInt(index);
	}

	public int optInt(int index, int fallback) {
		return mJSON.optInt(index, fallback);
	}

	public long getLong(int index) throws JSONException {
		return mJSON.getLong(index);
	}

	public long optLong(int index) {
		return mJSON.optLong(index);
	}

	public long optLong(int index, long fallback) {
		return mJSON.optLong(index, fallback);
	}

	public String getString(int index) throws JSONException {
		return mJSON.getString(index);
	}

	public String optString(int index) {
		return mJSON.optString(index);
	}

	public String optString(int index, String fallback) {
		return mJSON.optString(index, fallback);
	}

	public JSONArray getJSONArray(int index) throws JSONException {
		return new JSONArray(mJSON.getJSONArray(index));
	}

	public JSONArray optJSONArray(int index) {
		return new JSONArray(mJSON.optJSONArray(index));
	}

	public JSONObject getJSONObject(int index) throws JSONException {
		return new JSONObject(mJSON.getJSONObject(index));
	}

	public JSONObject optJSONObject(int index) {
		return new JSONObject(mJSON.optJSONObject(index));
	}

	public JSONObject toJSONObject(org.json.JSONArray names)
			throws JSONException {
		return new JSONObject(mJSON.toJSONObject(names));
	}

	public JSONObject toJSONObject(JSONArray names) throws JSONException {
		return new JSONObject(mJSON.toJSONObject(names.getJSONArray()));
	}

	public String join(String separator) throws JSONException {
		return mJSON.join(separator);
	}

	public String toString() {
		return mJSON.toString();
	}

	public String toString(int indentSpaces) throws JSONException {
		return mJSON.toString(indentSpaces);
	}

	public boolean equals(Object o) {
		return mJSON.equals(o);
	}

	public int hashCode() {
		return mJSON.hashCode();
	}
}