package androidx.work.impl.diagnostics;

import A0.b;
import N3.p;
import O3.e;
import O3.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        p.i("DiagnosticsRcvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        p.d().b(new Throwable[0]);
        try {
            l lVarL0 = l.l0(context);
            List listSingletonList = Collections.singletonList(new b(DiagnosticsWorker.class).L());
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new e(lVarL0, null, 2, listSingletonList).b0();
        } catch (IllegalStateException e7) {
            p.d().c(e7);
        }
    }
}
