package S5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class H extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f6766e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f6767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f6768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f6769d;

    static {
        String str = u.f6810p;
        f6766e = N2.z.n("/");
    }

    public H(u uVar, l lVar, LinkedHashMap linkedHashMap) {
        this.f6767b = uVar;
        this.f6768c = lVar;
        this.f6769d = linkedHashMap;
    }

    @Override // S5.l
    public final void a(u uVar) throws IOException {
        AbstractC1209k.f(uVar, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // S5.l
    public final List d(u uVar) throws IOException {
        AbstractC1209k.f(uVar, "dir");
        u uVar2 = f6766e;
        uVar2.getClass();
        T5.f fVar = (T5.f) this.f6769d.get(T5.c.b(uVar2, uVar, true));
        if (fVar != null) {
            return Z4.n.K0(fVar.h);
        }
        throw new IOException("not a directory: " + uVar);
    }

    @Override // S5.l
    public final B3.a f(u uVar) throws Throwable {
        B3.a aVarF;
        Throwable th;
        AbstractC1209k.f(uVar, "path");
        u uVar2 = f6766e;
        uVar2.getClass();
        T5.f fVar = (T5.f) this.f6769d.get(T5.c.b(uVar2, uVar, true));
        Throwable th2 = null;
        if (fVar == null) {
            return null;
        }
        boolean z6 = fVar.f7000b;
        B3.a aVar = new B3.a(!z6, z6, null, z6 ? null : Long.valueOf(fVar.f7002d), null, fVar.f7004f, null);
        long j3 = fVar.f7005g;
        if (j3 == -1) {
            return aVar;
        }
        q qVarG = this.f6768c.g(this.f6767b);
        try {
            y yVarE = M3.a.E(qVarG.c(j3));
            try {
                aVarF = T5.b.f(yVarE, aVar);
                AbstractC1209k.c(aVarF);
                try {
                    yVarE.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    yVarE.close();
                } catch (Throwable th5) {
                    N5.l.k(th4, th5);
                }
                th = th4;
                aVarF = null;
            }
        } catch (Throwable th6) {
            if (qVarG != null) {
                try {
                    qVarG.close();
                } catch (Throwable th7) {
                    N5.l.k(th6, th7);
                }
            }
            aVarF = null;
            th2 = th6;
        }
        if (th != null) {
            throw th;
        }
        AbstractC1209k.c(aVarF);
        try {
            qVarG.close();
        } catch (Throwable th8) {
            th2 = th8;
        }
        if (th2 != null) {
            throw th2;
        }
        AbstractC1209k.c(aVarF);
        return aVarF;
    }

    @Override // S5.l
    public final q g(u uVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // S5.l
    public final C h(u uVar) throws IOException {
        AbstractC1209k.f(uVar, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // S5.l
    public final E i(u uVar) throws Throwable {
        Throwable th;
        y yVarE;
        AbstractC1209k.f(uVar, "file");
        u uVar2 = f6766e;
        uVar2.getClass();
        T5.f fVar = (T5.f) this.f6769d.get(T5.c.b(uVar2, uVar, true));
        if (fVar == null) {
            throw new FileNotFoundException("no such file: " + uVar);
        }
        q qVarG = this.f6768c.g(this.f6767b);
        try {
            yVarE = M3.a.E(qVarG.c(fVar.f7005g));
            try {
                qVarG.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (qVarG != null) {
                try {
                    qVarG.close();
                } catch (Throwable th4) {
                    N5.l.k(th3, th4);
                }
            }
            th = th3;
            yVarE = null;
        }
        if (th != null) {
            throw th;
        }
        AbstractC1209k.c(yVarE);
        T5.b.f(yVarE, null);
        int i7 = fVar.f7003e;
        long j3 = fVar.f7002d;
        if (i7 == 0) {
            return new T5.d(yVarE, j3, true);
        }
        return new T5.d(new p(M3.a.E(new T5.d(yVarE, fVar.f7001c, true)), new Inflater(true)), j3, false);
    }
}
