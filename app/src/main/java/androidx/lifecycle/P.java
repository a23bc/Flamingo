package androidx.lifecycle;

import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Runnable {

    /* JADX INFO: renamed from: o */
    public final C0599w f9716o;

    /* JADX INFO: renamed from: p */
    public final EnumC0592o f9717p;

    /* JADX INFO: renamed from: q */
    public boolean f9718q;

    public P(C0599w c0599w, EnumC0592o enumC0592o) {
        AbstractC1209k.f(c0599w, "registry");
        AbstractC1209k.f(enumC0592o, "event");
        this.f9716o = c0599w;
        this.f9717p = enumC0592o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9718q) {
            return;
        }
        this.f9716o.r(this.f9717p);
        this.f9718q = true;
    }
}
