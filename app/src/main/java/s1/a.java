package s1;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b */
    public static final a f15841b;

    /* JADX INFO: renamed from: c */
    public static final a f15842c;

    /* JADX INFO: renamed from: a */
    public final CancellationException f15843a;

    static {
        if (g.f15856r) {
            f15842c = null;
            f15841b = null;
        } else {
            f15842c = new a(false, null);
            f15841b = new a(true, null);
        }
    }

    public a(boolean z6, CancellationException cancellationException) {
        this.f15843a = cancellationException;
    }
}
