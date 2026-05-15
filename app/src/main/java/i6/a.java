package i6;

import f0.C0879c;
import f0.C0912t;
import k.AbstractC1113a;
import o5.AbstractC1267a;
import r0.C1395m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1395m f13517p;

    public /* synthetic */ a(C1395m c1395m, int i7, int i8) {
        this.f13516o = i8;
        this.f13517p = c1395m;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f13516o;
        C0912t c0912t = (C0912t) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                AbstractC1267a.d(this.f13517p, c0912t, C0879c.B(1));
                break;
            case 1:
                j6.i.a(this.f13517p, c0912t, C0879c.B(1));
                break;
            default:
                AbstractC1113a.j(this.f13517p, c0912t, C0879c.B(1));
                break;
        }
        return Y4.o.f8736a;
    }
}
