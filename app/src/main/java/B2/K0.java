package b2;

import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: a */
    public static final K0 f10078a = new K0();

    public final void a(String str, int i7) {
        Trace.beginAsyncSection(str, i7);
    }

    public final void b(String str, int i7) {
        Trace.endAsyncSection(str, i7);
    }
}
