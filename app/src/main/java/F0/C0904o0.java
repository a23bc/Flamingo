package f0;

import a.AbstractC0509a;
import java.util.ArrayList;

/* JADX INFO: renamed from: f0.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0904o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t.y f11855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Y4.m f11856f;

    public C0904o0(int i7, ArrayList arrayList) {
        this.f11851a = arrayList;
        this.f11852b = i7;
        if (i7 < 0) {
            AbstractC0908q0.a("Invalid start index");
        }
        this.f11854d = new ArrayList();
        t.y yVar = new t.y();
        int size = arrayList.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            T t7 = (T) this.f11851a.get(i9);
            int i10 = t7.f11747c;
            int i11 = t7.f11748d;
            yVar.h(i10, new M(i9, i8, i11));
            i8 += i11;
        }
        this.f11855e = yVar;
        this.f11856f = AbstractC0509a.O(new C0902n0(this));
    }

    public final boolean a(int i7, int i8) {
        int i9;
        t.y yVar = this.f11855e;
        M m7 = (M) yVar.b(i7);
        if (m7 == null) {
            return false;
        }
        int i10 = m7.f11717b;
        int i11 = i8 - m7.f11718c;
        m7.f11718c = i8;
        if (i11 == 0) {
            return true;
        }
        Object[] objArr = yVar.f16085c;
        long[] jArr = yVar.f16083a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j3 = jArr[i12];
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j3) < 128) {
                        M m8 = (M) objArr[(i12 << 3) + i14];
                        if (m8.f11717b >= i10 && !m8.equals(m7) && (i9 = m8.f11717b + i11) >= 0) {
                            m8.f11717b = i9;
                        }
                    }
                    j3 >>= 8;
                }
                if (i13 != 8) {
                    return true;
                }
            }
            if (i12 == length) {
                return true;
            }
            i12++;
        }
    }
}
