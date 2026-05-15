package u6;

import b1.C0615K;
import f0.C0912t;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements l5.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ String f17623A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ int f17624B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ long f17625C;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f17626o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List f17627p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f17628q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f17629r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f17630s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f17631t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ long f17632u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b1.M f17633v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d6.f f17634w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0615K f17635x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f17636y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f17637z;

    public g0(String str, List list, boolean z6, boolean z7, boolean z8, int i7, long j3, b1.M m7, d6.f fVar, C0615K c0615k, long j7, boolean z9, String str2, int i8, long j8) {
        this.f17626o = str;
        this.f17627p = list;
        this.f17628q = z6;
        this.f17629r = z7;
        this.f17630s = z8;
        this.f17631t = i7;
        this.f17632u = j3;
        this.f17633v = m7;
        this.f17634w = fVar;
        this.f17635x = c0615k;
        this.f17636y = j7;
        this.f17637z = z9;
        this.f17623A = str2;
        this.f17624B = i8;
        this.f17625C = j8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            E0.e(false, this.f17626o, this.f17627p, this.f17628q, this.f17629r, this.f17630s, this.f17631t, this.f17632u, this.f17633v, this.f17634w, this.f17635x, this.f17636y, this.f17637z, this.f17623A, this.f17624B, this.f17625C, c0912t, 100663344, 384);
        }
        return Y4.o.f8736a;
    }
}
