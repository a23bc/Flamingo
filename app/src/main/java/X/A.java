package X;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0903o;
import f0.C0912t;
import f0.a1;
import i1.C1059b;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a */
    public static final a1 f7868a = new a1(new D.A0(13));

    /* JADX INFO: renamed from: b */
    public static final C0506z f7869b = new C0506z();

    /* JADX WARN: Removed duplicated region for block: B:74:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(O.a r9, android.content.Context r10, boolean r11, java.lang.CharSequence r12, b1.L r13, X.C0505y r14, l5.InterfaceC1182c r15) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb2
            if (r12 == 0) goto Lb2
            if (r13 == 0) goto Lb2
            if (r14 == 0) goto Lb2
            boolean r0 = r14 instanceof X.C0505y
            if (r0 != 0) goto L12
            goto Lb2
        L12:
            E5.d r0 = r14.f8209e
            boolean r1 = r0.e()
            r2 = 0
            if (r1 != 0) goto L1c
            goto L40
        L1c:
            f0.j0 r1 = r14.f8211g
            java.lang.Object r1 = r1.getValue()
            X.y0 r1 = (X.y0) r1
            if (r1 == 0) goto L3b
            long r3 = r1.f8213b
            long r5 = r13.f9945a
            boolean r3 = b1.L.b(r5, r3)
            if (r3 == 0) goto L3b
            java.lang.CharSequence r3 = r1.f8212a
            boolean r3 = m5.AbstractC1209k.a(r12, r3)
            if (r3 == 0) goto L3b
            android.view.textclassifier.TextClassification r1 = r1.f8214c
            goto L3c
        L3b:
            r1 = r2
        L3c:
            r0.f(r2)
            r2 = r1
        L40:
            if (r2 != 0) goto L46
            r15.b(r9)
            goto La8
        L46:
            java.util.List r0 = B0.r.n(r2)
            boolean r0 = r0.isEmpty()
            java.lang.Object r14 = r14.h
            r1 = 0
            if (r0 != 0) goto L5e
            P.h r0 = new P.h
            r0.<init>(r14, r2, r1)
            t.F r3 = r9.f5273a
            r3.a(r0)
            goto L85
        L5e:
            android.graphics.drawable.Drawable r0 = A2.AbstractC0002c.f(r2)
            if (r0 != 0) goto L6e
            java.lang.CharSequence r0 = A2.AbstractC0002c.r(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L85
        L6e:
            android.content.Intent r0 = A2.AbstractC0002c.e(r2)
            if (r0 != 0) goto L7a
            android.view.View$OnClickListener r0 = X.r.g(r2)
            if (r0 == 0) goto L85
        L7a:
            P.h r0 = new P.h
            r3 = -1
            r0.<init>(r14, r2, r3)
            t.F r3 = r9.f5273a
            r3.a(r0)
        L85:
            r15.b(r9)
            java.util.List r15 = B0.r.n(r2)
            int r0 = r15.size()
        L90:
            if (r1 >= r0) goto La8
            java.lang.Object r3 = r15.get(r1)
            X.r.t(r3)
            if (r1 <= 0) goto La5
            P.h r3 = new P.h
            r3.<init>(r14, r2, r1)
            t.F r4 = r9.f5273a
            r4.a(r3)
        La5:
            int r1 = r1 + 1
            goto L90
        La8:
            long r7 = r13.f9945a
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            N.b.a(r3, r4, r5, r6, r7)
            return
        Lb2:
            r15.b(r9)
            if (r12 == 0) goto Lbe
            if (r13 == 0) goto Lbe
            long r13 = r13.f9945a
            N.b.a(r9, r10, r11, r12, r13)
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A.a(O.a, android.content.Context, boolean, java.lang.CharSequence, b1.L, X.y, l5.c):void");
    }

    public static final C0505y b(C c7, C1059b c1059b, C0912t c0912t, int i7) {
        c0912t.X(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            c0912t.p(false);
            return null;
        }
        Context context = (Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b);
        c5.i iVar = (c5.i) c0912t.j(f7868a);
        boolean zF = ((((i7 & 112) ^ 48) > 32 && c0912t.f(c1059b)) || (i7 & 48) == 32) | c0912t.f(iVar) | c0912t.f(context);
        Object objK = c0912t.K();
        if (zF || objK == C0903o.f11850a) {
            f7869b.getClass();
            objK = new C0505y(iVar, context, c7, c1059b);
            c0912t.i0(objK);
        }
        C0505y c0505y = (C0505y) objK;
        c0912t.p(false);
        return c0505y;
    }
}
