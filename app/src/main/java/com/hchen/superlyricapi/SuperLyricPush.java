package com.hchen.superlyricapi;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.hchen.superlyricapi.ISuperLyric;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class SuperLyricPush {
    private SuperLyricPush() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$registerSuperLyricController$0(Consumer consumer, Message message) {
        IBinder binder = message.getData().getBinder("reply");
        if (binder == null) {
            return true;
        }
        consumer.accept(ISuperLyric.Stub.asInterface(binder));
        return true;
    }

    public static void onStop(SuperLyricData superLyricData) {
    }

    public static void onSuperLyric(SuperLyricData superLyricData) {
    }

    public static void registerSelfControl(Context context) {
        Intent intent = new Intent("Super_Lyric");
        intent.putExtra("super_lyric_self_control_package", context.getPackageName());
        context.sendBroadcast(intent);
    }

    public static void registerSuperLyricController(Context context, Consumer<ISuperLyric> consumer) {
        Bundle bundleExtra;
        IBinder binder;
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null || (bundleExtra = intentRegisterReceiver.getBundleExtra("super_lyric_info")) == null || (binder = bundleExtra.getBinder("super_lyric_controller")) == null) {
            return;
        }
        try {
            Messenger messenger = new Messenger(new Handler(new a(0, consumer)));
            Messenger messenger2 = new Messenger(binder);
            Message messageObtain = Message.obtain();
            messageObtain.replyTo = messenger;
            Bundle bundle = new Bundle();
            bundle.putString("super_lyric_controller_package", context.getPackageName());
            messageObtain.setData(bundle);
            messenger2.send(messageObtain);
        } catch (RemoteException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void unregisterSelfControl(Context context) {
        Intent intent = new Intent("Super_Lyric");
        intent.putExtra("super_lyric_un_self_control_package", context.getPackageName());
        context.sendBroadcast(intent);
    }

    @Deprecated(since = "1.7")
    public static void unregisterSuperLyricController(Context context) {
        Intent intent = new Intent("Super_Lyric");
        intent.putExtra("super_lyric_un_controller", context.getPackageName());
        context.sendBroadcast(intent);
    }
}
