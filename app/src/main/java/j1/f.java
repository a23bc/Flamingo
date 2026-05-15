package j1;

import android.text.style.ClickableSpan;
import android.view.View;
import b1.AbstractC0629n;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0629n f13670a;

    public f(AbstractC0629n abstractC0629n) {
        this.f13670a = abstractC0629n;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.f13670a.getClass();
    }
}
