package M5;

import java.io.IOException;
import m5.AbstractC1209k;
import m5.C1220v;

/* JADX INFO: loaded from: classes.dex */
public final class i extends I5.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f4859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f4861g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i7) {
        super(str, true);
        this.f4859e = i7;
        this.f4860f = obj;
        this.f4861g = obj2;
    }

    @Override // I5.a
    public final long a() {
        long jA;
        w[] wVarArr;
        int i7 = 0;
        switch (this.f4859e) {
            case 0:
                o oVar = (o) this.f4860f;
                oVar.f4891o.a(oVar, (B) ((C1220v) this.f4861g).f14439o);
                return -1L;
            case 1:
                try {
                    ((o) this.f4860f).f4891o.b((w) this.f4861g);
                    break;
                } catch (IOException e7) {
                    N5.n nVar = N5.n.f5271a;
                    N5.n nVar2 = N5.n.f5271a;
                    String str = "Http2Connection.Listener failure for " + ((o) this.f4860f).f4893q;
                    nVar2.getClass();
                    N5.n.i(str, 4, e7);
                    try {
                        ((w) this.f4861g).c(2, e7);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                k kVar = (k) this.f4860f;
                B b7 = (B) this.f4861g;
                C1220v c1220v = new C1220v();
                o oVar2 = (o) kVar.f4867q;
                synchronized (oVar2.f4888K) {
                    synchronized (oVar2) {
                        try {
                            B b8 = oVar2.f4882E;
                            B b9 = new B();
                            b9.b(b8);
                            b9.b(b7);
                            c1220v.f14439o = b9;
                            jA = ((long) b9.a()) - ((long) b8.a());
                            wVarArr = (jA == 0 || oVar2.f4892p.isEmpty()) ? null : (w[]) oVar2.f4892p.values().toArray(new w[0]);
                            B b10 = (B) c1220v.f14439o;
                            AbstractC1209k.f(b10, "<set-?>");
                            oVar2.f4882E = b10;
                            oVar2.f4900x.c(new i(oVar2.f4893q + " onSettings", oVar2, c1220v, i7), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        oVar2.f4888K.b((B) c1220v.f14439o);
                    } catch (IOException e8) {
                        oVar2.b(2, 2, e8);
                    }
                    break;
                }
                if (wVarArr != null) {
                    int length = wVarArr.length;
                    while (i7 < length) {
                        w wVar = wVarArr[i7];
                        synchronized (wVar) {
                            wVar.f4936f += jA;
                            if (jA > 0) {
                                wVar.notifyAll();
                            }
                        }
                        i7++;
                    }
                }
                return -1L;
        }
    }
}
