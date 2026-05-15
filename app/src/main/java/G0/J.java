package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.C0877b;
import f0.InterfaceC0881d;
import f0.L0;
import m5.AbstractC1221w;

/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12272b;

    public J(int i7, int i8) {
        this.f12271a = i7;
        this.f12272b = i8;
    }

    public abstract void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7);

    public C0877b b(C0535h c0535h) {
        return null;
    }

    public final String toString() {
        String strB = AbstractC1221w.a(getClass()).b();
        return strB == null ? "" : strB;
    }

    public /* synthetic */ J(int i7, int i8, int i9) {
        this((i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? 0 : i8);
    }
}
