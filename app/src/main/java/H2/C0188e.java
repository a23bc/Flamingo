package H2;

import java.io.IOException;

/* JADX INFO: renamed from: H2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0188e extends IOException {
    public C0188e(int i7) {
        super("Illegal clipping: ".concat(i7 != 0 ? i7 != 1 ? i7 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
    }
}
