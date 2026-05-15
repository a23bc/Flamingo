package R0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import y0.AbstractC1959I;

/* JADX INFO: renamed from: R0.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0389j0 implements InterfaceC0385h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f6470a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f6471b = new int[2];

    @Override // R0.InterfaceC0385h0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f6470a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f6471b;
        view.getLocationOnScreen(iArr);
        int i7 = iArr[0];
        int i8 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i7, iArr[1] - i8);
        AbstractC1959I.q(matrix, fArr);
    }
}
