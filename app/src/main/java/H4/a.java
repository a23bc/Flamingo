package H4;

import N5.d;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f3248q = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f3249o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3250p;

    static {
        new a(new int[0]);
    }

    public a(int[] iArr) {
        int length = iArr.length;
        this.f3249o = iArr;
        this.f3250p = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i7 = aVar.f3250p;
            int i8 = this.f3250p;
            if (i8 == i7) {
                for (int i9 = 0; i9 < i8; i9++) {
                    d.p(i9, i8);
                    int i10 = this.f3249o[i9];
                    d.p(i9, aVar.f3250p);
                    if (i10 == aVar.f3249o[i9]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f3250p; i8++) {
            i7 = (i7 * 31) + this.f3249o[i8];
        }
        return i7;
    }

    public final String toString() {
        int i7 = this.f3250p;
        if (i7 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i7 * 5);
        sb.append('[');
        int[] iArr = this.f3249o;
        sb.append(iArr[0]);
        for (int i8 = 1; i8 < i7; i8++) {
            sb.append(", ");
            sb.append(iArr[i8]);
        }
        sb.append(']');
        return sb.toString();
    }
}
