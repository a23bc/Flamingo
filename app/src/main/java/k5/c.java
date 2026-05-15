package K5;

import R0.C0414w0;
import R0.Y;
import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import o5.AbstractC1267a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ThreadLocal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4073a;

    public /* synthetic */ c(int i7) {
        this.f4073a = i7;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f4073a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(G5.b.f2768d);
                return simpleDateFormat;
            case 1:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper == null) {
                    throw new IllegalStateException("no Looper on this thread");
                }
                Y y6 = new Y(choreographer, AbstractC1267a.r(looperMyLooper));
                return I0.c.L(y6, y6.f6398z);
            case 2:
                return new C0414w0();
            case 3:
                return new Random();
            default:
                return new HashMap();
        }
    }
}
