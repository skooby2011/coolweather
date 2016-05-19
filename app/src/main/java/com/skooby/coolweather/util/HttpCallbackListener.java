package com.skooby.coolweather.util;

/**
 * Created by skooby on 16/5/15.
 */
public interface HttpCallbackListener {
    void onFinish (String response);

    void onError(Exception e);
}
