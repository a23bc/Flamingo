package y2;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class B implements h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h f20300o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f20301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Uri f20302q;

    public B(h hVar) {
        hVar.getClass();
        this.f20300o = hVar;
        this.f20302q = Uri.EMPTY;
        Map map = Collections.EMPTY_MAP;
    }

    @Override // y2.h
    public final void a(C c7) {
        c7.getClass();
        this.f20300o.a(c7);
    }

    @Override // y2.h
    public final void close() {
        this.f20300o.close();
    }

    @Override // y2.h
    public final Map d() {
        return this.f20300o.d();
    }

    @Override // y2.h
    public final long e(m mVar) {
        this.f20302q = mVar.f20345a;
        Map map = Collections.EMPTY_MAP;
        h hVar = this.f20300o;
        long jE = hVar.e(mVar);
        Uri uriH = hVar.h();
        uriH.getClass();
        this.f20302q = uriH;
        hVar.d();
        return jE;
    }

    @Override // y2.h
    public final Uri h() {
        return this.f20300o.h();
    }

    @Override // t2.InterfaceC1481j
    public final int n(byte[] bArr, int i7, int i8) {
        int iN = this.f20300o.n(bArr, i7, i8);
        if (iN != -1) {
            this.f20301p += (long) iN;
        }
        return iN;
    }
}
