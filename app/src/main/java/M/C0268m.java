package M;

import f0.C0879c;
import f0.C0912t;
import r0.InterfaceC1398p;
import y0.InterfaceC1988u;

/* JADX INFO: renamed from: M.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0268m implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f4626o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f4627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f4628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b1.M f4629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f4630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f4631t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4632u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4633v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1988u f4634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f4635x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f4636y;

    public /* synthetic */ C0268m(String str, InterfaceC1398p interfaceC1398p, b1.M m7, int i7, boolean z6, int i8, int i9, InterfaceC1988u interfaceC1988u, int i10, int i11, int i12) {
        this.f4626o = i12;
        this.f4627p = str;
        this.f4628q = interfaceC1398p;
        this.f4629r = m7;
        this.f4630s = i7;
        this.f4631t = z6;
        this.f4632u = i8;
        this.f4633v = i9;
        this.f4634w = interfaceC1988u;
        this.f4635x = i10;
        this.f4636y = i11;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4626o) {
            case 0:
                ((Integer) obj2).getClass();
                int iB = C0879c.B(this.f4635x | 1);
                InterfaceC1988u interfaceC1988u = this.f4634w;
                V.b(this.f4627p, this.f4628q, this.f4629r, this.f4630s, this.f4631t, this.f4632u, this.f4633v, interfaceC1988u, (C0912t) obj, iB, this.f4636y);
                break;
            default:
                ((Integer) obj2).getClass();
                int iB2 = C0879c.B(this.f4635x | 1);
                InterfaceC1988u interfaceC1988u2 = this.f4634w;
                V.a(this.f4627p, this.f4628q, this.f4629r, this.f4630s, this.f4631t, this.f4632u, this.f4633v, interfaceC1988u2, (C0912t) obj, iB2, this.f4636y);
                break;
        }
        return Y4.o.f8736a;
    }
}
