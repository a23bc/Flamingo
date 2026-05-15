package I5;

import J5.l;
import M5.k;
import M5.o;
import java.io.IOException;
import java.net.Socket;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3546e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f3547f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i7) {
        super(str, true);
        this.f3546e = i7;
        this.f3547f = obj;
    }

    @Override // I5.a
    public final long a() {
        switch (this.f3546e) {
            case 0:
                ((k) this.f3547f).a();
                return -1L;
            case 1:
                l lVar = (l) this.f3547f;
                long jNanoTime = System.nanoTime();
                int i7 = 0;
                long j3 = Long.MIN_VALUE;
                J5.k kVar = null;
                int i8 = 0;
                for (J5.k kVar2 : lVar.f3804d) {
                    AbstractC1209k.e(kVar2, "connection");
                    synchronized (kVar2) {
                        if (lVar.b(kVar2, jNanoTime) > 0) {
                            i8++;
                        } else {
                            i7++;
                            long j7 = jNanoTime - kVar2.f3800q;
                            if (j7 > j3) {
                                kVar = kVar2;
                                j3 = j7;
                            }
                        }
                    }
                }
                long j8 = lVar.f3801a;
                if (j3 < j8 && i7 <= 5) {
                    if (i7 > 0) {
                        return j8 - j3;
                    }
                    if (i8 > 0) {
                        return j8;
                    }
                    return -1L;
                }
                AbstractC1209k.c(kVar);
                synchronized (kVar) {
                    if (!kVar.f3799p.isEmpty()) {
                        return 0L;
                    }
                    if (kVar.f3800q + j3 != jNanoTime) {
                        return 0L;
                    }
                    kVar.f3794j = true;
                    lVar.f3804d.remove(kVar);
                    Socket socket = kVar.f3789d;
                    AbstractC1209k.c(socket);
                    G5.b.c(socket);
                    if (!lVar.f3804d.isEmpty()) {
                        return 0L;
                    }
                    lVar.f3802b.a();
                    return 0L;
                }
            default:
                o oVar = (o) this.f3547f;
                oVar.getClass();
                try {
                    oVar.f4888K.i(2, 0, false);
                    return -1L;
                } catch (IOException e7) {
                    oVar.b(2, 2, e7);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str) {
        super(str, true);
        this.f3546e = 1;
        this.f3547f = lVar;
    }
}
