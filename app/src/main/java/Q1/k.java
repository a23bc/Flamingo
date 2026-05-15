package q1;

import Q0.AbstractC0347f;
import Q0.K;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import r0.AbstractC1397o;
import w0.u;
import x0.C1893c;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a */
    public static final j f15498a = new j();

    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(w0.i iVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        u uVarG = w0.f.g(((w0.k) iVar).f18788c);
        C1893c c1893cJ = uVarG != null ? w0.f.j(uVarG) : null;
        if (c1893cJ == null) {
            return null;
        }
        int i7 = (int) c1893cJ.f19869a;
        int i8 = iArr[0];
        int i9 = iArr2[0];
        int i10 = (int) c1893cJ.f19870b;
        int i11 = iArr[1];
        int i12 = iArr2[1];
        return new Rect((i7 + i8) - i9, (i10 + i11) - i12, (((int) c1893cJ.f19871c) + i8) - i9, (((int) c1893cJ.f19872d) + i11) - i12);
    }

    public static final View c(AbstractC1397o abstractC1397o) {
        q qVar = AbstractC0347f.x(abstractC1397o.f15637o).f5804C;
        View interopView = qVar != null ? qVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void d(q qVar, K k7) {
        long jI = k7.f5821T.f6002c.I(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jI >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jI & 4294967295L)));
        qVar.layout(iRound, iRound2, qVar.getMeasuredWidth() + iRound, qVar.getMeasuredHeight() + iRound2);
    }
}
