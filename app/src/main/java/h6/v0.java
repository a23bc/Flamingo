package h6;

import androidx.lifecycle.InterfaceC0597u;
import f0.C0879c;
import f0.C0886f0;
import f0.C0890h0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import l5.InterfaceC1182c;
import n2.AbstractC1228a;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13249o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13250p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f13251q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f13252r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13254t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f13255u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f13256v;

    public /* synthetic */ v0(InterfaceC0878b0 interfaceC0878b0, C0890h0 c0890h0, C0890h0 c0890h02, InterfaceC0878b0 interfaceC0878b02, InterfaceC0878b0 interfaceC0878b03, InterfaceC1182c interfaceC1182c, C0886f0 c0886f0, int i7) {
        this.f13249o = i7;
        this.f13250p = interfaceC0878b0;
        this.f13251q = c0890h0;
        this.f13252r = c0890h02;
        this.f13253s = interfaceC0878b02;
        this.f13254t = interfaceC0878b03;
        this.f13255u = interfaceC1182c;
        this.f13256v = c0886f0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13249o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    InterfaceC0878b0 interfaceC0878b0K = C0879c.k(((InterfaceC0597u) c0912t.j(AbstractC1228a.f14530a)).h().j(), c0912t, 0);
                    Object value = interfaceC0878b0K.getValue();
                    Object value2 = this.f13250p.getValue();
                    c0912t.X(-369187083);
                    boolean zF = c0912t.f(interfaceC0878b0K) | c0912t.f(this.f13251q) | c0912t.f(this.f13252r) | c0912t.f(this.f13253s) | c0912t.f(this.f13254t) | c0912t.h(this.f13255u);
                    Object objK = c0912t.K();
                    if (zF || objK == C0903o.f11850a) {
                        C1046u0 c1046u0 = new C1046u0(interfaceC0878b0K, this.f13251q, this.f13252r, this.f13250p, this.f13253s, this.f13256v, this.f13254t, this.f13255u, null);
                        c0912t.i0(c1046u0);
                        objK = c1046u0;
                    }
                    c0912t.p(false);
                    C0879c.f(value, value2, (l5.e) objK, c0912t);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    InterfaceC0878b0 interfaceC0878b0K2 = C0879c.k(((InterfaceC0597u) c0912t2.j(AbstractC1228a.f14530a)).h().j(), c0912t2, 0);
                    Object value3 = interfaceC0878b0K2.getValue();
                    Object value4 = this.f13250p.getValue();
                    c0912t2.X(103619717);
                    boolean zF2 = c0912t2.f(interfaceC0878b0K2) | c0912t2.f(this.f13251q) | c0912t2.f(this.f13252r) | c0912t2.f(this.f13253s) | c0912t2.f(this.f13254t) | c0912t2.h(this.f13255u);
                    Object objK2 = c0912t2.K();
                    if (zF2 || objK2 == C0903o.f11850a) {
                        E0 e02 = new E0(interfaceC0878b0K2, this.f13251q, this.f13252r, this.f13250p, this.f13253s, this.f13256v, this.f13254t, this.f13255u, null);
                        c0912t2.i0(e02);
                        objK2 = e02;
                    }
                    c0912t2.p(false);
                    C0879c.f(value3, value4, (l5.e) objK2, c0912t2);
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
