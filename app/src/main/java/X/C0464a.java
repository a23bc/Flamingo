package X;

import f0.C0879c;
import f0.C0912t;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: X.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0464a implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f8019o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f8020p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f8021q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8022r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8023s;

    public /* synthetic */ C0464a(InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a, boolean z6, int i7) {
        this.f8019o = 0;
        this.f8022r = interfaceC1398p;
        this.f8023s = interfaceC1180a;
        this.f8020p = z6;
        this.f8021q = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f8019o;
        C0912t c0912t = (C0912t) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                int iB = C0879c.B(this.f8021q | 1);
                AbstractC0498r0.e((InterfaceC1398p) this.f8022r, (InterfaceC1180a) this.f8023s, this.f8020p, c0912t, iB);
                break;
            case 1:
                int iB2 = C0879c.B(this.f8021q | 1);
                AbstractC0498r0.g(this.f8020p, (m1.j) this.f8022r, (K0) this.f8023s, c0912t, iB2);
                break;
            default:
                String str = (String) this.f8022r;
                AbstractC1209k.f(str, "$title");
                String str2 = (String) this.f8023s;
                AbstractC1209k.f(str2, "$desc");
                i6.g.e(this.f8020p, str, str2, c0912t, C0879c.B(this.f8021q | 1));
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ C0464a(boolean z6, Object obj, Object obj2, int i7, int i8) {
        this.f8019o = i8;
        this.f8020p = z6;
        this.f8022r = obj;
        this.f8023s = obj2;
        this.f8021q = i7;
    }
}
