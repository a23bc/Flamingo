package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements J3.b {
    @Override // J3.b
    public final List a() {
        return Z4.v.f8818o;
    }

    @Override // J3.b
    public final Object b(Context context) {
        AbstractC1209k.f(context, "context");
        J3.a aVarC = J3.a.c(context);
        AbstractC1209k.e(aVarC, "getInstance(...)");
        if (!aVarC.f3741b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!r.f9751a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC1209k.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0594q());
        }
        E e7 = E.f9684w;
        e7.getClass();
        e7.f9689s = new Handler();
        e7.f9690t.r(EnumC0592o.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC1209k.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new D(e7));
        return e7;
    }
}
