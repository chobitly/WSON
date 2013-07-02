WSON
============

仅仅是使用Android的Parcelable接口对Android中的JSON实现做了一下的可序列化封装，并对org.json.JSONObject和org.json.JSONArray中的对应方法做了代理。

实际上被序列化的是JSON字符串，反序列化时再重新生成JSON对象。
