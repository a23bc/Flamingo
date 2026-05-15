package L2;

import A2.C0007h;
import A2.C0008i;
import A2.C0013n;
import A2.I;
import A2.K;
import A2.L;
import A2.O;
import A2.u0;
import E4.b0;
import H2.C0196m;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import t2.C1480i;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import t2.s0;
import w2.AbstractC1697a;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class m extends F2.t {

    /* JADX INFO: renamed from: A1 */
    public static boolean f4146A1;

    /* JADX INFO: renamed from: B1 */
    public static boolean f4147B1;

    /* JADX INFO: renamed from: z1 */
    public static final int[] f4148z1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final Context T0;

    /* JADX INFO: renamed from: U0 */
    public final boolean f4149U0;

    /* JADX INFO: renamed from: V0 */
    public final V.o f4150V0;

    /* JADX INFO: renamed from: W0 */
    public final int f4151W0;

    /* JADX INFO: renamed from: X0 */
    public final boolean f4152X0;

    /* JADX INFO: renamed from: Y0 */
    public final q f4153Y0;

    /* JADX INFO: renamed from: Z0 */
    public final p f4154Z0;

    /* JADX INFO: renamed from: a1 */
    public k f4155a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f4156b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f4157c1;

    /* JADX INFO: renamed from: d1 */
    public e f4158d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f4159e1;

    /* JADX INFO: renamed from: f1 */
    public List f4160f1;

    /* JADX INFO: renamed from: g1 */
    public Surface f4161g1;

    /* JADX INFO: renamed from: h1 */
    public o f4162h1;

    /* JADX INFO: renamed from: i1 */
    public w2.n f4163i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f4164j1;
    public int k1;

    /* JADX INFO: renamed from: l1 */
    public long f4165l1;

    /* JADX INFO: renamed from: m1 */
    public int f4166m1;

    /* JADX INFO: renamed from: n1 */
    public int f4167n1;

    /* JADX INFO: renamed from: o1 */
    public int f4168o1;

    /* JADX INFO: renamed from: p1 */
    public long f4169p1;

    /* JADX INFO: renamed from: q1 */
    public int f4170q1;

    /* JADX INFO: renamed from: r1 */
    public long f4171r1;

    /* JADX INFO: renamed from: s1 */
    public s0 f4172s1;

    /* JADX INFO: renamed from: t1 */
    public s0 f4173t1;

    /* JADX INFO: renamed from: u1 */
    public int f4174u1;

    /* JADX INFO: renamed from: v1 */
    public boolean f4175v1;
    public int w1;

    /* JADX INFO: renamed from: x1 */
    public l f4176x1;

    /* JADX INFO: renamed from: y1 */
    public L f4177y1;

    public m(YosPlaybackService yosPlaybackService, F2.i iVar, boolean z6, Handler handler, K k7) {
        super(2, iVar, z6, 30.0f);
        Context applicationContext = yosPlaybackService.getApplicationContext();
        this.T0 = applicationContext;
        this.f4151W0 = 50;
        this.f4150V0 = new V.o(handler, (y) k7);
        this.f4149U0 = true;
        this.f4153Y0 = new q(applicationContext, this);
        this.f4154Z0 = new p();
        this.f4152X0 = "NVIDIA".equals(w2.t.f18883c);
        this.f4163i1 = w2.n.f18870c;
        this.k1 = 1;
        this.f4172s1 = s0.f16725e;
        this.w1 = 0;
        this.f4173t1 = null;
        this.f4174u1 = -1000;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:878:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:879:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean v0(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 3206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.m.v0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int w0(F2.m mVar, C1487p c1487p) {
        int i7;
        int iIntValue;
        int i8 = c1487p.f16707s;
        if (i8 != -1 && (i7 = c1487p.f16708t) != -1) {
            String str = c1487p.f16701m;
            str.getClass();
            if ("video/dolby-vision".equals(str)) {
                Pair pairD = F2.A.d(c1487p);
                str = (pairD == null || !((iIntValue = ((Integer) pairD.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
            switch (str) {
                case "video/3gpp":
                case "video/av01":
                case "video/mp4v-es":
                case "video/x-vnd.on2.vp8":
                    return ((i8 * i7) * 3) / 4;
                case "video/hevc":
                    return Math.max(2097152, ((i8 * i7) * 3) / 4);
                case "video/avc":
                    String str2 = w2.t.f18884d;
                    if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(w2.t.f18883c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !mVar.f2230f)))) {
                        return ((w2.t.e(i7, 16) * w2.t.e(i8, 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    return ((i8 * i7) * 3) / 8;
            }
        }
        return -1;
    }

    public static List x0(Context context, F2.u uVar, C1487p c1487p, boolean z6, boolean z7) {
        List listE;
        String str = c1487p.f16701m;
        if (str == null) {
            return b0.f1913s;
        }
        if (w2.t.f18881a >= 26 && "video/dolby-vision".equals(str) && !j.a(context)) {
            String strB = F2.A.b(c1487p);
            if (strB == null) {
                listE = b0.f1913s;
            } else {
                uVar.getClass();
                listE = F2.A.e(strB, z6, z7);
            }
            if (!listE.isEmpty()) {
                return listE;
            }
        }
        return F2.A.g(uVar, c1487p, z6, z7);
    }

    public static int y0(F2.m mVar, C1487p c1487p) {
        if (c1487p.f16702n == -1) {
            return w0(mVar, c1487p);
        }
        List list = c1487p.f16704p;
        int size = list.size();
        int length = 0;
        for (int i7 = 0; i7 < size; i7++) {
            length += ((byte[]) list.get(i7)).length;
        }
        return c1487p.f16702n + length;
    }

    public final void A0(s0 s0Var) {
        if (s0Var.equals(s0.f16725e) || s0Var.equals(this.f4173t1)) {
            return;
        }
        this.f4173t1 = s0Var;
        this.f4150V0.O(s0Var);
    }

    public final void B0() {
        int i7;
        F2.j jVar;
        if (!this.f4175v1 || (i7 = w2.t.f18881a) < 23 || (jVar = this.Z) == null) {
            return;
        }
        this.f4176x1 = new l(this, jVar);
        if (i7 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            jVar.d(bundle);
        }
    }

    public final void C0() {
        Surface surface = this.f4161g1;
        o oVar = this.f4162h1;
        if (surface == oVar) {
            this.f4161g1 = null;
        }
        if (oVar != null) {
            oVar.release();
            this.f4162h1 = null;
        }
    }

    @Override // F2.t
    public final C0008i D(F2.m mVar, C1487p c1487p, C1487p c1487p2) {
        C0008i c0008iB = mVar.b(c1487p, c1487p2);
        k kVar = this.f4155a1;
        kVar.getClass();
        int i7 = c1487p2.f16707s;
        int i8 = kVar.f4141a;
        int i9 = c0008iB.f310e;
        if (i7 > i8 || c1487p2.f16708t > kVar.f4142b) {
            i9 |= 256;
        }
        if (y0(mVar, c1487p2) > kVar.f4143c) {
            i9 |= 64;
        }
        int i10 = i9;
        return new C0008i(mVar.f2225a, c1487p, c1487p2, i10 != 0 ? 0 : c0008iB.f309d, i10);
    }

    public final void D0(F2.j jVar, int i7) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        jVar.j(i7, true);
        Trace.endSection();
        this.f2266O0.f297e++;
        this.f4167n1 = 0;
        if (this.f4158d1 == null) {
            A0(this.f4172s1);
            q qVar = this.f4153Y0;
            boolean z6 = qVar.f4193d != 3;
            qVar.f4193d = 3;
            qVar.f4199k.getClass();
            qVar.f4195f = w2.t.D(SystemClock.elapsedRealtime());
            if (!z6 || (surface = this.f4161g1) == null) {
                return;
            }
            V.o oVar = this.f4150V0;
            Handler handler = (Handler) oVar.f7342p;
            if (handler != null) {
                handler.post(new x(oVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f4164j1 = true;
        }
    }

    @Override // F2.t
    public final F2.l E(IllegalStateException illegalStateException, F2.m mVar) {
        Surface surface = this.f4161g1;
        i iVar = new i(illegalStateException, mVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return iVar;
    }

    public final void E0(F2.j jVar, int i7, long j3) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        jVar.g(j3, i7);
        Trace.endSection();
        this.f2266O0.f297e++;
        this.f4167n1 = 0;
        if (this.f4158d1 == null) {
            A0(this.f4172s1);
            q qVar = this.f4153Y0;
            boolean z6 = qVar.f4193d != 3;
            qVar.f4193d = 3;
            qVar.f4199k.getClass();
            qVar.f4195f = w2.t.D(SystemClock.elapsedRealtime());
            if (!z6 || (surface = this.f4161g1) == null) {
                return;
            }
            V.o oVar = this.f4150V0;
            Handler handler = (Handler) oVar.f7342p;
            if (handler != null) {
                handler.post(new x(oVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f4164j1 = true;
        }
    }

    public final boolean F0(F2.m mVar) {
        if (w2.t.f18881a < 23 || this.f4175v1 || v0(mVar.f2225a)) {
            return false;
        }
        return !mVar.f2230f || o.a(this.T0);
    }

    public final void G0(F2.j jVar, int i7) {
        Trace.beginSection("skipVideoBuffer");
        jVar.j(i7, false);
        Trace.endSection();
        this.f2266O0.f298f++;
    }

    public final void H0(int i7, int i8) {
        C0007h c0007h = this.f2266O0;
        c0007h.h += i7;
        int i9 = i7 + i8;
        c0007h.f299g += i9;
        this.f4166m1 += i9;
        int i10 = this.f4167n1 + i9;
        this.f4167n1 = i10;
        c0007h.f300i = Math.max(i10, c0007h.f300i);
        int i11 = this.f4151W0;
        if (i11 <= 0 || this.f4166m1 < i11) {
            return;
        }
        z0();
    }

    public final void I0(long j3) {
        C0007h c0007h = this.f2266O0;
        c0007h.f302k += j3;
        c0007h.l++;
        this.f4169p1 += j3;
        this.f4170q1++;
    }

    @Override // F2.t
    public final int M(z2.f fVar) {
        return (w2.t.f18881a < 34 || !this.f4175v1 || fVar.f21117u >= this.f291z) ? 0 : 32;
    }

    @Override // F2.t
    public final boolean N() {
        return this.f4175v1 && w2.t.f18881a < 23;
    }

    @Override // F2.t
    public final float O(float f7, C1487p[] c1487pArr) {
        float fMax = -1.0f;
        for (C1487p c1487p : c1487pArr) {
            float f8 = c1487p.f16709u;
            if (f8 != -1.0f) {
                fMax = Math.max(fMax, f8);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f7;
    }

    @Override // F2.t
    public final ArrayList P(F2.u uVar, C1487p c1487p, boolean z6) {
        List listX0 = x0(this.T0, uVar, c1487p, z6, this.f4175v1);
        Pattern pattern = F2.A.f2177a;
        ArrayList arrayList = new ArrayList(listX0);
        Collections.sort(arrayList, new F2.v(0, new I(8, c1487p)));
        return arrayList;
    }

    @Override // F2.t
    public final F2.h Q(F2.m mVar, C1487p c1487p, MediaCrypto mediaCrypto, float f7) {
        boolean z6;
        int i7;
        C1480i c1480i;
        int iMax;
        k kVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i8;
        int i9;
        byte b7;
        boolean z7;
        Pair pairD;
        int iW0;
        o oVar = this.f4162h1;
        boolean z8 = mVar.f2230f;
        if (oVar != null && oVar.f4185o != z8) {
            C0();
        }
        String str = mVar.f2227c;
        C1487p[] c1487pArr = this.f289x;
        c1487pArr.getClass();
        int iMax2 = c1487p.f16707s;
        int iY0 = y0(mVar, c1487p);
        int length = c1487pArr.length;
        float f8 = c1487p.f16709u;
        int i10 = c1487p.f16707s;
        C1480i c1480i2 = c1487p.f16714z;
        int i11 = c1487p.f16708t;
        if (length == 1) {
            if (iY0 != -1 && (iW0 = w0(mVar, c1487p)) != -1) {
                iY0 = Math.min((int) (iY0 * 1.5f), iW0);
            }
            z6 = z8;
            kVar = new k(iMax2, i11, iY0);
            i7 = i11;
            c1480i = c1480i2;
        } else {
            int length2 = c1487pArr.length;
            int iMax3 = i11;
            int i12 = 0;
            boolean z9 = false;
            while (i12 < length2) {
                C1487p c1487p2 = c1487pArr[i12];
                C1487p[] c1487pArr2 = c1487pArr;
                if (c1480i2 != null && c1487p2.f16714z == null) {
                    C1486o c1486oA = c1487p2.a();
                    c1486oA.f16639y = c1480i2;
                    c1487p2 = new C1487p(c1486oA);
                }
                if (mVar.b(c1487p, c1487p2).f309d != 0) {
                    int i13 = c1487p2.f16708t;
                    i8 = length2;
                    int i14 = c1487p2.f16707s;
                    i9 = i12;
                    b7 = -1;
                    z9 |= i14 == -1 || i13 == -1;
                    iMax2 = Math.max(iMax2, i14);
                    iMax3 = Math.max(iMax3, i13);
                    iY0 = Math.max(iY0, y0(mVar, c1487p2));
                } else {
                    i8 = length2;
                    i9 = i12;
                    b7 = -1;
                }
                length2 = i8;
                i12 = i9 + 1;
                c1487pArr = c1487pArr2;
            }
            int i15 = iMax3;
            if (z9) {
                AbstractC1697a.w("Resolutions unknown. Codec max resolution: " + iMax2 + "x" + i15);
                boolean z10 = i11 > i10;
                int i16 = z10 ? i11 : i10;
                boolean z11 = z10;
                int i17 = z10 ? i10 : i11;
                z6 = z8;
                float f9 = i17 / i16;
                int[] iArr = f4148z1;
                int i18 = 0;
                while (i18 < 9) {
                    int i19 = iArr[i18];
                    int i20 = i18;
                    int i21 = (int) (i19 * f9);
                    if (i19 <= i16 || i21 <= i17) {
                        break;
                    }
                    int i22 = i17;
                    int i23 = i16;
                    if (w2.t.f18881a >= 21) {
                        int i24 = z11 ? i21 : i19;
                        if (!z11) {
                            i19 = i21;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f2228d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            c1480i = c1480i2;
                            point = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            c1480i = c1480i2;
                            point = new Point(w2.t.e(i24, widthAlignment) * widthAlignment, w2.t.e(i19, heightAlignment) * heightAlignment);
                        }
                        if (point != null) {
                            i7 = i11;
                            if (mVar.f(point.x, point.y, f8)) {
                                break;
                            }
                        } else {
                            i7 = i11;
                        }
                        i18 = i20 + 1;
                        i11 = i7;
                        i17 = i22;
                        i16 = i23;
                        c1480i2 = c1480i;
                    } else {
                        i7 = i11;
                        c1480i = c1480i2;
                        try {
                            int iE = w2.t.e(i19, 16) * 16;
                            int iE2 = w2.t.e(i21, 16) * 16;
                            if (iE * iE2 <= F2.A.j()) {
                                int i25 = z11 ? iE2 : iE;
                                if (!z11) {
                                    iE = iE2;
                                }
                                point = new Point(i25, iE);
                            } else {
                                i18 = i20 + 1;
                                i11 = i7;
                                i17 = i22;
                                i16 = i23;
                                c1480i2 = c1480i;
                            }
                        } catch (F2.x unused) {
                            point = null;
                        }
                    }
                }
                i7 = i11;
                c1480i = c1480i2;
                point = null;
                if (point != null) {
                    iMax2 = Math.max(iMax2, point.x);
                    iMax = Math.max(i15, point.y);
                    C1486o c1486oA2 = c1487p.a();
                    c1486oA2.f16632r = iMax2;
                    c1486oA2.f16633s = iMax;
                    iY0 = Math.max(iY0, w0(mVar, new C1487p(c1486oA2)));
                    AbstractC1697a.w("Codec max resolution adjusted to: " + iMax2 + "x" + iMax);
                }
                kVar = new k(iMax2, iMax, iY0);
            } else {
                z6 = z8;
                i7 = i11;
                c1480i = c1480i2;
            }
            iMax = i15;
            kVar = new k(iMax2, iMax, iY0);
        }
        this.f4155a1 = kVar;
        int i26 = this.f4175v1 ? this.w1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i10);
        mediaFormat.setInteger("height", i7);
        AbstractC1697a.u(mediaFormat, c1487p.f16704p);
        if (f8 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f8);
        }
        AbstractC1697a.t(mediaFormat, "rotation-degrees", c1487p.f16710v);
        if (c1480i != null) {
            C1480i c1480i3 = c1480i;
            AbstractC1697a.t(mediaFormat, "color-transfer", c1480i3.f16483c);
            AbstractC1697a.t(mediaFormat, "color-standard", c1480i3.f16481a);
            AbstractC1697a.t(mediaFormat, "color-range", c1480i3.f16482b);
            byte[] bArr = c1480i3.f16484d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c1487p.f16701m) && (pairD = F2.A.d(c1487p)) != null) {
            AbstractC1697a.t(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", kVar.f4141a);
        mediaFormat.setInteger("max-height", kVar.f4142b);
        AbstractC1697a.t(mediaFormat, "max-input-size", kVar.f4143c);
        int i27 = w2.t.f18881a;
        if (i27 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f7 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f7);
            }
        }
        if (this.f4152X0) {
            z7 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z7 = true;
        }
        if (i26 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z7);
            mediaFormat.setInteger("audio-session-id", i26);
        }
        if (i27 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f4174u1));
        }
        if (this.f4161g1 == null) {
            if (!F0(mVar)) {
                throw new IllegalStateException();
            }
            if (this.f4162h1 == null) {
                this.f4162h1 = o.c(this.T0, z6);
            }
            this.f4161g1 = this.f4162h1;
        }
        e eVar = this.f4158d1;
        if (eVar != null && !w2.t.A(eVar.f4109a)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (this.f4158d1 == null) {
            return new F2.h(mVar, mediaFormat, c1487p, this.f4161g1, mediaCrypto);
        }
        AbstractC1697a.i(false);
        AbstractC1697a.j(null);
        throw null;
    }

    @Override // F2.t
    public final void R(z2.f fVar) {
        if (this.f4157c1) {
            ByteBuffer byteBuffer = fVar.f21118v;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b7 = byteBuffer.get();
                short s7 = byteBuffer.getShort();
                short s8 = byteBuffer.getShort();
                byte b8 = byteBuffer.get();
                byte b9 = byteBuffer.get();
                byteBuffer.position(0);
                if (b7 == -75 && s7 == 60 && s8 == 1 && b8 == 4) {
                    if (b9 == 0 || b9 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        F2.j jVar = this.Z;
                        jVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        jVar.d(bundle);
                    }
                }
            }
        }
    }

    @Override // F2.t
    public final void W(Exception exc) {
        AbstractC1697a.n("Video codec error", exc);
        V.o oVar = this.f4150V0;
        Handler handler = (Handler) oVar.f7342p;
        if (handler != null) {
            handler.post(new w(oVar, exc, 3));
        }
    }

    @Override // F2.t
    public final void X(long j3, String str, long j7) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        V.o oVar = this.f4150V0;
        Handler handler = (Handler) oVar.f7342p;
        if (handler != null) {
            str2 = str;
            handler.post(new w(oVar, str2, j3, j7));
        } else {
            str2 = str;
        }
        this.f4156b1 = v0(str2);
        F2.m mVar = this.f2284g0;
        mVar.getClass();
        boolean z6 = false;
        if (w2.t.f18881a >= 29 && "video/x-vnd.on2.vp9".equals(mVar.f2226b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mVar.f2228d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i7].profile == 16384) {
                    z6 = true;
                    break;
                }
                i7++;
            }
        }
        this.f4157c1 = z6;
        B0();
    }

    @Override // F2.t
    public final void Y(String str) {
        V.o oVar = this.f4150V0;
        Handler handler = (Handler) oVar.f7342p;
        if (handler != null) {
            handler.post(new w(oVar, str, 6));
        }
    }

    @Override // F2.t
    public final C0008i Z(V.o oVar) throws C0013n {
        C0008i c0008iZ = super.Z(oVar);
        C1487p c1487p = (C1487p) oVar.f7343q;
        c1487p.getClass();
        V.o oVar2 = this.f4150V0;
        Handler handler = (Handler) oVar2.f7342p;
        if (handler != null) {
            handler.post(new w(oVar2, c1487p, c0008iZ));
        }
        return c0008iZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [F2.j] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12, types: [L2.o] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // A2.AbstractC0006g, A2.q0
    public final void a(int i7, Object obj) throws C0013n {
        Handler handler;
        q qVar = this.f4153Y0;
        if (i7 == 1) {
            ?? C5 = obj instanceof Surface ? (Surface) obj : 0;
            if (C5 == 0) {
                o oVar = this.f4162h1;
                if (oVar != null) {
                    C5 = oVar;
                } else {
                    F2.m mVar = this.f2284g0;
                    if (mVar != null && F0(mVar)) {
                        C5 = o.c(this.T0, mVar.f2230f);
                        this.f4162h1 = C5;
                    }
                }
            }
            Surface surface = this.f4161g1;
            V.o oVar2 = this.f4150V0;
            if (surface == C5) {
                if (C5 == 0 || C5 == this.f4162h1) {
                    return;
                }
                s0 s0Var = this.f4173t1;
                if (s0Var != null) {
                    oVar2.O(s0Var);
                }
                Surface surface2 = this.f4161g1;
                if (surface2 == null || !this.f4164j1 || (handler = (Handler) oVar2.f7342p) == null) {
                    return;
                }
                handler.post(new x(oVar2, surface2, SystemClock.elapsedRealtime()));
                return;
            }
            this.f4161g1 = C5;
            if (this.f4158d1 == null) {
                u uVar = qVar.f4191b;
                uVar.getClass();
                ?? r52 = C5 instanceof o ? 0 : C5;
                if (uVar.f4211e != r52) {
                    uVar.b();
                    uVar.f4211e = r52;
                    uVar.d(true);
                }
                qVar.c(1);
            }
            this.f4164j1 = false;
            int i8 = this.f287v;
            ?? r22 = this.Z;
            if (r22 != 0 && this.f4158d1 == null) {
                if (w2.t.f18881a < 23 || C5 == 0 || this.f4156b1) {
                    j0();
                    U();
                } else {
                    r22.B(C5);
                }
            }
            if (C5 == 0 || C5 == this.f4162h1) {
                this.f4173t1 = null;
                e eVar = this.f4158d1;
                if (eVar != null) {
                    f fVar = eVar.f4117j;
                    fVar.getClass();
                    int i9 = w2.n.f18870c.f18871a;
                    fVar.f4127j = null;
                }
            } else {
                s0 s0Var2 = this.f4173t1;
                if (s0Var2 != null) {
                    oVar2.O(s0Var2);
                }
                if (i8 == 2) {
                    qVar.b(true);
                }
            }
            B0();
            return;
        }
        if (i7 == 7) {
            obj.getClass();
            L l = (L) obj;
            this.f4177y1 = l;
            e eVar2 = this.f4158d1;
            if (eVar2 != null) {
                eVar2.f4117j.h = l;
                return;
            }
            return;
        }
        if (i7 == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.w1 != iIntValue) {
                this.w1 = iIntValue;
                if (this.f4175v1) {
                    j0();
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 16) {
            obj.getClass();
            this.f4174u1 = ((Integer) obj).intValue();
            F2.j jVar = this.Z;
            if (jVar != null && w2.t.f18881a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f4174u1));
                jVar.d(bundle);
                return;
            }
            return;
        }
        if (i7 == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.k1 = iIntValue2;
            F2.j jVar2 = this.Z;
            if (jVar2 != null) {
                jVar2.n(iIntValue2);
                return;
            }
            return;
        }
        if (i7 == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            u uVar2 = qVar.f4191b;
            if (uVar2.f4215j == iIntValue3) {
                return;
            }
            uVar2.f4215j = iIntValue3;
            uVar2.d(true);
            return;
        }
        if (i7 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f4160f1 = list;
            e eVar3 = this.f4158d1;
            if (eVar3 != null) {
                ArrayList arrayList = eVar3.f4111c;
                if (arrayList.equals(list)) {
                    return;
                }
                arrayList.clear();
                arrayList.addAll(list);
                eVar3.c();
                return;
            }
            return;
        }
        if (i7 != 14) {
            if (i7 == 11) {
                this.f2275U = (O) obj;
                return;
            }
            return;
        }
        obj.getClass();
        w2.n nVar = (w2.n) obj;
        if (nVar.f18871a == 0 || nVar.f18872b == 0) {
            return;
        }
        this.f4163i1 = nVar;
        e eVar4 = this.f4158d1;
        if (eVar4 != null) {
            Surface surface3 = this.f4161g1;
            AbstractC1697a.j(surface3);
            eVar4.e(surface3, nVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0109  */
    @Override // F2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a0(t2.C1487p r10, android.media.MediaFormat r11) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: L2.m.a0(t2.p, android.media.MediaFormat):void");
    }

    @Override // A2.AbstractC0006g
    public final void c() {
        e eVar = this.f4158d1;
        if (eVar != null) {
            q qVar = eVar.f4117j.f4120b;
            if (qVar.f4193d == 0) {
                qVar.f4193d = 1;
                return;
            }
            return;
        }
        q qVar2 = this.f4153Y0;
        if (qVar2.f4193d == 0) {
            qVar2.f4193d = 1;
        }
    }

    @Override // F2.t
    public final void c0(long j3) {
        super.c0(j3);
        if (this.f4175v1) {
            return;
        }
        this.f4168o1--;
    }

    @Override // F2.t
    public final void d0() {
        if (this.f4158d1 != null) {
            long j3 = this.f2268P0.f2240c;
        } else {
            this.f4153Y0.c(2);
        }
        B0();
    }

    @Override // A2.AbstractC0006g
    public final String e() {
        return "MediaCodecVideoRenderer";
    }

    @Override // F2.t
    public final void e0(z2.f fVar) {
        Surface surface;
        boolean z6 = this.f4175v1;
        if (!z6) {
            this.f4168o1++;
        }
        if (w2.t.f18881a >= 23 || !z6) {
            return;
        }
        long j3 = fVar.f21117u;
        u0(j3);
        A0(this.f4172s1);
        this.f2266O0.f297e++;
        q qVar = this.f4153Y0;
        boolean z7 = qVar.f4193d != 3;
        qVar.f4193d = 3;
        qVar.f4199k.getClass();
        qVar.f4195f = w2.t.D(SystemClock.elapsedRealtime());
        if (z7 && (surface = this.f4161g1) != null) {
            V.o oVar = this.f4150V0;
            Handler handler = (Handler) oVar.f7342p;
            if (handler != null) {
                handler.post(new x(oVar, surface, SystemClock.elapsedRealtime()));
            }
            this.f4164j1 = true;
        }
        c0(j3);
    }

    @Override // F2.t
    public final void f0(C1487p c1487p) throws C0013n {
        e eVar = this.f4158d1;
        if (eVar == null) {
            return;
        }
        try {
            eVar.b(c1487p);
            throw null;
        } catch (A e7) {
            throw b(e7, c1487p, false, 7000);
        }
    }

    @Override // A2.AbstractC0006g
    public final boolean g() {
        return this.f2258K0 && this.f4158d1 == null;
    }

    @Override // F2.t
    public final boolean h0(long j3, long j7, F2.j jVar, ByteBuffer byteBuffer, int i7, int i8, int i9, long j8, boolean z6, boolean z7, C1487p c1487p) throws C0013n {
        jVar.getClass();
        F2.s sVar = this.f2268P0;
        long j9 = sVar.f2240c;
        int iA = this.f4153Y0.a(j8, j3, j7, sVar.f2239b, z7, this.f4154Z0);
        if (iA != 4) {
            if (z6 && !z7) {
                G0(jVar, i7);
                return true;
            }
            Surface surface = this.f4161g1;
            o oVar = this.f4162h1;
            p pVar = this.f4154Z0;
            if (surface != oVar || this.f4158d1 != null) {
                e eVar = this.f4158d1;
                if (eVar != null) {
                    try {
                        eVar.d(j3, j7);
                        e eVar2 = this.f4158d1;
                        eVar2.getClass();
                        AbstractC1697a.i(false);
                        AbstractC1697a.i(eVar2.f4110b != -1);
                        long j10 = eVar2.f4115g;
                        if (j10 != -9223372036854775807L) {
                            f fVar = eVar2.f4117j;
                            if (fVar.f4128k == 0) {
                                long j11 = fVar.f4121c.f4230j;
                                if (j11 != -9223372036854775807L && j11 >= j10) {
                                    eVar2.c();
                                    eVar2.f4115g = -9223372036854775807L;
                                }
                            }
                            return false;
                        }
                        AbstractC1697a.j(null);
                        throw null;
                    } catch (A e7) {
                        throw b(e7, e7.f4103o, false, 7001);
                    }
                }
                if (iA == 0) {
                    this.f286u.getClass();
                    long jNanoTime = System.nanoTime();
                    L l = this.f4177y1;
                    if (l != null) {
                        l.d();
                    }
                    if (w2.t.f18881a >= 21) {
                        E0(jVar, i7, jNanoTime);
                    } else {
                        D0(jVar, i7);
                    }
                    I0(pVar.f4188a);
                    return true;
                }
                if (iA == 1) {
                    long j12 = pVar.f4189b;
                    long j13 = pVar.f4188a;
                    if (w2.t.f18881a >= 21) {
                        if (j12 == this.f4171r1) {
                            G0(jVar, i7);
                        } else {
                            L l7 = this.f4177y1;
                            if (l7 != null) {
                                l7.d();
                            }
                            E0(jVar, i7, j12);
                        }
                        I0(j13);
                        this.f4171r1 = j12;
                        return true;
                    }
                    if (j13 < 30000) {
                        if (j13 > 11000) {
                            try {
                                Thread.sleep((j13 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        }
                        L l8 = this.f4177y1;
                        if (l8 != null) {
                            l8.d();
                        }
                        D0(jVar, i7);
                        I0(j13);
                        return true;
                    }
                } else {
                    if (iA == 2) {
                        Trace.beginSection("dropVideoBuffer");
                        jVar.j(i7, false);
                        Trace.endSection();
                        H0(0, 1);
                        I0(pVar.f4188a);
                        return true;
                    }
                    if (iA == 3) {
                        G0(jVar, i7);
                        I0(pVar.f4188a);
                        return true;
                    }
                    if (iA != 5) {
                        throw new IllegalStateException(String.valueOf(iA));
                    }
                }
            } else if (pVar.f4188a < 30000) {
                G0(jVar, i7);
                I0(pVar.f4188a);
                return true;
            }
        }
        return false;
    }

    @Override // F2.t, A2.AbstractC0006g
    public final boolean i() {
        o oVar;
        boolean z6 = super.i() && this.f4158d1 == null;
        if (z6 && (((oVar = this.f4162h1) != null && this.f4161g1 == oVar) || this.Z == null || this.f4175v1)) {
            return true;
        }
        q qVar = this.f4153Y0;
        if (z6 && qVar.f4193d == 3) {
            qVar.h = -9223372036854775807L;
            return true;
        }
        if (qVar.h == -9223372036854775807L) {
            return false;
        }
        qVar.f4199k.getClass();
        if (SystemClock.elapsedRealtime() < qVar.h) {
            return true;
        }
        qVar.h = -9223372036854775807L;
        return false;
    }

    @Override // F2.t
    public final void l0() {
        super.l0();
        this.f4168o1 = 0;
    }

    @Override // F2.t, A2.AbstractC0006g
    public final void n() {
        V.o oVar = this.f4150V0;
        this.f4173t1 = null;
        e eVar = this.f4158d1;
        if (eVar != null) {
            eVar.f4117j.f4120b.c(0);
        } else {
            this.f4153Y0.c(0);
        }
        B0();
        this.f4164j1 = false;
        this.f4176x1 = null;
        try {
            super.n();
        } finally {
            oVar.i(this.f2266O0);
            oVar.O(s0.f16725e);
        }
    }

    @Override // A2.AbstractC0006g
    public final void o(boolean z6, boolean z7) {
        this.f2266O0 = new C0007h();
        u0 u0Var = this.f283r;
        u0Var.getClass();
        boolean z8 = u0Var.f455b;
        AbstractC1697a.i((z8 && this.w1 == 0) ? false : true);
        if (this.f4175v1 != z8) {
            this.f4175v1 = z8;
            j0();
        }
        C0007h c0007h = this.f2266O0;
        V.o oVar = this.f4150V0;
        Handler handler = (Handler) oVar.f7342p;
        if (handler != null) {
            handler.post(new w(oVar, c0007h, 4));
        }
        boolean z9 = this.f4159e1;
        q qVar = this.f4153Y0;
        if (!z9) {
            if ((this.f4160f1 != null || !this.f4149U0) && this.f4158d1 == null) {
                C0196m c0196m = new C0196m(this.T0, qVar);
                w2.o oVar2 = this.f286u;
                oVar2.getClass();
                c0196m.f3209g = oVar2;
                AbstractC1697a.i(!c0196m.f3204b);
                if (((c) c0196m.f3208f) == null) {
                    if (((b) c0196m.f3207e) == null) {
                        c0196m.f3207e = new b();
                    }
                    c0196m.f3208f = new c((b) c0196m.f3207e);
                }
                f fVar = new f(c0196m);
                c0196m.f3204b = true;
                this.f4158d1 = fVar.f4119a;
            }
            this.f4159e1 = true;
        }
        e eVar = this.f4158d1;
        if (eVar == null) {
            w2.o oVar3 = this.f286u;
            oVar3.getClass();
            qVar.f4199k = oVar3;
            qVar.f4193d = z7 ? 1 : 0;
            return;
        }
        C0247a c0247a = new C0247a(1, this);
        I4.r rVar = I4.r.f3531o;
        eVar.h = c0247a;
        eVar.f4116i = rVar;
        L l = this.f4177y1;
        if (l != null) {
            eVar.f4117j.h = l;
        }
        if (this.f4161g1 != null && !this.f4163i1.equals(w2.n.f18870c)) {
            this.f4158d1.e(this.f4161g1, this.f4163i1);
        }
        e eVar2 = this.f4158d1;
        float f7 = this.f2278X;
        v vVar = eVar2.f4117j.f4121c;
        vVar.getClass();
        AbstractC1697a.d(f7 > 0.0f);
        q qVar2 = vVar.f4223b;
        if (f7 != qVar2.f4198j) {
            qVar2.f4198j = f7;
            u uVar = qVar2.f4191b;
            uVar.f4214i = f7;
            uVar.f4217m = 0L;
            uVar.f4220p = -1L;
            uVar.f4218n = -1L;
            uVar.d(false);
        }
        List list = this.f4160f1;
        if (list != null) {
            e eVar3 = this.f4158d1;
            ArrayList arrayList = eVar3.f4111c;
            if (!arrayList.equals(list)) {
                arrayList.clear();
                arrayList.addAll(list);
                eVar3.c();
            }
        }
        this.f4158d1.f4117j.f4120b.f4193d = z7 ? 1 : 0;
    }

    @Override // F2.t, A2.AbstractC0006g
    public final void p(long j3, boolean z6) throws C0013n {
        e eVar = this.f4158d1;
        if (eVar != null) {
            eVar.a(true);
            e eVar2 = this.f4158d1;
            long j7 = this.f2268P0.f2240c;
            eVar2.getClass();
        }
        super.p(j3, z6);
        e eVar3 = this.f4158d1;
        q qVar = this.f4153Y0;
        if (eVar3 == null) {
            u uVar = qVar.f4191b;
            uVar.f4217m = 0L;
            uVar.f4220p = -1L;
            uVar.f4218n = -1L;
            qVar.f4196g = -9223372036854775807L;
            qVar.f4194e = -9223372036854775807L;
            qVar.c(1);
            qVar.h = -9223372036854775807L;
        }
        if (z6) {
            qVar.b(false);
        }
        B0();
        this.f4167n1 = 0;
    }

    @Override // F2.t
    public final boolean p0(F2.m mVar) {
        return this.f4161g1 != null || F0(mVar);
    }

    @Override // A2.AbstractC0006g
    public final void q() {
        e eVar = this.f4158d1;
        if (eVar == null || !this.f4149U0) {
            return;
        }
        f fVar = eVar.f4117j;
        if (fVar.l == 2) {
            return;
        }
        w2.q qVar = fVar.f4126i;
        if (qVar != null) {
            qVar.f18876a.removeCallbacksAndMessages(null);
        }
        fVar.f4127j = null;
        fVar.l = 2;
    }

    @Override // A2.AbstractC0006g
    public final void r() {
        try {
            try {
                F();
                j0();
            } finally {
                A0.e.K(this.f2274T, null);
                this.f2274T = null;
            }
        } finally {
            this.f4159e1 = false;
            if (this.f4162h1 != null) {
                C0();
            }
        }
    }

    @Override // F2.t
    public final int r0(F2.u uVar, C1487p c1487p) {
        boolean z6;
        int i7 = 0;
        if (!M.i(c1487p.f16701m)) {
            return A0.e.r(0, 0, 0, 0);
        }
        boolean z7 = c1487p.f16705q != null;
        Context context = this.T0;
        List listX0 = x0(context, uVar, c1487p, z7, false);
        if (z7 && listX0.isEmpty()) {
            listX0 = x0(context, uVar, c1487p, false, false);
        }
        if (listX0.isEmpty()) {
            return A0.e.r(1, 0, 0, 0);
        }
        int i8 = c1487p.f16689J;
        if (i8 != 0 && i8 != 2) {
            return A0.e.r(2, 0, 0, 0);
        }
        F2.m mVar = (F2.m) listX0.get(0);
        boolean zD = mVar.d(c1487p);
        if (zD) {
            z6 = true;
        } else {
            for (int i9 = 1; i9 < listX0.size(); i9++) {
                F2.m mVar2 = (F2.m) listX0.get(i9);
                if (mVar2.d(c1487p)) {
                    zD = true;
                    z6 = false;
                    mVar = mVar2;
                    break;
                }
            }
            z6 = true;
        }
        int i10 = zD ? 4 : 3;
        int i11 = mVar.e(c1487p) ? 16 : 8;
        int i12 = mVar.f2231g ? 64 : 0;
        int i13 = z6 ? 128 : 0;
        if (w2.t.f18881a >= 26 && "video/dolby-vision".equals(c1487p.f16701m) && !j.a(context)) {
            i13 = 256;
        }
        if (zD) {
            List listX02 = x0(context, uVar, c1487p, z7, true);
            if (!listX02.isEmpty()) {
                Pattern pattern = F2.A.f2177a;
                ArrayList arrayList = new ArrayList(listX02);
                Collections.sort(arrayList, new F2.v(0, new I(8, c1487p)));
                F2.m mVar3 = (F2.m) arrayList.get(0);
                if (mVar3.d(c1487p) && mVar3.e(c1487p)) {
                    i7 = 32;
                }
            }
        }
        return i10 | i11 | i7 | i12 | i13;
    }

    @Override // A2.AbstractC0006g
    public final void s() {
        this.f4166m1 = 0;
        this.f286u.getClass();
        this.f4165l1 = SystemClock.elapsedRealtime();
        this.f4169p1 = 0L;
        this.f4170q1 = 0;
        e eVar = this.f4158d1;
        if (eVar != null) {
            eVar.f4117j.f4120b.d();
        } else {
            this.f4153Y0.d();
        }
    }

    @Override // A2.AbstractC0006g
    public final void t() {
        z0();
        int i7 = this.f4170q1;
        if (i7 != 0) {
            long j3 = this.f4169p1;
            V.o oVar = this.f4150V0;
            Handler handler = (Handler) oVar.f7342p;
            if (handler != null) {
                handler.post(new w(oVar, j3, i7));
            }
            this.f4169p1 = 0L;
            this.f4170q1 = 0;
        }
        e eVar = this.f4158d1;
        if (eVar != null) {
            eVar.f4117j.f4120b.e();
        } else {
            this.f4153Y0.e();
        }
    }

    @Override // F2.t, A2.AbstractC0006g
    public final void w(long j3, long j7) throws C0013n {
        super.w(j3, j7);
        e eVar = this.f4158d1;
        if (eVar != null) {
            try {
                eVar.d(j3, j7);
            } catch (A e7) {
                throw b(e7, e7.f4103o, false, 7001);
            }
        }
    }

    @Override // F2.t, A2.AbstractC0006g
    public final void z(float f7, float f8) throws C0013n {
        super.z(f7, f8);
        e eVar = this.f4158d1;
        if (eVar == null) {
            q qVar = this.f4153Y0;
            if (f7 == qVar.f4198j) {
                return;
            }
            qVar.f4198j = f7;
            u uVar = qVar.f4191b;
            uVar.f4214i = f7;
            uVar.f4217m = 0L;
            uVar.f4220p = -1L;
            uVar.f4218n = -1L;
            uVar.d(false);
            return;
        }
        v vVar = eVar.f4117j.f4121c;
        vVar.getClass();
        AbstractC1697a.d(f7 > 0.0f);
        q qVar2 = vVar.f4223b;
        if (f7 == qVar2.f4198j) {
            return;
        }
        qVar2.f4198j = f7;
        u uVar2 = qVar2.f4191b;
        uVar2.f4214i = f7;
        uVar2.f4217m = 0L;
        uVar2.f4220p = -1L;
        uVar2.f4218n = -1L;
        uVar2.d(false);
    }

    public final void z0() {
        if (this.f4166m1 > 0) {
            this.f286u.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = jElapsedRealtime - this.f4165l1;
            int i7 = this.f4166m1;
            V.o oVar = this.f4150V0;
            Handler handler = (Handler) oVar.f7342p;
            if (handler != null) {
                handler.post(new w(oVar, i7, j3));
            }
            this.f4166m1 = 0;
            this.f4165l1 = jElapsedRealtime;
        }
    }
}
