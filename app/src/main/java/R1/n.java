package r1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import f0.C0903o;
import f0.C0912t;
import f0.C0915u0;
import l5.InterfaceC1180a;
import r0.C1385c;
import r0.C1390h;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a */
    public static final f0.D f15708a = new f0.D(C1412f.f15681r);

    /* JADX WARN: Removed duplicated region for block: B:139:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(r1.InterfaceC1404C r21, l5.InterfaceC1180a r22, r1.C1405D r23, n0.d r24, f0.C0912t r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.n.a(r1.C, l5.a, r1.D, n0.d, f0.t, int, int):void");
    }

    public static final void b(C1390h c1390h, long j3, InterfaceC1180a interfaceC1180a, C1405D c1405d, n0.d dVar, C0912t c0912t, int i7) {
        C1390h c1390h2;
        long j7;
        C1405D c1405d2;
        c0912t.Z(71005054);
        int i8 = i7 | 54 | (c0912t.h(interfaceC1180a) ? 256 : 128) | 3072;
        if (c0912t.N(i8 & 1, (i8 & 9363) != 9362)) {
            C1390h c1390h3 = C1385c.f15612o;
            long j8 = 0;
            long j9 = (j8 << 32) | (j8 & 4294967295L);
            C1405D c1405d3 = new C1405D(15);
            Object objK = c0912t.K();
            if (objK == C0903o.f11850a) {
                objK = new C1407a(j9);
                c0912t.i0(objK);
            }
            a((C1407a) objK, interfaceC1180a, c1405d3, dVar, c0912t, (i8 >> 3) & 8176, 0);
            c1405d2 = c1405d3;
            c1390h2 = c1390h3;
            j7 = j9;
        } else {
            c0912t.Q();
            c1390h2 = c1390h;
            j7 = j3;
            c1405d2 = c1405d;
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new C1414h(c1390h2, j7, interfaceC1180a, c1405d2, dVar, i7);
        }
    }

    public static final boolean c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
