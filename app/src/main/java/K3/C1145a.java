package k3;

import E4.I;
import java.util.List;

/* JADX INFO: renamed from: k3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1145a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f14021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f14022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f14023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14024d;

    public C1145a(List list, long j3, long j7) {
        this.f14021a = I.p(list);
        this.f14022b = j3;
        this.f14023c = j7;
        long j8 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && j7 != -9223372036854775807L) {
            j8 = j3 + j7;
        }
        this.f14024d = j8;
    }
}
