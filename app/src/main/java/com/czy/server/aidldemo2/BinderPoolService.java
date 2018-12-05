package com.czy.server.aidldemo2;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class BinderPoolService extends Service{
    private static final String TAG="BinderPoolService";
    private Binder mBinderPool;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinderPool;
    }
}
