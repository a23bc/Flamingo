package z;

import d5.EnumC0830a;
import e5.AbstractC0865c;
import f0.C0879c;
import f0.C0894j0;
import l5.InterfaceC1182c;
import w5.AbstractC1767D;
import x.C1872q0;
import x.EnumC1862l0;

/* JADX INFO: renamed from: z.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2053o implements I0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1182c f20925a;

    /* JADX INFO: renamed from: b */
    public final I.B f20926b = new I.B(this);

    /* JADX INFO: renamed from: c */
    public final C1872q0 f20927c = new C1872q0();

    /* JADX INFO: renamed from: d */
    public final C0894j0 f20928d;

    /* JADX INFO: renamed from: e */
    public final C0894j0 f20929e;

    /* JADX INFO: renamed from: f */
    public final C0894j0 f20930f;

    public C2053o(InterfaceC1182c interfaceC1182c) {
        this.f20925a = interfaceC1182c;
        Boolean bool = Boolean.FALSE;
        this.f20928d = C0879c.t(bool);
        this.f20929e = C0879c.t(bool);
        this.f20930f = C0879c.t(bool);
    }

    @Override // z.I0
    public final /* synthetic */ boolean a() {
        return true;
    }

    @Override // z.I0
    public final boolean b() {
        return ((Boolean) this.f20928d.getValue()).booleanValue();
    }

    @Override // z.I0
    public final Object c(EnumC1862l0 enumC1862l0, l5.e eVar, AbstractC0865c abstractC0865c) {
        Object objH = AbstractC1767D.h(new C2051n(this, enumC1862l0, eVar, null), abstractC0865c);
        return objH == EnumC0830a.f11264o ? objH : Y4.o.f8736a;
    }

    @Override // z.I0
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // z.I0
    public final float e(float f7) {
        return ((Number) this.f20925a.b(Float.valueOf(f7))).floatValue();
    }
}
