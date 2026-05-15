package M;

import b1.C0622g;
import f0.C0894j0;
import f0.C0915u0;
import f0.C0924z;
import g1.C0968j;
import g1.C0980v;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: M.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0276v implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f4712o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Z f4713p;

    public /* synthetic */ C0276v(Z z6, int i7) {
        this.f4712o = i7;
        this.f4713p = z6;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f4712o) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f4713p.f4511q.setValue(bool);
                return Y4.o.f8736a;
            case 1:
                C0980v c0980v = (C0980v) obj;
                String str = c0980v.f12384a.f9970p;
                Z z6 = this.f4713p;
                C0622g c0622g = z6.f4505j;
                if (!AbstractC1209k.a(str, c0622g != null ? c0622g.f9970p : null)) {
                    z6.f4506k.setValue(N.f4425o);
                    C0894j0 c0894j0 = z6.f4514t;
                    if (((Boolean) c0894j0.getValue()).booleanValue()) {
                        c0894j0.setValue(Boolean.FALSE);
                    } else {
                        z6.f4513s.setValue(Boolean.FALSE);
                    }
                }
                long j3 = b1.L.f9943b;
                z6.f(j3);
                z6.e(j3);
                z6.f4515u.b(c0980v);
                C0915u0 c0915u0 = z6.f4498b;
                C0924z c0924z = c0915u0.f11929a;
                if (c0924z != null) {
                    c0924z.q(c0915u0, null);
                }
                return Y4.o.f8736a;
            case 2:
                this.f4713p.f4512r.b(((C0968j) obj).f12360a);
                return Y4.o.f8736a;
            default:
                return Boolean.valueOf(this.f4713p.f4512r.b(((C0968j) obj).f12360a));
        }
    }
}
