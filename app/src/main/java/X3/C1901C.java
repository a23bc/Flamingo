package x3;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import w3.C1710a0;

/* JADX INFO: renamed from: x3.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1901C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaController f19973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f19974b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19975c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f19976d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Y f19977e;

    public C1901C(Context context, Y y6) {
        this.f19977e = y6;
        Object obj = y6.f20021p;
        obj.getClass();
        MediaController mediaController = new MediaController(context, (MediaSession.Token) obj);
        this.f19973a = mediaController;
        if (y6.a() == null) {
            w3.Z z6 = new w3.Z(null);
            z6.f19109p = new WeakReference(this);
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, z6);
        }
    }

    public final void a() {
        InterfaceC1923h interfaceC1923hA = this.f19977e.a();
        if (interfaceC1923hA == null) {
            return;
        }
        ArrayList<C1710a0> arrayList = this.f19975c;
        for (C1710a0 c1710a0 : arrayList) {
            BinderC1900B binderC1900B = new BinderC1900B(c1710a0);
            this.f19976d.put(c1710a0, binderC1900B);
            c1710a0.f19132c = binderC1900B;
            try {
                interfaceC1923hA.D0(binderC1900B);
                c1710a0.i(13, null, null);
            } catch (RemoteException unused) {
            }
        }
        arrayList.clear();
    }

    public final void b(C1710a0 c1710a0) {
        MediaController mediaController = this.f19973a;
        C1899A c1899a = c1710a0.f19130a;
        c1899a.getClass();
        mediaController.unregisterCallback(c1899a);
        synchronized (this.f19974b) {
            InterfaceC1923h interfaceC1923hA = this.f19977e.a();
            if (interfaceC1923hA != null) {
                try {
                    BinderC1900B binderC1900B = (BinderC1900B) this.f19976d.remove(c1710a0);
                    if (binderC1900B != null) {
                        c1710a0.f19132c = null;
                        interfaceC1923hA.t(binderC1900B);
                    }
                } catch (RemoteException unused) {
                }
            } else {
                this.f19975c.remove(c1710a0);
            }
        }
    }
}
