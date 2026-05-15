package U4;

import b1.M;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f7046q = new a(0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f7047r = new a(0, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f7048s = new a(0, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f7049t = new a(0, 3);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7050p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7, int i8) {
        super(i7);
        this.f7050p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f7050p) {
            case 0:
                return new C1987t(C1987t.f20255b);
            case 1:
                return b.f7052b;
            case 2:
                return new M(0L, 0L, null, 0L, 0, 0L, null, 0, 16777215);
            default:
                return c.f7054b;
        }
    }
}
