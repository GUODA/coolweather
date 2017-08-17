package test.gd.com.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by gd on 2017/8/17.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request  = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
