package M;

import D.C0056b;
import f0.C0886f0;
import f0.C0888g0;
import f0.C0894j0;
import o0.AbstractC1256m;
import x0.C1893c;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final V1.a f4364g = AbstractC1256m.b(new C0056b(6, 0), new F.g(15));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0886f0 f4365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0886f0 f4366b = new C0886f0(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0888g0 f4367c = new C0888g0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1893c f4368d = C1893c.f19868e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4369e = b1.L.f9943b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0894j0 f4370f;

    public B0(EnumC2048l0 enumC2048l0, float f7) {
        this.f4365a = new C0886f0(f7);
        this.f4370f = new C0894j0(enumC2048l0, f0.W.f11767t);
    }

    public final void a(EnumC2048l0 enumC2048l0, C1893c c1893c, int i7, int i8) {
        float f7 = i8 - i7;
        this.f4366b.j(f7);
        C1893c c1893c2 = this.f4368d;
        float f8 = c1893c2.f19869a;
        float f9 = c1893c.f19869a;
        C0886f0 c0886f0 = this.f4365a;
        float f10 = c1893c.f19870b;
        if (f9 != f8 || f10 != c1893c2.f19870b) {
            boolean z6 = enumC2048l0 == EnumC2048l0.f20894o;
            if (z6) {
                f9 = f10;
            }
            float f11 = z6 ? c1893c.f19872d : c1893c.f19871c;
            float fH = c0886f0.h();
            float f12 = i7;
            float f13 = fH + f12;
            c0886f0.j(c0886f0.h() + ((f11 <= f13 && (f9 >= fH || f11 - f9 <= f12)) ? (f9 >= fH || f11 - f9 > f12) ? 0.0f : f9 - fH : f11 - f13));
            this.f4368d = c1893c;
        }
        c0886f0.j(i6.h.p(c0886f0.h(), 0.0f, f7));
        this.f4367c.j(i7);
    }
}
