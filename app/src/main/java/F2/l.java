package F2;

import android.media.MediaCodec;

/* JADX INFO: loaded from: classes.dex */
public class l extends z2.d {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2224o;

    public l(IllegalStateException illegalStateException, m mVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb.append(mVar == null ? null : mVar.f2225a);
        super(sb.toString(), illegalStateException);
        int i7 = w2.t.f18881a;
        if (i7 >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f2224o = i7 >= 23 ? illegalStateException instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0 : w2.t.q(diagnosticInfo);
    }
}
