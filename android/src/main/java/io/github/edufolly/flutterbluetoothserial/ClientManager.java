package io.github.edufolly.flutterbluetoothserial;

import android.content.Context;

import com.inuker.bluetooth.library.BluetoothClient;

/**
 * Created by dingjikerbo on 2016/8/27.
 */
public class ClientManager {

    private static BluetoothClient mClient;

    public static BluetoothClient init(Context context) {
        if (mClient == null) {
            synchronized (ClientManager.class) {
                if (mClient == null) {
                    mClient = new BluetoothClient(context);
                }
            }
        }
        return mClient;
    }

    public static BluetoothClient getInstance(){
        return mClient;
    }
}
