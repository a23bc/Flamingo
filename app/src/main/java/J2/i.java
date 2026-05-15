package J2;

import E4.G;
import E4.b0;
import H2.g0;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Map;
import o5.AbstractC1267a;
import t2.i0;
import t2.m0;
import t2.n0;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n0 {

    /* JADX INFO: renamed from: A0 */
    public static final String f3659A0;

    /* JADX INFO: renamed from: B0 */
    public static final String f3660B0;

    /* JADX INFO: renamed from: C0 */
    public static final String f3661C0;

    /* JADX INFO: renamed from: D0 */
    public static final String f3662D0;

    /* JADX INFO: renamed from: E0 */
    public static final String f3663E0;

    /* JADX INFO: renamed from: F0 */
    public static final String f3664F0;

    /* JADX INFO: renamed from: G0 */
    public static final String f3665G0;

    /* JADX INFO: renamed from: H0 */
    public static final String f3666H0;

    /* JADX INFO: renamed from: I0 */
    public static final String f3667I0;

    /* JADX INFO: renamed from: J0 */
    public static final String f3668J0;

    /* JADX INFO: renamed from: r0 */
    public static final String f3669r0;

    /* JADX INFO: renamed from: s0 */
    public static final String f3670s0;

    /* JADX INFO: renamed from: t0 */
    public static final String f3671t0;

    /* JADX INFO: renamed from: u0 */
    public static final String f3672u0;

    /* JADX INFO: renamed from: v0 */
    public static final String f3673v0;

    /* JADX INFO: renamed from: w0 */
    public static final String f3674w0;

    /* JADX INFO: renamed from: x0 */
    public static final String f3675x0;

    /* JADX INFO: renamed from: y0 */
    public static final String f3676y0;

    /* JADX INFO: renamed from: z0 */
    public static final String f3677z0;

    /* JADX INFO: renamed from: i0 */
    public final boolean f3678i0;

    /* JADX INFO: renamed from: j0 */
    public final boolean f3679j0;

    /* JADX INFO: renamed from: k0 */
    public final boolean f3680k0;

    /* JADX INFO: renamed from: l0 */
    public final boolean f3681l0;

    /* JADX INFO: renamed from: m0 */
    public final boolean f3682m0;

    /* JADX INFO: renamed from: n0 */
    public final boolean f3683n0;

    /* JADX INFO: renamed from: o0 */
    public final boolean f3684o0;

    /* JADX INFO: renamed from: p0 */
    public final SparseArray f3685p0;

    /* JADX INFO: renamed from: q0 */
    public final SparseBooleanArray f3686q0;

    static {
        new i(new h());
        int i7 = w2.t.f18881a;
        f3669r0 = Integer.toString(1000, 36);
        f3670s0 = Integer.toString(1001, 36);
        f3671t0 = Integer.toString(1002, 36);
        f3672u0 = Integer.toString(1003, 36);
        f3673v0 = Integer.toString(1004, 36);
        f3674w0 = Integer.toString(1005, 36);
        f3675x0 = Integer.toString(1006, 36);
        f3676y0 = Integer.toString(1007, 36);
        f3677z0 = Integer.toString(1008, 36);
        f3659A0 = Integer.toString(1009, 36);
        f3660B0 = Integer.toString(1010, 36);
        f3661C0 = Integer.toString(1011, 36);
        f3662D0 = Integer.toString(1012, 36);
        f3663E0 = Integer.toString(1013, 36);
        f3664F0 = Integer.toString(1014, 36);
        f3665G0 = Integer.toString(1015, 36);
        f3666H0 = Integer.toString(1016, 36);
        f3667I0 = Integer.toString(1017, 36);
        f3668J0 = Integer.toString(1018, 36);
    }

    public i(h hVar) {
        super(hVar);
        this.f3678i0 = hVar.f3650C;
        this.f3679j0 = hVar.f3651D;
        this.f3680k0 = hVar.f3652E;
        this.f3681l0 = hVar.f3653F;
        this.f3682m0 = hVar.f3654G;
        this.f3683n0 = hVar.f3655H;
        this.f3684o0 = hVar.f3656I;
        this.f3685p0 = hVar.f3657J;
        this.f3686q0 = hVar.f3658K;
    }

    @Override // t2.n0
    public final m0 a() {
        return new h(this);
    }

    @Override // t2.n0
    public final Bundle c() {
        Bundle bundleC = super.c();
        bundleC.putBoolean(f3669r0, this.f3678i0);
        bundleC.putBoolean(f3670s0, false);
        bundleC.putBoolean(f3671t0, this.f3679j0);
        bundleC.putBoolean(f3664F0, false);
        bundleC.putBoolean(f3672u0, this.f3680k0);
        bundleC.putBoolean(f3673v0, false);
        bundleC.putBoolean(f3674w0, false);
        bundleC.putBoolean(f3675x0, false);
        bundleC.putBoolean(f3665G0, false);
        bundleC.putBoolean(f3668J0, this.f3681l0);
        bundleC.putBoolean(f3666H0, this.f3682m0);
        bundleC.putBoolean(f3676y0, this.f3683n0);
        bundleC.putBoolean(f3677z0, false);
        bundleC.putBoolean(f3659A0, this.f3684o0);
        bundleC.putBoolean(f3667I0, false);
        ArrayList arrayList = new ArrayList();
        ArrayList<g0> arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f3685p0;
            if (i7 >= sparseArray2.size()) {
                SparseBooleanArray sparseBooleanArray = this.f3686q0;
                int[] iArr = new int[sparseBooleanArray.size()];
                for (int i8 = 0; i8 < sparseBooleanArray.size(); i8++) {
                    iArr[i8] = sparseBooleanArray.keyAt(i8);
                }
                bundleC.putIntArray(f3663E0, iArr);
                return bundleC;
            }
            int iKeyAt = sparseArray2.keyAt(i7);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i7)).entrySet()) {
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                arrayList2.add((g0) entry.getKey());
                arrayList.add(Integer.valueOf(iKeyAt));
            }
            bundleC.putIntArray(f3660B0, AbstractC1267a.N(arrayList));
            ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(arrayList2.size());
            for (g0 g0Var : arrayList2) {
                g0Var.getClass();
                Bundle bundle = new Bundle();
                b0 b0Var = g0Var.f3188b;
                ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(b0Var.f1915r);
                G gListIterator = b0Var.listIterator(0);
                while (gListIterator.hasNext()) {
                    arrayList4.add(((i0) gListIterator.next()).c());
                }
                bundle.putParcelableArrayList(g0.f3186e, arrayList4);
                arrayList3.add(bundle);
            }
            bundleC.putParcelableArrayList(f3661C0, arrayList3);
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            if (sparseArray.size() > 0) {
                sparseArray.keyAt(0);
                A0.e.G(sparseArray.valueAt(0));
                throw null;
            }
            bundleC.putSparseParcelableArray(f3662D0, sparseArray3);
            i7++;
        }
    }

    @Override // t2.n0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (super.equals(iVar) && this.f3678i0 == iVar.f3678i0 && this.f3679j0 == iVar.f3679j0 && this.f3680k0 == iVar.f3680k0 && this.f3681l0 == iVar.f3681l0 && this.f3682m0 == iVar.f3682m0 && this.f3683n0 == iVar.f3683n0 && this.f3684o0 == iVar.f3684o0) {
                SparseBooleanArray sparseBooleanArray = this.f3686q0;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = iVar.f3686q0;
                if (sparseBooleanArray2.size() == size) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size) {
                            SparseArray sparseArray = this.f3685p0;
                            int size2 = sparseArray.size();
                            SparseArray sparseArray2 = iVar.f3685p0;
                            if (sparseArray2.size() == size2) {
                                for (int i8 = 0; i8 < size2; i8++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i8);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                g0 g0Var = (g0) entry.getKey();
                                                if (!map2.containsKey(g0Var) || !w2.t.a(entry.getValue(), map2.get(g0Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) < 0) {
                                break;
                            }
                            i7++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // t2.n0
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f3678i0 ? 1 : 0)) * 961) + (this.f3679j0 ? 1 : 0)) * 961) + (this.f3680k0 ? 1 : 0)) * 28629151) + (this.f3681l0 ? 1 : 0)) * 31) + (this.f3682m0 ? 1 : 0)) * 31) + (this.f3683n0 ? 1 : 0)) * 961) + (this.f3684o0 ? 1 : 0)) * 31;
    }
}
