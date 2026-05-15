package i3;

import N2.H;
import N2.o;
import w2.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public H f13484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f13485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f13486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f13487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f13488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13489g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13490i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f13492k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13493m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1084e f13483a = new C1084e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public V1.a f13491j = new V1.a();

    public void a(long j3) {
        this.f13489g = j3;
    }

    public abstract long b(m mVar);

    public abstract boolean c(m mVar, long j3, V1.a aVar);

    public void d(boolean z6) {
        if (z6) {
            this.f13491j = new V1.a();
            this.f13488f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f13487e = -1L;
        this.f13489g = 0L;
    }
}
