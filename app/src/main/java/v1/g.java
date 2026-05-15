package V1;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class g extends M3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f7402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f7403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7404e = true;

    public g(TextView textView) {
        this.f7402c = textView;
        this.f7403d = new e(textView);
    }

    @Override // M3.a
    public final InputFilter[] R(InputFilter[] inputFilterArr) {
        if (!this.f7404e) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i7 = 0; i7 < inputFilterArr.length; i7++) {
                InputFilter inputFilter = inputFilterArr[i7];
                if (inputFilter instanceof e) {
                    sparseArray.put(i7, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (sparseArray.indexOfKey(i9) < 0) {
                    inputFilterArr2[i8] = inputFilterArr[i9];
                    i8++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i10 = 0;
        while (true) {
            e eVar = this.f7403d;
            if (i10 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = eVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i10] == eVar) {
                return inputFilterArr;
            }
            i10++;
        }
    }

    @Override // M3.a
    public final void d0(boolean z6) {
        if (z6) {
            k0();
        }
    }

    @Override // M3.a
    public final void e0(boolean z6) {
        this.f7404e = z6;
        k0();
        TextView textView = this.f7402c;
        textView.setFilters(R(textView.getFilters()));
    }

    public final void k0() {
        TextView textView = this.f7402c;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f7404e) {
            if (!(transformationMethod instanceof k) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new k(transformationMethod);
            }
        } else if (transformationMethod instanceof k) {
            transformationMethod = ((k) transformationMethod).f7410a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
