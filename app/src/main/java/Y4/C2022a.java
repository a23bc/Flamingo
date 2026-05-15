package y4;

import A2.W;
import Q0.N;
import Y4.m;
import a.AbstractC0509a;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import f0.C0;
import f0.C0879c;
import f0.C0894j0;
import i6.h;
import m5.AbstractC1209k;
import n1.n;
import o5.AbstractC1267a;
import r1.x;
import x0.C1895e;
import y0.AbstractC1970c;
import y0.C1980m;
import y0.InterfaceC1985r;

/* JADX INFO: renamed from: y4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2022a extends D0.b implements C0 {

    /* JADX INFO: renamed from: s */
    public final Drawable f20522s;

    /* JADX INFO: renamed from: t */
    public final C0894j0 f20523t;

    /* JADX INFO: renamed from: u */
    public final C0894j0 f20524u;

    /* JADX INFO: renamed from: v */
    public final m f20525v;

    public C2022a(Drawable drawable) {
        AbstractC1209k.f(drawable, "drawable");
        this.f20522s = drawable;
        this.f20523t = C0879c.t(0);
        Object obj = AbstractC2024c.f20527a;
        this.f20524u = C0879c.t(new C1895e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : h.i(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.f20525v = AbstractC0509a.O(new x(9, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f0.C0
    public final void a() {
        Drawable.Callback callback = (Drawable.Callback) this.f20525v.getValue();
        Drawable drawable = this.f20522s;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // D0.b
    public final void b(float f7) {
        this.f20522s.setAlpha(h.q(AbstractC1267a.H(f7 * 255), 0, 255));
    }

    @Override // D0.b
    public final void c(C1980m c1980m) {
        this.f20522s.setColorFilter(c1980m != null ? c1980m.f20246a : null);
    }

    @Override // D0.b
    public final void d(n nVar) {
        int i7;
        AbstractC1209k.f(nVar, "layoutDirection");
        int iOrdinal = nVar.ordinal();
        if (iOrdinal != 0) {
            i7 = 1;
            if (iOrdinal != 1) {
                throw new W();
            }
        } else {
            i7 = 0;
        }
        this.f20522s.setLayoutDirection(i7);
    }

    @Override // f0.C0
    public final void e() {
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f0.C0
    public final void f() {
        Drawable drawable = this.f20522s;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // D0.b
    public final long h() {
        return ((C1895e) this.f20524u.getValue()).f19880a;
    }

    @Override // D0.b
    public final void i(N n7) {
        InterfaceC1985r interfaceC1985rS = n7.f5853o.f54p.S();
        ((Number) this.f20523t.getValue()).intValue();
        int iH = AbstractC1267a.H(C1895e.d(n7.f()));
        int iH2 = AbstractC1267a.H(C1895e.b(n7.f()));
        Drawable drawable = this.f20522s;
        drawable.setBounds(0, 0, iH, iH2);
        try {
            interfaceC1985rS.l();
            drawable.draw(AbstractC1970c.a(interfaceC1985rS));
        } finally {
            interfaceC1985rS.k();
        }
    }
}
