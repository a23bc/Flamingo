package u6;

import b1.C0615K;
import f0.C0912t;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class U implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d6.f f17515o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f17516p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f17517q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f17518r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f17519s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f17520t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ b1.M f17521u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C0615K f17522v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f17523w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f17524x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f17525y;

    public U(d6.f fVar, boolean z6, boolean z7, boolean z8, int i7, long j3, b1.M m7, C0615K c0615k, long j7, boolean z9, long j8) {
        this.f17515o = fVar;
        this.f17516p = z6;
        this.f17517q = z7;
        this.f17518r = z8;
        this.f17519s = i7;
        this.f17520t = j3;
        this.f17521u = m7;
        this.f17522v = c0615k;
        this.f17523w = j7;
        this.f17524x = z9;
        this.f17525y = j8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            d6.f fVar = this.f17515o;
            AbstractC1209k.c(fVar);
            E0.e(true, fVar.f11293r, fVar.f11294s, this.f17516p, this.f17517q, this.f17518r, this.f17519s, this.f17520t, this.f17521u, fVar, this.f17522v, this.f17523w, this.f17524x, fVar.f11295t, 14, this.f17525y, c0912t, 48, 196608);
        }
        return Y4.o.f8736a;
    }
}
