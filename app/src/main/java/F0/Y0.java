package f0;

import java.util.Iterator;
import n5.InterfaceC1237a;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 implements Iterable, InterfaceC1237a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final I0 f11783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f11784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C0879c f11785q;

    public Y0(I0 i02, int i7, O o7, C0879c c0879c) {
        this.f11783o = i02;
        this.f11784p = i7;
        this.f11785q = c0879c;
        o7.getClass();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new N(this.f11783o, this.f11784p, null, this.f11785q);
    }
}
