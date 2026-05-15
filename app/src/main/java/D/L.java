package D;

import f0.C0879c;
import f0.C0912t;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1245o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1246p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1247q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1250t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y4.c f1251u;

    public /* synthetic */ L(Object obj, Object obj2, Object obj3, Object obj4, n0.d dVar, int i7, int i8) {
        this.f1245o = i8;
        this.f1246p = obj;
        this.f1248r = obj2;
        this.f1249s = obj3;
        this.f1250t = obj4;
        this.f1251u = dVar;
        this.f1247q = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1245o) {
            case 0:
                ((Integer) obj2).getClass();
                int iB = C0879c.B(this.f1247q | 1);
                InterfaceC0064f interfaceC0064f = (InterfaceC0064f) this.f1248r;
                InterfaceC0067h interfaceC0067h = (InterfaceC0067h) this.f1249s;
                n0.d dVar = (n0.d) this.f1251u;
                AbstractC0060d.b((InterfaceC1398p) this.f1246p, interfaceC0064f, interfaceC0067h, (T) this.f1250t, dVar, (C0912t) obj, iB);
                break;
            case 1:
                ((Integer) obj2).getClass();
                InterfaceC1398p interfaceC1398p = (InterfaceC1398p) this.f1246p;
                AbstractC1209k.f(interfaceC1398p, "$albumModifier");
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) this.f1249s;
                AbstractC1209k.f(interfaceC1180a, "$albumUrlLambda");
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) this.f1250t;
                AbstractC1209k.f(interfaceC1180a2, "$musicPlayingLambda");
                InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) this.f1251u;
                AbstractC1209k.f(interfaceC1180a3, "$onAlbumClick");
                M3.a.m(interfaceC1398p, (InterfaceC1398p) this.f1248r, interfaceC1180a, interfaceC1180a2, interfaceC1180a3, (C0912t) obj, C0879c.B(3457), this.f1247q);
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((n0.d) this.f1251u).k(this.f1246p, this.f1248r, this.f1249s, this.f1250t, (C0912t) obj, C0879c.B(this.f1247q) | 1);
                break;
            default:
                ((Integer) obj2).getClass();
                d0.K k7 = (d0.K) this.f1248r;
                InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) this.f1249s;
                AbstractC1209k.f(interfaceC1180a4, "$cornerRadius");
                InterfaceC1180a interfaceC1180a5 = (InterfaceC1180a) this.f1250t;
                AbstractC1209k.f(interfaceC1180a5, "$onDismissRequest");
                n0.d dVar2 = (n0.d) this.f1251u;
                AbstractC1113a.p((d0.n0) this.f1246p, k7, interfaceC1180a4, interfaceC1180a5, dVar2, (C0912t) obj, C0879c.B(this.f1247q | 1));
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ L(n0.d dVar, Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1245o = 2;
        this.f1251u = dVar;
        this.f1246p = obj;
        this.f1248r = obj2;
        this.f1249s = obj3;
        this.f1250t = obj4;
        this.f1247q = i7;
    }

    public /* synthetic */ L(InterfaceC1398p interfaceC1398p, InterfaceC1398p interfaceC1398p2, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, int i7, int i8) {
        this.f1245o = 1;
        this.f1246p = interfaceC1398p;
        this.f1248r = interfaceC1398p2;
        this.f1249s = interfaceC1180a;
        this.f1250t = interfaceC1180a2;
        this.f1251u = interfaceC1180a3;
        this.f1247q = i8;
    }
}
