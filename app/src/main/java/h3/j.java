package h3;

import E4.G;
import E4.I;
import E4.b0;
import N2.F;
import N2.H;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import t2.C1483l;
import t2.C1484m;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import t2.N;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class j implements N2.m {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final byte[] f12593H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final C1487p f12594I;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f12595A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f12596B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f12597C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public N2.o f12598D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public H[] f12599E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public H[] f12600F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f12601G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3.k f12602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f12605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w2.m f12606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w2.m f12607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w2.m f12608g;
    public final byte[] h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w2.m f12609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final V1.a f12610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final w2.m f12611k;
    public final ArrayDeque l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque f12612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b0 f12613n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12614o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f12616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public w2.m f12618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f12619t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12620u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f12621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f12622w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f12623x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f12624y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12625z;

    static {
        C1486o c1486o = new C1486o();
        c1486o.l = M.j("application/x-emsg");
        f12594I = new C1487p(c1486o);
    }

    public j(k3.k kVar, int i7) {
        G g6 = I.f1870p;
        b0 b0Var = b0.f1913s;
        this.f12602a = kVar;
        this.f12603b = i7;
        this.f12604c = Collections.unmodifiableList(b0Var);
        this.f12610j = new V1.a(5);
        this.f12611k = new w2.m(16);
        this.f12606e = new w2.m(x2.g.f19966a);
        this.f12607f = new w2.m(5);
        this.f12608g = new w2.m();
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.f12609i = new w2.m(bArr);
        this.l = new ArrayDeque();
        this.f12612m = new ArrayDeque();
        this.f12605d = new SparseArray();
        this.f12613n = b0Var;
        this.f12622w = -9223372036854775807L;
        this.f12621v = -9223372036854775807L;
        this.f12623x = -9223372036854775807L;
        this.f12598D = N2.o.f5066f;
        this.f12599E = new H[0];
        this.f12600F = new H[0];
    }

    public static C1484m d(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i7 = 0; i7 < size; i7++) {
            C1000b c1000b = (C1000b) arrayList.get(i7);
            if (c1000b.f12566p == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = c1000b.f12564q.f18867a;
                D4.i iVarE = p.e(bArr);
                UUID uuid = iVarE == null ? null : (UUID) iVarE.f1583q;
                if (uuid == null) {
                    AbstractC1697a.w("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C1483l(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C1484m(null, false, (C1483l[]) arrayList2.toArray(new C1483l[0]));
    }

    public static void h(w2.m mVar, int i7, s sVar) throws N {
        mVar.G(i7 + 8);
        int iG = mVar.g();
        if ((iG & 1) != 0) {
            throw N.b("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z6 = (iG & 2) != 0;
        int iY = mVar.y();
        if (iY == 0) {
            Arrays.fill(sVar.l, 0, sVar.f12686e, false);
            return;
        }
        if (iY != sVar.f12686e) {
            StringBuilder sbV = n1.c.v(iY, "Senc sample count ", " is different from fragment sample count");
            sbV.append(sVar.f12686e);
            throw N.a(null, sbV.toString());
        }
        Arrays.fill(sVar.l, 0, iY, z6);
        int iA = mVar.a();
        w2.m mVar2 = sVar.f12693n;
        mVar2.D(iA);
        sVar.f12691k = true;
        sVar.f12694o = true;
        mVar.e(mVar2.f18867a, 0, mVar2.f18869c);
        mVar2.G(0);
        sVar.f12694o = false;
    }

    @Override // N2.m
    public final N2.m b() {
        return this;
    }

    @Override // N2.m
    public final void c(N2.o oVar) {
        int i7;
        int i8 = this.f12603b;
        if ((i8 & 32) == 0) {
            oVar = new A0.b(oVar, this.f12602a);
        }
        this.f12598D = oVar;
        int i9 = 0;
        this.f12614o = 0;
        this.f12617r = 0;
        H[] hArr = new H[2];
        this.f12599E = hArr;
        int i10 = 100;
        if ((i8 & 4) != 0) {
            hArr[0] = oVar.E(100, 5);
            i7 = 1;
            i10 = 101;
        } else {
            i7 = 0;
        }
        H[] hArr2 = (H[]) w2.t.F(i7, this.f12599E);
        this.f12599E = hArr2;
        for (H h : hArr2) {
            h.e(f12594I);
        }
        List list = this.f12604c;
        this.f12600F = new H[list.size()];
        while (i9 < this.f12600F.length) {
            H hE = this.f12598D.E(i10, 3);
            hE.e((C1487p) list.get(i9));
            this.f12600F[i9] = hE;
            i9++;
            i10++;
        }
    }

    @Override // N2.m
    public final void e(long j3, long j7) {
        SparseArray sparseArray = this.f12605d;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((i) sparseArray.valueAt(i7)).d();
        }
        this.f12612m.clear();
        this.f12620u = 0;
        this.f12621v = j7;
        this.l.clear();
        this.f12614o = 0;
        this.f12617r = 0;
    }

    @Override // N2.m
    public final List f() {
        return this.f12613n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f9, code lost:
    
        r37 = r7;
        r7 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0200, code lost:
    
        if ("video/hevc".equals(r4) == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x020a, code lost:
    
        if (((r6 & 126) >> 1) != 39) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x020c, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x020e, code lost:
    
        r37 = r7;
        r7 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0211, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0212, code lost:
    
        r35.f12597C = r2;
        r35.f12595A += 5;
        r35.f12625z += r37;
        r2 = r20;
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x022e, code lost:
    
        throw t2.N.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x022f, code lost:
    
        r20 = r2;
        r37 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0236, code lost:
    
        if (r35.f12597C == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0238, code lost:
    
        r2 = r35.f12608g;
        r2.D(r4);
        r21 = r13;
        r22 = r14;
        ((N2.C0293j) r0).b(r2.f18867a, 0, r35.f12596B, false);
        r11.c(r35.f12596B, r2);
        r4 = r35.f12596B;
        r7 = x2.g.f(r2.f18869c, r2.f18867a);
        r2.G("video/hevc".equals(r6.f16701m) ? 1 : 0);
        r2.F(r7);
        N2.AbstractC0285b.d(r8, r2, r35.f12600F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x026d, code lost:
    
        r21 = r13;
        r22 = r14;
        r4 = r11.a(r0, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0276, code lost:
    
        r35.f12595A += r4;
        r35.f12596B -= r4;
        r7 = r37;
        r2 = r20;
        r13 = r21;
        r14 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x028c, code lost:
    
        r2 = r35.f12595A;
        r4 = r35.f12625z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0290, code lost:
    
        if (r2 >= r4) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0292, code lost:
    
        r35.f12595A += r11.a(r0, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a0, code lost:
    
        if (r3.l != false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a2, code lost:
    
        r0 = r3.f12586d.f12703g[r3.f12588f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02b1, code lost:
    
        if (r5.f12690j[r3.f12588f] == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02b3, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02b5, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02ba, code lost:
    
        if (r3.a() == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02bc, code lost:
    
        r0 = r0 | 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02bf, code lost:
    
        r23 = r0;
        r0 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02c5, code lost:
    
        if (r0 == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c7, code lost:
    
        r26 = r0.f12679c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02cc, code lost:
    
        r26 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ce, code lost:
    
        r21 = r8;
        r11.f(r21, r23, r35.f12625z, 0, r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02df, code lost:
    
        if (r12.isEmpty() != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02e1, code lost:
    
        r0 = (h3.h) r12.removeFirst();
        r35.f12620u -= r0.f12582c;
        r2 = r0.f12581b;
        r4 = r0.f12580a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02f2, code lost:
    
        if (r2 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02f4, code lost:
    
        r4 = r4 + r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02f6, code lost:
    
        r29 = r4;
        r2 = r35.f12599E;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02fc, code lost:
    
        if (r5 >= r4) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02fe, code lost:
    
        r2[r5].f(r29, 1, r0.f12582c, r35.f12620u, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0318, code lost:
    
        if (r3.b() != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x031a, code lost:
    
        r35.f12624y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x031d, code lost:
    
        r35.f12614o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0322, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0323, code lost:
    
        r2 = r5.size();
        r3 = null;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0329, code lost:
    
        if (r4 >= r2) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x032b, code lost:
    
        r6 = ((h3.i) r5.valueAt(r4)).f12584b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0335, code lost:
    
        if (r6.f12694o == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0337, code lost:
    
        r9 = r6.f12684c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x033b, code lost:
    
        if (r9 >= r7) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x033d, code lost:
    
        r3 = (h3.i) r5.valueAt(r4);
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0344, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0349, code lost:
    
        if (r3 != null) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x034b, code lost:
    
        r35.f12614o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0350, code lost:
    
        r2 = (int) (r7 - ((N2.C0293j) r0).f5054r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0357, code lost:
    
        if (r2 < 0) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0359, code lost:
    
        r4 = (N2.C0293j) r0;
        r4.g(r2);
        r2 = r3.f12584b;
        r3 = r2.f12693n;
        r4.b(r3.f18867a, 0, r3.f18869c, false);
        r3.G(0);
        r2.f12694o = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0379, code lost:
    
        throw t2.N.a(null, "Offset to encryption data was negative.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x037a, code lost:
    
        r2 = ((int) r35.f12616q) - r35.f12617r;
        r3 = r35.f12618s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0384, code lost:
    
        if (r3 == null) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0386, code lost:
    
        ((N2.C0293j) r0).b(r3.f18867a, 8, r2, false);
        r5 = r35.f12615p;
        r2 = new h3.C1000b(r5, r3);
        r9 = ((N2.C0293j) r0).f5054r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03a1, code lost:
    
        if (r4.isEmpty() != false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03a3, code lost:
    
        ((h3.C0999a) r4.peek()).f12562r.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03b0, code lost:
    
        if (r5 != 1936286840) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03b2, code lost:
    
        r3.G(8);
        r2 = h3.AbstractC1001c.e(r3.g());
        r3.H(4);
        r23 = r3.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03c7, code lost:
    
        if (r2 != 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03c9, code lost:
    
        r4 = r3.w();
        r6 = r3.w();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03d1, code lost:
    
        r6 = r6 + r9;
        r19 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03d5, code lost:
    
        r4 = r3.z();
        r6 = r3.z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03de, code lost:
    
        r2 = w2.t.f18881a;
        r4 = w2.t.J(r19, 1000000, r23, java.math.RoundingMode.FLOOR);
        r3.H(2);
        r2 = r3.A();
        r8 = new int[r2];
        r9 = new long[r2];
        r10 = new long[r2];
        r11 = new long[r2];
        r14 = r4;
        r12 = r6;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03fd, code lost:
    
        if (r6 >= r2) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03ff, code lost:
    
        r7 = r3.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0407, code lost:
    
        if ((r7 & Integer.MIN_VALUE) != 0) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0409, code lost:
    
        r21 = r3.w();
        r8[r6] = r7 & Integer.MAX_VALUE;
        r9[r6] = r12;
        r11[r6] = r14;
        r19 = r19 + r21;
        r14 = w2.t.J(r19, 1000000, r23, java.math.RoundingMode.FLOOR);
        r10[r6] = r14 - r11[r6];
        r3.H(4);
        r12 = r12 + ((long) r8[r6]);
        r6 = r6 + 1;
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0441, code lost:
    
        throw t2.N.a(null, "Unhandled indirect reference");
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0442, code lost:
    
        r2 = android.util.Pair.create(java.lang.Long.valueOf(r4), new N2.C0292i(r8, r9, r10, r11));
        r35.f12623x = ((java.lang.Long) r2.first).longValue();
        r35.f12598D.H((N2.B) r2.second);
        r35.f12601G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0469, code lost:
    
        if (r5 != 1701671783) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x046e, code lost:
    
        if (r35.f12599E.length != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0472, code lost:
    
        r3.G(8);
        r2 = h3.AbstractC1001c.e(r3.g());
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0484, code lost:
    
        if (r2 == 0) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0487, code lost:
    
        if (r2 == 1) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0489, code lost:
    
        n1.c.x(r2, "Skipping unsupported emsg version: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0490, code lost:
    
        r23 = r3.w();
        r19 = r3.z();
        r25 = java.math.RoundingMode.FLOOR;
        r6 = w2.t.J(r19, 1000000, r23, r25);
        r8 = w2.t.J(r3.w(), 1000, r23, r25);
        r10 = r3.w();
        r2 = r3.p();
        r2.getClass();
        r13 = r3.p();
        r13.getClass();
        r16 = -9223372036854775807L;
        r14 = r10;
        r10 = r8;
        r8 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x04c4, code lost:
    
        r2 = r3.p();
        r2.getClass();
        r13 = r3.p();
        r13.getClass();
        r23 = r3.w();
        r19 = r3.w();
        r25 = java.math.RoundingMode.FLOOR;
        r6 = w2.t.J(r19, 1000000, r23, r25);
        r8 = r35.f12623x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04e7, code lost:
    
        if (r8 == (-9223372036854775807L)) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x04e9, code lost:
    
        r8 = r8 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04eb, code lost:
    
        r8 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x04ec, code lost:
    
        r10 = w2.t.J(r3.w(), 1000, r23, r25);
        r14 = r3.w();
        r16 = r8;
        r8 = r6;
        r6 = r16;
        r16 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0501, code lost:
    
        r4 = new byte[r3.a()];
        r3.e(r4, 0, r3.a());
        r3 = r35.f12610j;
        r5 = (java.io.ByteArrayOutputStream) r3.f7389o;
        r5.reset();
        r3 = (java.io.DataOutputStream) r3.f7390p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0520, code lost:
    
        r3.writeBytes(r2);
        r3.writeByte(0);
        r3.writeBytes(r13);
        r3.writeByte(0);
        r3.writeLong(r10);
        r3.writeLong(r14);
        r3.write(r4);
        r3.flush();
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x053d, code lost:
    
        r0 = new w2.m(r5.toByteArray());
        r2 = r0.a();
        r3 = r35.f12599E;
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0548, code lost:
    
        if (r5 >= r4) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x054a, code lost:
    
        r10 = r3[r5];
        r0.G(0);
        r10.c(r2, r0);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0559, code lost:
    
        if (r6 != r16) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x055b, code lost:
    
        r12.addLast(new h3.h(r2, r8, true));
        r35.f12620u += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x056d, code lost:
    
        if (r12.isEmpty() != false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x056f, code lost:
    
        r12.addLast(new h3.h(r2, r6, false));
        r35.f12620u += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x057e, code lost:
    
        r0 = r35.f12599E;
        r3 = r0.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0582, code lost:
    
        if (r4 >= r3) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0584, code lost:
    
        r0[r4].f(r6, 1, r2, 0, null);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0598, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x059e, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x059f, code lost:
    
        ((N2.C0293j) r36).g(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x05a6, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x05a6, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d3, code lost:
    
        r2 = r35.f12614o;
        r5 = r3.f12584b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d9, code lost:
    
        if (r2 != 3) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
    
        if (r3.l != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00df, code lost:
    
        r2 = r3.f12586d.f12700d[r3.f12588f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e8, code lost:
    
        r2 = r5.h[r3.f12588f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ee, code lost:
    
        r35.f12625z = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f4, code lost:
    
        if (r3.f12588f >= r3.f12590i) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f6, code lost:
    
        ((N2.C0293j) r0).g(r2);
        r0 = r3.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ff, code lost:
    
        if (r0 != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
    
        r2 = r5.f12693n;
        r0 = r0.f12680d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0106, code lost:
    
        if (r0 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0108, code lost:
    
        r2.H(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010b, code lost:
    
        r0 = r3.f12588f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010f, code lost:
    
        if (r5.f12691k == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0115, code lost:
    
        if (r5.l[r0] == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0117, code lost:
    
        r2.H(r2.A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0123, code lost:
    
        if (r3.b() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0125, code lost:
    
        r35.f12624y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0127, code lost:
    
        r35.f12614o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012a, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0133, code lost:
    
        if (r3.f12586d.f12697a.f12673g != r18) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0135, code lost:
    
        r35.f12625z = r2 - 8;
        ((N2.C0293j) r0).g(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014f, code lost:
    
        if ("audio/ac4".equals(r3.f12586d.f12697a.f12672f.f16701m) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0151, code lost:
    
        r35.f12595A = r3.c(r35.f12625z, 7);
        r2 = r35.f12625z;
        r8 = r35.f12609i;
        N2.AbstractC0285b.g(r2, r8);
        r3.f12583a.c(7, r8);
        r35.f12595A += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016c, code lost:
    
        r35.f12595A = r3.c(r35.f12625z, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0174, code lost:
    
        r35.f12625z += r35.f12595A;
        r35.f12614o = 4;
        r35.f12596B = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0180, code lost:
    
        r2 = r3.f12586d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0184, code lost:
    
        if (r3.l != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0186, code lost:
    
        r8 = r2.f12702f[r3.f12588f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018d, code lost:
    
        r8 = r5.f12689i[r3.f12588f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0194, code lost:
    
        r2 = r2.f12697a;
        r7 = r2.f12675j;
        r11 = r3.f12583a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019a, code lost:
    
        if (r7 == 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019c, code lost:
    
        r13 = r35.f12607f;
        r14 = r13.f18867a;
        r14[0] = 0;
        r14[1] = 0;
        r14[r37] = 0;
        r15 = r7 + 1;
        r7 = 4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b2, code lost:
    
        if (r35.f12595A >= r35.f12625z) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b4, code lost:
    
        r4 = r35.f12596B;
        r6 = r2.f12672f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ba, code lost:
    
        if (r4 != 0) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01bc, code lost:
    
        r20 = r2;
        ((N2.C0293j) r0).b(r14, r7, r15, false);
        r13.G(0);
        r4 = r13.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01cd, code lost:
    
        if (r4 < 1) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cf, code lost:
    
        r35.f12596B = r4 - 1;
        r4 = r35.f12606e;
        r4.G(0);
        r11.c(4, r4);
        r11.c(1, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e3, code lost:
    
        if (r35.f12600F.length <= 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e5, code lost:
    
        r4 = r6.f16701m;
        r6 = r14[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ef, code lost:
    
        if ("video/avc".equals(r4) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01f1, code lost:
    
        r37 = r7;
        r7 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01f6, code lost:
    
        if ((r6 & 31) == 6) goto L106;
     */
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
    public final int g(N2.n r36, N2.q r37) throws t2.N {
        /*
            Method dump skipped, instruction units count: 1978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.j.g(N2.n, N2.q):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:340:0x07cb, code lost:
    
        r59.f12614o = 0;
        r59.f12617r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x07d0, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(long r60) throws t2.N {
        /*
            Method dump skipped, instruction units count: 2001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h3.j.i(long):void");
    }

    @Override // N2.m
    public final boolean m(N2.n nVar) {
        b0 b0VarT;
        F fH = p.h(nVar, true, false);
        if (fH != null) {
            b0VarT = I.t(fH);
        } else {
            G g6 = I.f1870p;
            b0VarT = b0.f1913s;
        }
        this.f12613n = b0VarT;
        return fH == null;
    }

    @Override // N2.m
    public final void a() {
    }
}
