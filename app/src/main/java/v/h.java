package V;

import M.C0276v;
import M.D0;
import M.Z;
import Q0.A0;
import Q0.AbstractC0358n;
import X.K0;
import Y0.w;
import b1.AbstractC0607C;
import b1.C0622g;
import b1.L;
import g1.C0956B;
import g1.C0957C;
import g1.C0959a;
import g1.C0962d;
import g1.C0968j;
import g1.C0969k;
import g1.C0980v;
import s5.InterfaceC1438c;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC0358n implements A0 {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C0957C f7322E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C0980v f7323F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public Z f7324G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f7325H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public B2.m f7326I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public K0 f7327J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0969k f7328K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public w0.p f7329L;

    public static void E0(Z z6, String str, boolean z7) {
        if (z7) {
            C0956B c0956b = z6.f4501e;
            C0276v c0276v = z6.f4516v;
            if (c0956b == null) {
                int length = str.length();
                c0276v.b(new C0980v(AbstractC0607C.b(length, length), str, 4));
            } else {
                C0980v c0980vU = z6.f4500d.u(Z4.o.e0(new C0962d(), new C0959a(str, 1)));
                c0956b.a(null, c0980vU);
                c0276v.b(c0980vU);
            }
        }
    }

    @Override // Q0.A0
    public final void T(Y0.j jVar) {
        int i7 = 1;
        int i8 = 2;
        C0622g c0622g = this.f7323F.f12384a;
        InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
        w wVar = Y0.t.f8518D;
        InterfaceC1438c[] interfaceC1438cArr2 = Y0.v.f8556a;
        InterfaceC1438c interfaceC1438c = interfaceC1438cArr2[17];
        wVar.a(jVar, c0622g);
        C0622g c0622g2 = this.f7322E.f12322a;
        w wVar2 = Y0.t.f8519E;
        InterfaceC1438c interfaceC1438c2 = interfaceC1438cArr2[18];
        wVar2.a(jVar, c0622g2);
        long j3 = this.f7323F.f12385b;
        w wVar3 = Y0.t.f8520F;
        InterfaceC1438c interfaceC1438c3 = interfaceC1438cArr2[19];
        wVar3.a(jVar, new L(j3));
        s0.d dVar = s0.l.f15835a;
        w wVar4 = Y0.t.f8545r;
        InterfaceC1438c interfaceC1438c4 = interfaceC1438cArr2[9];
        wVar4.a(jVar, dVar);
        jVar.i(Y0.i.f8455g, new Y0.a(null, new g(this, 0)));
        if (!this.f7325H) {
            jVar.i(Y0.t.f8537i, Y4.o.f8736a);
        }
        boolean z6 = this.f7325H;
        w wVar5 = Y0.t.f8527M;
        InterfaceC1438c interfaceC1438c5 = interfaceC1438cArr2[25];
        wVar5.a(jVar, Boolean.valueOf(z6));
        Y0.v.a(jVar, new g(this, i7));
        if (z6) {
            jVar.i(Y0.i.f8457j, new Y0.a(null, new g(this, i8)));
            jVar.i(Y0.i.f8460n, new Y0.a(null, new g(this, jVar)));
        }
        jVar.i(Y0.i.f8456i, new Y0.a(null, new D0(i8, this)));
        int i9 = this.f7328K.f12366e;
        f fVar = new f(this, 6);
        jVar.i(Y0.t.f8521G, new C0968j(i9));
        jVar.i(Y0.i.f8461o, new Y0.a(null, fVar));
        jVar.i(Y0.i.f8450b, new Y0.a(null, new f(this, 7)));
        jVar.i(Y0.i.f8451c, new Y0.a(null, new f(this, 1)));
        if (!L.c(this.f7323F.f12385b)) {
            jVar.i(Y0.i.f8462p, new Y0.a(null, new f(this, 2)));
            if (this.f7325H) {
                jVar.i(Y0.i.f8463q, new Y0.a(null, new f(this, 3)));
            }
        }
        if (this.f7325H) {
            jVar.i(Y0.i.f8464r, new Y0.a(null, new f(this, 5)));
        }
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // Q0.A0
    public final boolean d0() {
        return true;
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean i() {
        return true;
    }
}
