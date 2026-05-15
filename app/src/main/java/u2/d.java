package u2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: renamed from: a */
    public static final ByteBuffer f17209a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean b();

    ByteBuffer c();

    void d();

    void e();

    boolean f();

    void flush();

    b g(b bVar);

    void h(ByteBuffer byteBuffer);
}
