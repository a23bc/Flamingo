package x;

import d5.EnumC0830a;
import e5.AbstractC0865c;
import f0.C0879c;
import f0.C0888g0;
import l5.InterfaceC1180a;
import o0.C1247d;
import z.C2053o;
import z.I0;

/* JADX INFO: renamed from: x.E0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1817E0 implements I0 {

    /* JADX INFO: renamed from: i */
    public static final V1.a f19618i = new V1.a(new b1.x(17), new C1247d(19));

    /* JADX INFO: renamed from: a */
    public final C0888g0 f19619a;

    /* JADX INFO: renamed from: e */
    public float f19623e;

    /* JADX INFO: renamed from: g */
    public final f0.G f19625g;
    public final f0.G h;

    /* JADX INFO: renamed from: b */
    public final C0888g0 f19620b = new C0888g0(0);

    /* JADX INFO: renamed from: c */
    public final B.k f19621c = new B.k();

    /* JADX INFO: renamed from: d */
    public final C0888g0 f19622d = new C0888g0(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f */
    public final C2053o f19624f = new C2053o(new p6.f(4, this));

    public C1817E0(int i7) {
        this.f19619a = new C0888g0(i7);
        final int i8 = 0;
        this.f19625g = C0879c.o(new InterfaceC1180a(this) { // from class: x.D0

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ C1817E0 f19615p;

            {
                this.f19615p = this;
            }

            @Override // l5.InterfaceC1180a
            public final Object a() {
                switch (i8) {
                    case 0:
                        C1817E0 c1817e0 = this.f19615p;
                        return Boolean.valueOf(c1817e0.f19619a.h() < c1817e0.f19622d.h());
                    default:
                        return Boolean.valueOf(this.f19615p.f19619a.h() > 0);
                }
            }
        });
        final int i9 = 1;
        this.h = C0879c.o(new InterfaceC1180a(this) { // from class: x.D0

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ C1817E0 f19615p;

            {
                this.f19615p = this;
            }

            @Override // l5.InterfaceC1180a
            public final Object a() {
                switch (i9) {
                    case 0:
                        C1817E0 c1817e0 = this.f19615p;
                        return Boolean.valueOf(c1817e0.f19619a.h() < c1817e0.f19622d.h());
                    default:
                        return Boolean.valueOf(this.f19615p.f19619a.h() > 0);
                }
            }
        });
    }

    @Override // z.I0
    public final boolean a() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    @Override // z.I0
    public final boolean b() {
        return this.f19624f.b();
    }

    @Override // z.I0
    public final Object c(EnumC1862l0 enumC1862l0, l5.e eVar, AbstractC0865c abstractC0865c) {
        Object objC = this.f19624f.c(enumC1862l0, eVar, abstractC0865c);
        return objC == EnumC0830a.f11264o ? objC : Y4.o.f8736a;
    }

    @Override // z.I0
    public final boolean d() {
        return ((Boolean) this.f19625g.getValue()).booleanValue();
    }

    @Override // z.I0
    public final float e(float f7) {
        return this.f19624f.e(f7);
    }
}
