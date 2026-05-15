package androidx.media3.decoder;

import androidx.media3.decoder.ffmpeg.b;
import java.nio.ByteBuffer;
import z2.g;

/* JADX INFO: loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends g {

    /* JADX INFO: renamed from: t */
    public final b f9773t;

    /* JADX INFO: renamed from: u */
    public ByteBuffer f9774u;

    public SimpleDecoderOutputBuffer(b bVar) {
        this.f9773t = bVar;
    }

    @Override // z2.g
    public final void f() {
        super.f();
        ByteBuffer byteBuffer = this.f9774u;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // z2.g
    public final void g() {
        b bVar = this.f9773t;
        bVar.getClass();
        bVar.f9803a.o(this);
    }
}
