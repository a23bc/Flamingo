package G;

import H.InterfaceC0174p;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC0174p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f2490a;

    public d(x xVar) {
        this.f2490a = xVar;
    }

    @Override // H.InterfaceC0174p
    public final int a() {
        return this.f2490a.g().f2553o;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // H.InterfaceC0174p
    public final int b() {
        return ((o) Z4.n.x0(this.f2490a.g().l)).f2557a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // H.InterfaceC0174p
    public final boolean c() {
        return !this.f2490a.g().l.isEmpty();
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // H.InterfaceC0174p
    public final int d() {
        int i7;
        boolean z6;
        long j3;
        x xVar = this.f2490a;
        int i8 = 0;
        if (xVar.g().l.isEmpty()) {
            return 0;
        }
        n nVarG = xVar.g();
        EnumC2048l0 enumC2048l0 = nVarG.f2554p;
        EnumC2048l0 enumC2048l02 = EnumC2048l0.f20894o;
        int iG = (int) (enumC2048l0 == enumC2048l02 ? nVarG.g() & 4294967295L : nVarG.g() >> 32);
        n nVarG2 = xVar.g();
        boolean z7 = nVarG2.f2554p == enumC2048l02;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ?? r12 = nVarG2.l;
            if (i9 >= r12.size()) {
                break;
            }
            int iJ0 = M3.a.j0(z7, nVarG2, i9);
            if (iJ0 == -1) {
                i9++;
            } else {
                int iMax = i8;
                while (i9 < r12.size() && M3.a.j0(z7, nVarG2, i9) == iJ0) {
                    if (z7) {
                        z6 = z7;
                        j3 = ((o) r12.get(i9)).f2573s & 4294967295L;
                    } else {
                        z6 = z7;
                        j3 = ((o) r12.get(i9)).f2573s >> 32;
                    }
                    iMax = Math.max(iMax, (int) j3);
                    i9++;
                    z7 = z6;
                }
                i10 += iMax;
                i11++;
                z7 = z7;
                i8 = 0;
            }
        }
        int i12 = (i10 / i11) + nVarG2.f2556r;
        if (i12 != 0 && (i7 = iG / i12) >= 1) {
            return i7;
        }
        return 1;
    }

    @Override // H.InterfaceC0174p
    public final int e() {
        return this.f2490a.f2614d.f2151b.h();
    }
}
