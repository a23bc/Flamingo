package F;

import H.InterfaceC0174p;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC0174p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f2068a;

    public e(A a4) {
        this.f2068a = a4;
    }

    @Override // H.InterfaceC0174p
    public final int a() {
        return this.f2068a.g().f2126n;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // H.InterfaceC0174p
    public final int b() {
        return Math.min(a() - 1, ((s) Z4.n.x0(this.f2068a.g().f2124k)).f2130a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // H.InterfaceC0174p
    public final boolean c() {
        return !this.f2068a.g().f2124k.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // H.InterfaceC0174p
    public final int d() {
        int i7;
        A a4 = this.f2068a;
        if (a4.g().f2124k.isEmpty()) {
            return 0;
        }
        r rVarG = a4.g();
        int iG = (int) (rVarG.f2127o == EnumC2048l0.f20894o ? rVarG.g() & 4294967295L : rVarG.g() >> 32);
        r rVarG2 = a4.g();
        ?? r32 = rVarG2.f2124k;
        int size = r32.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            i8 += ((s) r32.get(i9)).f2141n;
        }
        int size2 = (i8 / r32.size()) + rVarG2.f2129q;
        if (size2 != 0 && (i7 = iG / size2) >= 1) {
            return i7;
        }
        return 1;
    }

    @Override // H.InterfaceC0174p
    public final int e() {
        return Math.max(0, this.f2068a.f2028e.f2151b.h());
    }
}
