package d0;

import e0.AbstractC0847l;
import java.util.UUID;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import y0.C1987t;

/* JADX INFO: renamed from: d0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0804t extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0804t f11127q = new C0804t(0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0804t f11128r = new C0804t(0, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0804t f11129s = new C0804t(0, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0804t f11130t = new C0804t(0, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C0804t f11131u = new C0804t(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C0804t f11132v = new C0804t(0, 5);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final C0804t f11133w = new C0804t(0, 6);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final C0804t f11134x = new C0804t(0, 7);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final C0804t f11135y = new C0804t(0, 8);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f11136p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0804t(int i7, int i8) {
        super(i7);
        this.f11136p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f11136p) {
            case 0:
                return AbstractC0805u.d(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
            case 1:
                return Boolean.TRUE;
            case 2:
                return new C1987t(C1987t.f20255b);
            case 3:
                return Boolean.TRUE;
            case 4:
                return UUID.randomUUID();
            case 5:
                return new C0795j0();
            case 6:
                return new n1.g(0);
            case 7:
                return AbstractC0847l.f11529a;
            default:
                return new I0(null, 32767);
        }
    }
}
