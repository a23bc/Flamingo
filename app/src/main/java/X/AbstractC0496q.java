package X;

import android.media.session.MediaSessionManager;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextSelection;

/* JADX INFO: renamed from: X.q */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0496q {
    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ TextClassification.Request.Builder e(CharSequence charSequence, int i7, int i8) {
        return new TextClassification.Request.Builder(charSequence, i7, i8);
    }

    public static /* synthetic */ TextClassificationContext.Builder h(String str, String str2) {
        return new TextClassificationContext.Builder(str, str2);
    }

    public static /* synthetic */ TextSelection.Request.Builder l(CharSequence charSequence, int i7, int i8) {
        return new TextSelection.Request.Builder(charSequence, i7, i8);
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ void v(String str, int i7, int i8) {
        new MediaSessionManager.RemoteUserInfo(str, i7, i8);
    }

    public static /* synthetic */ void y() {
    }
}
