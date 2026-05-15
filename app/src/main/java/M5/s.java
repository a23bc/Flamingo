package M5;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;
import m5.AbstractC1209k;
import w.AbstractC1676i;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Closeable {

    /* JADX INFO: renamed from: r */
    public static final Logger f4916r;

    /* JADX INFO: renamed from: o */
    public final S5.y f4917o;

    /* JADX INFO: renamed from: p */
    public final r f4918p;

    /* JADX INFO: renamed from: q */
    public final C0283c f4919q;

    static {
        Logger logger = Logger.getLogger(f.class.getName());
        AbstractC1209k.e(logger, "getLogger(Http2::class.java.name)");
        f4916r = logger;
    }

    public s(S5.y yVar) {
        AbstractC1209k.f(yVar, "source");
        this.f4917o = yVar;
        r rVar = new r(yVar);
        this.f4918p = rVar;
        this.f4919q = new C0283c(rVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x0144, code lost:
    
        throw new java.io.IOException(n1.c.s(r10, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(boolean r20, M5.k r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.s.b(boolean, M5.k):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x012a, code lost:
    
        if (r8 == false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x012c, code lost:
    
        r16.i(G5.b.f2766b, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(M5.k r18, int r19, int r20, int r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.s.c(M5.k, int, int, int):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4917o.close();
    }

    public final void d(k kVar, int i7, int i8) throws IOException {
        int i9;
        Object[] array;
        if (i7 < 8) {
            throw new IOException(n1.c.s(i7, "TYPE_GOAWAY length < 8: "));
        }
        if (i8 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int i10 = this.f4917o.i();
        int i11 = this.f4917o.i();
        int i12 = i7 - 8;
        int[] iArrC = AbstractC1676i.c(14);
        int length = iArrC.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                i9 = 0;
                break;
            }
            i9 = iArrC[i13];
            if (AbstractC1676i.b(i9) == i11) {
                break;
            } else {
                i13++;
            }
        }
        if (i9 == 0) {
            throw new IOException(n1.c.s(i11, "TYPE_GOAWAY unexpected error code: "));
        }
        S5.j jVarG = S5.j.f6786r;
        if (i12 > 0) {
            jVarG = this.f4917o.g(i12);
        }
        AbstractC1209k.f(jVarG, "debugData");
        jVarG.c();
        o oVar = (o) kVar.f4867q;
        synchronized (oVar) {
            array = oVar.f4892p.values().toArray(new w[0]);
            oVar.f4896t = true;
        }
        for (w wVar : (w[]) array) {
            if (wVar.f4931a > i10 && wVar.g()) {
                wVar.j(8);
                ((o) kVar.f4867q).g(wVar.f4931a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0067, code lost:
    
        throw new java.io.IOException(n1.c.s(r7, "Header index too large "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List g(int r6, int r7, int r8, int r9) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.s.g(int, int, int, int):java.util.List");
    }

    public final void h(k kVar, int i7, int i8, int i9) throws IOException {
        int i10;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z6 = false;
        boolean z7 = (i8 & 1) != 0;
        if ((i8 & 8) != 0) {
            byte bD = this.f4917o.d();
            byte[] bArr = G5.b.f2765a;
            i10 = bD & 255;
        } else {
            i10 = 0;
        }
        if ((i8 & 32) != 0) {
            S5.y yVar = this.f4917o;
            yVar.i();
            yVar.d();
            byte[] bArr2 = G5.b.f2765a;
            i7 -= 5;
        }
        List listG = g(q.a(i7, i8, i10), i10, i8, i9);
        ((o) kVar.f4867q).getClass();
        if (i9 != 0 && (i9 & 1) == 0) {
            z6 = true;
        }
        if (z6) {
            o oVar = (o) kVar.f4867q;
            oVar.getClass();
            oVar.f4899w.c(new m(oVar.f4893q + '[' + i9 + "] onHeaders", oVar, i9, listG, z7), 0L);
            return;
        }
        o oVar2 = (o) kVar.f4867q;
        synchronized (oVar2) {
            w wVarC = oVar2.c(i9);
            if (wVarC != null) {
                wVarC.i(G5.b.s(listG), z7);
                return;
            }
            if (oVar2.f4896t) {
                return;
            }
            if (i9 <= oVar2.f4894r) {
                return;
            }
            if (i9 % 2 == oVar2.f4895s % 2) {
                return;
            }
            w wVar = new w(i9, oVar2, false, z7, G5.b.s(listG));
            oVar2.f4894r = i9;
            oVar2.f4892p.put(Integer.valueOf(i9), wVar);
            oVar2.f4897u.e().c(new i(oVar2.f4893q + '[' + i9 + "] onStream", oVar2, wVar, 1), 0L);
        }
    }

    public final void i(k kVar, int i7, int i8, int i9) throws IOException {
        if (i7 != 8) {
            throw new IOException(n1.c.s(i7, "TYPE_PING length != 8: "));
        }
        if (i9 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        int i10 = this.f4917o.i();
        int i11 = this.f4917o.i();
        if ((i8 & 1) == 0) {
            ((o) kVar.f4867q).f4898v.c(new j(Z1.l.t(new StringBuilder(), ((o) kVar.f4867q).f4893q, " ping"), (o) kVar.f4867q, i10, i11, 0), 0L);
            return;
        }
        o oVar = (o) kVar.f4867q;
        synchronized (oVar) {
            try {
                if (i10 == 1) {
                    oVar.f4902z++;
                } else if (i10 == 2) {
                    oVar.f4879B++;
                } else if (i10 == 3) {
                    oVar.notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(k kVar, int i7, int i8, int i9) throws IOException {
        int i10;
        if (i9 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        if ((i8 & 8) != 0) {
            byte bD = this.f4917o.d();
            byte[] bArr = G5.b.f2765a;
            i10 = bD & 255;
        } else {
            i10 = 0;
        }
        int i11 = this.f4917o.i() & Integer.MAX_VALUE;
        List listG = g(q.a(i7 - 4, i8, i10), i10, i8, i9);
        o oVar = (o) kVar.f4867q;
        oVar.getClass();
        synchronized (oVar) {
            if (oVar.f4890M.contains(Integer.valueOf(i11))) {
                oVar.n(i11, 2);
                return;
            }
            oVar.f4890M.add(Integer.valueOf(i11));
            oVar.f4899w.c(new m(oVar.f4893q + '[' + i11 + "] onRequest", oVar, i11, listG), 0L);
        }
    }
}
