package u6;

import b1.C0615K;
import f0.C0912t;
import f0.InterfaceC0878b0;
import l5.InterfaceC1182c;
import r0.C1388f;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements l5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ boolean f17601A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ long f17602B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17603C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17604D;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f17605o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f17606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f17607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f17608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f17609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1388f f17610t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f17611u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f17612v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f17613w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b1.M f17614x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0615K f17615y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f17616z;

    public /* synthetic */ f0(boolean z6, boolean z7, InterfaceC0878b0 interfaceC0878b0, InterfaceC1182c interfaceC1182c, C1388f c1388f, boolean z8, int i7, long j3, b1.M m7, C0615K c0615k, long j7, boolean z9, long j8, InterfaceC0878b0 interfaceC0878b02, InterfaceC0878b0 interfaceC0878b03, int i8) {
        this.f17605o = i8;
        this.f17606p = z6;
        this.f17607q = z7;
        this.f17608r = interfaceC0878b0;
        this.f17609s = interfaceC1182c;
        this.f17610t = c1388f;
        this.f17611u = z8;
        this.f17612v = i7;
        this.f17613w = j3;
        this.f17614x = m7;
        this.f17615y = c0615k;
        this.f17616z = j7;
        this.f17601A = z9;
        this.f17602B = j8;
        this.f17603C = interfaceC0878b02;
        this.f17604D = interfaceC0878b03;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17605o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else if (((Boolean) this.f17603C.getValue()).booleanValue()) {
                    InterfaceC0878b0 interfaceC0878b0 = this.f17604D;
                    if (((d6.f) interfaceC0878b0.getValue()) != null) {
                        E0.a(this.f17606p, (d6.f) interfaceC0878b0.getValue(), true, this.f17607q, this.f17608r, this.f17609s, this.f17610t, this.f17611u, this.f17612v, this.f17613w, this.f17614x, this.f17615y, this.f17616z, this.f17601A, this.f17602B, c0912t, 3072);
                    }
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else if (!((Boolean) this.f17603C.getValue()).booleanValue()) {
                    InterfaceC0878b0 interfaceC0878b02 = this.f17604D;
                    if (((d6.f) interfaceC0878b02.getValue()) != null) {
                        E0.a(this.f17606p, (d6.f) interfaceC0878b02.getValue(), false, this.f17607q, this.f17608r, this.f17609s, this.f17610t, this.f17611u, this.f17612v, this.f17613w, this.f17614x, this.f17615y, this.f17616z, this.f17601A, this.f17602B, c0912t2, 3072);
                    }
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
