package X;

import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextSelection;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class r {
    public static /* bridge */ /* synthetic */ Class C() {
        return AutofillManager.class;
    }

    public static /* bridge */ /* synthetic */ AdaptiveIconDrawable e(Drawable drawable) {
        return (AdaptiveIconDrawable) drawable;
    }

    public static /* bridge */ /* synthetic */ AutofillManager h(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue i(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassification j(Object obj) {
        return (TextClassification) obj;
    }

    public static /* bridge */ /* synthetic */ TextClassificationManager k(Object obj) {
        return (TextClassificationManager) obj;
    }

    public static /* bridge */ /* synthetic */ TextSelection l(Object obj) {
        return (TextSelection) obj;
    }

    public static /* bridge */ /* synthetic */ Class m() {
        return TextClassificationManager.class;
    }

    public static /* bridge */ /* synthetic */ void t(Object obj) {
    }

    public static /* bridge */ /* synthetic */ boolean z(Drawable drawable) {
        return drawable instanceof AdaptiveIconDrawable;
    }
}
