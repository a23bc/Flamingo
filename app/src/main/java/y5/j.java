package y5;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a */
    public static final i f20566a = new i();

    public static c a(int i7, int i8, a aVar) {
        if ((i8 & 1) != 0) {
            i7 = 0;
        }
        if ((i8 & 2) != 0) {
            aVar = a.f20528o;
        }
        if (i7 == -2) {
            if (aVar != a.f20528o) {
                return new n(1, aVar);
            }
            g.l.getClass();
            return new c(f.f20564b);
        }
        if (i7 != -1) {
            return i7 != 0 ? i7 != Integer.MAX_VALUE ? aVar == a.f20528o ? new c(i7) : new n(i7, aVar) : new c(Integer.MAX_VALUE) : aVar == a.f20528o ? new c(0) : new n(1, aVar);
        }
        if (aVar == a.f20528o) {
            return new n(1, a.f20529p);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    public static final void b(q qVar, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
            cancellationException.initCause(th);
        }
        qVar.c(cancellationException);
    }
}
