package androidx.media3.decoder.ffmpeg;

import A2.AbstractC0006g;
import A2.C0007h;
import A2.C0008i;
import A2.C0013n;
import A2.a0;
import A2.u0;
import B2.p;
import C2.B;
import C2.C0046s;
import C2.C0047t;
import C2.C0049v;
import C2.InterfaceC0050w;
import C2.K;
import C2.RunnableC0044p;
import C2.S;
import C2.r;
import D2.k;
import V.o;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import t2.C1476e;
import t2.C1477f;
import t2.C1487p;
import t2.Q;
import w2.AbstractC1697a;
import w2.t;
import z2.f;
import z2.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0006g implements a0 {

    /* JADX INFO: renamed from: F */
    public final o f9804F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC0050w f9805G;

    /* JADX INFO: renamed from: H */
    public final f f9806H;

    /* JADX INFO: renamed from: I */
    public C0007h f9807I;

    /* JADX INFO: renamed from: J */
    public C1487p f9808J;

    /* JADX INFO: renamed from: K */
    public int f9809K;

    /* JADX INFO: renamed from: L */
    public int f9810L;

    /* JADX INFO: renamed from: M */
    public boolean f9811M;

    /* JADX INFO: renamed from: N */
    public z2.c f9812N;

    /* JADX INFO: renamed from: O */
    public f f9813O;

    /* JADX INFO: renamed from: P */
    public SimpleDecoderOutputBuffer f9814P;

    /* JADX INFO: renamed from: Q */
    public k f9815Q;

    /* JADX INFO: renamed from: R */
    public k f9816R;

    /* JADX INFO: renamed from: S */
    public int f9817S;

    /* JADX INFO: renamed from: T */
    public boolean f9818T;

    /* JADX INFO: renamed from: U */
    public boolean f9819U;

    /* JADX INFO: renamed from: V */
    public long f9820V;

    /* JADX INFO: renamed from: W */
    public boolean f9821W;

    /* JADX INFO: renamed from: X */
    public boolean f9822X;

    /* JADX INFO: renamed from: Y */
    public boolean f9823Y;
    public long Z;
    public final long[] a0;
    public int b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f9824c0;

    public c(Handler handler, r rVar, InterfaceC0050w interfaceC0050w) {
        super(1);
        this.f9804F = new o(handler, rVar);
        this.f9805G = interfaceC0050w;
        ((S) interfaceC0050w).f1067s = new A.b(4, this);
        this.f9806H = new f(0, 0);
        this.f9817S = 0;
        this.f9819U = true;
        I(-9223372036854775807L);
        this.a0 = new long[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x004e  */
    @Override // A2.AbstractC0006g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A(t2.C1487p r8) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f16701m
            boolean r0 = t2.M.f(r0)
            r1 = 0
            if (r0 != 0) goto Le
            int r8 = A0.e.r(r1, r1, r1, r1)
            return r8
        Le:
            java.lang.String r0 = r8.f16701m
            r0.getClass()
            boolean r2 = androidx.media3.decoder.ffmpeg.FfmpegLibrary.d()
            r3 = 2
            if (r2 == 0) goto L50
            boolean r2 = t2.M.f(r0)
            if (r2 != 0) goto L21
            goto L50
        L21:
            boolean r0 = androidx.media3.decoder.ffmpeg.FfmpegLibrary.e(r0)
            if (r0 == 0) goto L4e
            int r0 = r8.f16680A
            int r2 = r8.f16681B
            t2.p r4 = w2.t.t(r3, r0, r2)
            C2.w r5 = r7.f9805G
            r6 = r5
            C2.S r6 = (C2.S) r6
            boolean r4 = r6.A(r4)
            r6 = 4
            if (r4 != 0) goto L48
            t2.p r0 = w2.t.t(r6, r0, r2)
            C2.S r5 = (C2.S) r5
            boolean r0 = r5.A(r0)
            if (r0 != 0) goto L48
            goto L4e
        L48:
            int r8 = r8.f16689J
            if (r8 == 0) goto L51
            r6 = r3
            goto L51
        L4e:
            r6 = 1
            goto L51
        L50:
            r6 = r1
        L51:
            if (r6 > r3) goto L58
            int r8 = A0.e.r(r6, r1, r1, r1)
            return r8
        L58:
            int r8 = w2.t.f18881a
            r0 = 21
            if (r8 < r0) goto L60
            r1 = 32
        L60:
            r8 = r6 | 8
            r8 = r8 | r1
            r8 = r8 | 128(0x80, float:1.8E-43)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.decoder.ffmpeg.c.A(t2.p):int");
    }

    @Override // A2.AbstractC0006g
    public final int B() {
        return 8;
    }

    public final z2.c C(C1487p c1487p) {
        Trace.beginSection("createFfmpegAudioDecoder");
        int i7 = c1487p.f16702n;
        if (i7 == -1) {
            i7 = 5760;
        }
        int i8 = c1487p.f16680A;
        int i9 = c1487p.f16681B;
        C1487p c1487pT = t.t(2, i8, i9);
        InterfaceC0050w interfaceC0050w = this.f9805G;
        boolean zEquals = true;
        if (((S) interfaceC0050w).A(c1487pT)) {
            zEquals = ((S) interfaceC0050w).h(t.t(4, i8, i9)) != 2 ? false : true ^ "audio/ac3".equals(c1487p.f16701m);
        }
        FfmpegAudioDecoder ffmpegAudioDecoder = new FfmpegAudioDecoder(i7, c1487p, zEquals);
        Trace.endSection();
        return ffmpegAudioDecoder;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean D() throws C2.C0046s, A2.C0013n {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.decoder.ffmpeg.c.D():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean E() throws A2.C0013n {
        /*
            r7 = this;
            z2.c r0 = r7.f9812N
            r1 = 0
            if (r0 == 0) goto La2
            int r2 = r7.f9817S
            r3 = 2
            if (r2 == r3) goto La2
            boolean r2 = r7.f9822X
            if (r2 == 0) goto L10
            goto La2
        L10:
            z2.f r2 = r7.f9813O
            if (r2 != 0) goto L22
            z2.i r0 = (z2.i) r0
            java.lang.Object r0 = r0.f()
            z2.f r0 = (z2.f) r0
            r7.f9813O = r0
            if (r0 != 0) goto L22
            goto La2
        L22:
            int r0 = r7.f9817S
            r2 = 4
            r4 = 0
            r5 = 1
            if (r0 != r5) goto L3c
            z2.f r0 = r7.f9813O
            r0.f12566p = r2
            z2.c r2 = r7.f9812N
            z2.i r2 = (z2.i) r2
            r2.getClass()
            r2.c(r0)
            r7.f9813O = r4
            r7.f9817S = r3
            return r1
        L3c:
            V.o r0 = r7.f282q
            r0.e()
            z2.f r3 = r7.f9813O
            int r3 = r7.v(r0, r3, r1)
            r6 = -5
            if (r3 == r6) goto L9e
            r0 = -4
            if (r3 == r0) goto L57
            r0 = -3
            if (r3 != r0) goto L51
            goto La2
        L51:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L57:
            z2.f r0 = r7.f9813O
            boolean r0 = r0.c(r2)
            if (r0 == 0) goto L70
            r7.f9822X = r5
            z2.c r0 = r7.f9812N
            z2.f r2 = r7.f9813O
            z2.i r0 = (z2.i) r0
            r0.getClass()
            r0.c(r2)
            r7.f9813O = r4
            return r1
        L70:
            boolean r0 = r7.f9811M
            if (r0 != 0) goto L7d
            r7.f9811M = r5
            z2.f r0 = r7.f9813O
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0.a(r1)
        L7d:
            z2.f r0 = r7.f9813O
            r0.i()
            z2.f r0 = r7.f9813O
            t2.p r1 = r7.f9808J
            r0.f21113q = r1
            z2.c r1 = r7.f9812N
            z2.i r1 = (z2.i) r1
            r1.getClass()
            r1.c(r0)
            r7.f9818T = r5
            A2.h r0 = r7.f9807I
            int r1 = r0.f295c
            int r1 = r1 + r5
            r0.f295c = r1
            r7.f9813O = r4
            return r5
        L9e:
            r7.G(r0)
            return r5
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.decoder.ffmpeg.c.E():boolean");
    }

    public final void F() throws C0013n {
        o oVar = this.f9804F;
        if (this.f9812N != null) {
            return;
        }
        k kVar = this.f9816R;
        A0.e.K(this.f9815Q, kVar);
        this.f9815Q = kVar;
        if (kVar != null && kVar.h() == null && this.f9815Q.g() == null) {
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            z2.c cVarC = C(this.f9808J);
            this.f9812N = cVarC;
            ((i) cVarC).b(this.f291z);
            Trace.endSection();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            String strP = ((FfmpegAudioDecoder) this.f9812N).p();
            long j3 = jElapsedRealtime2 - jElapsedRealtime;
            Handler handler = (Handler) oVar.f7342p;
            if (handler != null) {
                handler.post(new RunnableC0044p(oVar, strP, jElapsedRealtime2, j3));
            }
            this.f9807I.f293a++;
        } catch (OutOfMemoryError e7) {
            throw b(e7, this.f9808J, false, 4001);
        } catch (z2.d e8) {
            AbstractC1697a.n("Audio codec error", e8);
            Handler handler2 = (Handler) oVar.f7342p;
            if (handler2 != null) {
                handler2.post(new RunnableC0044p(oVar, e8, 3));
            }
            throw b(e8, this.f9808J, false, 4001);
        }
    }

    public final void G(o oVar) throws C0013n {
        C1487p c1487p = (C1487p) oVar.f7343q;
        c1487p.getClass();
        k kVar = (k) oVar.f7342p;
        A0.e.K(this.f9816R, kVar);
        this.f9816R = kVar;
        C1487p c1487p2 = this.f9808J;
        this.f9808J = c1487p;
        this.f9809K = c1487p.f16683D;
        this.f9810L = c1487p.f16684E;
        z2.c cVar = this.f9812N;
        o oVar2 = this.f9804F;
        if (cVar == null) {
            F();
            C1487p c1487p3 = this.f9808J;
            Handler handler = (Handler) oVar2.f7342p;
            if (handler != null) {
                handler.post(new RunnableC0044p(oVar2, c1487p3, (C0008i) null));
                return;
            }
            return;
        }
        C0008i c0008i = kVar != this.f9815Q ? new C0008i(((FfmpegAudioDecoder) cVar).p(), c1487p2, c1487p, 0, 128) : new C0008i(((FfmpegAudioDecoder) cVar).p(), c1487p2, c1487p, 0, 1);
        if (c0008i.f309d == 0) {
            if (this.f9818T) {
                this.f9817S = 1;
            } else {
                H();
                F();
                this.f9819U = true;
            }
        }
        C1487p c1487p4 = this.f9808J;
        Handler handler2 = (Handler) oVar2.f7342p;
        if (handler2 != null) {
            handler2.post(new RunnableC0044p(oVar2, c1487p4, c0008i));
        }
    }

    public final void H() {
        this.f9813O = null;
        this.f9814P = null;
        this.f9817S = 0;
        this.f9818T = false;
        z2.c cVar = this.f9812N;
        if (cVar != null) {
            this.f9807I.f294b++;
            ((FfmpegAudioDecoder) cVar).a();
            String strP = ((FfmpegAudioDecoder) this.f9812N).p();
            o oVar = this.f9804F;
            Handler handler = (Handler) oVar.f7342p;
            if (handler != null) {
                handler.post(new RunnableC0044p(oVar, strP, 7));
            }
            this.f9812N = null;
        }
        A0.e.K(this.f9815Q, null);
        this.f9815Q = null;
    }

    public final void I(long j3) {
        this.Z = j3;
        if (j3 != -9223372036854775807L) {
            this.f9805G.getClass();
        }
    }

    public final void J() {
        long jF = ((S) this.f9805G).f(g());
        if (jF != Long.MIN_VALUE) {
            if (!this.f9821W) {
                jF = Math.max(this.f9820V, jF);
            }
            this.f9820V = jF;
            this.f9821W = false;
        }
    }

    @Override // A2.AbstractC0006g, A2.q0
    public final void a(int i7, Object obj) {
        InterfaceC0050w interfaceC0050w = this.f9805G;
        if (i7 == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            S s7 = (S) interfaceC0050w;
            if (s7.f1031P != fFloatValue) {
                s7.f1031P = fFloatValue;
                if (s7.n()) {
                    if (t.f18881a >= 21) {
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
            ((S) interfaceC0050w).w((C1476e) obj);
            return;
        }
        if (i7 == 6) {
            ((S) interfaceC0050w).y((C1477f) obj);
            return;
        }
        if (i7 == 12) {
            if (t.f18881a >= 23) {
                B.a(interfaceC0050w, obj);
                return;
            }
            return;
        }
        if (i7 == 9) {
            S s8 = (S) interfaceC0050w;
            s8.f1020E = ((Boolean) obj).booleanValue();
            K k7 = new K(s8.B() ? Q.f16345d : s8.f1019D, -9223372036854775807L, -9223372036854775807L);
            if (s8.n()) {
                s8.f1017B = k7;
                return;
            } else {
                s8.f1018C = k7;
                return;
            }
        }
        if (i7 != 10) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        S s9 = (S) interfaceC0050w;
        if (s9.a0 != iIntValue) {
            s9.a0 = iIntValue;
            s9.Z = iIntValue != 0;
            s9.e();
        }
    }

    @Override // A2.AbstractC0006g
    public final String e() {
        return "FfmpegAudioRenderer";
    }

    @Override // A2.AbstractC0006g
    public final boolean g() {
        if (!this.f9823Y) {
            return false;
        }
        S s7 = (S) this.f9805G;
        if (s7.n()) {
            return s7.f1037V && !s7.l();
        }
        return true;
    }

    @Override // A2.a0
    public final void h(Q q7) {
        ((S) this.f9805G).z(q7);
    }

    @Override // A2.AbstractC0006g
    public final boolean i() {
        if (((S) this.f9805G).l()) {
            return true;
        }
        if (this.f9808J != null) {
            return m() || this.f9814P != null;
        }
        return false;
    }

    @Override // A2.a0
    public final Q j() {
        return ((S) this.f9805G).f1019D;
    }

    @Override // A2.a0
    public final boolean k() {
        boolean z6 = this.f9824c0;
        this.f9824c0 = false;
        return z6;
    }

    @Override // A2.a0
    public final long l() {
        if (this.f287v == 2) {
            J();
        }
        return this.f9820V;
    }

    @Override // A2.AbstractC0006g
    public final void n() {
        o oVar = this.f9804F;
        this.f9808J = null;
        this.f9819U = true;
        I(-9223372036854775807L);
        this.f9824c0 = false;
        try {
            A0.e.K(this.f9816R, null);
            this.f9816R = null;
            H();
            ((S) this.f9805G).v();
        } finally {
            oVar.i(this.f9807I);
        }
    }

    @Override // A2.AbstractC0006g
    public final void o(boolean z6, boolean z7) {
        C0007h c0007h = new C0007h();
        this.f9807I = c0007h;
        o oVar = this.f9804F;
        Handler handler = (Handler) oVar.f7342p;
        if (handler != null) {
            handler.post(new RunnableC0044p(oVar, c0007h, 0));
        }
        u0 u0Var = this.f283r;
        u0Var.getClass();
        boolean z8 = u0Var.f455b;
        InterfaceC0050w interfaceC0050w = this.f9805G;
        if (z8) {
            ((S) interfaceC0050w).d();
        } else {
            S s7 = (S) interfaceC0050w;
            if (s7.f1046d0) {
                s7.f1046d0 = false;
                s7.e();
            }
        }
        p pVar = this.f285t;
        pVar.getClass();
        S s8 = (S) interfaceC0050w;
        s8.f1066r = pVar;
        w2.o oVar2 = this.f286u;
        oVar2.getClass();
        s8.f1054i.f1178J = oVar2;
    }

    @Override // A2.AbstractC0006g
    public final void p(long j3, boolean z6) throws C0013n {
        ((S) this.f9805G).e();
        this.f9820V = j3;
        this.f9824c0 = false;
        this.f9821W = true;
        this.f9822X = false;
        this.f9823Y = false;
        if (this.f9812N != null) {
            if (this.f9817S != 0) {
                H();
                F();
                return;
            }
            this.f9813O = null;
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = this.f9814P;
            if (simpleDecoderOutputBuffer != null) {
                simpleDecoderOutputBuffer.g();
                this.f9814P = null;
            }
            z2.c cVar = this.f9812N;
            cVar.getClass();
            i iVar = (i) cVar;
            iVar.flush();
            iVar.b(this.f291z);
            this.f9818T = false;
        }
    }

    @Override // A2.AbstractC0006g
    public final void s() {
        ((S) this.f9805G).r();
    }

    @Override // A2.AbstractC0006g
    public final void t() {
        J();
        ((S) this.f9805G).q();
    }

    @Override // A2.AbstractC0006g
    public final void u(C1487p[] c1487pArr, long j3, long j7) {
        this.f9811M = false;
        if (this.Z == -9223372036854775807L) {
            I(j7);
            return;
        }
        int i7 = this.b0;
        long[] jArr = this.a0;
        if (i7 == jArr.length) {
            AbstractC1697a.w("Too many stream changes, so dropping offset: " + jArr[this.b0 - 1]);
        } else {
            this.b0 = i7 + 1;
        }
        jArr[this.b0 - 1] = j7;
    }

    @Override // A2.AbstractC0006g
    public final void w(long j3, long j7) throws C0013n {
        if (this.f9823Y) {
            try {
                ((S) this.f9805G).t();
                return;
            } catch (C0049v e7) {
                throw b(e7, e7.f1155q, e7.f1154p, 5002);
            }
        }
        if (this.f9808J == null) {
            o oVar = this.f282q;
            oVar.e();
            this.f9806H.f();
            int iV = v(oVar, this.f9806H, 2);
            if (iV != -5) {
                if (iV == -4) {
                    AbstractC1697a.i(this.f9806H.c(4));
                    this.f9822X = true;
                    try {
                        this.f9823Y = true;
                        ((S) this.f9805G).t();
                        return;
                    } catch (C0049v e8) {
                        throw b(e8, null, false, 5002);
                    }
                }
                return;
            }
            G(oVar);
        }
        F();
        if (this.f9812N != null) {
            try {
                Trace.beginSection("drainAndFeed");
                while (D()) {
                }
                while (E()) {
                }
                Trace.endSection();
                synchronized (this.f9807I) {
                }
            } catch (C0046s e9) {
                throw b(e9, e9.f1149o, false, 5001);
            } catch (C0047t e10) {
                throw b(e10, e10.f1152q, e10.f1151p, 5001);
            } catch (C0049v e11) {
                throw b(e11, e11.f1155q, e11.f1154p, 5002);
            } catch (z2.d e12) {
                AbstractC1697a.n("Audio codec error", e12);
                o oVar2 = this.f9804F;
                Handler handler = (Handler) oVar2.f7342p;
                if (handler != null) {
                    handler.post(new RunnableC0044p(oVar2, e12, 3));
                }
                throw b(e12, this.f9808J, false, 4003);
            }
        }
    }

    @Override // A2.AbstractC0006g
    public final a0 d() {
        return this;
    }
}
