package F2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import z2.C2081b;

/* JADX INFO: loaded from: classes.dex */
public interface j {
    void B(Surface surface);

    ByteBuffer D(int i7);

    int F();

    void a();

    void b(int i7, int i8, int i9, long j3);

    void c(int i7, C2081b c2081b, long j3, int i8);

    void d(Bundle bundle);

    int e(MediaCodec.BufferInfo bufferInfo);

    void f(L2.l lVar, Handler handler);

    void flush();

    void g(long j3, int i7);

    boolean h(r rVar);

    void j(int i7, boolean z6);

    void n(int i7);

    MediaFormat x();

    ByteBuffer y(int i7);
}
