package z2;

import android.media.MediaCodec;
import w2.t;
import x3.AbstractC1905G;

/* JADX INFO: renamed from: z2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2081b {

    /* JADX INFO: renamed from: a */
    public byte[] f21104a;

    /* JADX INFO: renamed from: b */
    public byte[] f21105b;

    /* JADX INFO: renamed from: c */
    public int f21106c;

    /* JADX INFO: renamed from: d */
    public int[] f21107d;

    /* JADX INFO: renamed from: e */
    public int[] f21108e;

    /* JADX INFO: renamed from: f */
    public int f21109f;

    /* JADX INFO: renamed from: g */
    public int f21110g;
    public int h;

    /* JADX INFO: renamed from: i */
    public final MediaCodec.CryptoInfo f21111i;

    /* JADX INFO: renamed from: j */
    public final V1.a f21112j;

    public C2081b() {
        V1.a aVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f21111i = cryptoInfo;
        if (t.f18881a >= 24) {
            aVar = new V1.a();
            aVar.f7389o = cryptoInfo;
            aVar.f7390p = AbstractC1905G.a();
        } else {
            aVar = null;
        }
        this.f21112j = aVar;
    }
}
