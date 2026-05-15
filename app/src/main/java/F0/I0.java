package f0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m5.AbstractC1209k;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class I0 implements Iterable, InterfaceC1237a {

    /* JADX INFO: renamed from: p */
    public int f11680p;

    /* JADX INFO: renamed from: r */
    public int f11682r;

    /* JADX INFO: renamed from: s */
    public int f11683s;

    /* JADX INFO: renamed from: u */
    public boolean f11685u;

    /* JADX INFO: renamed from: v */
    public int f11686v;

    /* JADX INFO: renamed from: x */
    public HashMap f11688x;

    /* JADX INFO: renamed from: y */
    public t.y f11689y;

    /* JADX INFO: renamed from: o */
    public int[] f11679o = new int[0];

    /* JADX INFO: renamed from: q */
    public Object[] f11681q = new Object[0];

    /* JADX INFO: renamed from: t */
    public final Object f11684t = new Object();

    /* JADX INFO: renamed from: w */
    public ArrayList f11687w = new ArrayList();

    public final int b(C0877b c0877b) {
        if (this.f11685u) {
            AbstractC0914u.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!c0877b.a()) {
            AbstractC0908q0.a("Anchor refers to a group that was removed");
        }
        return c0877b.f11789a;
    }

    public final void c() {
        this.f11688x = new HashMap();
    }

    public final H0 e() {
        if (this.f11685u) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f11683s++;
        return new H0(this);
    }

    public final L0 g() {
        if (this.f11685u) {
            AbstractC0914u.c("Cannot start a writer when another writer is pending");
        }
        if (this.f11683s > 0) {
            AbstractC0914u.c("Cannot start a writer when a reader is pending");
        }
        this.f11685u = true;
        this.f11686v++;
        return new L0(this);
    }

    public final boolean i(C0877b c0877b) {
        int iE;
        return c0877b.a() && (iE = K0.e(this.f11687w, c0877b.f11789a, this.f11680p)) >= 0 && AbstractC1209k.a(this.f11687w.get(iE), c0877b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new N(this, 0, this.f11680p);
    }

    public final O n(int i7) {
        int i8;
        ArrayList arrayList;
        int iE;
        HashMap map = this.f11688x;
        if (map != null) {
            if (this.f11685u) {
                AbstractC0914u.c("use active SlotWriter to crate an anchor for location instead");
            }
            C0877b c0877b = (i7 < 0 || i7 >= (i8 = this.f11680p) || (iE = K0.e((arrayList = this.f11687w), i7, i8)) < 0) ? null : (C0877b) arrayList.get(iE);
            if (c0877b != null) {
                return (O) map.get(c0877b);
            }
        }
        return null;
    }
}
