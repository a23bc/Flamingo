package h3;

import N2.AbstractC0285b;
import t2.N;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w2.m f12572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w2.m f12573g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12574i;

    public d(w2.m mVar, w2.m mVar2, boolean z6) throws N {
        this.f12573g = mVar;
        this.f12572f = mVar2;
        this.f12571e = z6;
        mVar2.G(12);
        this.f12567a = mVar2.y();
        mVar.G(12);
        this.f12574i = mVar.y();
        AbstractC0285b.c("first_chunk must be 1", mVar.g() == 1);
        this.f12568b = -1;
    }

    public final boolean a() {
        int i7 = this.f12568b + 1;
        this.f12568b = i7;
        if (i7 == this.f12567a) {
            return false;
        }
        boolean z6 = this.f12571e;
        w2.m mVar = this.f12572f;
        this.f12570d = z6 ? mVar.z() : mVar.w();
        if (this.f12568b == this.h) {
            w2.m mVar2 = this.f12573g;
            this.f12569c = mVar2.y();
            mVar2.H(4);
            int i8 = this.f12574i - 1;
            this.f12574i = i8;
            this.h = i8 > 0 ? mVar2.y() - 1 : -1;
        }
        return true;
    }
}
