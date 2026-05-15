package D2;

import java.io.IOException;

/* JADX INFO: renamed from: D2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0088d extends IOException {
    public C0088d(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
