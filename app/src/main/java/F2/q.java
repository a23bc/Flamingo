package F2;

import t2.C1487p;

/* JADX INFO: loaded from: classes.dex */
public final class q extends Exception {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f2232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f2233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f2234q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f2235r;

    public q(C1487p c1487p, x xVar, boolean z6, int i7) {
        this("Decoder init failed: [" + i7 + "], " + c1487p, xVar, c1487p.f16701m, z6, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i7 < 0 ? "neg_" : "") + Math.abs(i7));
    }

    public q(String str, Throwable th, String str2, boolean z6, m mVar, String str3) {
        super(str, th);
        this.f2232o = str2;
        this.f2233p = z6;
        this.f2234q = mVar;
        this.f2235r = str3;
    }
}
