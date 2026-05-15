package J5;

import F5.o;
import F5.y;
import M5.C;
import M5.C0281a;
import java.io.IOException;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    public final l f3754a;

    /* JADX INFO: renamed from: b */
    public final F5.a f3755b;

    /* JADX INFO: renamed from: c */
    public final h f3756c;

    /* JADX INFO: renamed from: d */
    public C1.k f3757d;

    /* JADX INFO: renamed from: e */
    public n f3758e;

    /* JADX INFO: renamed from: f */
    public int f3759f;

    /* JADX INFO: renamed from: g */
    public int f3760g;
    public int h;

    /* JADX INFO: renamed from: i */
    public y f3761i;

    public d(l lVar, F5.a aVar, h hVar) {
        AbstractC1209k.f(lVar, "connectionPool");
        AbstractC1209k.f(hVar, "call");
        this.f3754a = lVar;
        this.f3755b = aVar;
        this.f3756c = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final J5.k a(int r12, int r13, int r14, boolean r15, boolean r16) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.d.a(int, int, int, boolean, boolean):J5.k");
    }

    public final boolean b(o oVar) {
        AbstractC1209k.f(oVar, "url");
        o oVar2 = this.f3755b.h;
        return oVar.f2398e == oVar2.f2398e && AbstractC1209k.a(oVar.f2397d, oVar2.f2397d);
    }

    public final void c(IOException iOException) {
        AbstractC1209k.f(iOException, "e");
        this.f3761i = null;
        if ((iOException instanceof C) && ((C) iOException).f4829o == 8) {
            this.f3759f++;
        } else if (iOException instanceof C0281a) {
            this.f3760g++;
        } else {
            this.h++;
        }
    }
}
