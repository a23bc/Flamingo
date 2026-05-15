package N2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f4976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4978d;

    public G(int i7, int i8, int i9, byte[] bArr) {
        this.f4975a = i7;
        this.f4976b = bArr;
        this.f4977c = i8;
        this.f4978d = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G.class == obj.getClass()) {
            G g6 = (G) obj;
            if (this.f4975a == g6.f4975a && this.f4977c == g6.f4977c && this.f4978d == g6.f4978d && Arrays.equals(this.f4976b, g6.f4976b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4976b) + (this.f4975a * 31)) * 31) + this.f4977c) * 31) + this.f4978d;
    }
}
