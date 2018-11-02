package com.qudian.qd_react_native_tools_kit.download;

import android.app.Activity;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.qudian.qd_react_native_tools_kit.R;
import com.qufenqi.android.toolkit.update.FileDownloadService;
import com.qufenqi.android.toolkit.update.Config;

public class QDDownloadManager extends ReactContextBaseJavaModule {
    ReactApplicationContext context;
    public QDDownloadManager(ReactApplicationContext reactContext) {
        super(reactContext);
        context = reactContext;
    }

    @Override
    public String getName() {
        return "QDDownloadManager";
    }

    @ReactMethod
    public void download(String url) {

        try {
            Activity activity = context.getCurrentActivity();
            Config config = new Config()
                    .smallIcon(R.mipmap.ic_launcher)
                    .startDownloadMsg(activity.getString(R.string.hint_new_version_downloading))
                    .downloadingMsg(activity.getString(R.string.hint_new_version_downloading));
            FileDownloadService.download(context,
                    new FileDownloadService.Config()
                            .smallIcon(config.getSmallIcon())
                            .downloadingMessage(config.getDownloadingMsg()),
                    url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
