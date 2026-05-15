package f3;

import E4.G;
import E4.b0;
import L2.C0247a;
import N2.C0293j;
import N2.H;
import N2.I;
import N2.m;
import N2.n;
import N2.o;
import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import k3.k;
import t2.N;
import w2.AbstractC1697a;
import w2.t;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f12106e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f12107f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final byte[] f12108g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final byte[] f12109h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final UUID f12110i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Map f12111j0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f12112A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f12113B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f12114C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f12115D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public L0.b f12116E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public L0.b f12117F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f12118G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f12119H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f12120I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f12121J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f12122K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f12123L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12124M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int[] f12125N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f12126O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f12127P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f12128Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f12129R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f12130S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public long f12131T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f12132U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f12133V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f12134W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f12135X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f12136Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12137a;
    public int a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f12138b;
    public byte b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f12139c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f12140c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12141d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public o f12142d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f12144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w2.m f12145g;
    public final w2.m h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w2.m f12146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w2.m f12147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w2.m f12148k;
    public final w2.m l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final w2.m f12149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w2.m f12150n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w2.m f12151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w2.m f12152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f12153q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f12154r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f12155s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f12156t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f12157u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f12158v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f12159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12160x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12161y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f12162z;

    static {
        int i7 = t.f18881a;
        f12107f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(D4.d.f1569c);
        f12108g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f12109h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f12110i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        n1.c.y(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        n1.c.y(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f12111j0 = Collections.unmodifiableMap(map);
    }

    public d(k kVar, int i7) {
        b bVar = new b();
        this.f12155s = -1L;
        this.f12156t = -9223372036854775807L;
        this.f12157u = -9223372036854775807L;
        this.f12158v = -9223372036854775807L;
        this.f12113B = -1L;
        this.f12114C = -1L;
        this.f12115D = -9223372036854775807L;
        this.f12137a = bVar;
        bVar.f12053d = new C0247a(25, this);
        this.f12144f = kVar;
        this.f12141d = (i7 & 1) == 0;
        this.f12143e = (i7 & 2) == 0;
        this.f12138b = new e();
        this.f12139c = new SparseArray();
        this.f12146i = new w2.m(4);
        this.f12147j = new w2.m(ByteBuffer.allocate(4).putInt(-1).array());
        this.f12148k = new w2.m(4);
        this.f12145g = new w2.m(g.f19966a);
        this.h = new w2.m(4);
        this.l = new w2.m();
        this.f12149m = new w2.m();
        this.f12150n = new w2.m(8);
        this.f12151o = new w2.m();
        this.f12152p = new w2.m();
        this.f12125N = new int[1];
    }

    public static byte[] j(long j3, String str, long j7) {
        AbstractC1697a.d(j3 != -9223372036854775807L);
        int i7 = (int) (j3 / 3600000000L);
        long j8 = j3 - (((long) i7) * 3600000000L);
        int i8 = (int) (j8 / 60000000);
        long j9 = j8 - (((long) i8) * 60000000);
        int i9 = (int) (j9 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf((int) ((j9 - (((long) i9) * 1000000)) / j7)));
        int i10 = t.f18881a;
        return str2.getBytes(D4.d.f1569c);
    }

    @Override // N2.m
    public final m b() {
        return this;
    }

    @Override // N2.m
    public final void c(o oVar) {
        this.f12142d0 = oVar;
        if (this.f12143e) {
            oVar = new A0.b(oVar, this.f12144f);
        }
        this.f12142d0 = oVar;
    }

    public final void d(int i7) {
        if (this.f12116E == null || this.f12117F == null) {
            throw N.a(null, "Element " + i7 + " must be in a Cues");
        }
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        this.f12115D = -9223372036854775807L;
        this.f12120I = 0;
        b bVar = this.f12137a;
        bVar.f12054e = 0;
        bVar.f12051b.clear();
        e eVar = bVar.f12052c;
        eVar.f12165b = 0;
        eVar.f12166c = 0;
        e eVar2 = this.f12138b;
        eVar2.f12165b = 0;
        eVar2.f12166c = 0;
        l();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f12139c;
            if (i7 >= sparseArray.size()) {
                return;
            }
            I i8 = ((c) sparseArray.valueAt(i7)).f12077U;
            if (i8 != null) {
                i8.f4980b = false;
                i8.f4981c = 0;
            }
            i7++;
        }
    }

    @Override // N2.m
    public final List f() {
        G g6 = E4.I.f1870p;
        return b0.f1913s;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0486 A[PHI: r41
  0x0486: PHI (r41v45 java.lang.String) = 
  (r41v11 java.lang.String)
  (r41v12 java.lang.String)
  (r41v13 java.lang.String)
  (r41v14 java.lang.String)
  (r41v15 java.lang.String)
  (r41v16 java.lang.String)
  (r41v17 java.lang.String)
  (r41v18 java.lang.String)
  (r41v19 java.lang.String)
  (r41v20 java.lang.String)
  (r41v21 java.lang.String)
  (r41v22 java.lang.String)
  (r41v23 java.lang.String)
  (r41v24 java.lang.String)
  (r41v25 java.lang.String)
  (r41v26 java.lang.String)
  (r41v27 java.lang.String)
  (r41v28 java.lang.String)
  (r41v29 java.lang.String)
  (r41v30 java.lang.String)
  (r41v31 java.lang.String)
  (r41v32 java.lang.String)
  (r41v33 java.lang.String)
  (r41v34 java.lang.String)
  (r41v35 java.lang.String)
  (r41v36 java.lang.String)
  (r41v37 java.lang.String)
  (r41v38 java.lang.String)
  (r41v39 java.lang.String)
  (r41v40 java.lang.String)
  (r41v41 java.lang.String)
  (r41v42 java.lang.String)
  (r41v46 java.lang.String)
 binds: [B:369:0x066e, B:365:0x0663, B:361:0x0657, B:357:0x064c, B:353:0x0641, B:349:0x0636, B:345:0x062b, B:341:0x061e, B:337:0x060e, B:333:0x05fe, B:329:0x05ee, B:325:0x05de, B:321:0x05ce, B:317:0x05be, B:313:0x05ae, B:309:0x059e, B:305:0x058e, B:301:0x057e, B:297:0x056e, B:293:0x055e, B:289:0x054e, B:285:0x053e, B:281:0x052e, B:277:0x051e, B:273:0x050e, B:269:0x04fe, B:265:0x04ee, B:261:0x04de, B:257:0x04ce, B:253:0x04be, B:249:0x04ae, B:245:0x049e, B:238:0x0484] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0ad7  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0af0  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0b10  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0ce5  */
    /* JADX WARN: Type inference failed for: r13v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v97 */
    /* JADX WARN: Type inference failed for: r1v3, types: [f3.e] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r3v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10, types: [N2.j] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // N2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(N2.n r53, N2.q r54) throws t2.N {
        /*
            Method dump skipped, instruction units count: 5254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.d.g(N2.n, N2.q):int");
    }

    public final void h(int i7) {
        if (this.f12159w != null) {
            return;
        }
        throw N.a(null, "Element " + i7 + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(f3.c r24, long r25, int r27, int r28, int r29) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.d.i(f3.c, long, int, int, int):void");
    }

    public final void k(C0293j c0293j, int i7) {
        w2.m mVar = this.f12146i;
        if (mVar.f18869c >= i7) {
            return;
        }
        byte[] bArr = mVar.f18867a;
        if (bArr.length < i7) {
            mVar.b(Math.max(bArr.length * 2, i7));
        }
        byte[] bArr2 = mVar.f18867a;
        int i8 = mVar.f18869c;
        c0293j.b(bArr2, i8, i7 - i8, false);
        mVar.F(i7);
    }

    public final void l() {
        this.f12132U = 0;
        this.f12133V = 0;
        this.f12134W = 0;
        this.f12135X = false;
        this.f12136Y = false;
        this.Z = false;
        this.a0 = 0;
        this.b0 = (byte) 0;
        this.f12140c0 = false;
        this.l.D(0);
    }

    @Override // N2.m
    public final boolean m(n nVar) throws EOFException, InterruptedIOException {
        C1.k kVar = new C1.k(4);
        C0293j c0293j = (C0293j) nVar;
        long j3 = c0293j.f5053q;
        long j7 = 1024;
        if (j3 != -1 && j3 <= 1024) {
            j7 = j3;
        }
        int i7 = (int) j7;
        w2.m mVar = (w2.m) kVar.f960p;
        c0293j.i(mVar.f18867a, 0, 4, false);
        long jW = mVar.w();
        kVar.f959o = 4;
        while (true) {
            if (jW != 440786851) {
                int i8 = kVar.f959o + 1;
                kVar.f959o = i8;
                if (i8 == i7) {
                    break;
                }
                c0293j.i(mVar.f18867a, 0, 1, false);
                jW = ((jW << 8) & (-256)) | ((long) (mVar.f18867a[0] & 255));
            } else {
                long jG = kVar.g(c0293j);
                long j8 = kVar.f959o;
                if (jG != Long.MIN_VALUE && (j3 == -1 || j8 + jG < j3)) {
                    while (true) {
                        long j9 = kVar.f959o;
                        long j10 = j8 + jG;
                        if (j9 < j10) {
                            if (kVar.g(c0293j) == Long.MIN_VALUE) {
                                break;
                            }
                            long jG2 = kVar.g(c0293j);
                            if (jG2 < 0 || jG2 > 2147483647L) {
                                break;
                            }
                            if (jG2 != 0) {
                                int i9 = (int) jG2;
                                c0293j.k(i9, false);
                                kVar.f959o += i9;
                            }
                        } else if (j9 == j10) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final long n(long j3) throws N {
        long j7 = this.f12156t;
        if (j7 == -9223372036854775807L) {
            throw N.a(null, "Can't scale timecode prior to timecodeScale being set.");
        }
        int i7 = t.f18881a;
        return t.J(j3, j7, 1000L, RoundingMode.FLOOR);
    }

    public final int o(C0293j c0293j, c cVar, int i7, boolean z6) throws N {
        int iA;
        int iA2;
        int i8;
        if ("S_TEXT/UTF8".equals(cVar.f12083b)) {
            p(c0293j, f12106e0, i7);
            int i9 = this.f12133V;
            l();
            return i9;
        }
        if ("S_TEXT/ASS".equals(cVar.f12083b)) {
            p(c0293j, f12108g0, i7);
            int i10 = this.f12133V;
            l();
            return i10;
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f12083b)) {
            p(c0293j, f12109h0, i7);
            int i11 = this.f12133V;
            l();
            return i11;
        }
        H h = cVar.f12081Y;
        boolean z7 = this.f12135X;
        w2.m mVar = this.l;
        if (!z7) {
            boolean z8 = cVar.h;
            w2.m mVar2 = this.f12146i;
            if (z8) {
                this.f12128Q &= -1073741825;
                if (!this.f12136Y) {
                    c0293j.b(mVar2.f18867a, 0, 1, false);
                    this.f12132U++;
                    byte b7 = mVar2.f18867a[0];
                    if ((b7 & 128) == 128) {
                        throw N.a(null, "Extension bit is set in signal byte");
                    }
                    this.b0 = b7;
                    this.f12136Y = true;
                }
                byte b8 = this.b0;
                if ((b8 & 1) == 1) {
                    boolean z9 = (b8 & 2) == 2;
                    this.f12128Q |= 1073741824;
                    if (!this.f12140c0) {
                        w2.m mVar3 = this.f12150n;
                        c0293j.b(mVar3.f18867a, 0, 8, false);
                        this.f12132U += 8;
                        this.f12140c0 = true;
                        mVar2.f18867a[0] = (byte) ((z9 ? 128 : 0) | 8);
                        mVar2.G(0);
                        h.d(mVar2, 1, 1);
                        this.f12133V++;
                        mVar3.G(0);
                        h.d(mVar3, 8, 1);
                        this.f12133V += 8;
                    }
                    if (z9) {
                        if (!this.Z) {
                            c0293j.b(mVar2.f18867a, 0, 1, false);
                            this.f12132U++;
                            mVar2.G(0);
                            this.a0 = mVar2.u();
                            this.Z = true;
                        }
                        int i12 = this.a0 * 4;
                        mVar2.D(i12);
                        c0293j.b(mVar2.f18867a, 0, i12, false);
                        this.f12132U += i12;
                        short s7 = (short) ((this.a0 / 2) + 1);
                        int i13 = (s7 * 6) + 2;
                        ByteBuffer byteBuffer = this.f12153q;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f12153q = ByteBuffer.allocate(i13);
                        }
                        this.f12153q.position(0);
                        this.f12153q.putShort(s7);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i8 = this.a0;
                            if (i14 >= i8) {
                                break;
                            }
                            int iY = mVar2.y();
                            if (i14 % 2 == 0) {
                                this.f12153q.putShort((short) (iY - i15));
                            } else {
                                this.f12153q.putInt(iY - i15);
                            }
                            i14++;
                            i15 = iY;
                        }
                        int i16 = (i7 - this.f12132U) - i15;
                        if (i8 % 2 == 1) {
                            this.f12153q.putInt(i16);
                        } else {
                            this.f12153q.putShort((short) i16);
                            this.f12153q.putInt(0);
                        }
                        byte[] bArrArray = this.f12153q.array();
                        w2.m mVar4 = this.f12151o;
                        mVar4.E(i13, bArrArray);
                        h.d(mVar4, i13, 1);
                        this.f12133V += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f12089i;
                if (bArr != null) {
                    mVar.E(bArr.length, bArr);
                }
            }
            if ("A_OPUS".equals(cVar.f12083b) ? z6 : cVar.f12087f > 0) {
                this.f12128Q |= 268435456;
                this.f12152p.D(0);
                int i17 = (mVar.f18869c + i7) - this.f12132U;
                mVar2.D(4);
                byte[] bArr2 = mVar2.f18867a;
                bArr2[0] = (byte) ((i17 >> 24) & 255);
                bArr2[1] = (byte) ((i17 >> 16) & 255);
                bArr2[2] = (byte) ((i17 >> 8) & 255);
                bArr2[3] = (byte) (i17 & 255);
                h.d(mVar2, 4, 2);
                this.f12133V += 4;
            }
            this.f12135X = true;
        }
        int i18 = i7 + mVar.f18869c;
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f12083b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f12083b)) {
            if (cVar.f12077U != null) {
                AbstractC1697a.i(mVar.f18869c == 0);
                cVar.f12077U.c(c0293j);
            }
            while (true) {
                int i19 = this.f12132U;
                if (i19 >= i18) {
                    break;
                }
                int i20 = i18 - i19;
                int iA3 = mVar.a();
                if (iA3 > 0) {
                    iA2 = Math.min(i20, iA3);
                    h.c(iA2, mVar);
                } else {
                    iA2 = h.a(c0293j, i20, false);
                }
                this.f12132U += iA2;
                this.f12133V += iA2;
            }
        } else {
            w2.m mVar5 = this.h;
            byte[] bArr3 = mVar5.f18867a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i21 = cVar.Z;
            int i22 = 4 - i21;
            while (this.f12132U < i18) {
                int i23 = this.f12134W;
                if (i23 == 0) {
                    int iMin = Math.min(i21, mVar.a());
                    c0293j.b(bArr3, i22 + iMin, i21 - iMin, false);
                    if (iMin > 0) {
                        mVar.e(bArr3, i22, iMin);
                    }
                    this.f12132U += i21;
                    mVar5.G(0);
                    this.f12134W = mVar5.y();
                    w2.m mVar6 = this.f12145g;
                    mVar6.G(0);
                    h.c(4, mVar6);
                    this.f12133V += 4;
                } else {
                    int iA4 = mVar.a();
                    if (iA4 > 0) {
                        iA = Math.min(i23, iA4);
                        h.c(iA, mVar);
                    } else {
                        iA = h.a(c0293j, i23, false);
                    }
                    this.f12132U += iA;
                    this.f12133V += iA;
                    this.f12134W -= iA;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f12083b)) {
            w2.m mVar7 = this.f12147j;
            mVar7.G(0);
            h.c(4, mVar7);
            this.f12133V += 4;
        }
        int i24 = this.f12133V;
        l();
        return i24;
    }

    public final void p(C0293j c0293j, byte[] bArr, int i7) {
        int length = bArr.length + i7;
        w2.m mVar = this.f12149m;
        byte[] bArr2 = mVar.f18867a;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i7);
            mVar.E(bArrCopyOf.length, bArrCopyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c0293j.b(mVar.f18867a, bArr.length, i7, false);
        mVar.G(0);
        mVar.F(length);
    }

    @Override // N2.m
    public final void a() {
    }
}
