package Y3;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c */
    public static final a f8692c;

    /* JADX INFO: renamed from: d */
    public static final a f8693d;

    /* JADX INFO: renamed from: a */
    public final boolean f8694a;

    /* JADX INFO: renamed from: b */
    public final CancellationException f8695b;

    static {
        if (h.f8712r) {
            f8693d = null;
            f8692c = null;
        } else {
            f8693d = new a(false, null);
            f8692c = new a(true, null);
        }
    }

    public a(boolean z6, CancellationException cancellationException) {
        this.f8694a = z6;
        this.f8695b = cancellationException;
    }
}
