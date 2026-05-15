package J2;

import A2.V;
import A2.x0;
import D2.B;
import E4.C0123v;
import E4.I;
import E4.Z;
import E4.b0;
import H2.g0;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import t2.C1476e;
import t2.C1487p;
import t2.i0;
import t2.j0;
import t2.l0;
import w2.AbstractC1697a;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class o extends s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Z f3716j = new C0123v(new C1.b(4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f3718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f3719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public i f3721g;
    public final B h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1476e f3722i;

    public o(YosPlaybackService yosPlaybackService) {
        x0 x0Var = new x0(16);
        String str = i.f3669r0;
        i iVar = new i(new h(yosPlaybackService));
        this.f3717c = new Object();
        this.f3718d = yosPlaybackService.getApplicationContext();
        this.f3719e = x0Var;
        this.f3721g = iVar;
        this.f3722i = C1476e.f16413g;
        boolean zB = w2.t.B(yosPlaybackService);
        this.f3720f = zB;
        if (!zB && w2.t.f18881a >= 32) {
            AudioManager audioManager = (AudioManager) yosPlaybackService.getSystemService("audio");
            this.h = audioManager == null ? null : new B(audioManager.getSpatializer());
        }
        boolean z6 = this.f3721g.f3682m0;
    }

    public static void c(g0 g0Var, i iVar, HashMap map) {
        for (int i7 = 0; i7 < g0Var.f3187a; i7++) {
            j0 j0Var = (j0) iVar.f16582A.get(g0Var.a(i7));
            if (j0Var != null) {
                i0 i0Var = j0Var.f16497a;
                j0 j0Var2 = (j0) map.get(Integer.valueOf(i0Var.f16492c));
                if (j0Var2 == null || (j0Var2.f16498b.isEmpty() && !j0Var.f16498b.isEmpty())) {
                    map.put(Integer.valueOf(i0Var.f16492c), j0Var);
                }
            }
        }
    }

    public static int d(C1487p c1487p, String str, boolean z6) {
        if (!TextUtils.isEmpty(str) && str.equals(c1487p.f16694d)) {
            return 4;
        }
        String strG = g(str);
        String strG2 = g(c1487p.f16694d);
        if (strG2 == null || strG == null) {
            return (z6 && strG2 == null) ? 1 : 0;
        }
        if (strG2.startsWith(strG) || strG.startsWith(strG2)) {
            return 3;
        }
        int i7 = w2.t.f18881a;
        return strG2.split("-", 2)[0].equals(strG.split("-", 2)[0]) ? 2 : 0;
    }

    public static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean i(i iVar, int i7, C1487p c1487p) {
        if ((i7 & 3584) == 0) {
            return false;
        }
        l0 l0Var = iVar.f16600s;
        if (l0Var.f16521c && (i7 & 2048) == 0) {
            return false;
        }
        if (l0Var.f16520b) {
            boolean z6 = (c1487p.f16683D == 0 && c1487p.f16684E == 0) ? false : true;
            boolean z7 = (i7 & 1024) != 0;
            if (z6 && !z7) {
                return false;
            }
        }
        return true;
    }

    public static Pair j(int i7, r rVar, int[][][] iArr, l lVar, Comparator comparator) {
        RandomAccess randomAccessT;
        r rVar2 = rVar;
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (i8 < rVar2.f3725a) {
            if (i7 == ((int[]) rVar2.f3726b)[i8]) {
                g0 g0Var = ((g0[]) rVar2.f3728d)[i8];
                for (int i9 = 0; i9 < g0Var.f3187a; i9++) {
                    i0 i0VarA = g0Var.a(i9);
                    b0 b0VarA = lVar.a(i8, i0VarA, iArr[i8][i9]);
                    int i10 = i0VarA.f16490a;
                    boolean[] zArr = new boolean[i10];
                    for (int i11 = 0; i11 < i10; i11++) {
                        m mVar = (m) b0VarA.get(i11);
                        int iA = mVar.a();
                        if (!zArr[i11] && iA != 0) {
                            boolean z6 = true;
                            if (iA == 1) {
                                randomAccessT = I.t(mVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(mVar);
                                int i12 = i11 + 1;
                                while (i12 < i10) {
                                    boolean z7 = z6;
                                    m mVar2 = (m) b0VarA.get(i12);
                                    if (mVar2.a() == 2 && mVar.b(mVar2)) {
                                        arrayList2.add(mVar2);
                                        zArr[i12] = z7;
                                    }
                                    i12++;
                                    z6 = z7;
                                }
                                randomAccessT = arrayList2;
                            }
                            arrayList.add(randomAccessT);
                        }
                    }
                }
            }
            i8++;
            rVar2 = rVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i13 = 0; i13 < list.size(); i13++) {
            iArr2[i13] = ((m) list.get(i13)).f3699q;
        }
        m mVar3 = (m) list.get(0);
        return Pair.create(new p(mVar3.f3698p, iArr2), Integer.valueOf(mVar3.f3697o));
    }

    @Override // J2.s
    public final void a() {
        B b7;
        j jVar;
        synchronized (this.f3717c) {
            try {
                if (w2.t.f18881a >= 32 && (b7 = this.h) != null && (jVar = (j) b7.f1461r) != null && ((Handler) b7.f1460q) != null) {
                    ((Spatializer) b7.f1459p).removeOnSpatializerStateChangedListener(jVar);
                    ((Handler) b7.f1460q).removeCallbacksAndMessages(null);
                    b7.f1460q = null;
                    b7.f1461r = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f3731a = null;
        this.f3732b = null;
    }

    @Override // J2.s
    public final void b(C1476e c1476e) {
        boolean zEquals;
        synchronized (this.f3717c) {
            zEquals = this.f3722i.equals(c1476e);
            this.f3722i = c1476e;
        }
        if (zEquals) {
            return;
        }
        f();
    }

    public final i e() {
        i iVar;
        synchronized (this.f3717c) {
            iVar = this.f3721g;
        }
        return iVar;
    }

    public final void f() {
        boolean z6;
        V v3;
        B b7;
        synchronized (this.f3717c) {
            try {
                z6 = this.f3721g.f3682m0 && !this.f3720f && w2.t.f18881a >= 32 && (b7 = this.h) != null && b7.f1458o;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z6 || (v3 = this.f3731a) == null) {
            return;
        }
        v3.f204v.e(10);
    }

    public final void h() {
        synchronized (this.f3717c) {
            this.f3721g.getClass();
        }
    }

    public final void k(i iVar) {
        boolean zEquals;
        iVar.getClass();
        synchronized (this.f3717c) {
            zEquals = this.f3721g.equals(iVar);
            this.f3721g = iVar;
        }
        if (zEquals) {
            return;
        }
        if (iVar.f3682m0 && this.f3718d == null) {
            AbstractC1697a.w("Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        V v3 = this.f3731a;
        if (v3 != null) {
            v3.f204v.e(10);
        }
    }
}
