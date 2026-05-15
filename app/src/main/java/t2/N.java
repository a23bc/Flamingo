package t2;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class N extends IOException {

    /* JADX INFO: renamed from: o */
    public final boolean f16332o;

    /* JADX INFO: renamed from: p */
    public final int f16333p;

    public N(String str, RuntimeException runtimeException, boolean z6, int i7) {
        super(str, runtimeException);
        this.f16332o = z6;
        this.f16333p = i7;
    }

    public static N a(RuntimeException runtimeException, String str) {
        return new N(str, runtimeException, true, 1);
    }

    public static N b(String str) {
        return new N(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + "{contentIsMalformed=" + this.f16332o + ", dataType=" + this.f16333p + "}";
    }
}
