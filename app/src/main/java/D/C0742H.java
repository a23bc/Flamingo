package d;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: d.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0742H implements InterfaceC0750c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC0773z f10735o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0743I f10736p;

    public C0742H(C0743I c0743i, AbstractC0773z abstractC0773z) {
        AbstractC1209k.f(abstractC0773z, "onBackPressedCallback");
        this.f10736p = c0743i;
        this.f10735o = abstractC0773z;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l5.a, m5.i] */
    @Override // d.InterfaceC0750c
    public final void cancel() {
        C0743I c0743i = this.f10736p;
        Z4.k kVar = c0743i.f10738b;
        AbstractC0773z abstractC0773z = this.f10735o;
        kVar.remove(abstractC0773z);
        if (AbstractC1209k.a(c0743i.f10739c, abstractC0773z)) {
            abstractC0773z.getClass();
            c0743i.f10739c = null;
        }
        abstractC0773z.f10812b.remove(this);
        ?? r02 = abstractC0773z.f10813c;
        if (r02 != 0) {
            r02.a();
        }
        abstractC0773z.f10813c = null;
    }
}
