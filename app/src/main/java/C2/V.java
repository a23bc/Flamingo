package C2;

import A2.C0007h;
import A2.C0008i;
import A2.C0013n;
import A2.a0;
import A2.u0;
import android.content.Context;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;
import t2.C1476e;
import t2.C1477f;
import t2.C1487p;
import w2.AbstractC1697a;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class V extends F2.t implements a0 {
    public final Context T0;

    /* JADX INFO: renamed from: U0 */
    public final V.o f1076U0;

    /* JADX INFO: renamed from: V0 */
    public final S f1077V0;

    /* JADX INFO: renamed from: W0 */
    public int f1078W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f1079X0;

    /* JADX INFO: renamed from: Y0 */
    public boolean f1080Y0;

    /* JADX INFO: renamed from: Z0 */
    public C1487p f1081Z0;

    /* JADX INFO: renamed from: a1 */
    public C1487p f1082a1;

    /* JADX INFO: renamed from: b1 */
    public long f1083b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f1084c1;

    /* JADX INFO: renamed from: d1 */
    public boolean f1085d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f1086e1;

    /* JADX INFO: renamed from: f1 */
    public int f1087f1;

    public V(YosPlaybackService yosPlaybackService, A.b bVar, boolean z6, Handler handler, A2.K k7, S s7) {
        super(1, bVar, z6, 44100.0f);
        this.T0 = yosPlaybackService.getApplicationContext();
        this.f1077V0 = s7;
        this.f1087f1 = -1000;
        this.f1076U0 = new V.o(handler, (r) k7);
        s7.f1067s = new A.b(6, this);
    }

    @Override // F2.t
    public final C0008i D(F2.m mVar, C1487p c1487p, C1487p c1487p2) {
        C0008i c0008iB = mVar.b(c1487p, c1487p2);
        boolean z6 = this.f2274T == null && q0(c1487p2);
        int i7 = c0008iB.f310e;
        if (z6) {
            i7 |= 32768;
        }
        if (w0(mVar, c1487p2) > this.f1078W0) {
            i7 |= 64;
        }
        int i8 = i7;
        return new C0008i(mVar.f2225a, c1487p, c1487p2, i8 == 0 ? c0008iB.f309d : 0, i8);
    }

    @Override // F2.t
    public final float O(float f7, C1487p[] c1487pArr) {
        int iMax = -1;
        for (C1487p c1487p : c1487pArr) {
            int i7 = c1487p.f16681B;
            if (i7 != -1) {
                iMax = Math.max(iMax, i7);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f7;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x002b  */
    @Override // F2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList P(F2.u r4, t2.C1487p r5, boolean r6) {
        /*
            r3 = this;
            r0 = 0
            java.lang.String r1 = r5.f16701m
            if (r1 != 0) goto L8
            E4.b0 r4 = E4.b0.f1913s
            goto L2f
        L8:
            C2.S r1 = r3.f1077V0
            boolean r1 = r1.A(r5)
            if (r1 == 0) goto L2b
            java.lang.String r1 = "audio/raw"
            java.util.List r1 = F2.A.e(r1, r0, r0)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L1e
            r1 = 0
            goto L24
        L1e:
            java.lang.Object r1 = r1.get(r0)
            F2.m r1 = (F2.m) r1
        L24:
            if (r1 == 0) goto L2b
            E4.b0 r4 = E4.I.t(r1)
            goto L2f
        L2b:
            E4.b0 r4 = F2.A.g(r4, r5, r6, r0)
        L2f:
            java.util.regex.Pattern r6 = F2.A.f2177a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            A2.I r4 = new A2.I
            r1 = 8
            r4.<init>(r1, r5)
            F2.v r5 = new F2.v
            r5.<init>(r0, r4)
            java.util.Collections.sort(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.V.P(F2.u, t2.p, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0060  */
    @Override // F2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final F2.h Q(F2.m r12, t2.C1487p r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.V.Q(F2.m, t2.p, android.media.MediaCrypto, float):F2.h");
    }

    @Override // F2.t
    public final void R(z2.f fVar) {
        C1487p c1487p;
        J j3;
        if (w2.t.f18881a < 29 || (c1487p = fVar.f21113q) == null || !Objects.equals(c1487p.f16701m, "audio/opus") || !this.f2301x0) {
            return;
        }
        ByteBuffer byteBuffer = fVar.f21118v;
        byteBuffer.getClass();
        C1487p c1487p2 = fVar.f21113q;
        c1487p2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i7 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            S s7 = this.f1077V0;
            AudioTrack audioTrack = s7.f1071w;
            if (audioTrack == null || !S.o(audioTrack) || (j3 = s7.f1069u) == null || !j3.f997k) {
                return;
            }
            s7.f1071w.setOffloadDelayPadding(c1487p2.f16683D, i7);
        }
    }

    @Override // F2.t
    public final void W(Exception exc) {
        AbstractC1697a.n("Audio codec error", exc);
        V.o oVar = this.f1076U0;
        Handler handler = (Handler) oVar.f7342p;
        if (handler != null) {
            handler.post(new RunnableC0044p(oVar, exc, 3));
        }
    }

    @Override // F2.t
    public final void X(long j3, String str, long j7) {
        V.o oVar = this.f1076U0;
        Handler handler = (Handler) oVar.f7342p;
        if (handler != null) {
            handler.post(new RunnableC0044p(oVar, str, j3, j7));
        }
    }

    @Override // F2.t
    public final void Y(String str) {
        V.o oVar = this.f1076U0;
        Handler handler = (Handler) oVar.f7342p;
        if (handler != null) {
            handler.post(new RunnableC0044p(oVar, str, 7));
        }
    }

    @Override // F2.t
    public final C0008i Z(V.o oVar) throws C0013n {
        C1487p c1487p = (C1487p) oVar.f7343q;
        c1487p.getClass();
        this.f1081Z0 = c1487p;
        C0008i c0008iZ = super.Z(oVar);
        V.o oVar2 = this.f1076U0;
        Handler handler = (Handler) oVar2.f7342p;
        if (handler != null) {
            handler.post(new RunnableC0044p(oVar2, c1487p, c0008iZ));
        }
        return c0008iZ;
    }

    @Override // A2.AbstractC0006g, A2.q0
    public final void a(int i7, Object obj) {
        S s7 = this.f1077V0;
        if (i7 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (s7.f1031P != fFloatValue) {
                s7.f1031P = fFloatValue;
                if (s7.n()) {
                    if (w2.t.f18881a >= 21) {
                        s7.f1071w.setVolume(s7.f1031P);
                        return;
                    }
                    AudioTrack audioTrack = s7.f1071w;
                    float f7 = s7.f1031P;
                    audioTrack.setStereoVolume(f7, f7);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 3) {
            C1476e c1476e = (C1476e) obj;
            c1476e.getClass();
            s7.w(c1476e);
            return;
        }
        if (i7 == 6) {
            C1477f c1477f = (C1477f) obj;
            c1477f.getClass();
            s7.y(c1477f);
            return;
        }
        if (i7 == 12) {
            if (w2.t.f18881a >= 23) {
                U.a(s7, obj);
                return;
            }
            return;
        }
        if (i7 == 16) {
            obj.getClass();
            this.f1087f1 = ((Integer) obj).intValue();
            F2.j jVar = this.Z;
            if (jVar != null && w2.t.f18881a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f1087f1));
                jVar.d(bundle);
                return;
            }
            return;
        }
        if (i7 == 9) {
            obj.getClass();
            s7.f1020E = ((Boolean) obj).booleanValue();
            K k7 = new K(s7.B() ? t2.Q.f16345d : s7.f1019D, -9223372036854775807L, -9223372036854775807L);
            if (s7.n()) {
                s7.f1017B = k7;
                return;
            } else {
                s7.f1018C = k7;
                return;
            }
        }
        if (i7 != 10) {
            if (i7 == 11) {
                this.f2275U = (A2.O) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (s7.a0 != iIntValue) {
            s7.a0 = iIntValue;
            s7.Z = iIntValue != 0;
            s7.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0104 A[Catch: s -> 0x0102, TryCatch #0 {s -> 0x0102, blocks: (B:110:0x00d9, B:113:0x00e1, B:115:0x00e5, B:117:0x00ee, B:121:0x00fc, B:124:0x0104, B:128:0x010b, B:129:0x0110), top: B:133:0x00d9 }] */
    @Override // F2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(t2.C1487p r14, android.media.MediaFormat r15) throws A2.C0013n {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.V.a0(t2.p, android.media.MediaFormat):void");
    }

    @Override // F2.t
    public final void b0() {
        this.f1077V0.getClass();
    }

    @Override // F2.t
    public final void d0() {
        this.f1077V0.f1028M = true;
    }

    @Override // A2.AbstractC0006g
    public final String e() {
        return "MediaCodecAudioRenderer";
    }

    @Override // A2.AbstractC0006g
    public final boolean g() {
        if (!this.f2258K0) {
            return false;
        }
        S s7 = this.f1077V0;
        if (s7.n()) {
            return s7.f1037V && !s7.l();
        }
        return true;
    }

    @Override // A2.a0
    public final void h(t2.Q q7) {
        this.f1077V0.z(q7);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0068  */
    @Override // F2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h0(long r1, long r3, F2.j r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, t2.C1487p r14) throws A2.C0013n {
        /*
            r0 = this;
            r6.getClass()
            t2.p r1 = r0.f1082a1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L14
            r1 = r8 & 2
            if (r1 == 0) goto L14
            r5.getClass()
            r5.j(r7, r3)
            return r2
        L14:
            C2.S r1 = r0.f1077V0
            if (r12 == 0) goto L27
            if (r5 == 0) goto L1d
            r5.j(r7, r3)
        L1d:
            A2.h r3 = r0.f2266O0
            int r4 = r3.f298f
            int r4 = r4 + r9
            r3.f298f = r4
            r1.f1028M = r2
            return r2
        L27:
            boolean r1 = r1.k(r6, r10, r9)     // Catch: C2.C0049v -> L3b C2.C0047t -> L55
            if (r1 == 0) goto L3a
            if (r5 == 0) goto L32
            r5.j(r7, r3)
        L32:
            A2.h r1 = r0.f2266O0
            int r3 = r1.f297e
            int r3 = r3 + r9
            r1.f297e = r3
            return r2
        L3a:
            return r3
        L3b:
            r1 = move-exception
            boolean r2 = r0.f2301x0
            if (r2 == 0) goto L4c
            A2.u0 r2 = r0.f283r
            r2.getClass()
            int r2 = r2.f454a
            if (r2 == 0) goto L4c
            r2 = 5003(0x138b, float:7.01E-42)
            goto L4e
        L4c:
            r2 = 5002(0x138a, float:7.009E-42)
        L4e:
            boolean r3 = r1.f1154p
            A2.n r1 = r0.b(r1, r14, r3, r2)
            throw r1
        L55:
            r1 = move-exception
            t2.p r2 = r0.f1081Z0
            boolean r3 = r0.f2301x0
            if (r3 == 0) goto L68
            A2.u0 r3 = r0.f283r
            r3.getClass()
            int r3 = r3.f454a
            if (r3 == 0) goto L68
            r3 = 5004(0x138c, float:7.012E-42)
            goto L6a
        L68:
            r3 = 5001(0x1389, float:7.008E-42)
        L6a:
            boolean r4 = r1.f1151p
            A2.n r1 = r0.b(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.V.h0(long, long, F2.j, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, t2.p):boolean");
    }

    @Override // F2.t, A2.AbstractC0006g
    public final boolean i() {
        return this.f1077V0.l() || super.i();
    }

    @Override // A2.a0
    public final t2.Q j() {
        return this.f1077V0.f1019D;
    }

    @Override // A2.a0
    public final boolean k() {
        boolean z6 = this.f1086e1;
        this.f1086e1 = false;
        return z6;
    }

    @Override // F2.t
    public final void k0() throws C0013n {
        try {
            this.f1077V0.t();
        } catch (C0049v e7) {
            throw b(e7, e7.f1155q, e7.f1154p, this.f2301x0 ? 5003 : 5002);
        }
    }

    @Override // A2.a0
    public final long l() {
        if (this.f287v == 2) {
            x0();
        }
        return this.f1083b1;
    }

    @Override // F2.t, A2.AbstractC0006g
    public final void n() {
        V.o oVar = this.f1076U0;
        this.f1085d1 = true;
        this.f1081Z0 = null;
        try {
            this.f1077V0.e();
            try {
                super.n();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.n();
                throw th;
            } finally {
            }
        }
    }

    @Override // A2.AbstractC0006g
    public final void o(boolean z6, boolean z7) {
        C0007h c0007h = new C0007h();
        this.f2266O0 = c0007h;
        V.o oVar = this.f1076U0;
        Handler handler = (Handler) oVar.f7342p;
        if (handler != null) {
            handler.post(new RunnableC0044p(oVar, c0007h, 0));
        }
        u0 u0Var = this.f283r;
        u0Var.getClass();
        boolean z8 = u0Var.f455b;
        S s7 = this.f1077V0;
        if (z8) {
            s7.d();
        } else if (s7.f1046d0) {
            s7.f1046d0 = false;
            s7.e();
        }
        B2.p pVar = this.f285t;
        pVar.getClass();
        s7.f1066r = pVar;
        w2.o oVar2 = this.f286u;
        oVar2.getClass();
        s7.f1054i.f1178J = oVar2;
    }

    @Override // F2.t, A2.AbstractC0006g
    public final void p(long j3, boolean z6) throws C0013n {
        super.p(j3, z6);
        this.f1077V0.e();
        this.f1083b1 = j3;
        this.f1086e1 = false;
        this.f1084c1 = true;
    }

    @Override // A2.AbstractC0006g
    public final void q() {
        C0037i c0037i;
        C0040l c0040l = this.f1077V0.f1073y;
        if (c0040l == null || !c0040l.f1136j) {
            return;
        }
        c0040l.f1134g = null;
        int i7 = w2.t.f18881a;
        Context context = c0040l.f1128a;
        if (i7 >= 23 && (c0037i = c0040l.f1131d) != null) {
            AbstractC0036h.b(context, c0037i);
        }
        C0039k c0039k = c0040l.f1132e;
        if (c0039k != null) {
            context.unregisterReceiver(c0039k);
        }
        C0038j c0038j = c0040l.f1133f;
        if (c0038j != null) {
            c0038j.f1123a.unregisterContentObserver(c0038j);
        }
        c0040l.f1136j = false;
    }

    @Override // F2.t
    public final boolean q0(C1487p c1487p) {
        u0 u0Var = this.f283r;
        u0Var.getClass();
        if (u0Var.f454a != 0) {
            int iV0 = v0(c1487p);
            if ((iV0 & 512) != 0) {
                u0 u0Var2 = this.f283r;
                u0Var2.getClass();
                if (u0Var2.f454a == 2 || (iV0 & 1024) != 0) {
                    return true;
                }
                if (c1487p.f16683D == 0 && c1487p.f16684E == 0) {
                    return true;
                }
            }
        }
        return this.f1077V0.A(c1487p);
    }

    @Override // A2.AbstractC0006g
    public final void r() {
        S s7 = this.f1077V0;
        this.f1086e1 = false;
        try {
            try {
                F();
                j0();
            } finally {
                A0.e.K(this.f2274T, null);
                this.f2274T = null;
            }
        } finally {
            if (this.f1085d1) {
                this.f1085d1 = false;
                s7.v();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00a6  */
    @Override // F2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int r0(F2.u r17, t2.C1487p r18) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.V.r0(F2.u, t2.p):int");
    }

    @Override // A2.AbstractC0006g
    public final void s() {
        this.f1077V0.r();
    }

    @Override // A2.AbstractC0006g
    public final void t() {
        x0();
        this.f1077V0.q();
    }

    public final int v0(C1487p c1487p) {
        C0043o c0043oG = this.f1077V0.g(c1487p);
        if (!c0043oG.f1142a) {
            return 0;
        }
        int i7 = c0043oG.f1143b ? 1536 : 512;
        return c0043oG.f1144c ? i7 | 2048 : i7;
    }

    public final int w0(F2.m mVar, C1487p c1487p) {
        int i7;
        if (!"OMX.google.raw.decoder".equals(mVar.f2225a) || (i7 = w2.t.f18881a) >= 24 || (i7 == 23 && w2.t.B(this.T0))) {
            return c1487p.f16702n;
        }
        return -1;
    }

    public final void x0() {
        long jF = this.f1077V0.f(g());
        if (jF != Long.MIN_VALUE) {
            if (!this.f1084c1) {
                jF = Math.max(this.f1083b1, jF);
            }
            this.f1083b1 = jF;
            this.f1084c1 = false;
        }
    }

    @Override // A2.AbstractC0006g
    public final a0 d() {
        return this;
    }
}
