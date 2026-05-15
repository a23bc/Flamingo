package androidx.work;

import J3.b;
import N2.z;
import N3.p;
import O3.l;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class WorkManagerInitializer implements b {
    static {
        p.i("WrkMgrInitializer");
    }

    @Override // J3.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // J3.b
    public final Object b(Context context) {
        p.d().b(new Throwable[0]);
        N3.b bVar = new N3.b(new z());
        synchronized (l.f5639n) {
            try {
                l lVar = l.l;
                if (lVar != null && l.f5638m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (lVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (l.f5638m == null) {
                        l.f5638m = new l(applicationContext, bVar, new A0.b(bVar.f5111b));
                    }
                    l.l = l.f5638m;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return l.l0(context);
    }
}
