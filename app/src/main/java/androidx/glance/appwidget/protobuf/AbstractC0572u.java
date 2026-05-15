package androidx.glance.appwidget.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0572u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f9656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f9657b;

    static {
        Charset.forName("US-ASCII");
        f9656a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f9657b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0559g(bArr, 0, 0, false).i(0);
        } catch (C0574w e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
