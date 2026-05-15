package D;

import m5.AbstractC1209k;

/* JADX INFO: renamed from: D.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0066g implements InterfaceC0064f, InterfaceC0067h {

    /* JADX INFO: renamed from: a */
    public final float f1319a;

    /* JADX INFO: renamed from: b */
    public final boolean f1320b;

    /* JADX INFO: renamed from: c */
    public final C0056b f1321c;

    /* JADX INFO: renamed from: d */
    public final float f1322d;

    public C0066g(float f7, boolean z6, C0056b c0056b) {
        this.f1319a = f7;
        this.f1320b = z6;
        this.f1321c = c0056b;
        this.f1322d = f7;
    }

    @Override // D.InterfaceC0064f, D.InterfaceC0067h
    public final float a() {
        return this.f1322d;
    }

    @Override // D.InterfaceC0067h
    public final void b(n1.d dVar, int i7, int[] iArr, int[] iArr2) {
        c(dVar, i7, iArr, n1.n.f14521o, iArr2);
    }

    @Override // D.InterfaceC0064f
    public final void c(n1.d dVar, int i7, int[] iArr, n1.n nVar, int[] iArr2) {
        int i8;
        int i9;
        if (iArr.length == 0) {
            return;
        }
        int iL = dVar.L(this.f1319a);
        boolean z6 = this.f1320b && nVar == n1.n.f14522p;
        C0058c c0058c = AbstractC0068i.f1327a;
        if (z6) {
            int length = iArr.length - 1;
            i8 = 0;
            i9 = 0;
            while (-1 < length) {
                int i10 = iArr[length];
                int iMin = Math.min(i8, i7 - i10);
                iArr2[length] = iMin;
                int iMin2 = Math.min(iL, (i7 - iMin) - i10);
                int i11 = iArr2[length] + i10 + iMin2;
                length--;
                i9 = iMin2;
                i8 = i11;
            }
        } else {
            int length2 = iArr.length;
            int i12 = 0;
            i8 = 0;
            i9 = 0;
            int i13 = 0;
            while (i12 < length2) {
                int i14 = iArr[i12];
                int iMin3 = Math.min(i8, i7 - i14);
                iArr2[i13] = iMin3;
                int iMin4 = Math.min(iL, (i7 - iMin3) - i14);
                int i15 = iArr2[i13] + i14 + iMin4;
                i12++;
                i9 = iMin4;
                i8 = i15;
                i13++;
            }
        }
        int i16 = i8 - i9;
        C0056b c0056b = this.f1321c;
        if (c0056b == null || i16 >= i7) {
            return;
        }
        int iIntValue = ((Number) c0056b.invoke(Integer.valueOf(i7 - i16), nVar)).intValue();
        int length3 = iArr2.length;
        for (int i17 = 0; i17 < length3; i17++) {
            iArr2[i17] = iArr2[i17] + iIntValue;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0066g)) {
            return false;
        }
        C0066g c0066g = (C0066g) obj;
        return n1.g.a(this.f1319a, c0066g.f1319a) && this.f1320b == c0066g.f1320b && AbstractC1209k.a(this.f1321c, c0066g.f1321c);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.f1319a) * 31) + (this.f1320b ? 1231 : 1237)) * 31;
        C0056b c0056b = this.f1321c;
        return iFloatToIntBits + (c0056b == null ? 0 : c0056b.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1320b ? "" : "Absolute");
        sb.append("Arrangement#spacedAligned(");
        sb.append((Object) n1.g.b(this.f1319a));
        sb.append(", ");
        sb.append(this.f1321c);
        sb.append(')');
        return sb.toString();
    }
}
