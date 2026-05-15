package y0;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m5.AbstractC1209k;
import x0.C1892b;

/* JADX INFO: renamed from: y0.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1952B extends AbstractC1961K {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f20170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f20171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f20173f;

    public C1952B(List list, ArrayList arrayList, long j3, long j7) {
        this.f20170c = list;
        this.f20171d = arrayList;
        this.f20172e = j3;
        this.f20173f = j7;
    }

    @Override // y0.AbstractC1961K
    public final Shader b(long j3) {
        int i7;
        int[] iArr;
        int i8;
        float[] fArr;
        long j7 = this.f20172e;
        char c7 = ' ';
        int i9 = (int) (j7 >> 32);
        if (Float.intBitsToFloat(i9) == Float.POSITIVE_INFINITY) {
            i9 = (int) (j3 >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i9);
        long j8 = 4294967295L;
        int i10 = (int) (j7 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j3 & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i10);
        long j9 = this.f20173f;
        int i11 = (int) (j9 >> 32);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j3 >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i11);
        int i12 = (int) (j9 & 4294967295L);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j3 & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i12);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.f20170c;
        ArrayList arrayList = this.f20171d;
        if (arrayList == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != arrayList.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i7 = 0;
        } else {
            int iD0 = Z4.o.d0(list);
            i7 = 0;
            int i13 = 1;
            while (i13 < iD0) {
                char c8 = c7;
                long j10 = j8;
                if (C1987t.d(((C1987t) list.get(i13)).f20264a) == 0.0f) {
                    i7++;
                }
                i13++;
                c7 = c8;
                j8 = j10;
            }
        }
        char c9 = c7;
        long j11 = j8;
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c9));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & j11));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> c9));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j11));
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            iArr = new int[size];
            for (int i14 = 0; i14 < size; i14++) {
                iArr[i14] = AbstractC1959I.x(((C1987t) list.get(i14)).f20264a);
            }
        } else {
            iArr = new int[list.size() + i7];
            int iD02 = Z4.o.d0(list);
            int size2 = list.size();
            int i15 = 0;
            for (int i16 = 0; i16 < size2; i16++) {
                long j12 = ((C1987t) list.get(i16)).f20264a;
                if (C1987t.d(j12) == 0.0f) {
                    if (i16 == 0) {
                        i8 = i15 + 1;
                        iArr[i15] = AbstractC1959I.x(C1987t.b(((C1987t) list.get(1)).f20264a, 0.0f));
                    } else if (i16 == iD02) {
                        i8 = i15 + 1;
                        iArr[i15] = AbstractC1959I.x(C1987t.b(((C1987t) list.get(i16 - 1)).f20264a, 0.0f));
                    } else {
                        int i17 = i15 + 1;
                        iArr[i15] = AbstractC1959I.x(C1987t.b(((C1987t) list.get(i16 - 1)).f20264a, 0.0f));
                        i15 += 2;
                        iArr[i17] = AbstractC1959I.x(C1987t.b(((C1987t) list.get(i16 + 1)).f20264a, 0.0f));
                    }
                    i15 = i8;
                } else {
                    iArr[i15] = AbstractC1959I.x(j12);
                    i15++;
                }
            }
        }
        int[] iArr2 = iArr;
        if (i7 != 0) {
            fArr = new float[list.size() + i7];
            fArr[0] = arrayList != null ? ((Number) arrayList.get(0)).floatValue() : 0.0f;
            int iD03 = Z4.o.d0(list);
            int i18 = 1;
            for (int i19 = 1; i19 < iD03; i19++) {
                long j13 = ((C1987t) list.get(i19)).f20264a;
                float fFloatValue = arrayList != null ? ((Number) arrayList.get(i19)).floatValue() : i19 / Z4.o.d0(list);
                int i20 = i18 + 1;
                fArr[i18] = fFloatValue;
                if (C1987t.d(j13) == 0.0f) {
                    i18 += 2;
                    fArr[i20] = fFloatValue;
                } else {
                    i18 = i20;
                }
            }
            fArr[i18] = arrayList != null ? ((Number) arrayList.get(Z4.o.d0(list))).floatValue() : 1.0f;
        } else if (arrayList != null) {
            fArr = new float[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i21 = 0;
            while (it.hasNext()) {
                fArr[i21] = ((Number) it.next()).floatValue();
                i21++;
            }
        } else {
            fArr = null;
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr2, fArr, AbstractC1959I.w(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1952B)) {
            return false;
        }
        C1952B c1952b = (C1952B) obj;
        return this.f20170c.equals(c1952b.f20170c) && AbstractC1209k.a(this.f20171d, c1952b.f20171d) && C1892b.b(this.f20172e, c1952b.f20172e) && C1892b.b(this.f20173f, c1952b.f20173f);
    }

    public final int hashCode() {
        int iHashCode = this.f20170c.hashCode() * 31;
        ArrayList arrayList = this.f20171d;
        return (C1892b.f(this.f20173f) + ((C1892b.f(this.f20172e) + ((iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        String str;
        long j3 = this.f20172e;
        String str2 = "";
        if (((((j3 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) C1892b.j(j3)) + ", ";
        } else {
            str = "";
        }
        long j7 = this.f20173f;
        if (((((j7 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) C1892b.j(j7)) + ", ";
        }
        return "LinearGradient(colors=" + this.f20170c + ", stops=" + this.f20171d + ", " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
