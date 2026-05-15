package D;

import f0.C0879c;
import f0.C0912t;
import r0.C1390h;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: D.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0079u implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1395o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1396p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ n0.d f1397q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1400t;

    public /* synthetic */ C0079u(Object obj, int i7, H.U u7, n0.d dVar, int i8) {
        this.f1399s = obj;
        this.f1396p = i7;
        this.f1400t = u7;
        this.f1397q = dVar;
        this.f1398r = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1395o) {
            case 0:
                ((Integer) obj2).getClass();
                int iB = C0879c.B(this.f1396p | 1);
                n0.d dVar = this.f1397q;
                AbstractC0060d.a((InterfaceC1398p) this.f1399s, (C1390h) this.f1400t, dVar, (C0912t) obj, iB, this.f1398r);
                break;
            default:
                ((Integer) obj2).getClass();
                int iB2 = C0879c.B(this.f1398r | 1);
                n0.d dVar2 = this.f1397q;
                H.E.d(this.f1399s, this.f1396p, (H.U) this.f1400t, dVar2, (C0912t) obj, iB2);
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ C0079u(InterfaceC1398p interfaceC1398p, C1390h c1390h, n0.d dVar, int i7, int i8) {
        this.f1399s = interfaceC1398p;
        this.f1400t = c1390h;
        this.f1397q = dVar;
        this.f1396p = i7;
        this.f1398r = i8;
    }
}
