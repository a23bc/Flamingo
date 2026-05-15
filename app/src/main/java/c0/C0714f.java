package c0;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import x.InterfaceC1844c0;
import x.InterfaceC1846d0;
import y0.C1987t;

/* JADX INFO: renamed from: c0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0714f implements InterfaceC1844c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0878b0 f10553c;

    public C0714f(boolean z6, float f7, InterfaceC0878b0 interfaceC0878b0) {
        this.f10551a = z6;
        this.f10552b = f7;
        this.f10553c = interfaceC0878b0;
    }

    @Override // x.InterfaceC1844c0
    public final InterfaceC1846d0 a(B.k kVar, C0912t c0912t) {
        long jB;
        c0912t.X(988743187);
        y yVar = (y) c0912t.j(AbstractC0707A.f10514a);
        InterfaceC0878b0 interfaceC0878b0 = this.f10553c;
        if (((C1987t) interfaceC0878b0.getValue()).f20264a != C1987t.f20262j) {
            c0912t.X(-303571590);
            c0912t.p(false);
            jB = ((C1987t) interfaceC0878b0.getValue()).f20264a;
        } else {
            c0912t.X(-303521246);
            jB = yVar.b(c0912t);
            c0912t.p(false);
        }
        InterfaceC0878b0 interfaceC0878b0X = C0879c.x(new C1987t(jB), c0912t);
        InterfaceC0878b0 interfaceC0878b0X2 = C0879c.x(yVar.a(c0912t), c0912t);
        c0912t.X(331259447);
        ViewGroup viewGroupB = AbstractC0708B.b((View) c0912t.j(AndroidCompositionLocals_androidKt.f9328f));
        boolean zF = c0912t.f(kVar) | c0912t.f(this) | c0912t.f(viewGroupB);
        Object objK = c0912t.K();
        Object obj = C0903o.f11850a;
        if (zF || objK == obj) {
            Object c0709a = new C0709a(this.f10551a, this.f10552b, interfaceC0878b0X, interfaceC0878b0X2, viewGroupB);
            c0912t.i0(c0709a);
            objK = c0709a;
        }
        C0709a c0709a2 = (C0709a) objK;
        c0912t.p(false);
        boolean zF2 = c0912t.f(kVar) | c0912t.h(c0709a2);
        Object objK2 = c0912t.K();
        if (zF2 || objK2 == obj) {
            objK2 = new g(kVar, c0709a2, null);
            c0912t.i0(objK2);
        }
        C0879c.f(c0709a2, kVar, (l5.e) objK2, c0912t);
        c0912t.p(false);
        return c0709a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0714f)) {
            return false;
        }
        C0714f c0714f = (C0714f) obj;
        return this.f10551a == c0714f.f10551a && n1.g.a(this.f10552b, c0714f.f10552b) && this.f10553c.equals(c0714f.f10553c);
    }

    public final int hashCode() {
        return this.f10553c.hashCode() + n1.c.n(this.f10552b, (this.f10551a ? 1231 : 1237) * 31, 31);
    }
}
