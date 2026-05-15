package h6;

import f0.C0888g0;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12968o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f12969p;

    public /* synthetic */ X(C0888g0 c0888g0, int i7) {
        this.f12968o = i7;
        this.f12969p = c0888g0;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f12968o) {
            case 0:
                C0888g0 c0888g0 = this.f12969p;
                AbstractC1209k.f(c0888g0, "$repeatMode");
                return Integer.valueOf(c0888g0.h());
            default:
                C0888g0 c0888g02 = this.f12969p;
                AbstractC1209k.f(c0888g02, "$repeatMode");
                return Integer.valueOf(c0888g02.h());
        }
    }
}
