package androidx.profileinstaller;

import A2.x0;
import J3.b;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // J3.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // J3.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new x0(4);
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: A3.g
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                this.f502o.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new h(applicationContext, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new x0(4);
    }
}
