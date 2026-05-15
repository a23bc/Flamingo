package T1;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a */
    public final SparseArray f6894a;

    /* JADX INFO: renamed from: b */
    public v f6895b;

    public s(int i7) {
        this.f6894a = new SparseArray(i7);
    }

    public final void a(v vVar, int i7, int i8) {
        int iA = vVar.a(i7);
        SparseArray sparseArray = this.f6894a;
        s sVar = sparseArray == null ? null : (s) sparseArray.get(iA);
        if (sVar == null) {
            sVar = new s(1);
            sparseArray.put(vVar.a(i7), sVar);
        }
        if (i8 > i7) {
            sVar.a(vVar, i7 + 1, i8);
        } else {
            sVar.f6895b = vVar;
        }
    }
}
