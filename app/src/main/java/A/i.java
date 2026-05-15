package A;

import Y4.o;
import f0.C0894j0;
import java.util.concurrent.CancellationException;
import l5.InterfaceC1182c;
import m5.C1217s;
import w.C1678k;
import z.K0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f26o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f27p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1217s f28q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ K0 f29r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f30s;

    public /* synthetic */ i(float f7, C1217s c1217s, K0 k02, InterfaceC1182c interfaceC1182c, int i7) {
        this.f26o = i7;
        this.f27p = f7;
        this.f28q = c1217s;
        this.f29r = k02;
        this.f30s = interfaceC1182c;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        float fA;
        switch (this.f26o) {
            case 0:
                C1678k c1678k = (C1678k) obj;
                float fAbs = Math.abs(((Number) c1678k.f18702e.getValue()).floatValue());
                float f7 = this.f27p;
                float fAbs2 = Math.abs(f7);
                C1217s c1217s = this.f28q;
                C0894j0 c0894j0 = c1678k.f18702e;
                K0 k02 = this.f29r;
                d dVar = (d) this.f30s;
                if (fAbs >= fAbs2) {
                    float fD = l.d(((Number) c0894j0.getValue()).floatValue(), f7);
                    l.c(c1678k, k02, dVar, fD - c1217s.f14436o);
                    c1678k.a();
                    c1217s.f14436o = fD;
                } else {
                    l.c(c1678k, k02, dVar, ((Number) c0894j0.getValue()).floatValue() - c1217s.f14436o);
                    c1217s.f14436o = ((Number) c0894j0.getValue()).floatValue();
                }
                break;
            default:
                K0 k03 = this.f29r;
                C1678k c1678k2 = (C1678k) obj;
                float fD2 = l.d(((Number) c1678k2.f18702e.getValue()).floatValue(), this.f27p);
                C1217s c1217s2 = this.f28q;
                float f8 = fD2 - c1217s2.f14436o;
                try {
                    fA = k03.a(f8);
                } catch (CancellationException unused) {
                    c1678k2.a();
                    fA = 0.0f;
                }
                this.f30s.b(Float.valueOf(fA));
                if (Math.abs(f8 - fA) > 0.5f || fD2 != ((Number) c1678k2.f18702e.getValue()).floatValue()) {
                    c1678k2.a();
                }
                c1217s2.f14436o += fA;
                break;
        }
        return o.f8736a;
    }
}
