package B5;

import a.AbstractC0509a;
import e5.AbstractC0863a;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f917a = 0;

    static {
        Object objL;
        Object objL2;
        Exception exc = new Exception();
        String simpleName = AbstractC0509a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objL = AbstractC0863a.class.getCanonicalName();
        } catch (Throwable th) {
            objL = android.support.v4.media.session.b.l(th);
        }
        if (Y4.k.a(objL) != null) {
            objL = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objL2 = t.class.getCanonicalName();
        } catch (Throwable th2) {
            objL2 = android.support.v4.media.session.b.l(th2);
        }
        if (Y4.k.a(objL2) != null) {
            objL2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
