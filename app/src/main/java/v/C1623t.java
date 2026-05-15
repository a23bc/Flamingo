package v;

import f0.C0879c;
import f0.C0912t;
import k.AbstractC1113a;
import m5.AbstractC1210l;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: v.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1623t extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f18170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f18171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f18172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1598P f18173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1599Q f18174t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f18175u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n0.d f18176v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f18177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f18178x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1623t(boolean z6, InterfaceC1398p interfaceC1398p, C1598P c1598p, C1599Q c1599q, String str, n0.d dVar, int i7, int i8, int i9) {
        super(2);
        this.f18170p = i9;
        this.f18171q = z6;
        this.f18172r = interfaceC1398p;
        this.f18173s = c1598p;
        this.f18174t = c1599q;
        this.f18175u = str;
        this.f18176v = dVar;
        this.f18177w = i7;
        this.f18178x = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18170p) {
            case 0:
                ((Number) obj2).intValue();
                int iB = C0879c.B(this.f18177w | 1);
                n0.d dVar = this.f18176v;
                C1598P c1598p = this.f18173s;
                C1599Q c1599q = this.f18174t;
                AbstractC1113a.c(this.f18171q, this.f18172r, c1598p, c1599q, this.f18175u, dVar, (C0912t) obj, iB, this.f18178x);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iB2 = C0879c.B(this.f18177w | 1);
                n0.d dVar2 = this.f18176v;
                C1599Q c1599q2 = this.f18174t;
                AbstractC1113a.d(this.f18171q, this.f18172r, this.f18173s, c1599q2, this.f18175u, dVar2, (C0912t) obj, iB2, this.f18178x);
                break;
            default:
                ((Number) obj2).intValue();
                int iB3 = C0879c.B(this.f18177w | 1);
                n0.d dVar3 = this.f18176v;
                C1599Q c1599q3 = this.f18174t;
                AbstractC1113a.b(this.f18171q, (C1395m) this.f18172r, this.f18173s, c1599q3, this.f18175u, dVar3, (C0912t) obj, iB3, this.f18178x);
                break;
        }
        return Y4.o.f8736a;
    }
}
