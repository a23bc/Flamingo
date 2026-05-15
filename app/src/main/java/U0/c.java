package U0;

import A2.AbstractC0002c;
import N5.d;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a */
    public final Object f7027a;

    /* JADX INFO: renamed from: b */
    public final View f7028b;

    public c(ContentCaptureSession contentCaptureSession, View view) {
        this.f7027a = contentCaptureSession;
        this.f7028b = view;
    }

    public final AutofillId a(long j3) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionG = H1.c.g(this.f7027a);
        a aVarF = d.F(this.f7028b);
        Objects.requireNonNull(aVarF);
        return b.b(contentCaptureSessionG, AbstractC0002c.o(aVarF.f7026a), j3);
    }
}
