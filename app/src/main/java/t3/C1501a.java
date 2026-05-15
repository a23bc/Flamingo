package t3;

import N2.H;
import N2.J;
import t2.C1487p;

/* JADX INFO: renamed from: t3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1501a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f16803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w2.m f16804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f16807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public H f16808g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16809i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f16810j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16811k;
    public C1487p l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16812m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f16813n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1501a() {
        this(null, 0, 0);
        this.f16802a = 0;
    }

    @Override // t3.f
    public final void a() {
        switch (this.f16802a) {
            case 0:
                this.h = 0;
                this.f16809i = 0;
                this.f16810j = false;
                this.f16813n = -9223372036854775807L;
                break;
            default:
                this.h = 0;
                this.f16809i = 0;
                this.f16810j = false;
                this.f16813n = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03e5  */
    @Override // t3.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(w2.m r23) {
        /*
            Method dump skipped, instruction units count: 1258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.C1501a.b(w2.m):void");
    }

    @Override // t3.f
    public final void c(boolean z6) {
        int i7 = this.f16802a;
    }

    @Override // t3.f
    public final void d(long j3, int i7) {
        switch (this.f16802a) {
            case 0:
                this.f16813n = j3;
                break;
            default:
                this.f16813n = j3;
                break;
        }
    }

    @Override // t3.f
    public final void e(N2.o oVar, C1500D c1500d) {
        switch (this.f16802a) {
            case 0:
                c1500d.a();
                c1500d.b();
                this.f16807f = c1500d.f16801e;
                c1500d.b();
                this.f16808g = oVar.E(c1500d.f16800d, 1);
                break;
            default:
                c1500d.a();
                c1500d.b();
                this.f16807f = c1500d.f16801e;
                c1500d.b();
                this.f16808g = oVar.E(c1500d.f16800d, 1);
                break;
        }
    }

    public C1501a(String str, int i7, int i8) {
        this.f16802a = i8;
        switch (i8) {
            case 1:
                J j3 = new J(16, new byte[16]);
                this.f16803b = j3;
                this.f16804c = new w2.m(j3.f4989d);
                this.h = 0;
                this.f16809i = 0;
                this.f16810j = false;
                this.f16813n = -9223372036854775807L;
                this.f16805d = str;
                this.f16806e = i7;
                break;
            default:
                J j7 = new J(128, new byte[128]);
                this.f16803b = j7;
                this.f16804c = new w2.m(j7.f4989d);
                this.h = 0;
                this.f16813n = -9223372036854775807L;
                this.f16805d = str;
                this.f16806e = i7;
                break;
        }
    }

    private final void f(boolean z6) {
    }

    private final void g(boolean z6) {
    }
}
