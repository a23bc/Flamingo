package T1;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f6900d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f6901a;

    /* JADX INFO: renamed from: b */
    public final U3.h f6902b;

    /* JADX INFO: renamed from: c */
    public volatile int f6903c = 0;

    public v(U3.h hVar, int i7) {
        this.f6902b = hVar;
        this.f6901a = i7;
    }

    public final int a(int i7) {
        U1.a aVarB = b();
        int iB = aVarB.b(16);
        if (iB == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f2745r;
        int i8 = iB + aVarB.f2742o;
        return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i8) + i8 + 4);
    }

    public final U1.a b() {
        ThreadLocal threadLocal = f6900d;
        U1.a aVar = (U1.a) threadLocal.get();
        if (aVar == null) {
            aVar = new U1.a();
            threadLocal.set(aVar);
        }
        U1.b bVar = (U1.b) this.f6902b.f7042o;
        int iB = bVar.b(6);
        if (iB != 0) {
            int i7 = iB + bVar.f2742o;
            int i8 = (this.f6901a * 4) + ((ByteBuffer) bVar.f2745r).getInt(i7) + i7 + 4;
            int i9 = ((ByteBuffer) bVar.f2745r).getInt(i8) + i8;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f2745r;
            aVar.f2745r = byteBuffer;
            if (byteBuffer != null) {
                aVar.f2742o = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                aVar.f2743p = i10;
                aVar.f2744q = ((ByteBuffer) aVar.f2745r).getShort(i10);
                return aVar;
            }
            aVar.f2742o = 0;
            aVar.f2743p = 0;
            aVar.f2744q = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i7;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        U1.a aVarB = b();
        int iB = aVarB.b(4);
        sb.append(Integer.toHexString(iB != 0 ? ((ByteBuffer) aVarB.f2745r).getInt(iB + aVarB.f2742o) : 0));
        sb.append(", codepoints:");
        U1.a aVarB2 = b();
        int iB2 = aVarB2.b(16);
        if (iB2 != 0) {
            int i8 = iB2 + aVarB2.f2742o;
            i7 = ((ByteBuffer) aVarB2.f2745r).getInt(((ByteBuffer) aVarB2.f2745r).getInt(i8) + i8);
        } else {
            i7 = 0;
        }
        for (int i9 = 0; i9 < i7; i9++) {
            sb.append(Integer.toHexString(a(i9)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
