package R0;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
import y0.AbstractC1959I;
import y0.C1953C;

/* JADX INFO: renamed from: R0.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0387i0 implements InterfaceC0385h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f6466b;

    public C0387i0(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f6465a = new int[size];
        this.f6466b = new float[size];
        for (int i7 = 0; i7 < size; i7++) {
            this.f6465a[i7] = ((Integer) arrayList.get(i7)).intValue();
            this.f6466b[i7] = ((Float) arrayList2.get(i7)).floatValue();
        }
    }

    @Override // R0.InterfaceC0385h0
    public void a(View view, float[] fArr) {
        C1953C.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z6 = parent instanceof View;
        float[] fArr2 = this.f6466b;
        if (z6) {
            b((View) parent, fArr);
            C1953C.d(fArr2);
            C1953C.f(fArr2, -view.getScrollX(), -view.getScrollY());
            M.D(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C1953C.d(fArr2);
            C1953C.f(fArr2, left, top);
            M.D(fArr, fArr2);
        } else {
            int[] iArr = this.f6465a;
            view.getLocationInWindow(iArr);
            C1953C.d(fArr2);
            C1953C.f(fArr2, -view.getScrollX(), -view.getScrollY());
            M.D(fArr, fArr2);
            float f7 = iArr[0];
            float f8 = iArr[1];
            C1953C.d(fArr2);
            C1953C.f(fArr2, f7, f8);
            M.D(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        AbstractC1959I.q(matrix, fArr2);
        M.D(fArr, fArr2);
    }

    public C0387i0(int i7, int i8) {
        this.f6465a = new int[]{i7, i8};
        this.f6466b = new float[]{0.0f, 1.0f};
    }

    public C0387i0(int i7, int i8, int i9) {
        this.f6465a = new int[]{i7, i8, i9};
        this.f6466b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0387i0(float[] fArr) {
        this.f6466b = fArr;
        this.f6465a = new int[2];
    }
}
