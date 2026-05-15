package d0;

import f0.C0912t;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: d0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0806v extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0806v f11150q = new C0806v(2, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0806v f11151r = new C0806v(2, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0806v f11152s = new C0806v(2, 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11153p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0806v(int i7, int i8) {
        super(i7);
        this.f11153p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11153p) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    r.f11081a.a(null, 0.0f, 0.0f, null, 0L, c0912t, 196608);
                }
                return Y4.o.f8736a;
            case 1:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                }
                return Y4.o.f8736a;
            default:
                return (o0) ((n0) obj2).f11048a.f11061f.getValue();
        }
    }
}
