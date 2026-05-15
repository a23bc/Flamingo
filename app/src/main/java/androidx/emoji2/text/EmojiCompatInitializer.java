package androidx.emoji2.text;

import J3.a;
import J3.b;
import O3.f;
import T1.j;
import T1.k;
import T1.r;
import android.content.Context;
import androidx.lifecycle.InterfaceC0597u;
import androidx.lifecycle.K;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // J3.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // J3.b
    public final Object b(Context context) {
        r rVar = new r(new f(context, 1));
        rVar.f6892b = 1;
        if (j.f6859k == null) {
            synchronized (j.f6858j) {
                try {
                    if (j.f6859k == null) {
                        j.f6859k = new j(rVar);
                    }
                } finally {
                }
            }
        }
        c(context);
        return Boolean.TRUE;
    }

    public final void c(Context context) {
        Object objB;
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f3739e) {
            try {
                objB = aVarC.f3740a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        K kH = ((InterfaceC0597u) objB).h();
        kH.a(new k(this, kH));
    }
}
