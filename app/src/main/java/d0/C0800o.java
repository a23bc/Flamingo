package d0;

import b2.C0641K;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import x.EnumC1862l0;

/* JADX INFO: renamed from: d0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0800o implements z.Q {

    /* JADX INFO: renamed from: a */
    public final V4.F f11050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0801p f11051b;

    public C0800o(C0801p c0801p) {
        this.f11051b = c0801p;
        this.f11050a = new V4.F(1, c0801p);
    }

    @Override // z.Q
    public final Object a(EnumC1862l0 enumC1862l0, l5.e eVar, AbstractC0871i abstractC0871i) throws Throwable {
        Object objB = this.f11051b.b(enumC1862l0, new C0641K(this, eVar, (c5.d) null), abstractC0871i);
        return objB == EnumC0830a.f11264o ? objB : Y4.o.f8736a;
    }
}
