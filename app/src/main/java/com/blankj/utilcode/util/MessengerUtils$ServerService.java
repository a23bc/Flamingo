package com.blankj.utilcode.util;

import D2.HandlerC0087c;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import i6.h;
import java.util.concurrent.ConcurrentHashMap;
import t4.AbstractC1507b;
import t4.C1508c;
import u1.i;

/* JADX INFO: loaded from: classes.dex */
public class MessengerUtils$ServerService extends Service {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f10703r = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ConcurrentHashMap f10704o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final HandlerC0087c f10705p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Messenger f10706q;

    public MessengerUtils$ServerService() {
        HandlerC0087c handlerC0087c = new HandlerC0087c(this);
        this.f10705p = handlerC0087c;
        this.f10706q = new Messenger(handlerC0087c);
    }

    public final void a(Message message) {
        Message messageObtain = Message.obtain(message);
        for (Messenger messenger : this.f10704o.values()) {
            if (messenger != null) {
                try {
                    messenger.send(Message.obtain(messageObtain));
                } catch (RemoteException e7) {
                    e7.printStackTrace();
                }
            }
        }
        messageObtain.recycle();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f10706q.getBinder();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        Bundle extras;
        String string;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            C1508c c1508c = C1508c.f17069b;
            if (i9 >= 26) {
                ((NotificationManager) h.z().getSystemService("notification")).createNotificationChannel(c1508c.f17070a);
            }
            i iVar = new i(h.z(), null);
            if (i9 >= 26) {
                iVar.f17171o = c1508c.f17070a.getId();
            }
            startForeground(1, iVar.a());
        }
        if (intent != null && (extras = intent.getExtras()) != null) {
            Message messageObtain = Message.obtain(this.f10705p, 2);
            messageObtain.replyTo = this.f10706q;
            messageObtain.setData(extras);
            a(messageObtain);
            Bundle data = messageObtain.getData();
            if (data != null && (string = data.getString("MESSENGER_UTILS")) != null && AbstractC1507b.f17068a.get(string) != null) {
                throw new ClassCastException();
            }
        }
        return 2;
    }
}
