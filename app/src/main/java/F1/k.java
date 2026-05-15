package f1;

import h1.AbstractC0996a;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final k f11998p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f11999q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final k f12000r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final k f12001s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final k f12002t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final k f12003u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final k f12004v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final k f12005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final k f12006x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final k f12007y;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f12008o;

    static {
        k kVar = new k(100);
        k kVar2 = new k(200);
        k kVar3 = new k(300);
        k kVar4 = new k(400);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        f11998p = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        f11999q = kVar;
        f12000r = kVar2;
        f12001s = kVar3;
        f12002t = kVar4;
        f12003u = kVar5;
        f12004v = kVar6;
        f12005w = kVar7;
        f12006x = kVar8;
        f12007y = kVar9;
        Z4.o.e0(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i7) {
        this.f12008o = i7;
        boolean z6 = false;
        if (1 <= i7 && i7 < 1001) {
            z6 = true;
        }
        if (z6) {
            return;
        }
        AbstractC0996a.a("Font weight can be in range [1, 1000]. Current value: " + i7);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return AbstractC1209k.g(this.f12008o, ((k) obj).f12008o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f12008o == ((k) obj).f12008o;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12008o;
    }

    public final String toString() {
        return Z1.l.r(new StringBuilder("FontWeight(weight="), this.f12008o, ')');
    }
}
