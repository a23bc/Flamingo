package l3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k.I;
import k3.j;
import v2.C1635b;
import w2.AbstractC1697a;
import w2.m;

/* JADX INFO: renamed from: l3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1171c extends AbstractC1177i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f14186i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f14187j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f14188k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f14191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public List f14192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14196t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f14197u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte f14198v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14200x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f14201y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f14185z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f14178A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f14179B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int[] f14180C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final int[] f14181D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final int[] f14182E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f14183F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final boolean[] f14184G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final m h = new m();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f14189m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C1170b f14190n = new C1170b(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14199w = 0;
    public final long l = 16000000;

    public C1171c(String str, int i7) {
        this.f14186i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i7 == 1) {
            this.f14188k = 0;
            this.f14187j = 0;
        } else if (i7 == 2) {
            this.f14188k = 1;
            this.f14187j = 0;
        } else if (i7 == 3) {
            this.f14188k = 0;
            this.f14187j = 1;
        } else if (i7 != 4) {
            AbstractC1697a.w("Invalid channel. Defaulting to CC1.");
            this.f14188k = 0;
            this.f14187j = 0;
        } else {
            this.f14188k = 1;
            this.f14187j = 1;
        }
        m(0);
        l();
        this.f14200x = true;
        this.f14201y = -9223372036854775807L;
    }

    @Override // l3.AbstractC1177i, z2.c
    public final void flush() {
        super.flush();
        this.f14191o = null;
        this.f14192p = null;
        m(0);
        this.f14194r = 4;
        this.f14190n.h = 4;
        l();
        this.f14195s = false;
        this.f14196t = false;
        this.f14197u = (byte) 0;
        this.f14198v = (byte) 0;
        this.f14199w = 0;
        this.f14200x = true;
        this.f14201y = -9223372036854775807L;
    }

    @Override // l3.AbstractC1177i
    public final I g() {
        List list = this.f14191o;
        this.f14192p = list;
        list.getClass();
        return new I(1, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // l3.AbstractC1177i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(l3.C1175g r15) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C1171c.h(l3.g):void");
    }

    @Override // l3.AbstractC1177i, z2.c
    /* JADX INFO: renamed from: i */
    public final j e() {
        j jVar;
        j jVarE = super.e();
        if (jVarE != null) {
            return jVarE;
        }
        long j3 = this.l;
        if (j3 == -9223372036854775807L) {
            return null;
        }
        long j7 = this.f14201y;
        if (j7 == -9223372036854775807L || this.f14248e - j7 < j3 || (jVar = (j) this.f14245b.pollFirst()) == null) {
            return null;
        }
        this.f14191o = Collections.EMPTY_LIST;
        this.f14201y = -9223372036854775807L;
        I iG = g();
        long j8 = this.f14248e;
        jVar.f21121q = j8;
        jVar.f14041t = iG;
        jVar.f14042u = j8;
        return jVar;
    }

    @Override // l3.AbstractC1177i
    public final boolean j() {
        return this.f14191o != this.f14192p;
    }

    public final ArrayList k() {
        ArrayList arrayList = this.f14189m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i7 = 0; i7 < size; i7++) {
            C1635b c1635bC = ((C1170b) arrayList.get(i7)).c(Integer.MIN_VALUE);
            arrayList2.add(c1635bC);
            if (c1635bC != null) {
                iMin = Math.min(iMin, c1635bC.f18263i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            C1635b c1635bC2 = (C1635b) arrayList2.get(i8);
            if (c1635bC2 != null) {
                if (c1635bC2.f18263i != iMin) {
                    c1635bC2 = ((C1170b) arrayList.get(i8)).c(iMin);
                    c1635bC2.getClass();
                }
                arrayList3.add(c1635bC2);
            }
        }
        return arrayList3;
    }

    public final void l() {
        C1170b c1170b = this.f14190n;
        c1170b.f14177g = this.f14193q;
        c1170b.f14171a.clear();
        c1170b.f14172b.clear();
        c1170b.f14173c.setLength(0);
        c1170b.f14174d = 15;
        c1170b.f14175e = 0;
        c1170b.f14176f = 0;
        ArrayList arrayList = this.f14189m;
        arrayList.clear();
        arrayList.add(this.f14190n);
    }

    public final void m(int i7) {
        int i8 = this.f14193q;
        if (i8 == i7) {
            return;
        }
        this.f14193q = i7;
        if (i7 != 3) {
            l();
            if (i8 == 3 || i7 == 1 || i7 == 0) {
                this.f14191o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f14189m;
            if (i9 >= arrayList.size()) {
                return;
            }
            ((C1170b) arrayList.get(i9)).f14177g = i7;
            i9++;
        }
    }

    @Override // l3.AbstractC1177i, z2.c
    public final void a() {
    }
}
