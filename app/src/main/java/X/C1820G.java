package x;

import I.C0216h;
import android.view.KeyEvent;
import l5.InterfaceC1180a;
import s5.InterfaceC1438c;
import t.AbstractC1462q;
import t.C1441C;
import w5.AbstractC1767D;
import w5.InterfaceC1786g0;

/* JADX INFO: renamed from: x.G, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1820G extends AbstractC1869p {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f19644Y;
    public InterfaceC1180a Z;
    public InterfaceC1180a a0;
    public boolean b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final C1441C f19645c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final C1441C f19646d0;

    public C1820G(B.k kVar, Y0.g gVar, String str, String str2, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, InterfaceC1852g0 interfaceC1852g0, boolean z6, boolean z7, boolean z8) {
        super(kVar, interfaceC1852g0, z7, z8, str2, gVar, interfaceC1180a);
        this.f19644Y = str;
        this.Z = interfaceC1180a2;
        this.a0 = interfaceC1180a3;
        this.b0 = z6;
        C1441C c1441c = AbstractC1462q.f16101a;
        this.f19645c0 = new C1441C();
        this.f19646d0 = new C1441C();
    }

    @Override // x.AbstractC1869p
    public final void E0(Y0.j jVar) {
        if (this.Z != null) {
            String str = this.f19644Y;
            C1808A c1808a = new C1808A(0, this);
            InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
            jVar.i(Y0.i.f8451c, new Y0.a(str, c1808a));
        }
    }

    @Override // x.AbstractC1869p
    public final K0.N F0() {
        return K0.H.a(new C0216h(5, this));
    }

    @Override // x.AbstractC1869p
    public final void K0() {
        O0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // x.AbstractC1869p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L0(android.view.KeyEvent r8) {
        /*
            r7 = this;
            long r0 = I0.c.A(r8)
            l5.a r8 = r7.Z
            r2 = 0
            if (r8 == 0) goto L24
            t.C r8 = r7.f19645c0
            java.lang.Object r3 = r8.e(r0)
            if (r3 != 0) goto L24
            w5.B r3 = r7.n0()
            x.E r4 = new x.E
            r4.<init>(r7, r2)
            r5 = 3
            w5.w0 r3 = w5.AbstractC1767D.t(r3, r2, r4, r5)
            r8.h(r0, r3)
            r8 = 1
            goto L25
        L24:
            r8 = 0
        L25:
            t.C r3 = r7.f19646d0
            java.lang.Object r4 = r3.e(r0)
            x.B r4 = (x.C1810B) r4
            if (r4 == 0) goto L4a
            w5.w0 r5 = r4.f19602a
            boolean r6 = r5.b()
            if (r6 == 0) goto L47
            r5.c(r2)
            boolean r2 = r4.f19603b
            if (r2 != 0) goto L4a
            l5.a r2 = r7.f19796K
            r2.a()
            r3.g(r0)
            return r8
        L47:
            r3.g(r0)
        L4a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1820G.L0(android.view.KeyEvent):boolean");
    }

    @Override // x.AbstractC1869p
    public final void M0(KeyEvent keyEvent) {
        InterfaceC1180a interfaceC1180a;
        long jA = I0.c.A(keyEvent);
        C1441C c1441c = this.f19645c0;
        boolean z6 = false;
        if (c1441c.e(jA) != null) {
            InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) c1441c.e(jA);
            if (interfaceC1786g0 != null) {
                if (interfaceC1786g0.b()) {
                    interfaceC1786g0.c(null);
                } else {
                    z6 = true;
                }
            }
            c1441c.g(jA);
        }
        if (this.a0 == null) {
            if (z6) {
                return;
            }
            this.f19796K.a();
            return;
        }
        C1441C c1441c2 = this.f19646d0;
        if (c1441c2.e(jA) == null) {
            if (z6) {
                return;
            }
            c1441c2.h(jA, new C1810B(AbstractC1767D.t(n0(), null, new C1818F(this, jA, null), 3)));
        } else {
            if (!z6 && (interfaceC1180a = this.a0) != null) {
                interfaceC1180a.a();
            }
            c1441c2.g(jA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0() {
        /*
            r24 = this;
            r0 = r24
            t.C r1 = r0.f19645c0
            java.lang.Object[] r2 = r1.f15968c
            long[] r3 = r1.f15966a
            int r4 = r3.length
            int r4 = r4 + (-2)
            r5 = 0
            r10 = 7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r13 = 8
            r14 = 0
            if (r4 < 0) goto L5c
            r15 = r14
            r16 = 128(0x80, double:6.3E-322)
        L1a:
            r6 = r3[r15]
            r18 = 255(0xff, double:1.26E-321)
            long r8 = ~r6
            long r8 = r8 << r10
            long r8 = r8 & r6
            long r8 = r8 & r11
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 == 0) goto L53
            int r8 = r15 - r4
            int r8 = ~r8
            int r8 = r8 >>> 31
            int r8 = 8 - r8
            r9 = r14
        L2e:
            if (r9 >= r8) goto L4e
            long r20 = r6 & r18
            int r20 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r20 >= 0) goto L46
            int r20 = r15 << 3
            int r20 = r20 + r9
            r20 = r2[r20]
            r21 = r10
            r10 = r20
            w5.g0 r10 = (w5.InterfaceC1786g0) r10
            r10.c(r5)
            goto L48
        L46:
            r21 = r10
        L48:
            long r6 = r6 >> r13
            int r9 = r9 + 1
            r10 = r21
            goto L2e
        L4e:
            r21 = r10
            if (r8 != r13) goto L62
            goto L55
        L53:
            r21 = r10
        L55:
            if (r15 == r4) goto L62
            int r15 = r15 + 1
            r10 = r21
            goto L1a
        L5c:
            r21 = r10
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L62:
            r1.a()
            t.C r1 = r0.f19646d0
            java.lang.Object[] r2 = r1.f15968c
            long[] r3 = r1.f15966a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto La3
            r6 = r14
        L71:
            r7 = r3[r6]
            long r9 = ~r7
            long r9 = r9 << r21
            long r9 = r9 & r7
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L9e
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = r14
        L84:
            if (r10 >= r9) goto L9c
            long r22 = r7 & r18
            int r15 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r15 >= 0) goto L98
            int r15 = r6 << 3
            int r15 = r15 + r10
            r15 = r2[r15]
            x.B r15 = (x.C1810B) r15
            w5.w0 r15 = r15.f19602a
            r15.c(r5)
        L98:
            long r7 = r7 >> r13
            int r10 = r10 + 1
            goto L84
        L9c:
            if (r9 != r13) goto La3
        L9e:
            if (r6 == r4) goto La3
            int r6 = r6 + 1
            goto L71
        La3:
            r1.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x.C1820G.O0():void");
    }

    @Override // r0.AbstractC1397o
    public final void v0() {
        O0();
    }
}
