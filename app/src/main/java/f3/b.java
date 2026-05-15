package f3;

import L2.C0247a;
import N2.C0293j;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12050a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f12051b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f12052c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0247a f12053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12056g;

    public final long a(C0293j c0293j, int i7) {
        byte[] bArr = this.f12050a;
        c0293j.b(bArr, 0, i7, false);
        long j3 = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            j3 = (j3 << 8) | ((long) (bArr[i8] & 255));
        }
        return j3;
    }
}
