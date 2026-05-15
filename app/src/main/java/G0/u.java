package g0;

import androidx.datastore.preferences.protobuf.C0535h;
import f0.AbstractC0914u;
import f0.C0877b;
import f0.InterfaceC0881d;
import f0.K0;
import f0.L0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u extends J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f12313c = new u(1, 0, 2);

    @Override // g0.J
    public final void a(C0535h c0535h, InterfaceC0881d interfaceC0881d, L0 l02, n0.j jVar, K k7) {
        C0877b c0877b;
        int iC;
        int iE = c0535h.e(0);
        if (l02.f11705n != 0) {
            AbstractC0914u.c("Cannot move a group while inserting");
        }
        boolean z6 = true;
        if (!(iE >= 0)) {
            AbstractC0914u.c("Parameter offset is out of bounds");
        }
        if (iE == 0) {
            return;
        }
        int i7 = l02.f11711t;
        int i8 = l02.f11713v;
        int i9 = l02.f11712u;
        int i10 = i7;
        while (iE > 0) {
            i10 += l02.f11695b[(l02.r(i10) * 5) + 3];
            if (i10 > i9) {
                AbstractC0914u.c("Parameter offset is out of bounds");
            }
            iE--;
        }
        int i11 = l02.f11695b[(l02.r(i10) * 5) + 3];
        int iG = l02.g(l02.f11695b, l02.r(l02.f11711t));
        int iG2 = l02.g(l02.f11695b, l02.r(i10));
        int i12 = i10 + i11;
        int iG3 = l02.g(l02.f11695b, l02.r(i12));
        int i13 = iG3 - iG2;
        l02.w(i13, Math.max(l02.f11711t - 1, 0));
        l02.v(i11);
        int[] iArr = l02.f11695b;
        int iR = l02.r(i12) * 5;
        Z4.l.V(l02.r(i7) * 5, iR, (i11 * 5) + iR, iArr, iArr);
        if (i13 > 0) {
            Object[] objArr = l02.f11696c;
            int iH = l02.h(iG2 + i13);
            System.arraycopy(objArr, iH, objArr, iG, l02.h(iG3 + i13) - iH);
        }
        int i14 = iG2 + i13;
        int i15 = i14 - iG;
        int i16 = l02.f11703k;
        int i17 = l02.l;
        int length = l02.f11696c.length;
        int i18 = l02.f11704m;
        int i19 = i7 + i11;
        int i20 = i7;
        while (i20 < i19) {
            boolean z7 = z6;
            int iR2 = l02.r(i20);
            int i21 = i20;
            iArr[(iR2 * 5) + 4] = L0.i(L0.i(l02.g(iArr, iR2) - i15, i18 < iR2 ? 0 : i16, i17, length), l02.f11703k, l02.l, l02.f11696c.length);
            i20 = i21 + 1;
            z6 = z7;
            i15 = i15;
            i16 = i16;
        }
        int i22 = i12 + i11;
        int iP = l02.p();
        int iB = K0.b(l02.f11697d, i12, iP);
        ArrayList arrayList = new ArrayList();
        if (iB >= 0) {
            while (iB < l02.f11697d.size() && (iC = l02.c((c0877b = (C0877b) l02.f11697d.get(iB)))) >= i12 && iC < i22) {
                arrayList.add(c0877b);
            }
        }
        int i23 = i7 - i12;
        int size = arrayList.size();
        for (int i24 = 0; i24 < size; i24++) {
            C0877b c0877b2 = (C0877b) arrayList.get(i24);
            int iC2 = l02.c(c0877b2) + i23;
            if (iC2 >= l02.f11700g) {
                c0877b2.f11789a = -(iP - iC2);
            } else {
                c0877b2.f11789a = iC2;
            }
            l02.f11697d.add(K0.b(l02.f11697d, iC2, iP), c0877b2);
        }
        if (l02.H(i12, i11)) {
            AbstractC0914u.c("Unexpectedly removed anchors");
        }
        l02.m(i8, l02.f11712u, i7);
        if (i13 > 0) {
            l02.I(i14, i13, i12 - 1);
        }
    }
}
