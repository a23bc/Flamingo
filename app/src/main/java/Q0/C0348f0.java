package Q0;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import m5.AbstractC1209k;
import r0.InterfaceC1396n;
import t.C1450e;
import w2.AbstractC1697a;
import w3.u1;
import w3.z1;

/* JADX INFO: renamed from: Q0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0348f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5989c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5990d = new C1450e(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5991e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5992f;

    public boolean a(int i7, int i8) {
        h0.e eVar = (h0.e) this.f5990d;
        int i9 = this.f5987a;
        InterfaceC1396n interfaceC1396n = (InterfaceC1396n) eVar.f12546o[i7 + i9];
        InterfaceC1396n interfaceC1396n2 = (InterfaceC1396n) ((h0.e) this.f5991e).f12546o[i9 + i8];
        return AbstractC1209k.a(interfaceC1396n, interfaceC1396n2) || interfaceC1396n.getClass() == interfaceC1396n2.getClass();
    }

    public int b() {
        int i7;
        synchronized (this.f5989c) {
            i7 = this.f5987a;
            this.f5987a = i7 + 1;
        }
        return i7;
    }

    public void c() {
        ArrayList arrayList;
        synchronized (this.f5989c) {
            try {
                this.f5988b = true;
                arrayList = new ArrayList(((C1450e) this.f5990d).values());
                ((C1450e) this.f5990d).clear();
                if (((B2.e) this.f5991e) != null) {
                    Handler handler = (Handler) this.f5992f;
                    handler.getClass();
                    handler.post((B2.e) this.f5991e);
                    this.f5991e = null;
                    this.f5992f = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((u1) it.next()).n();
        }
    }

    public void d(int i7, Object obj) {
        synchronized (this.f5989c) {
            try {
                u1 u1Var = (u1) ((C1450e) this.f5990d).remove(Integer.valueOf(i7));
                if (u1Var != null) {
                    if (z1.class == obj.getClass()) {
                        u1Var.l(obj);
                    } else {
                        AbstractC1697a.w("Type mismatch, expected " + z1.class + ", but was " + obj.getClass());
                    }
                }
                if (((B2.e) this.f5991e) != null && ((C1450e) this.f5990d).isEmpty()) {
                    c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
