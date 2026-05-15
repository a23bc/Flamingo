package androidx.lifecycle;

import android.os.Handler;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class E implements InterfaceC0597u {

    /* JADX INFO: renamed from: w */
    public static final E f9684w = new E();

    /* JADX INFO: renamed from: o */
    public int f9685o;

    /* JADX INFO: renamed from: p */
    public int f9686p;

    /* JADX INFO: renamed from: s */
    public Handler f9689s;

    /* JADX INFO: renamed from: q */
    public boolean f9687q = true;

    /* JADX INFO: renamed from: r */
    public boolean f9688r = true;

    /* JADX INFO: renamed from: t */
    public final C0599w f9690t = new C0599w(this, true);

    /* JADX INFO: renamed from: u */
    public final B2.e f9691u = new B2.e(12, this);

    /* JADX INFO: renamed from: v */
    public final W f9692v = new W(this);

    public final void c() {
        int i7 = this.f9686p + 1;
        this.f9686p = i7;
        if (i7 == 1) {
            if (this.f9687q) {
                this.f9690t.r(EnumC0592o.ON_RESUME);
                this.f9687q = false;
            } else {
                Handler handler = this.f9689s;
                AbstractC1209k.c(handler);
                handler.removeCallbacks(this.f9691u);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0597u
    public final K h() {
        return this.f9690t;
    }
}
