package w3;

import d2.C0821i;

/* JADX INFO: renamed from: w3.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1698A implements S, w2.g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f18893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ U f18894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f18895q;

    public /* synthetic */ C1698A(U u7, int i7, int i8) {
        this.f18893o = i8;
        this.f18894p = u7;
        this.f18895q = i7;
    }

    @Override // w2.g
    public void b(Object obj) {
        t2.V v3 = (t2.V) obj;
        switch (this.f18893o) {
            case 3:
                v3.U(this.f18895q, this.f18894p.f19070n.f19305s);
                break;
            case 4:
                v3.U(this.f18895q, this.f18894p.f19070n.f19305s);
                break;
            case 5:
                v3.U(this.f18895q, this.f18894p.f19070n.f19305s);
                break;
            case 6:
            case 8:
            default:
                v3.U(this.f18895q, this.f18894p.f19070n.f19305s);
                break;
            case 7:
                v3.U(this.f18895q, this.f18894p.f19070n.f19305s);
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                v3.U(this.f18895q, this.f18894p.f19070n.f19305s);
                break;
        }
    }

    @Override // w3.S
    public void e(InterfaceC1741o interfaceC1741o, int i7) {
        switch (this.f18893o) {
            case 0:
                interfaceC1741o.Y(this.f18894p.f19061c, i7, this.f18895q);
                break;
            case 1:
                interfaceC1741o.c1(this.f18894p.f19061c, i7, this.f18895q);
                break;
            case 2:
                interfaceC1741o.X0(this.f18894p.f19061c, i7, this.f18895q);
                break;
            case 3:
            case 4:
            case 5:
            case 7:
            default:
                interfaceC1741o.e1(this.f18894p.f19061c, i7, this.f18895q);
                break;
            case 6:
                interfaceC1741o.z0(this.f18894p.f19061c, i7, this.f18895q);
                break;
            case 8:
                interfaceC1741o.M(this.f18894p.f19061c, i7, this.f18895q);
                break;
        }
    }
}
