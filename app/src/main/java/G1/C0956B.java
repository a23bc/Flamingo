package g1;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: g1.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0956B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0981w f12320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0975q f12321b;

    public C0956B(C0981w c0981w, InterfaceC0975q interfaceC0975q) {
        this.f12320a = c0981w;
        this.f12321b = interfaceC0975q;
    }

    public final void a(C0980v c0980v, C0980v c0980v2) {
        if (AbstractC1209k.a((C0956B) this.f12320a.f12388b.get(), this)) {
            this.f12321b.a(c0980v, c0980v2);
        }
    }
}
