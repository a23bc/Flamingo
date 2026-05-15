package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0548v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f9521a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f9522b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f9522b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw C0550x.f();
        } catch (C0550x e7) {
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

    public static AbstractC0546t c(Object obj, Object obj2) {
        AbstractC0546t abstractC0546t = (AbstractC0546t) ((AbstractC0528a) obj);
        r rVar = (r) abstractC0546t.d(5);
        rVar.c();
        r.d(rVar.f9518p, abstractC0546t);
        AbstractC0528a abstractC0528a = (AbstractC0528a) obj2;
        if (!rVar.f9517o.getClass().isInstance(abstractC0528a)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        rVar.c();
        r.d(rVar.f9518p, (AbstractC0546t) abstractC0528a);
        return rVar.b();
    }
}
