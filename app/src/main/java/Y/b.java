package Y;

import f0.a1;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import y0.AbstractC1959I;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f8357q = new b(0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f8358r = new b(0, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f8359s = new b(0, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f8360t = new b(0, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f8361u = new b(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f8362v = new b(0, 5);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final b f8363w = new b(0, 6);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final b f8364x = new b(0, 7);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f8365y = new b(0, 8);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f8366p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i7, int i8) {
        super(i7);
        this.f8366p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f8366p) {
            case 0:
                a1 a1Var = c.f8367a;
                long jD = AbstractC1959I.d(4284612846L);
                long jD2 = AbstractC1959I.d(4281794739L);
                long jD3 = AbstractC1959I.d(4278442694L);
                long jD4 = AbstractC1959I.d(4278290310L);
                long j3 = C1987t.f20259f;
                long jD5 = AbstractC1959I.d(4289724448L);
                long j7 = C1987t.f20255b;
                return new a(jD, jD2, jD3, jD4, j3, j3, jD5, j3, j7, j7, j7, j3);
            case 1:
                return Float.valueOf(1.0f);
            case 2:
                return new C1987t(C1987t.f20255b);
            case 3:
                return new n1.g(0);
            case 4:
                return f.f8370a;
            case 5:
                return new l();
            case 6:
                return Boolean.FALSE;
            case 7:
                return w.f8429a;
            default:
                return new v();
        }
    }
}
