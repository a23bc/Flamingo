package t2;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f16353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f16354c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1485n f16355a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        AbstractC1697a.i(!false);
        f16353b = new T(new C1485n(sparseBooleanArray));
        int i7 = w2.t.f18881a;
        f16354c = Integer.toString(0, 36);
    }

    public T(C1485n c1485n) {
        this.f16355a = c1485n;
    }

    public static T b(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f16354c);
        if (integerArrayList == null) {
            return f16353b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i7 = 0; i7 < integerArrayList.size(); i7++) {
            int iIntValue = integerArrayList.get(i7).intValue();
            AbstractC1697a.i(!false);
            sparseBooleanArray.append(iIntValue, true);
        }
        AbstractC1697a.i(!false);
        return new T(new C1485n(sparseBooleanArray));
    }

    public final boolean a(int i7) {
        return this.f16355a.f16552a.get(i7);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i7 = 0;
        while (true) {
            C1485n c1485n = this.f16355a;
            if (i7 >= c1485n.f16552a.size()) {
                bundle.putIntegerArrayList(f16354c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(c1485n.b(i7)));
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof T) {
            return this.f16355a.equals(((T) obj).f16355a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16355a.hashCode();
    }
}
