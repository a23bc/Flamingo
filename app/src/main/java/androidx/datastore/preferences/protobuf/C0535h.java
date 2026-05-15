package androidx.datastore.preferences.protobuf;

import androidx.glance.appwidget.protobuf.AbstractC0572u;
import androidx.glance.appwidget.protobuf.C0558f;
import androidx.glance.appwidget.protobuf.C0563k;
import androidx.glance.appwidget.protobuf.C0573v;
import androidx.glance.appwidget.protobuf.C0574w;
import androidx.glance.appwidget.protobuf.InterfaceC0571t;
import d2.C0821i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import t2.C1482k;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0535h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9478a;

    /* JADX INFO: renamed from: b */
    public int f9479b;

    /* JADX INFO: renamed from: c */
    public int f9480c;

    /* JADX INFO: renamed from: d */
    public int f9481d;

    /* JADX INFO: renamed from: e */
    public Object f9482e;

    public /* synthetic */ C0535h(int i7, byte b7) {
        this.f9478a = i7;
    }

    public long A() throws C0549w {
        q0(1);
        return ((C0534g) this.f9482e).j();
    }

    public void B(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 1) {
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Long.valueOf(p7.p()));
                if (p7.c()) {
                    return;
                } else {
                    iZ = p7.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0574w.b();
        }
        int iA = p7.A();
        if ((iA & 7) != 0) {
            throw new C0574w("Failed to parse the message.");
        }
        int iB = p7.b() + iA;
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Long.valueOf(p7.p()));
        } while (p7.b() < iB);
    }

    public void C(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 1) {
            do {
                list.add(Long.valueOf(c0534g.j()));
                if (c0534g.c()) {
                    return;
                } else {
                    iZ = c0534g.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0550x.b();
        }
        int iA = c0534g.A();
        if ((iA & 7) != 0) {
            throw C0550x.e();
        }
        int iB = c0534g.b() + iA;
        do {
            list.add(Long.valueOf(c0534g.j()));
        } while (c0534g.b() < iB);
    }

    public float D() throws C0549w {
        q0(5);
        return ((C0534g) this.f9482e).k();
    }

    public void E(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 2) {
            int iA = p7.A();
            if ((iA & 3) != 0) {
                throw new C0574w("Failed to parse the message.");
            }
            int iB = p7.b() + iA;
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Float.valueOf(p7.q()));
            } while (p7.b() < iB);
            return;
        }
        if (i7 != 5) {
            throw C0574w.b();
        }
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Float.valueOf(p7.q()));
            if (p7.c()) {
                return;
            } else {
                iZ = p7.z();
            }
        } while (iZ == this.f9479b);
        this.f9481d = iZ;
    }

    public void F(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 2) {
            int iA = c0534g.A();
            if ((iA & 3) != 0) {
                throw C0550x.e();
            }
            int iB = c0534g.b() + iA;
            do {
                list.add(Float.valueOf(c0534g.k()));
            } while (c0534g.b() < iB);
            return;
        }
        if (i7 != 5) {
            throw C0550x.b();
        }
        do {
            list.add(Float.valueOf(c0534g.k()));
            if (c0534g.c()) {
                return;
            } else {
                iZ = c0534g.z();
            }
        } while (iZ == this.f9479b);
        this.f9481d = iZ;
    }

    public Object G(X x6, C0539l c0539l) {
        int i7 = this.f9480c;
        this.f9480c = ((this.f9479b >>> 3) << 3) | 4;
        try {
            Object objC = x6.c();
            x6.h(objC, this, c0539l);
            x6.a(objC);
            if (this.f9479b == this.f9480c) {
                return objC;
            }
            throw C0550x.e();
        } finally {
            this.f9480c = i7;
        }
    }

    public Object H(X x6, C0539l c0539l) throws C0549w {
        q0(3);
        return G(x6, c0539l);
    }

    public int I() throws C0549w {
        q0(0);
        return ((C0534g) this.f9482e).l();
    }

    public void J(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 0) {
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Integer.valueOf(p7.r()));
                if (p7.c()) {
                    return;
                } else {
                    iZ = p7.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0574w.b();
        }
        int iB = p7.b() + p7.A();
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Integer.valueOf(p7.r()));
        } while (p7.b() < iB);
        n0(iB);
    }

    public void K(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 0) {
            do {
                list.add(Integer.valueOf(c0534g.l()));
                if (c0534g.c()) {
                    return;
                } else {
                    iZ = c0534g.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0550x.b();
        }
        int iB = c0534g.b() + c0534g.A();
        do {
            list.add(Integer.valueOf(c0534g.l()));
        } while (c0534g.b() < iB);
        o0(iB);
    }

    public long L() throws C0549w {
        q0(0);
        return ((C0534g) this.f9482e).m();
    }

    public void M(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 0) {
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Long.valueOf(p7.s()));
                if (p7.c()) {
                    return;
                } else {
                    iZ = p7.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0574w.b();
        }
        int iB = p7.b() + p7.A();
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Long.valueOf(p7.s()));
        } while (p7.b() < iB);
        n0(iB);
    }

    public void N(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 0) {
            do {
                list.add(Long.valueOf(c0534g.m()));
                if (c0534g.c()) {
                    return;
                } else {
                    iZ = c0534g.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0550x.b();
        }
        int iB = c0534g.b() + c0534g.A();
        do {
            list.add(Long.valueOf(c0534g.m()));
        } while (c0534g.b() < iB);
        o0(iB);
    }

    public Object O(X x6, C0539l c0539l) throws C0550x {
        C0534g c0534g = (C0534g) this.f9482e;
        int iA = c0534g.A();
        if (c0534g.f9469a >= 100) {
            throw new C0550x("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iE = c0534g.e(iA);
        Object objC = x6.c();
        c0534g.f9469a++;
        x6.h(objC, this, c0539l);
        x6.a(objC);
        c0534g.a(0);
        c0534g.f9469a--;
        c0534g.d(iE);
        return objC;
    }

    public Object P(X x6, C0539l c0539l) throws C0549w {
        q0(2);
        return O(x6, c0539l);
    }

    public int Q() throws C0549w {
        q0(5);
        return ((C0534g) this.f9482e).v();
    }

    public void R(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 2) {
            int iA = p7.A();
            if ((iA & 3) != 0) {
                throw new C0574w("Failed to parse the message.");
            }
            int iB = p7.b() + iA;
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Integer.valueOf(p7.t()));
            } while (p7.b() < iB);
            return;
        }
        if (i7 != 5) {
            throw C0574w.b();
        }
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Integer.valueOf(p7.t()));
            if (p7.c()) {
                return;
            } else {
                iZ = p7.z();
            }
        } while (iZ == this.f9479b);
        this.f9481d = iZ;
    }

    public void S(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 2) {
            int iA = c0534g.A();
            if ((iA & 3) != 0) {
                throw C0550x.e();
            }
            int iB = c0534g.b() + iA;
            do {
                list.add(Integer.valueOf(c0534g.v()));
            } while (c0534g.b() < iB);
            return;
        }
        if (i7 != 5) {
            throw C0550x.b();
        }
        do {
            list.add(Integer.valueOf(c0534g.v()));
            if (c0534g.c()) {
                return;
            } else {
                iZ = c0534g.z();
            }
        } while (iZ == this.f9479b);
        this.f9481d = iZ;
    }

    public long T() throws C0549w {
        q0(1);
        return ((C0534g) this.f9482e).w();
    }

    public void U(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 1) {
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Long.valueOf(p7.u()));
                if (p7.c()) {
                    return;
                } else {
                    iZ = p7.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0574w.b();
        }
        int iA = p7.A();
        if ((iA & 7) != 0) {
            throw new C0574w("Failed to parse the message.");
        }
        int iB = p7.b() + iA;
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Long.valueOf(p7.u()));
        } while (p7.b() < iB);
    }

    public void V(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 1) {
            do {
                list.add(Long.valueOf(c0534g.w()));
                if (c0534g.c()) {
                    return;
                } else {
                    iZ = c0534g.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0550x.b();
        }
        int iA = c0534g.A();
        if ((iA & 7) != 0) {
            throw C0550x.e();
        }
        int iB = c0534g.b() + iA;
        do {
            list.add(Long.valueOf(c0534g.w()));
        } while (c0534g.b() < iB);
    }

    public int W() throws C0549w {
        q0(0);
        return ((C0534g) this.f9482e).x();
    }

    public void X(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 0) {
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Integer.valueOf(p7.v()));
                if (p7.c()) {
                    return;
                } else {
                    iZ = p7.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0574w.b();
        }
        int iB = p7.b() + p7.A();
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Integer.valueOf(p7.v()));
        } while (p7.b() < iB);
        n0(iB);
    }

    public void Y(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 0) {
            do {
                list.add(Integer.valueOf(c0534g.x()));
                if (c0534g.c()) {
                    return;
                } else {
                    iZ = c0534g.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0550x.b();
        }
        int iB = c0534g.b() + c0534g.A();
        do {
            list.add(Integer.valueOf(c0534g.x()));
        } while (c0534g.b() < iB);
        o0(iB);
    }

    public long Z() throws C0549w {
        q0(0);
        return ((C0534g) this.f9482e).y();
    }

    public void a(int i7) {
        int[] iArr = (int[]) this.f9482e;
        int i8 = this.f9480c;
        iArr[i8] = i7;
        int i9 = this.f9481d & (i8 + 1);
        this.f9480c = i9;
        int i10 = this.f9479b;
        if (i9 == i10) {
            int length = iArr.length;
            int i11 = length - i10;
            int i12 = length << 1;
            if (i12 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i12];
            Z4.l.V(0, i10, length, iArr, iArr2);
            Z4.l.V(i11, 0, this.f9479b, (int[]) this.f9482e, iArr2);
            this.f9482e = iArr2;
            this.f9479b = 0;
            this.f9480c = length;
            this.f9481d = i12 - 1;
        }
    }

    public void a0(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 0) {
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Long.valueOf(p7.w()));
                if (p7.c()) {
                    return;
                } else {
                    iZ = p7.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0574w.b();
        }
        int iB = p7.b() + p7.A();
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Long.valueOf(p7.w()));
        } while (p7.b() < iB);
        n0(iB);
    }

    public C1482k b() {
        AbstractC1697a.d(this.f9480c <= this.f9481d);
        return new C1482k(this);
    }

    public void b0(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 0) {
            do {
                list.add(Long.valueOf(c0534g.y()));
                if (c0534g.c()) {
                    return;
                } else {
                    iZ = c0534g.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0550x.b();
        }
        int iB = c0534g.b() + c0534g.A();
        do {
            list.add(Long.valueOf(c0534g.y()));
        } while (c0534g.b() < iB);
        o0(iB);
    }

    public int c() {
        return this.f9481d - this.f9480c;
    }

    public String c0() throws C0549w {
        q0(2);
        C0534g c0534g = (C0534g) this.f9482e;
        int iS = c0534g.s();
        byte[] bArr = c0534g.f9472d;
        if (iS > 0) {
            int i7 = c0534g.f9473e;
            int i8 = c0534g.f9475g;
            if (iS <= i7 - i8) {
                String str = new String(bArr, i8, iS, AbstractC0548v.f9521a);
                c0534g.f9475g += iS;
                return str;
            }
        }
        if (iS == 0) {
            return "";
        }
        if (iS > c0534g.f9473e) {
            return new String(c0534g.n(iS), AbstractC0548v.f9521a);
        }
        c0534g.D(iS);
        String str2 = new String(bArr, c0534g.f9475g, iS, AbstractC0548v.f9521a);
        c0534g.f9475g += iS;
        return str2;
    }

    public int d() {
        switch (this.f9478a) {
            case 0:
                int i7 = this.f9481d;
                if (i7 != 0) {
                    this.f9479b = i7;
                    this.f9481d = 0;
                } else {
                    this.f9479b = ((C0534g) this.f9482e).z();
                }
                int i8 = this.f9479b;
                if (i8 == 0 || i8 == this.f9480c) {
                    return Integer.MAX_VALUE;
                }
                return i8 >>> 3;
            default:
                int i9 = this.f9481d;
                if (i9 != 0) {
                    this.f9479b = i9;
                    this.f9481d = 0;
                } else {
                    this.f9479b = ((G1.P) this.f9482e).z();
                }
                int i10 = this.f9479b;
                if (i10 == 0 || i10 == this.f9480c) {
                    return Integer.MAX_VALUE;
                }
                return i10 >>> 3;
        }
    }

    public void d0(InterfaceC0571t interfaceC0571t, boolean z6) throws C0573v {
        String strX;
        int iZ;
        if ((this.f9479b & 7) != 2) {
            throw C0574w.b();
        }
        do {
            G1.P p7 = (G1.P) this.f9482e;
            if (z6) {
                p0(2);
                strX = p7.y();
            } else {
                p0(2);
                strX = p7.x();
            }
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(strX);
            if (p7.c()) {
                return;
            } else {
                iZ = p7.z();
            }
        } while (iZ == this.f9479b);
        this.f9481d = iZ;
    }

    public int e(int i7) {
        return ((g0.L) this.f9482e).f12275w[this.f9480c + i7];
    }

    public void e0(List list, boolean z6) throws C0549w {
        int iZ;
        int iZ2;
        if ((this.f9479b & 7) != 2) {
            throw C0550x.b();
        }
        boolean z7 = list instanceof A;
        C0534g c0534g = (C0534g) this.f9482e;
        if (!z7 || z6) {
            do {
                list.add(z6 ? f0() : c0());
                if (c0534g.c()) {
                    return;
                } else {
                    iZ = c0534g.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        A a4 = (A) list;
        do {
            a4.h(m());
            if (c0534g.c()) {
                return;
            } else {
                iZ2 = c0534g.z();
            }
        } while (iZ2 == this.f9479b);
        this.f9481d = iZ2;
    }

    public Object f(int i7) {
        return ((g0.L) this.f9482e).f12277y[this.f9481d + i7];
    }

    public String f0() throws C0549w {
        q0(2);
        C0534g c0534g = (C0534g) this.f9482e;
        int iS = c0534g.s();
        int i7 = c0534g.f9475g;
        int i8 = c0534g.f9473e;
        int i9 = i8 - i7;
        byte[] bArrN = c0534g.f9472d;
        if (iS <= i9 && iS > 0) {
            c0534g.f9475g = i7 + iS;
        } else {
            if (iS == 0) {
                return "";
            }
            i7 = 0;
            if (iS <= i8) {
                c0534g.D(iS);
                c0534g.f9475g = iS;
            } else {
                bArrN = c0534g.n(iS);
            }
        }
        return r0.f9520a.e(bArrN, i7, iS);
    }

    public int g() {
        return this.f9479b;
    }

    public int g0() throws C0549w {
        q0(0);
        return ((C0534g) this.f9482e).A();
    }

    public void h(Object obj, androidx.glance.appwidget.protobuf.P p7, C0563k c0563k) {
        int i7 = this.f9480c;
        this.f9480c = ((this.f9479b >>> 3) << 3) | 4;
        try {
            p7.f(obj, this, c0563k);
            if (this.f9479b == this.f9480c) {
            } else {
                throw new C0574w("Failed to parse the message.");
            }
        } finally {
            this.f9480c = i7;
        }
    }

    public void h0(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 0) {
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Integer.valueOf(p7.A()));
                if (p7.c()) {
                    return;
                } else {
                    iZ = p7.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0574w.b();
        }
        int iB = p7.b() + p7.A();
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Integer.valueOf(p7.A()));
        } while (p7.b() < iB);
        n0(iB);
    }

    public void i(Object obj, androidx.glance.appwidget.protobuf.P p7, C0563k c0563k) throws C0574w {
        G1.P p8 = (G1.P) this.f9482e;
        int iA = p8.A();
        if (p8.f2653o >= 100) {
            throw new C0574w("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = p8.i(iA);
        p8.f2653o++;
        p7.f(obj, this, c0563k);
        p8.a(0);
        p8.f2653o--;
        p8.h(i7);
    }

    public void i0(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 0) {
            do {
                list.add(Integer.valueOf(c0534g.A()));
                if (c0534g.c()) {
                    return;
                } else {
                    iZ = c0534g.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0550x.b();
        }
        int iB = c0534g.b() + c0534g.A();
        do {
            list.add(Integer.valueOf(c0534g.A()));
        } while (c0534g.b() < iB);
        o0(iB);
    }

    public boolean j() throws C0549w {
        q0(0);
        return ((C0534g) this.f9482e).f();
    }

    public long j0() throws C0549w {
        q0(0);
        return ((C0534g) this.f9482e).B();
    }

    public void k(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 0) {
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Boolean.valueOf(p7.k()));
                if (p7.c()) {
                    return;
                } else {
                    iZ = p7.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0574w.b();
        }
        int iB = p7.b() + p7.A();
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Boolean.valueOf(p7.k()));
        } while (p7.b() < iB);
        n0(iB);
    }

    public void k0(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 0) {
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Long.valueOf(p7.B()));
                if (p7.c()) {
                    return;
                } else {
                    iZ = p7.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0574w.b();
        }
        int iB = p7.b() + p7.A();
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Long.valueOf(p7.B()));
        } while (p7.b() < iB);
        n0(iB);
    }

    public void l(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 0) {
            do {
                list.add(Boolean.valueOf(c0534g.f()));
                if (c0534g.c()) {
                    return;
                } else {
                    iZ = c0534g.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0550x.b();
        }
        int iB = c0534g.b() + c0534g.A();
        do {
            list.add(Boolean.valueOf(c0534g.f()));
        } while (c0534g.b() < iB);
        o0(iB);
    }

    public void l0(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 0) {
            do {
                list.add(Long.valueOf(c0534g.B()));
                if (c0534g.c()) {
                    return;
                } else {
                    iZ = c0534g.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0550x.b();
        }
        int iB = c0534g.b() + c0534g.A();
        do {
            list.add(Long.valueOf(c0534g.B()));
        } while (c0534g.b() < iB);
        o0(iB);
    }

    public C0533f m() throws C0549w {
        q0(2);
        C0534g c0534g = (C0534g) this.f9482e;
        int iS = c0534g.s();
        int i7 = c0534g.f9473e;
        int i8 = c0534g.f9475g;
        int i9 = i7 - i8;
        byte[] bArr = c0534g.f9472d;
        if (iS <= i9 && iS > 0) {
            C0533f c0533fA = C0533f.a(bArr, i8, iS);
            c0534g.f9475g += iS;
            return c0533fA;
        }
        if (iS == 0) {
            return C0533f.f9459q;
        }
        byte[] bArrO = c0534g.o(iS);
        if (bArrO != null) {
            return C0533f.a(bArrO, 0, bArrO.length);
        }
        int i10 = c0534g.f9475g;
        int i11 = c0534g.f9473e;
        int length = i11 - i10;
        c0534g.f9476i += i11;
        c0534g.f9475g = 0;
        c0534g.f9473e = 0;
        ArrayList<byte[]> arrayListP = c0534g.p(iS - length);
        byte[] bArr2 = new byte[iS];
        System.arraycopy(bArr, i10, bArr2, 0, length);
        for (byte[] bArr3 : arrayListP) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        C0533f c0533f = C0533f.f9459q;
        return new C0533f(bArr2);
    }

    public long m0() {
        int i7 = this.f9480c;
        if (i7 == 0) {
            throw new NoSuchElementException();
        }
        int i8 = this.f9479b;
        long j3 = ((long[]) this.f9482e)[i8];
        this.f9479b = (i8 + 1) & this.f9481d;
        this.f9480c = i7 - 1;
        return j3;
    }

    public C0558f n() throws C0573v {
        p0(2);
        return ((G1.P) this.f9482e).l();
    }

    public void n0(int i7) throws C0574w {
        if (((G1.P) this.f9482e).b() != i7) {
            throw C0574w.e();
        }
    }

    public void o(InterfaceC0571t interfaceC0571t) throws C0573v {
        int iZ;
        if ((this.f9479b & 7) != 2) {
            throw C0574w.b();
        }
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(n());
            G1.P p7 = (G1.P) this.f9482e;
            if (p7.c()) {
                return;
            } else {
                iZ = p7.z();
            }
        } while (iZ == this.f9479b);
        this.f9481d = iZ;
    }

    public void o0(int i7) throws C0550x {
        if (((C0534g) this.f9482e).b() != i7) {
            throw C0550x.f();
        }
    }

    public void p(List list) throws C0549w {
        int iZ;
        if ((this.f9479b & 7) != 2) {
            throw C0550x.b();
        }
        do {
            list.add(m());
            C0534g c0534g = (C0534g) this.f9482e;
            if (c0534g.c()) {
                return;
            } else {
                iZ = c0534g.z();
            }
        } while (iZ == this.f9479b);
        this.f9481d = iZ;
    }

    public void p0(int i7) throws C0573v {
        if ((this.f9479b & 7) != i7) {
            throw C0574w.b();
        }
    }

    public double q() throws C0549w {
        q0(1);
        return ((C0534g) this.f9482e).g();
    }

    public void q0(int i7) throws C0549w {
        if ((this.f9479b & 7) != i7) {
            throw C0550x.b();
        }
    }

    public void r(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 1) {
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Double.valueOf(p7.m()));
                if (p7.c()) {
                    return;
                } else {
                    iZ = p7.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0574w.b();
        }
        int iA = p7.A();
        if ((iA & 7) != 0) {
            throw new C0574w("Failed to parse the message.");
        }
        int iB = p7.b() + iA;
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Double.valueOf(p7.m()));
        } while (p7.b() < iB);
    }

    public boolean r0() {
        int i7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (c0534g.c() || (i7 = this.f9479b) == this.f9480c) {
            return false;
        }
        return c0534g.E(i7);
    }

    public void s(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 1) {
            do {
                list.add(Double.valueOf(c0534g.g()));
                if (c0534g.c()) {
                    return;
                } else {
                    iZ = c0534g.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0550x.b();
        }
        int iA = c0534g.A();
        if ((iA & 7) != 0) {
            throw C0550x.e();
        }
        int iB = c0534g.b() + iA;
        do {
            list.add(Double.valueOf(c0534g.g()));
        } while (c0534g.b() < iB);
    }

    public int t() throws C0549w {
        q0(0);
        return ((C0534g) this.f9482e).h();
    }

    public String toString() {
        switch (this.f9478a) {
            case 3:
                return "";
            default:
                return super.toString();
        }
    }

    public void u(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 0) {
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Integer.valueOf(p7.n()));
                if (p7.c()) {
                    return;
                } else {
                    iZ = p7.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0574w.b();
        }
        int iB = p7.b() + p7.A();
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Integer.valueOf(p7.n()));
        } while (p7.b() < iB);
        n0(iB);
    }

    public void v(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 0) {
            do {
                list.add(Integer.valueOf(c0534g.h()));
                if (c0534g.c()) {
                    return;
                } else {
                    iZ = c0534g.z();
                }
            } while (iZ == this.f9479b);
            this.f9481d = iZ;
            return;
        }
        if (i7 != 2) {
            throw C0550x.b();
        }
        int iB = c0534g.b() + c0534g.A();
        do {
            list.add(Integer.valueOf(c0534g.h()));
        } while (c0534g.b() < iB);
        o0(iB);
    }

    public Object w(w0 w0Var, Class cls, C0539l c0539l) throws C0549w {
        switch (w0Var.ordinal()) {
            case 0:
                return Double.valueOf(q());
            case 1:
                return Float.valueOf(D());
            case 2:
                return Long.valueOf(L());
            case 3:
                return Long.valueOf(j0());
            case 4:
                return Integer.valueOf(I());
            case 5:
                return Long.valueOf(A());
            case 6:
                return Integer.valueOf(x());
            case 7:
                return Boolean.valueOf(j());
            case 8:
                return f0();
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
            default:
                throw new RuntimeException("unsupported field type.");
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                q0(2);
                return O(U.f9421c.a(cls), c0539l);
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return m();
            case 12:
                return Integer.valueOf(g0());
            case 13:
                return Integer.valueOf(t());
            case 14:
                return Integer.valueOf(Q());
            case 15:
                return Long.valueOf(T());
            case 16:
                return Integer.valueOf(W());
            case 17:
                return Long.valueOf(Z());
        }
    }

    public int x() throws C0549w {
        q0(5);
        return ((C0534g) this.f9482e).i();
    }

    public void y(InterfaceC0571t interfaceC0571t) throws C0574w {
        int iZ;
        int i7 = this.f9479b & 7;
        G1.P p7 = (G1.P) this.f9482e;
        if (i7 == 2) {
            int iA = p7.A();
            if ((iA & 3) != 0) {
                throw new C0574w("Failed to parse the message.");
            }
            int iB = p7.b() + iA;
            do {
                ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Integer.valueOf(p7.o()));
            } while (p7.b() < iB);
            return;
        }
        if (i7 != 5) {
            throw C0574w.b();
        }
        do {
            ((androidx.glance.appwidget.protobuf.N) interfaceC0571t).add(Integer.valueOf(p7.o()));
            if (p7.c()) {
                return;
            } else {
                iZ = p7.z();
            }
        } while (iZ == this.f9479b);
        this.f9481d = iZ;
    }

    public void z(List list) throws C0550x {
        int iZ;
        int i7 = this.f9479b & 7;
        C0534g c0534g = (C0534g) this.f9482e;
        if (i7 == 2) {
            int iA = c0534g.A();
            if ((iA & 3) != 0) {
                throw C0550x.e();
            }
            int iB = c0534g.b() + iA;
            do {
                list.add(Integer.valueOf(c0534g.i()));
            } while (c0534g.b() < iB);
            return;
        }
        if (i7 != 5) {
            throw C0550x.b();
        }
        do {
            list.add(Integer.valueOf(c0534g.i()));
            if (c0534g.c()) {
                return;
            } else {
                iZ = c0534g.z();
            }
        } while (iZ == this.f9479b);
        this.f9481d = iZ;
    }

    public C0535h() {
        this.f9478a = 4;
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f9481d = iHighestOneBit - 1;
        this.f9482e = new int[iHighestOneBit];
    }

    public C0535h(G1.P p7) {
        this.f9478a = 1;
        this.f9481d = 0;
        Charset charset = AbstractC0572u.f9656a;
        this.f9482e = p7;
        p7.f2654p = this;
    }

    public C0535h(C0534g c0534g) {
        this.f9478a = 0;
        this.f9481d = 0;
        Charset charset = AbstractC0548v.f9521a;
        this.f9482e = c0534g;
        c0534g.f9470b = this;
    }

    public C0535h(int i7) {
        this.f9478a = 5;
        this.f9479b = i7;
    }

    public C0535h(g0.L l) {
        this.f9478a = 2;
        this.f9482e = l;
    }
}
