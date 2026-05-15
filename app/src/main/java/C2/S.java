package C2;

import E4.AbstractC0119q;
import E4.b0;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import t2.C1476e;
import t2.C1477f;
import t2.C1487p;
import w2.AbstractC1697a;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class S implements InterfaceC0050w {

    /* JADX INFO: renamed from: m0 */
    public static final Object f1013m0 = new Object();

    /* JADX INFO: renamed from: n0 */
    public static ExecutorService f1014n0;

    /* JADX INFO: renamed from: o0 */
    public static int f1015o0;

    /* JADX INFO: renamed from: A */
    public C1476e f1016A;

    /* JADX INFO: renamed from: B */
    public K f1017B;

    /* JADX INFO: renamed from: C */
    public K f1018C;

    /* JADX INFO: renamed from: D */
    public t2.Q f1019D;

    /* JADX INFO: renamed from: E */
    public boolean f1020E;

    /* JADX INFO: renamed from: F */
    public ByteBuffer f1021F;

    /* JADX INFO: renamed from: G */
    public int f1022G;

    /* JADX INFO: renamed from: H */
    public long f1023H;

    /* JADX INFO: renamed from: I */
    public long f1024I;

    /* JADX INFO: renamed from: J */
    public long f1025J;

    /* JADX INFO: renamed from: K */
    public long f1026K;

    /* JADX INFO: renamed from: L */
    public int f1027L;

    /* JADX INFO: renamed from: M */
    public boolean f1028M;

    /* JADX INFO: renamed from: N */
    public boolean f1029N;

    /* JADX INFO: renamed from: O */
    public long f1030O;

    /* JADX INFO: renamed from: P */
    public float f1031P;

    /* JADX INFO: renamed from: Q */
    public ByteBuffer f1032Q;

    /* JADX INFO: renamed from: R */
    public int f1033R;

    /* JADX INFO: renamed from: S */
    public ByteBuffer f1034S;

    /* JADX INFO: renamed from: T */
    public byte[] f1035T;

    /* JADX INFO: renamed from: U */
    public int f1036U;

    /* JADX INFO: renamed from: V */
    public boolean f1037V;

    /* JADX INFO: renamed from: W */
    public boolean f1038W;

    /* JADX INFO: renamed from: X */
    public boolean f1039X;

    /* JADX INFO: renamed from: Y */
    public boolean f1040Y;
    public boolean Z;

    /* JADX INFO: renamed from: a */
    public final YosPlaybackService f1041a;
    public int a0;

    /* JADX INFO: renamed from: b */
    public final A0.b f1042b;
    public C1477f b0;

    /* JADX INFO: renamed from: c */
    public final boolean f1043c;

    /* JADX INFO: renamed from: c0 */
    public C0041m f1044c0;

    /* JADX INFO: renamed from: d */
    public final A f1045d;

    /* JADX INFO: renamed from: d0 */
    public boolean f1046d0;

    /* JADX INFO: renamed from: e */
    public final Z f1047e;

    /* JADX INFO: renamed from: e0 */
    public long f1048e0;

    /* JADX INFO: renamed from: f */
    public final b0 f1049f;

    /* JADX INFO: renamed from: f0 */
    public long f1050f0;

    /* JADX INFO: renamed from: g */
    public final b0 f1051g;

    /* JADX INFO: renamed from: g0 */
    public boolean f1052g0;
    public final N2.K h;

    /* JADX INFO: renamed from: h0 */
    public boolean f1053h0;

    /* JADX INFO: renamed from: i */
    public final C0053z f1054i;

    /* JADX INFO: renamed from: i0 */
    public Looper f1055i0;

    /* JADX INFO: renamed from: j */
    public final ArrayDeque f1056j;

    /* JADX INFO: renamed from: j0 */
    public long f1057j0;

    /* JADX INFO: renamed from: k */
    public final boolean f1058k;

    /* JADX INFO: renamed from: k0 */
    public long f1059k0;
    public int l;

    /* JADX INFO: renamed from: l0 */
    public Handler f1060l0;

    /* JADX INFO: renamed from: m */
    public Q f1061m;

    /* JADX INFO: renamed from: n */
    public final N f1062n;

    /* JADX INFO: renamed from: o */
    public final N f1063o;

    /* JADX INFO: renamed from: p */
    public final T f1064p;

    /* JADX INFO: renamed from: q */
    public final V.o f1065q;

    /* JADX INFO: renamed from: r */
    public B2.p f1066r;

    /* JADX INFO: renamed from: s */
    public A.b f1067s;

    /* JADX INFO: renamed from: t */
    public J f1068t;

    /* JADX INFO: renamed from: u */
    public J f1069u;

    /* JADX INFO: renamed from: v */
    public u2.a f1070v;

    /* JADX INFO: renamed from: w */
    public AudioTrack f1071w;

    /* JADX INFO: renamed from: x */
    public C0035g f1072x;

    /* JADX INFO: renamed from: y */
    public C0040l f1073y;

    /* JADX INFO: renamed from: z */
    public M f1074z;

    public S(I i7) {
        C0035g c0035gC;
        YosPlaybackService yosPlaybackService = (YosPlaybackService) i7.f984d;
        this.f1041a = yosPlaybackService;
        C1476e c1476e = C1476e.f16413g;
        this.f1016A = c1476e;
        if (yosPlaybackService != null) {
            C0035g c0035g = C0035g.f1117c;
            int i8 = w2.t.f18881a;
            c0035gC = C0035g.c(yosPlaybackService, c1476e, null);
        } else {
            c0035gC = (C0035g) i7.f985e;
        }
        this.f1072x = c0035gC;
        this.f1042b = (A0.b) i7.f986f;
        int i9 = w2.t.f18881a;
        this.f1043c = i9 >= 21 && i7.f981a;
        this.f1058k = i9 >= 23 && i7.f982b;
        this.l = 0;
        this.f1064p = (T) i7.f987g;
        V.o oVar = (V.o) i7.h;
        oVar.getClass();
        this.f1065q = oVar;
        N2.K k7 = new N2.K();
        this.h = k7;
        k7.e();
        this.f1054i = new C0053z(new A.b(5, this));
        A a4 = new A();
        this.f1045d = a4;
        Z z6 = new Z();
        z6.f1110m = w2.t.f18886f;
        this.f1047e = z6;
        u2.h hVar = new u2.h();
        E4.G g6 = E4.I.f1870p;
        Object[] objArr = {hVar, a4, z6};
        AbstractC0119q.c(3, objArr);
        this.f1049f = E4.I.n(3, objArr);
        this.f1051g = E4.I.t(new Y());
        this.f1031P = 1.0f;
        this.a0 = 0;
        this.b0 = new C1477f();
        t2.Q q7 = t2.Q.f16345d;
        this.f1018C = new K(q7, 0L, 0L);
        this.f1019D = q7;
        this.f1020E = false;
        this.f1056j = new ArrayDeque();
        this.f1062n = new N();
        this.f1063o = new N();
    }

    public static boolean o(AudioTrack audioTrack) {
        return w2.t.f18881a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final boolean A(C1487p c1487p) {
        return h(c1487p) != 0;
    }

    public final boolean B() {
        J j3 = this.f1069u;
        return j3 != null && j3.f996j && w2.t.f18881a >= 23;
    }

    /* JADX WARN: Removed duplicated region for block: B:193:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(java.nio.ByteBuffer r13, long r14) throws C2.C0049v {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.S.C(java.nio.ByteBuffer, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r15) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.S.a(long):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(t2.C1487p r28, int[] r29) throws C2.C0046s {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.S.b(t2.p, int[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0049 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() throws C2.C0049v {
        /*
            r6 = this;
            u2.a r0 = r6.f1070v
            boolean r0 = r0.e()
            r1 = -9223372036854775808
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L19
            java.nio.ByteBuffer r0 = r6.f1034S
            if (r0 != 0) goto L11
            goto L48
        L11:
            r6.C(r0, r1)
            java.nio.ByteBuffer r0 = r6.f1034S
            if (r0 != 0) goto L49
            goto L48
        L19:
            u2.a r0 = r6.f1070v
            boolean r5 = r0.e()
            if (r5 == 0) goto L33
            boolean r5 = r0.f17203d
            if (r5 == 0) goto L26
            goto L33
        L26:
            r0.f17203d = r4
            java.util.ArrayList r0 = r0.f17201b
            java.lang.Object r0 = r0.get(r3)
            u2.d r0 = (u2.d) r0
            r0.e()
        L33:
            r6.u(r1)
            u2.a r0 = r6.f1070v
            boolean r0 = r0.d()
            if (r0 == 0) goto L49
            java.nio.ByteBuffer r0 = r6.f1034S
            if (r0 == 0) goto L48
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L49
        L48:
            return r4
        L49:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.S.c():boolean");
    }

    public final void d() {
        AbstractC1697a.i(w2.t.f18881a >= 21);
        AbstractC1697a.i(this.Z);
        if (this.f1046d0) {
            return;
        }
        this.f1046d0 = true;
        e();
    }

    public final void e() {
        M m7;
        if (n()) {
            this.f1023H = 0L;
            this.f1024I = 0L;
            this.f1025J = 0L;
            this.f1026K = 0L;
            this.f1053h0 = false;
            this.f1027L = 0;
            this.f1018C = new K(this.f1019D, 0L, 0L);
            this.f1030O = 0L;
            this.f1017B = null;
            this.f1056j.clear();
            this.f1032Q = null;
            this.f1033R = 0;
            this.f1034S = null;
            this.f1038W = false;
            this.f1037V = false;
            this.f1039X = false;
            this.f1021F = null;
            this.f1022G = 0;
            this.f1047e.f1112o = 0L;
            u2.a aVar = this.f1069u.f995i;
            this.f1070v = aVar;
            aVar.b();
            AudioTrack audioTrack = this.f1054i.f1181c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f1071w.pause();
            }
            if (o(this.f1071w)) {
                Q q7 = this.f1061m;
                q7.getClass();
                q7.b(this.f1071w);
            }
            int i7 = w2.t.f18881a;
            if (i7 < 21 && !this.Z) {
                this.a0 = 0;
            }
            this.f1069u.getClass();
            T t7 = new T();
            J j3 = this.f1068t;
            if (j3 != null) {
                this.f1069u = j3;
                this.f1068t = null;
            }
            C0053z c0053z = this.f1054i;
            c0053z.d();
            c0053z.f1181c = null;
            c0053z.f1184f = null;
            if (i7 >= 24 && (m7 = this.f1074z) != null) {
                m7.c();
                this.f1074z = null;
            }
            AudioTrack audioTrack2 = this.f1071w;
            N2.K k7 = this.h;
            A.b bVar = this.f1067s;
            k7.d();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f1013m0) {
                try {
                    if (f1014n0 == null) {
                        f1014n0 = Executors.newSingleThreadExecutor(new T1.a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f1015o0++;
                    f1014n0.execute(new F(audioTrack2, bVar, handler, t7, k7, 0));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f1071w = null;
        }
        this.f1063o.f1006p = null;
        this.f1062n.f1006p = null;
        this.f1057j0 = 0L;
        this.f1059k0 = 0L;
        Handler handler2 = this.f1060l0;
        if (handler2 != null) {
            handler2.removeCallbacksAndMessages(null);
        }
    }

    public final long f(boolean z6) {
        ArrayDeque arrayDeque;
        long jR;
        if (!n() || this.f1029N) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f1054i.a(z6), w2.t.H(j(), this.f1069u.f992e));
        while (true) {
            arrayDeque = this.f1056j;
            if (arrayDeque.isEmpty() || jMin < ((K) arrayDeque.getFirst()).f1000c) {
                break;
            }
            this.f1018C = (K) arrayDeque.remove();
        }
        long J6 = jMin - this.f1018C.f1000c;
        boolean zIsEmpty = arrayDeque.isEmpty();
        A0.b bVar = this.f1042b;
        if (zIsEmpty) {
            u2.g gVar = (u2.g) bVar.f52r;
            if (gVar.b()) {
                if (gVar.f17247o >= 1024) {
                    long j3 = gVar.f17246n;
                    u2.f fVar = gVar.f17243j;
                    fVar.getClass();
                    long j7 = j3 - ((long) ((fVar.f17225k * fVar.f17217b) * 2));
                    int i7 = gVar.h.f17205a;
                    int i8 = gVar.f17241g.f17205a;
                    J6 = i7 == i8 ? w2.t.J(J6, j7, gVar.f17247o, RoundingMode.FLOOR) : w2.t.J(J6, j7 * ((long) i7), gVar.f17247o * ((long) i8), RoundingMode.FLOOR);
                } else {
                    J6 = (long) (((double) gVar.f17237c) * J6);
                }
            }
            jR = this.f1018C.f999b + J6;
        } else {
            K k7 = (K) arrayDeque.getFirst();
            jR = k7.f999b - w2.t.r(k7.f1000c - jMin, this.f1018C.f998a.f16348a);
        }
        long j8 = ((X) bVar.f51q).f1100q;
        long jH = w2.t.H(j8, this.f1069u.f992e) + jR;
        long j9 = this.f1057j0;
        if (j8 > j9) {
            long jH2 = w2.t.H(j8 - j9, this.f1069u.f992e);
            this.f1057j0 = j8;
            this.f1059k0 += jH2;
            if (this.f1060l0 == null) {
                this.f1060l0 = new Handler(Looper.myLooper());
            }
            this.f1060l0.removeCallbacksAndMessages(null);
            this.f1060l0.postDelayed(new B2.e(1, this), 100L);
        }
        return jH;
    }

    public final C0043o g(C1487p c1487p) {
        int i7;
        boolean zBooleanValue;
        AudioManager audioManager;
        if (this.f1052g0) {
            return C0043o.f1141d;
        }
        C1476e c1476e = this.f1016A;
        V.o oVar = this.f1065q;
        oVar.getClass();
        c1487p.getClass();
        c1476e.getClass();
        int i8 = w2.t.f18881a;
        if (i8 < 29 || (i7 = c1487p.f16681B) == -1) {
            return C0043o.f1141d;
        }
        Boolean bool = (Boolean) oVar.f7343q;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            YosPlaybackService yosPlaybackService = (YosPlaybackService) oVar.f7342p;
            if (yosPlaybackService == null || (audioManager = (AudioManager) yosPlaybackService.getSystemService("audio")) == null) {
                oVar.f7343q = Boolean.FALSE;
            } else {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                oVar.f7343q = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            }
            zBooleanValue = ((Boolean) oVar.f7343q).booleanValue();
        }
        String str = c1487p.f16701m;
        str.getClass();
        int iA = t2.M.a(str, c1487p.f16699j);
        if (iA == 0 || i8 < w2.t.l(iA)) {
            return C0043o.f1141d;
        }
        int iN = w2.t.n(c1487p.f16680A);
        if (iN == 0) {
            return C0043o.f1141d;
        }
        try {
            AudioFormat audioFormatM = w2.t.m(i7, iN, iA);
            return i8 >= 31 ? E.a(audioFormatM, (AudioAttributes) c1476e.b().f16352a, zBooleanValue) : D.a(audioFormatM, (AudioAttributes) c1476e.b().f16352a, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return C0043o.f1141d;
        }
    }

    public final int h(C1487p c1487p) {
        p();
        if ("audio/raw".equals(c1487p.f16701m)) {
            int i7 = c1487p.f16682C;
            if (!w2.t.z(i7)) {
                n1.c.x(i7, "Invalid PCM encoding: ");
                return 0;
            }
            if (i7 != 2 && (!this.f1043c || i7 != 4)) {
                return 1;
            }
        } else if (this.f1072x.d(this.f1016A, c1487p) == null) {
            return 0;
        }
        return 2;
    }

    public final long i() {
        J j3 = this.f1069u;
        return j3.f990c == 0 ? this.f1023H / ((long) j3.f989b) : this.f1024I;
    }

    public final long j() {
        J j3 = this.f1069u;
        if (j3.f990c != 0) {
            return this.f1026K;
        }
        long j7 = this.f1025J;
        long j8 = j3.f991d;
        int i7 = w2.t.f18881a;
        return ((j7 + j8) - 1) / j8;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x03bc, code lost:
    
        if (r13 == 0) goto L483;
     */
    /* JADX WARN: Removed duplicated region for block: B:325:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(java.nio.ByteBuffer r27, long r28, int r30) throws C2.C0049v, C2.C0047t {
        /*
            Method dump skipped, instruction units count: 1248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.S.k(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean l() {
        if (n()) {
            return !(w2.t.f18881a >= 29 && this.f1071w.isOffloadedPlayback() && this.f1039X) && this.f1054i.c(j());
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m() throws C2.C0047t {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.S.m():boolean");
    }

    public final boolean n() {
        return this.f1071w != null;
    }

    public final void p() {
        YosPlaybackService yosPlaybackService;
        C0035g c0035gB;
        C0037i c0037i;
        if (this.f1073y != null || (yosPlaybackService = this.f1041a) == null) {
            return;
        }
        this.f1055i0 = Looper.myLooper();
        C0040l c0040l = new C0040l(yosPlaybackService, new A2.I(7, this), this.f1016A, this.f1044c0);
        this.f1073y = c0040l;
        if (c0040l.f1136j) {
            c0035gB = c0040l.f1134g;
            c0035gB.getClass();
        } else {
            c0040l.f1136j = true;
            C0038j c0038j = c0040l.f1133f;
            if (c0038j != null) {
                c0038j.f1123a.registerContentObserver(c0038j.f1124b, false, c0038j);
            }
            int i7 = w2.t.f18881a;
            Handler handler = c0040l.f1130c;
            Context context = c0040l.f1128a;
            if (i7 >= 23 && (c0037i = c0040l.f1131d) != null) {
                AbstractC0036h.a(context, c0037i, handler);
            }
            C0039k c0039k = c0040l.f1132e;
            c0035gB = C0035g.b(context, c0039k != null ? context.registerReceiver(c0039k, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler) : null, c0040l.f1135i, c0040l.h);
            c0040l.f1134g = c0035gB;
        }
        this.f1072x = c0035gB;
    }

    public final void q() {
        this.f1040Y = false;
        if (n()) {
            C0053z c0053z = this.f1054i;
            c0053z.d();
            if (c0053z.f1201y == -9223372036854775807L) {
                C0052y c0052y = c0053z.f1184f;
                c0052y.getClass();
                c0052y.a();
            } else {
                c0053z.f1169A = c0053z.b();
                if (!o(this.f1071w)) {
                    return;
                }
            }
            this.f1071w.pause();
        }
    }

    public final void r() {
        this.f1040Y = true;
        if (n()) {
            C0053z c0053z = this.f1054i;
            if (c0053z.f1201y != -9223372036854775807L) {
                c0053z.f1178J.getClass();
                c0053z.f1201y = w2.t.D(SystemClock.elapsedRealtime());
            }
            C0052y c0052y = c0053z.f1184f;
            c0052y.getClass();
            c0052y.a();
            this.f1071w.play();
        }
    }

    public final void s() {
        if (this.f1038W) {
            return;
        }
        this.f1038W = true;
        long j3 = j();
        C0053z c0053z = this.f1054i;
        c0053z.f1169A = c0053z.b();
        c0053z.f1178J.getClass();
        c0053z.f1201y = w2.t.D(SystemClock.elapsedRealtime());
        c0053z.f1170B = j3;
        if (o(this.f1071w)) {
            this.f1039X = false;
        }
        this.f1071w.stop();
        this.f1022G = 0;
    }

    public final void t() {
        if (!this.f1037V && n() && c()) {
            s();
            this.f1037V = true;
        }
    }

    public final void u(long j3) throws C0049v {
        ByteBuffer byteBuffer;
        if (!this.f1070v.e()) {
            ByteBuffer byteBuffer2 = this.f1032Q;
            if (byteBuffer2 == null) {
                byteBuffer2 = u2.d.f17209a;
            }
            C(byteBuffer2, j3);
            return;
        }
        while (!this.f1070v.d()) {
            do {
                u2.a aVar = this.f1070v;
                if (aVar.e()) {
                    ByteBuffer byteBuffer3 = aVar.f17202c[aVar.c()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        aVar.f(u2.d.f17209a);
                        byteBuffer = aVar.f17202c[aVar.c()];
                    }
                } else {
                    byteBuffer = u2.d.f17209a;
                }
                if (byteBuffer.hasRemaining()) {
                    C(byteBuffer, j3);
                } else {
                    ByteBuffer byteBuffer4 = this.f1032Q;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    u2.a aVar2 = this.f1070v;
                    ByteBuffer byteBuffer5 = this.f1032Q;
                    if (aVar2.e() && !aVar2.f17203d) {
                        aVar2.f(byteBuffer5);
                    }
                }
            } while (!byteBuffer.hasRemaining());
            return;
        }
    }

    public final void v() {
        e();
        E4.G gListIterator = this.f1049f.listIterator(0);
        while (gListIterator.hasNext()) {
            ((u2.d) gListIterator.next()).d();
        }
        E4.G gListIterator2 = this.f1051g.listIterator(0);
        while (gListIterator2.hasNext()) {
            ((u2.d) gListIterator2.next()).d();
        }
        u2.a aVar = this.f1070v;
        if (aVar != null) {
            int i7 = 0;
            while (true) {
                b0 b0Var = aVar.f17200a;
                if (i7 >= b0Var.f1915r) {
                    break;
                }
                u2.d dVar = (u2.d) b0Var.get(i7);
                dVar.flush();
                dVar.d();
                i7++;
            }
            aVar.f17202c = new ByteBuffer[0];
            u2.b bVar = u2.b.f17204e;
            aVar.f17203d = false;
        }
        this.f1040Y = false;
        this.f1052g0 = false;
    }

    public final void w(C1476e c1476e) {
        if (this.f1016A.equals(c1476e)) {
            return;
        }
        this.f1016A = c1476e;
        if (this.f1046d0) {
            return;
        }
        C0040l c0040l = this.f1073y;
        if (c0040l != null) {
            c0040l.f1135i = c1476e;
            c0040l.a(C0035g.c(c0040l.f1128a, c1476e, c0040l.h));
        }
        e();
    }

    public final void x() {
        if (n()) {
            try {
                this.f1071w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.f1019D.f16348a).setPitch(this.f1019D.f16349b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e7) {
                AbstractC1697a.x("Failed to set playback params", e7);
            }
            t2.Q q7 = new t2.Q(this.f1071w.getPlaybackParams().getSpeed(), this.f1071w.getPlaybackParams().getPitch());
            this.f1019D = q7;
            float f7 = q7.f16348a;
            C0053z c0053z = this.f1054i;
            c0053z.f1187j = f7;
            C0052y c0052y = c0053z.f1184f;
            if (c0052y != null) {
                c0052y.a();
            }
            c0053z.d();
        }
    }

    public final void y(C1477f c1477f) {
        if (this.b0.equals(c1477f)) {
            return;
        }
        c1477f.getClass();
        if (this.f1071w != null) {
            this.b0.getClass();
        }
        this.b0 = c1477f;
    }

    public final void z(t2.Q q7) {
        this.f1019D = new t2.Q(w2.t.f(q7.f16348a, 0.1f, 8.0f), w2.t.f(q7.f16349b, 0.1f, 8.0f));
        if (B()) {
            x();
            return;
        }
        K k7 = new K(q7, -9223372036854775807L, -9223372036854775807L);
        if (n()) {
            this.f1017B = k7;
        } else {
            this.f1018C = k7;
        }
    }
}
