package t2;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f16488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f16489g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1487p[] f16493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16494e;

    static {
        int i7 = w2.t.f18881a;
        f16488f = Integer.toString(0, 36);
        f16489g = Integer.toString(1, 36);
    }

    public i0(String str, C1487p... c1487pArr) {
        AbstractC1697a.d(c1487pArr.length > 0);
        this.f16491b = str;
        this.f16493d = c1487pArr;
        this.f16490a = c1487pArr.length;
        int iE = M.e(c1487pArr[0].f16701m);
        this.f16492c = iE == -1 ? M.e(c1487pArr[0].l) : iE;
        String str2 = c1487pArr[0].f16694d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i7 = c1487pArr[0].f16696f | 16384;
        for (int i8 = 1; i8 < c1487pArr.length; i8++) {
            String str3 = c1487pArr[i8].f16694d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b("languages", c1487pArr[0].f16694d, c1487pArr[i8].f16694d, i8);
                return;
            } else {
                if (i7 != (c1487pArr[i8].f16696f | 16384)) {
                    b("role flags", Integer.toBinaryString(c1487pArr[0].f16696f), Integer.toBinaryString(c1487pArr[i8].f16696f), i8);
                    return;
                }
            }
        }
    }

    public static i0 a(Bundle bundle) {
        E4.b0 b0VarO;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f16488f);
        if (parcelableArrayList == null) {
            E4.G g6 = E4.I.f1870p;
            b0VarO = E4.b0.f1913s;
        } else {
            b0VarO = AbstractC1697a.o(new c0(2), parcelableArrayList);
        }
        return new i0(bundle.getString(f16489g, ""), (C1487p[]) b0VarO.toArray(new C1487p[0]));
    }

    public static void b(String str, String str2, String str3, int i7) {
        AbstractC1697a.n("", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i7 + ")"));
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        C1487p[] c1487pArr = this.f16493d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c1487pArr.length);
        for (C1487p c1487p : c1487pArr) {
            arrayList.add(c1487p.c(true));
        }
        bundle.putParcelableArrayList(f16488f, arrayList);
        bundle.putString(f16489g, this.f16491b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i0.class == obj.getClass()) {
            i0 i0Var = (i0) obj;
            if (this.f16491b.equals(i0Var.f16491b) && Arrays.equals(this.f16493d, i0Var.f16493d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f16494e == 0) {
            this.f16494e = Arrays.hashCode(this.f16493d) + A0.e.C(this.f16491b, 527, 31);
        }
        return this.f16494e;
    }
}
