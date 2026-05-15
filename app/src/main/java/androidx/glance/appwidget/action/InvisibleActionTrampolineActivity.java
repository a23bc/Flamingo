package androidx.glance.appwidget.action;

import android.app.Activity;
import android.os.Bundle;
import c2.AbstractC0732g;

/* JADX INFO: loaded from: classes.dex */
public final class InvisibleActionTrampolineActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0732g.g(this, getIntent());
    }
}
