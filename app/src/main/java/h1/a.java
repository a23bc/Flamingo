package H1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a */
    public final int f2956a;

    /* JADX INFO: renamed from: b */
    public final e f2957b;

    /* JADX INFO: renamed from: c */
    public final int f2958c;

    public a(int i7, e eVar, int i8) {
        this.f2956a = i7;
        this.f2957b = eVar;
        this.f2958c = i8;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2956a);
        this.f2957b.f2969a.performAction(this.f2958c, bundle);
    }
}
