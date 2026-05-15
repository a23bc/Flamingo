package M;

import e5.AbstractC0865c;
import f0.C0879c;
import l5.InterfaceC1180a;
import x.EnumC1862l0;
import z.I0;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements I0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ I0 f4752a;

    /* JADX INFO: renamed from: b */
    public final f0.G f4753b;

    /* JADX INFO: renamed from: c */
    public final f0.G f4754c;

    public z0(I0 i02, final B0 b0) {
        this.f4752a = i02;
        final int i7 = 0;
        this.f4753b = C0879c.o(new InterfaceC1180a() { // from class: M.y0
            @Override // l5.InterfaceC1180a
            public final Object a() {
                switch (i7) {
                    case 0:
                        B0 b02 = b0;
                        return Boolean.valueOf(b02.f4365a.h() < b02.f4366b.h());
                    default:
                        return Boolean.valueOf(b0.f4365a.h() > 0.0f);
                }
            }
        });
        final int i8 = 1;
        this.f4754c = C0879c.o(new InterfaceC1180a() { // from class: M.y0
            @Override // l5.InterfaceC1180a
            public final Object a() {
                switch (i8) {
                    case 0:
                        B0 b02 = b0;
                        return Boolean.valueOf(b02.f4365a.h() < b02.f4366b.h());
                    default:
                        return Boolean.valueOf(b0.f4365a.h() > 0.0f);
                }
            }
        });
    }

    @Override // z.I0
    public final boolean a() {
        return ((Boolean) this.f4754c.getValue()).booleanValue();
    }

    @Override // z.I0
    public final boolean b() {
        return this.f4752a.b();
    }

    @Override // z.I0
    public final Object c(EnumC1862l0 enumC1862l0, l5.e eVar, AbstractC0865c abstractC0865c) {
        return this.f4752a.c(enumC1862l0, eVar, abstractC0865c);
    }

    @Override // z.I0
    public final boolean d() {
        return ((Boolean) this.f4753b.getValue()).booleanValue();
    }

    @Override // z.I0
    public final float e(float f7) {
        return this.f4752a.e(f7);
    }
}
