package I;

import O0.InterfaceC0296a0;
import java.util.List;
import java.util.Map;
import l5.InterfaceC1182c;
import w5.InterfaceC1765B;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class z implements InterfaceC0296a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumC2048l0 f3412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3414g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0218j f3415i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0218j f3416j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f3417k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f3418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final A.m f3419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0296a0 f3420o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f3421p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f3422q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f3423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC1765B f3424s;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ z(int i7, int i8, int i9, int i10, int i11, int i12, A.m mVar, InterfaceC0296a0 interfaceC0296a0, InterfaceC1765B interfaceC1765B) {
        Z4.v vVar = Z4.v.f8818o;
        this(vVar, i7, i8, i9, EnumC2048l0.f20895p, i10, i11, i12, null, null, 0.0f, 0, false, mVar, interfaceC0296a0, false, vVar, vVar, interfaceC1765B);
    }

    @Override // O0.InterfaceC0296a0
    public final Map a() {
        return this.f3420o.a();
    }

    @Override // O0.InterfaceC0296a0
    public final void b() {
        this.f3420o.b();
    }

    @Override // O0.InterfaceC0296a0
    public final int c() {
        return this.f3420o.c();
    }

    @Override // O0.InterfaceC0296a0
    public final InterfaceC1182c d() {
        return this.f3420o.d();
    }

    @Override // O0.InterfaceC0296a0
    public final int e() {
        return this.f3420o.e();
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final z f(int i7) {
        int i8;
        int i9 = this.f3409b + this.f3410c;
        if (this.f3421p) {
            return null;
        }
        ?? r52 = this.f3408a;
        if (r52.isEmpty() || this.f3415i == null || (i8 = this.l - i7) < 0 || i8 >= i9) {
            return null;
        }
        float f7 = this.f3417k - (i9 != 0 ? i7 / i9 : 0.0f);
        if (this.f3416j == null || f7 >= 0.5f || f7 <= -0.5f) {
            return null;
        }
        C0218j c0218j = (C0218j) Z4.n.q0(r52);
        C0218j c0218j2 = (C0218j) Z4.n.x0(r52);
        int i10 = this.f3414g;
        int i11 = this.f3413f;
        if (i7 < 0) {
            if (Math.min((c0218j.f3369j + i9) - i11, (c0218j2.f3369j + i9) - i10) <= (-i7)) {
                return null;
            }
        } else if (Math.min(i11 - c0218j.f3369j, i10 - c0218j2.f3369j) <= i7) {
            return null;
        }
        int size = r52.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((C0218j) r52.get(i12)).a(i7);
        }
        List list = this.f3422q;
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            ((C0218j) list.get(i13)).a(i7);
        }
        List list2 = this.f3423r;
        int size3 = list2.size();
        for (int i14 = 0; i14 < size3; i14++) {
            ((C0218j) list2.get(i14)).a(i7);
        }
        return new z(r52, this.f3409b, this.f3410c, this.f3411d, this.f3412e, this.f3413f, this.f3414g, this.h, this.f3415i, this.f3416j, f7, i8, this.f3418m || i7 > 0, this.f3419n, this.f3420o, this.f3421p, this.f3422q, this.f3423r, this.f3424s);
    }

    public final long g() {
        InterfaceC0296a0 interfaceC0296a0 = this.f3420o;
        return (((long) interfaceC0296a0.e()) << 32) | (((long) interfaceC0296a0.c()) & 4294967295L);
    }

    public z(List list, int i7, int i8, int i9, EnumC2048l0 enumC2048l0, int i10, int i11, int i12, C0218j c0218j, C0218j c0218j2, float f7, int i13, boolean z6, A.m mVar, InterfaceC0296a0 interfaceC0296a0, boolean z7, List list2, List list3, InterfaceC1765B interfaceC1765B) {
        this.f3408a = list;
        this.f3409b = i7;
        this.f3410c = i8;
        this.f3411d = i9;
        this.f3412e = enumC2048l0;
        this.f3413f = i10;
        this.f3414g = i11;
        this.h = i12;
        this.f3415i = c0218j;
        this.f3416j = c0218j2;
        this.f3417k = f7;
        this.l = i13;
        this.f3418m = z6;
        this.f3419n = mVar;
        this.f3420o = interfaceC0296a0;
        this.f3421p = z7;
        this.f3422q = list2;
        this.f3423r = list3;
        this.f3424s = interfaceC1765B;
    }
}
