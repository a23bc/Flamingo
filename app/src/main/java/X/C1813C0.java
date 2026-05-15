package x;

import M.G0;
import O0.InterfaceC0296a0;
import O0.InterfaceC0298b0;
import d.C0746L;
import f0.C0888g0;
import k.AbstractC1113a;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import p0.AbstractC1289f;
import r0.AbstractC1397o;
import s5.InterfaceC1438c;
import z.EnumC2048l0;

/* JADX INFO: renamed from: x.C0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1813C0 extends AbstractC1397o implements Q0.A, Q0.A0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C1817E0 f19608C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f19609D;

    @Override // Q0.A0
    public final void T(Y0.j jVar) {
        InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
        Y0.w wVar = Y0.t.f8540m;
        InterfaceC1438c[] interfaceC1438cArr2 = Y0.v.f8556a;
        InterfaceC1438c interfaceC1438c = interfaceC1438cArr2[6];
        wVar.a(jVar, Boolean.TRUE);
        final int i7 = 0;
        final int i8 = 1;
        Y0.h hVar = new Y0.h(new InterfaceC1180a(this) { // from class: x.B0

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ C1813C0 f19605p;

            {
                this.f19605p = this;
            }

            @Override // l5.InterfaceC1180a
            public final Object a() {
                switch (i7) {
                    case 0:
                        return Float.valueOf(this.f19605p.f19608C.f19619a.h());
                    default:
                        return Float.valueOf(this.f19605p.f19608C.f19622d.h());
                }
            }
        }, new InterfaceC1180a(this) { // from class: x.B0

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final /* synthetic */ C1813C0 f19605p;

            {
                this.f19605p = this;
            }

            @Override // l5.InterfaceC1180a
            public final Object a() {
                switch (i8) {
                    case 0:
                        return Float.valueOf(this.f19605p.f19608C.f19619a.h());
                    default:
                        return Float.valueOf(this.f19605p.f19608C.f19622d.h());
                }
            }
        });
        if (this.f19609D) {
            Y0.w wVar2 = Y0.t.f8548u;
            InterfaceC1438c interfaceC1438c2 = interfaceC1438cArr2[12];
            wVar2.a(jVar, hVar);
        } else {
            Y0.w wVar3 = Y0.t.f8547t;
            InterfaceC1438c interfaceC1438c3 = interfaceC1438cArr2[11];
            wVar3.a(jVar, hVar);
        }
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean a0() {
        return false;
    }

    @Override // Q0.A
    public final int c(Q0.T t7, O0.Y y6, int i7) {
        if (!this.f19609D) {
            i7 = Integer.MAX_VALUE;
        }
        return y6.e(i7);
    }

    @Override // Q0.A
    public final int d(Q0.T t7, O0.Y y6, int i7) {
        if (this.f19609D) {
            i7 = Integer.MAX_VALUE;
        }
        return y6.M(i7);
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean d0() {
        return false;
    }

    @Override // Q0.A
    public final InterfaceC0296a0 e(InterfaceC0298b0 interfaceC0298b0, O0.Y y6, long j3) {
        AbstractC1113a.w(j3, this.f19609D ? EnumC2048l0.f20894o : EnumC2048l0.f20895p);
        O0.m0 m0VarD = y6.d(n1.a.a(j3, 0, this.f19609D ? n1.a.h(j3) : Integer.MAX_VALUE, 0, this.f19609D ? Integer.MAX_VALUE : n1.a.g(j3), 5));
        int i7 = m0VarD.f5416o;
        int iH = n1.a.h(j3);
        if (i7 > iH) {
            i7 = iH;
        }
        int i8 = m0VarD.f5417p;
        int iG = n1.a.g(j3);
        if (i8 > iG) {
            i8 = iG;
        }
        int i9 = m0VarD.f5417p - i8;
        int i10 = m0VarD.f5416o - i7;
        if (!this.f19609D) {
            i9 = i10;
        }
        C1817E0 c1817e0 = this.f19608C;
        C0888g0 c0888g0 = c1817e0.f19622d;
        C0888g0 c0888g02 = c1817e0.f19619a;
        c0888g0.j(i9);
        AbstractC1289f abstractC1289fQ = C0746L.q();
        InterfaceC1182c interfaceC1182cE = abstractC1289fQ != null ? abstractC1289fQ.e() : null;
        AbstractC1289f abstractC1289fW = C0746L.w(abstractC1289fQ);
        try {
            if (c0888g02.h() > i9) {
                c0888g02.j(i9);
            }
            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
            this.f19608C.f19620b.j(this.f19609D ? i8 : i7);
            return interfaceC0298b0.k(i7, i8, Z4.w.f8819o, new G0(this, i9, m0VarD, 2));
        } catch (Throwable th) {
            C0746L.z(abstractC1289fQ, abstractC1289fW, interfaceC1182cE);
            throw th;
        }
    }

    @Override // Q0.A
    public final int g(Q0.T t7, O0.Y y6, int i7) {
        if (!this.f19609D) {
            i7 = Integer.MAX_VALUE;
        }
        return y6.Q(i7);
    }

    @Override // Q0.A
    public final int h(Q0.T t7, O0.Y y6, int i7) {
        if (this.f19609D) {
            i7 = Integer.MAX_VALUE;
        }
        return y6.P(i7);
    }

    @Override // Q0.A0
    public final /* synthetic */ boolean i() {
        return true;
    }
}
