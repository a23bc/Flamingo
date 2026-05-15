package X;

import f0.Z0;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import w.C1682o;

/* JADX INFO: renamed from: X.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0473e0 implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z0 f8058p;

    public /* synthetic */ C0473e0(Z0 z02, int i7) {
        this.f8057o = i7;
        this.f8058p = z02;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        Z0 z02 = this.f8058p;
        switch (this.f8057o) {
            case 0:
                C1682o c1682o = AbstractC0481i0.f8082a;
                break;
            case 1:
                AbstractC1209k.f(z02, "$scale");
                break;
            default:
                AbstractC1209k.f(z02, "$scale");
                break;
        }
        return Float.valueOf(((Number) z02.getValue()).floatValue() / 10.0f);
    }
}
