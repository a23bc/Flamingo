package W;

import b1.AbstractC0607C;
import b1.M;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static b h;

    /* JADX INFO: renamed from: a */
    public final n1.n f7626a;

    /* JADX INFO: renamed from: b */
    public final M f7627b;

    /* JADX INFO: renamed from: c */
    public final n1.e f7628c;

    /* JADX INFO: renamed from: d */
    public final f1.d f7629d;

    /* JADX INFO: renamed from: e */
    public final M f7630e;

    /* JADX INFO: renamed from: f */
    public float f7631f = Float.NaN;

    /* JADX INFO: renamed from: g */
    public float f7632g = Float.NaN;

    public b(n1.n nVar, M m7, n1.e eVar, f1.d dVar) {
        this.f7626a = nVar;
        this.f7627b = m7;
        this.f7628c = eVar;
        this.f7629d = dVar;
        this.f7630e = AbstractC0607C.i(m7, nVar);
    }

    public final long a(long j3, int i7) {
        int i8;
        float f7 = this.f7632g;
        float f8 = this.f7631f;
        if (Float.isNaN(f7) || Float.isNaN(f8)) {
            String str = c.f7633a;
            long jB = n1.b.b(0, 0, 15);
            n1.e eVar = this.f7628c;
            float fB = AbstractC0607C.a(str, this.f7630e, jB, eVar, this.f7629d, 1, 96).b();
            float fB2 = AbstractC0607C.a(c.f7634b, this.f7630e, n1.b.b(0, 0, 15), eVar, this.f7629d, 2, 96).b() - fB;
            this.f7632g = fB;
            this.f7631f = fB2;
            f8 = fB2;
            f7 = fB;
        }
        if (i7 != 1) {
            int iRound = Math.round((f8 * (i7 - 1)) + f7);
            i8 = iRound >= 0 ? iRound : 0;
            int iG = n1.a.g(j3);
            if (i8 > iG) {
                i8 = iG;
            }
        } else {
            i8 = n1.a.i(j3);
        }
        return n1.b.a(n1.a.j(j3), n1.a.h(j3), i8, n1.a.g(j3));
    }
}
