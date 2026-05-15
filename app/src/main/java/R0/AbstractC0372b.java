package R0;

import C2.C0039k;
import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import k.LayoutInflaterFactory2C1111A;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: R0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0372b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f6416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6417b;

    public AbstractC0372b(Context context) {
        this.f6416a = context;
    }

    public void c() {
        C0039k c0039k = (C0039k) this.f6416a;
        if (c0039k != null) {
            try {
                ((LayoutInflaterFactory2C1111A) this.f6417b).f13825y.unregisterReceiver(c0039k);
            } catch (IllegalArgumentException unused) {
            }
            this.f6416a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int[] e(int i7);

    public abstract int f();

    public MenuItem g(MenuItem menuItem) {
        if (!(menuItem instanceof A1.a)) {
            return menuItem;
        }
        A1.a aVar = (A1.a) menuItem;
        if (((t.T) this.f6417b) == null) {
            this.f6417b = new t.T(0);
        }
        MenuItem menuItem2 = (MenuItem) ((t.T) this.f6417b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        p.s sVar = new p.s((Context) this.f6416a, aVar);
        ((t.T) this.f6417b).put(aVar, sVar);
        return sVar;
    }

    public int[] h(int i7, int i8) {
        if (i7 < 0 || i8 < 0 || i7 == i8) {
            return null;
        }
        int[] iArr = (int[]) this.f6417b;
        iArr[0] = i7;
        iArr[1] = i8;
        return iArr;
    }

    public String i() {
        String str = (String) this.f6416a;
        if (str != null) {
            return str;
        }
        AbstractC1209k.m("text");
        throw null;
    }

    public abstract void j();

    public abstract int[] k(int i7);

    public void l() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((C0039k) this.f6416a) == null) {
            this.f6416a = new C0039k(3, this);
        }
        ((LayoutInflaterFactory2C1111A) this.f6417b).f13825y.registerReceiver((C0039k) this.f6416a, intentFilterD);
    }

    public AbstractC0372b() {
        this.f6417b = new int[2];
    }

    public AbstractC0372b(LayoutInflaterFactory2C1111A layoutInflaterFactory2C1111A) {
        this.f6417b = layoutInflaterFactory2C1111A;
    }
}
