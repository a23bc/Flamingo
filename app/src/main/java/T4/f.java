package T4;

import j5.AbstractC1110d;
import m5.AbstractC1209k;
import x0.C1895e;
import y0.AbstractC1983p;
import y0.C1979l;
import y0.C1987t;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1979l f6958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f6963g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AbstractC1983p f6964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f6965j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f6966k;

    public f(a aVar) {
        AbstractC1209k.f(aVar, "area");
        this.f6957a = aVar;
        this.f6959c = true;
        this.f6960d = 9205357640488583168L;
        this.f6961e = 9205357640488583168L;
        this.f6962f = 9205357640488583168L;
        this.f6963g = Float.NaN;
        int i7 = C1987t.f20263k;
        long j3 = C1987t.f20262j;
        this.f6965j = j3;
        this.f6966k = j3;
    }

    public final long a() {
        long j3 = this.f6961e;
        if (j3 == 9205357640488583168L || this.f6960d == 9205357640488583168L) {
            return 0L;
        }
        return AbstractC1110d.g((C1895e.d(j3) - C1895e.d(this.f6960d)) / 2.0f, (C1895e.b(this.f6961e) - C1895e.b(this.f6960d)) / 2.0f);
    }
}
