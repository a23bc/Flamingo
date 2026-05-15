package O0;

import java.util.Map;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class M implements InterfaceC0296a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0296a0 f5339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f5340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0296a0 f5342e;

    public /* synthetic */ M(InterfaceC0296a0 interfaceC0296a0, S s7, int i7, InterfaceC0296a0 interfaceC0296a02, int i8) {
        this.f5338a = i8;
        this.f5340c = s7;
        this.f5341d = i7;
        this.f5342e = interfaceC0296a02;
        this.f5339b = interfaceC0296a0;
    }

    @Override // O0.InterfaceC0296a0
    public final Map a() {
        switch (this.f5338a) {
        }
        return this.f5339b.a();
    }

    @Override // O0.InterfaceC0296a0
    public final void b() {
        switch (this.f5338a) {
            case 0:
                S s7 = this.f5340c;
                s7.f5359s = this.f5341d;
                this.f5342e.b();
                t.J j3 = s7.f5366z;
                long[] jArr = j3.f16003a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j7 = jArr[i7];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((255 & j7) < 128) {
                                    int i10 = (i7 << 3) + i9;
                                    Object obj = j3.f16004b[i10];
                                    y0 y0Var = (y0) j3.f16005c[i10];
                                    int iJ = s7.f5351A.j(obj);
                                    if (iJ < 0 || iJ >= s7.f5359s) {
                                        y0Var.a();
                                        j3.l(i10);
                                    }
                                }
                                j7 >>= 8;
                            }
                            if (i8 != 8) {
                            }
                        }
                        if (i7 != length) {
                            i7++;
                        }
                    }
                }
                break;
            default:
                S s8 = this.f5340c;
                s8.f5358r = this.f5341d;
                this.f5342e.b();
                s8.b(s8.f5358r);
                break;
        }
    }

    @Override // O0.InterfaceC0296a0
    public final int c() {
        switch (this.f5338a) {
        }
        return this.f5339b.c();
    }

    @Override // O0.InterfaceC0296a0
    public final InterfaceC1182c d() {
        switch (this.f5338a) {
        }
        return this.f5339b.d();
    }

    @Override // O0.InterfaceC0296a0
    public final int e() {
        switch (this.f5338a) {
        }
        return this.f5339b.e();
    }
}
