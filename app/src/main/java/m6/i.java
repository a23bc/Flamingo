package m6;

import Y4.o;
import f0.C0879c;
import f0.C0912t;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14472o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f14473p;

    public /* synthetic */ i(String str, int i7, int i8) {
        this.f14472o = i8;
        this.f14473p = str;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f14472o;
        C0912t c0912t = (C0912t) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                String str = this.f14473p;
                AbstractC1209k.f(str, "$content");
                i6.h.b(str, c0912t, C0879c.B(1));
                break;
            default:
                String str2 = this.f14473p;
                AbstractC1209k.f(str2, "$logLine");
                i6.h.c(str2, c0912t, C0879c.B(1));
                break;
        }
        return o.f8736a;
    }
}
