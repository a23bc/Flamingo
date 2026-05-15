package o1;

import d.C0746L;
import java.util.Arrays;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: o1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1259c implements InterfaceC1257a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f14658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f14659b;

    public C1259c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f14658a = fArr;
        this.f14659b = fArr2;
    }

    @Override // o1.InterfaceC1257a
    public final float a(float f7) {
        return C0746L.i(f7, this.f14659b, this.f14658a);
    }

    @Override // o1.InterfaceC1257a
    public final float b(float f7) {
        return C0746L.i(f7, this.f14658a, this.f14659b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1259c)) {
            return false;
        }
        C1259c c1259c = (C1259c) obj;
        return Arrays.equals(this.f14658a, c1259c.f14658a) && Arrays.equals(this.f14659b, c1259c.f14659b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14659b) + (Arrays.hashCode(this.f14658a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f14658a);
        AbstractC1209k.e(string, "toString(...)");
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f14659b);
        AbstractC1209k.e(string2, "toString(...)");
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
