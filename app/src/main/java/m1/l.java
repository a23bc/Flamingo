package m1;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b */
    public static final l f14345b = new l(0);

    /* JADX INFO: renamed from: c */
    public static final l f14346c = new l(1);

    /* JADX INFO: renamed from: d */
    public static final l f14347d = new l(2);

    /* JADX INFO: renamed from: a */
    public final int f14348a;

    public l(int i7) {
        this.f14348a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f14348a == ((l) obj).f14348a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14348a;
    }

    public final String toString() {
        int i7 = this.f14348a;
        if (i7 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i7 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() != 1) {
            return Z1.l.s(new StringBuilder("TextDecoration["), p1.a.a(arrayList, ", ", null, 62), ']');
        }
        return "TextDecoration." + ((String) arrayList.get(0));
    }
}
