package M5;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: M5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0282b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final S5.j f4830d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final S5.j f4831e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final S5.j f4832f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final S5.j f4833g;
    public static final S5.j h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final S5.j f4834i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S5.j f4835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S5.j f4836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4837c;

    static {
        S5.j jVar = S5.j.f6786r;
        f4830d = N2.z.l(":");
        f4831e = N2.z.l(":status");
        f4832f = N2.z.l(":method");
        f4833g = N2.z.l(":path");
        h = N2.z.l(":scheme");
        f4834i = N2.z.l(":authority");
    }

    public C0282b(S5.j jVar, S5.j jVar2) {
        AbstractC1209k.f(jVar, "name");
        AbstractC1209k.f(jVar2, "value");
        this.f4835a = jVar;
        this.f4836b = jVar2;
        this.f4837c = jVar2.c() + jVar.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0282b)) {
            return false;
        }
        C0282b c0282b = (C0282b) obj;
        return AbstractC1209k.a(this.f4835a, c0282b.f4835a) && AbstractC1209k.a(this.f4836b, c0282b.f4836b);
    }

    public final int hashCode() {
        return this.f4836b.hashCode() + (this.f4835a.hashCode() * 31);
    }

    public final String toString() {
        return this.f4835a.p() + ": " + this.f4836b.p();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0282b(String str, String str2) {
        this(N2.z.l(str), N2.z.l(str2));
        AbstractC1209k.f(str, "name");
        AbstractC1209k.f(str2, "value");
        S5.j jVar = S5.j.f6786r;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0282b(S5.j jVar, String str) {
        this(jVar, N2.z.l(str));
        AbstractC1209k.f(jVar, "name");
        AbstractC1209k.f(str, "value");
        S5.j jVar2 = S5.j.f6786r;
    }
}
