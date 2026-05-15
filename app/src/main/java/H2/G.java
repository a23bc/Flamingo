package H2;

import A2.v0;
import A2.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import t2.C1486o;
import t2.C1487p;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC0207y, InterfaceC0206x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0207y[] f2987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final IdentityHashMap f2988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final x0 f2989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f2990r = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashMap f2991s = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public InterfaceC0206x f2992t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g0 f2993u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InterfaceC0207y[] f2994v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C0194k f2995w;

    public G(x0 x0Var, long[] jArr, InterfaceC0207y... interfaceC0207yArr) {
        this.f2989q = x0Var;
        this.f2987o = interfaceC0207yArr;
        x0Var.getClass();
        E4.G g6 = E4.I.f1870p;
        E4.b0 b0Var = E4.b0.f1913s;
        this.f2995w = new C0194k(b0Var, b0Var);
        this.f2988p = new IdentityHashMap();
        this.f2994v = new InterfaceC0207y[0];
        for (int i7 = 0; i7 < interfaceC0207yArr.length; i7++) {
            long j3 = jArr[i7];
            if (j3 != 0) {
                this.f2987o[i7] = new f0(interfaceC0207yArr[i7], j3);
            }
        }
    }

    @Override // H2.InterfaceC0206x
    public final void a(X x6) {
        InterfaceC0206x interfaceC0206x = this.f2992t;
        interfaceC0206x.getClass();
        interfaceC0206x.a(this);
    }

    @Override // H2.InterfaceC0207y
    public final long b() {
        long j3 = -9223372036854775807L;
        for (InterfaceC0207y interfaceC0207y : this.f2994v) {
            long jB = interfaceC0207y.b();
            if (jB == -9223372036854775807L) {
                if (j3 != -9223372036854775807L && interfaceC0207y.o(j3) != j3) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j3 == -9223372036854775807L) {
                for (InterfaceC0207y interfaceC0207y2 : this.f2994v) {
                    if (interfaceC0207y2 == interfaceC0207y) {
                        break;
                    }
                    if (interfaceC0207y2.o(jB) != jB) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j3 = jB;
            } else if (jB != j3) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j3;
    }

    @Override // H2.X
    public final boolean c() {
        return this.f2995w.c();
    }

    @Override // H2.X
    public final boolean d(A2.Z z6) {
        ArrayList arrayList = this.f2990r;
        if (arrayList.isEmpty()) {
            return this.f2995w.d(z6);
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((InterfaceC0207y) arrayList.get(i7)).d(z6);
        }
        return false;
    }

    @Override // H2.X
    public final long e() {
        return this.f2995w.e();
    }

    @Override // H2.InterfaceC0207y
    public final long f(long j3, v0 v0Var) {
        InterfaceC0207y[] interfaceC0207yArr = this.f2994v;
        return (interfaceC0207yArr.length > 0 ? interfaceC0207yArr[0] : this.f2987o[0]).f(j3, v0Var);
    }

    @Override // H2.InterfaceC0207y
    public final void g(InterfaceC0206x interfaceC0206x, long j3) {
        this.f2992t = interfaceC0206x;
        ArrayList arrayList = this.f2990r;
        InterfaceC0207y[] interfaceC0207yArr = this.f2987o;
        Collections.addAll(arrayList, interfaceC0207yArr);
        for (InterfaceC0207y interfaceC0207y : interfaceC0207yArr) {
            interfaceC0207y.g(this, j3);
        }
    }

    @Override // H2.InterfaceC0207y
    public final g0 h() {
        g0 g0Var = this.f2993u;
        g0Var.getClass();
        return g0Var;
    }

    @Override // H2.X
    public final long i() {
        return this.f2995w.i();
    }

    @Override // H2.InterfaceC0207y
    public final void j() {
        for (InterfaceC0207y interfaceC0207y : this.f2987o) {
            interfaceC0207y.j();
        }
    }

    @Override // H2.InterfaceC0206x
    public final void k(InterfaceC0207y interfaceC0207y) {
        ArrayList arrayList = this.f2990r;
        arrayList.remove(interfaceC0207y);
        if (arrayList.isEmpty()) {
            InterfaceC0207y[] interfaceC0207yArr = this.f2987o;
            int i7 = 0;
            for (InterfaceC0207y interfaceC0207y2 : interfaceC0207yArr) {
                i7 += interfaceC0207y2.h().f3187a;
            }
            t2.i0[] i0VarArr = new t2.i0[i7];
            int i8 = 0;
            for (int i9 = 0; i9 < interfaceC0207yArr.length; i9++) {
                g0 g0VarH = interfaceC0207yArr[i9].h();
                int i10 = g0VarH.f3187a;
                int i11 = 0;
                while (i11 < i10) {
                    t2.i0 i0VarA = g0VarH.a(i11);
                    int i12 = i0VarA.f16490a;
                    C1487p[] c1487pArr = new C1487p[i12];
                    for (int i13 = 0; i13 < i12; i13++) {
                        C1487p c1487p = i0VarA.f16493d[i13];
                        C1486o c1486oA = c1487p.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append(i9);
                        sb.append(":");
                        String str = c1487p.f16691a;
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        c1486oA.f16617a = sb.toString();
                        c1487pArr[i13] = new C1487p(c1486oA);
                    }
                    t2.i0 i0Var = new t2.i0(i9 + ":" + i0VarA.f16491b, c1487pArr);
                    this.f2991s.put(i0Var, i0VarA);
                    i0VarArr[i8] = i0Var;
                    i11++;
                    i8++;
                }
            }
            this.f2993u = new g0(i0VarArr);
            InterfaceC0206x interfaceC0206x = this.f2992t;
            interfaceC0206x.getClass();
            interfaceC0206x.k(this);
        }
    }

    @Override // H2.InterfaceC0207y
    public final long n(J2.q[] qVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j3) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[qVarArr.length];
        int[] iArr3 = new int[qVarArr.length];
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int length = qVarArr.length;
            identityHashMap = this.f2988p;
            if (i8 >= length) {
                break;
            }
            W w7 = wArr[i8];
            Integer num = w7 == null ? null : (Integer) identityHashMap.get(w7);
            iArr2[i8] = num == null ? -1 : num.intValue();
            J2.q qVar = qVarArr[i8];
            if (qVar != null) {
                String str = qVar.g().f16491b;
                iArr3[i8] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr3[i8] = -1;
            }
            i8++;
        }
        identityHashMap.clear();
        int length2 = qVarArr.length;
        W[] wArr2 = new W[length2];
        W[] wArr3 = new W[qVarArr.length];
        J2.q[] qVarArr2 = new J2.q[qVarArr.length];
        InterfaceC0207y[] interfaceC0207yArr = this.f2987o;
        ArrayList arrayList = new ArrayList(interfaceC0207yArr.length);
        long j7 = j3;
        int i9 = 0;
        while (i9 < interfaceC0207yArr.length) {
            int i10 = i7;
            while (i10 < qVarArr.length) {
                wArr3[i10] = iArr2[i10] == i9 ? wArr[i10] : null;
                if (iArr3[i10] == i9) {
                    J2.q qVar2 = qVarArr[i10];
                    qVar2.getClass();
                    iArr = iArr2;
                    t2.i0 i0Var = (t2.i0) this.f2991s.get(qVar2.g());
                    i0Var.getClass();
                    qVarArr2[i10] = new F(qVar2, i0Var);
                } else {
                    iArr = iArr2;
                    qVarArr2[i10] = null;
                }
                i10++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            InterfaceC0207y[] interfaceC0207yArr2 = interfaceC0207yArr;
            int i11 = i9;
            long jN = interfaceC0207yArr2[i9].n(qVarArr2, zArr, wArr3, zArr2, j7);
            if (i11 == 0) {
                j7 = jN;
            } else if (jN != j7) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z6 = false;
            for (int i12 = 0; i12 < qVarArr.length; i12++) {
                if (iArr3[i12] == i11) {
                    W w8 = wArr3[i12];
                    w8.getClass();
                    wArr2[i12] = wArr3[i12];
                    identityHashMap.put(w8, Integer.valueOf(i11));
                    z6 = true;
                } else if (iArr4[i12] == i11) {
                    AbstractC1697a.i(wArr3[i12] == null);
                }
            }
            if (z6) {
                arrayList.add(interfaceC0207yArr2[i11]);
            }
            i9 = i11 + 1;
            interfaceC0207yArr = interfaceC0207yArr2;
            iArr2 = iArr4;
            i7 = 0;
        }
        int i13 = i7;
        System.arraycopy(wArr2, i13, wArr, i13, length2);
        this.f2994v = (InterfaceC0207y[]) arrayList.toArray(new InterfaceC0207y[i13]);
        E4.S s7 = new E4.S(new B2.g(10), arrayList);
        this.f2989q.getClass();
        this.f2995w = new C0194k(arrayList, s7);
        return j7;
    }

    @Override // H2.InterfaceC0207y
    public final long o(long j3) {
        long jO = this.f2994v[0].o(j3);
        int i7 = 1;
        while (true) {
            InterfaceC0207y[] interfaceC0207yArr = this.f2994v;
            if (i7 >= interfaceC0207yArr.length) {
                return jO;
            }
            if (interfaceC0207yArr[i7].o(jO) != jO) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i7++;
        }
    }

    @Override // H2.InterfaceC0207y
    public final void p(long j3) {
        for (InterfaceC0207y interfaceC0207y : this.f2994v) {
            interfaceC0207y.p(j3);
        }
    }

    @Override // H2.X
    public final void q(long j3) {
        this.f2995w.q(j3);
    }
}
