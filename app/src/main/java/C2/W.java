package C2;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: d */
    public static final byte[] f1088d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f1089e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public ByteBuffer f1090a;

    /* JADX INFO: renamed from: b */
    public int f1091b;

    /* JADX INFO: renamed from: c */
    public int f1092c;

    public static void a(ByteBuffer byteBuffer, long j3, int i7, int i8, boolean z6) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z6 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j3);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i7);
        byteBuffer.putInt(0);
        long j7 = i8;
        N5.d.o(j7, "out of range: %s", (j7 >> 8) == 0);
        byteBuffer.put((byte) j7);
    }
}
