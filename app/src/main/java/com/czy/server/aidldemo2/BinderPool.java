package com.czy.server.aidldemo2;

import android.content.Context;

import java.net.ConnectException;
import java.util.concurrent.CountDownLatch;

public class BinderPool {
    private static final String TAG = "BinderPool";
    public static final int BINDER_NONE = -1;
    public static final int BINDER_COMPUTE = 0;
    public static final int BINDER_SECURITY_CENTER = 1;

    private Context mContext;
    private IBinderPool mBinderPool;
    private static volatile BinderPool instance;
    private CountDownLatch countDownLatch;

    private BinderPool(Context context) {
        mContext = context.getApplicationContext();
        connectBinderPoolService();
    }


    private synchronized void connectBinderPoolService() {
              countDownLatch=new CountDownLatch(1);
    }

    public static BinderPool getInstance(Context context) {
        if (instance == null) {
            synchronized (BinderPool.class) {
                if (instance==null){
                    instance=new BinderPool(context);
                }
            }
        }
        return instance;
    }
}
