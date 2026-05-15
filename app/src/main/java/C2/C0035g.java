package C2;

import E4.AbstractC0119q;
import E4.b0;
import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import java.util.Objects;
import t2.C1476e;

/* JADX INFO: renamed from: C2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0035g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0035g f1117c = new C0035g(E4.I.t(C0034f.f1113d));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b0 f1118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final E4.K f1119e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f1120a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1121b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC0119q.c(3, objArr);
        f1118d = E4.I.n(3, objArr);
        D4.i iVar = new D4.i(4);
        iVar.z(5, 6);
        iVar.z(17, 6);
        iVar.z(7, 6);
        iVar.z(30, 10);
        iVar.z(18, 6);
        iVar.z(6, 8);
        iVar.z(8, 8);
        iVar.z(14, 8);
        f1119e = iVar.d();
    }

    public C0035g(b0 b0Var) {
        for (int i7 = 0; i7 < b0Var.f1915r; i7++) {
            C0034f c0034f = (C0034f) b0Var.get(i7);
            this.f1120a.put(c0034f.f1114a, c0034f);
        }
        int iMax = 0;
        for (int i8 = 0; i8 < this.f1120a.size(); i8++) {
            iMax = Math.max(iMax, ((C0034f) this.f1120a.valueAt(i8)).f1115b);
        }
        this.f1121b = iMax;
    }

    public static b0 a(int[] iArr, int i7) {
        E4.F fO = E4.I.o();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i8 : iArr) {
            fO.a(new C0034f(i8, i7));
        }
        return fO.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static C2.C0035g b(android.content.Context r5, android.content.Intent r6, t2.C1476e r7, C2.C0041m r8) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0035g.b(android.content.Context, android.content.Intent, t2.e, C2.m):C2.g");
    }

    public static C0035g c(Context context, C1476e c1476e, C0041m c0041m) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c1476e, c0041m);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair d(t2.C1476e r17, t2.C1487p r18) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.C0035g.d(t2.e, t2.p):android.util.Pair");
    }

    public final boolean e(int i7) {
        SparseArray sparseArray = this.f1120a;
        int i8 = w2.t.f18881a;
        return sparseArray.indexOfKey(i7) >= 0;
    }

    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof C0035g) {
                C0035g c0035g = (C0035g) obj;
                SparseArray sparseArray = this.f1120a;
                SparseArray sparseArray2 = c0035g.f1120a;
                int i7 = w2.t.f18881a;
                if (sparseArray != null) {
                    if (sparseArray2 != null) {
                        if (w2.t.f18881a >= 31) {
                            zContentEquals = sparseArray.contentEquals(sparseArray2);
                        } else {
                            int size = sparseArray.size();
                            if (size == sparseArray2.size()) {
                                for (int i8 = 0; i8 < size; i8++) {
                                    if (Objects.equals(sparseArray.valueAt(i8), sparseArray2.get(sparseArray.keyAt(i8)))) {
                                    }
                                }
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                    break;
                } else {
                    if (sparseArray2 != null) {
                        zContentEquals = false;
                        break;
                    }
                    zContentEquals = true;
                }
                if (!zContentEquals || this.f1121b != c0035g.f1121b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray sparseArray = this.f1120a;
        if (w2.t.f18881a >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i7)) + ((sparseArray.keyAt(i7) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f1121b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f1121b + ", audioProfiles=" + this.f1120a + "]";
    }
}
