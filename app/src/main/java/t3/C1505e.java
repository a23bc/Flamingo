package t3;

import N2.H;
import java.util.Collections;
import java.util.List;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: t3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1505e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f16862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f16863g;

    public C1505e(List list) {
        this.f16857a = 0;
        this.f16862f = list;
        this.f16863g = new H[list.size()];
        this.f16859c = -9223372036854775807L;
    }

    @Override // t3.f
    public final void a() {
        switch (this.f16857a) {
            case 0:
                this.f16858b = false;
                this.f16859c = -9223372036854775807L;
                break;
            default:
                this.f16858b = false;
                this.f16859c = -9223372036854775807L;
                break;
        }
    }

    @Override // t3.f
    public final void b(w2.m mVar) {
        boolean z6;
        boolean z7;
        switch (this.f16857a) {
            case 0:
                if (this.f16858b) {
                    if (this.f16860d == 2) {
                        if (mVar.a() == 0) {
                            z7 = false;
                        } else {
                            if (mVar.u() != 32) {
                                this.f16858b = false;
                            }
                            this.f16860d--;
                            z7 = this.f16858b;
                        }
                        if (!z7) {
                        }
                    }
                    if (this.f16860d == 1) {
                        if (mVar.a() == 0) {
                            z6 = false;
                        } else {
                            if (mVar.u() != 0) {
                                this.f16858b = false;
                            }
                            this.f16860d--;
                            z6 = this.f16858b;
                        }
                        if (!z6) {
                        }
                    }
                    int i7 = mVar.f18868b;
                    int iA = mVar.a();
                    for (H h : (H[]) this.f16863g) {
                        mVar.G(i7);
                        h.c(iA, mVar);
                    }
                    this.f16861e += iA;
                }
                break;
            default:
                AbstractC1697a.j((H) this.f16863g);
                if (this.f16858b) {
                    int iA2 = mVar.a();
                    int i8 = this.f16861e;
                    if (i8 < 10) {
                        int iMin = Math.min(iA2, 10 - i8);
                        byte[] bArr = mVar.f18867a;
                        int i9 = mVar.f18868b;
                        w2.m mVar2 = (w2.m) this.f16862f;
                        System.arraycopy(bArr, i9, mVar2.f18867a, this.f16861e, iMin);
                        if (this.f16861e + iMin == 10) {
                            mVar2.G(0);
                            if (73 == mVar2.u() && 68 == mVar2.u() && 51 == mVar2.u()) {
                                mVar2.H(3);
                                this.f16860d = mVar2.t() + 10;
                            } else {
                                AbstractC1697a.w("Discarding invalid ID3 tag");
                                this.f16858b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.f16860d - this.f16861e);
                    ((H) this.f16863g).c(iMin2, mVar);
                    this.f16861e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // t3.f
    public final void c(boolean z6) {
        int i7;
        switch (this.f16857a) {
            case 0:
                if (this.f16858b) {
                    AbstractC1697a.i(this.f16859c != -9223372036854775807L);
                    for (H h : (H[]) this.f16863g) {
                        h.f(this.f16859c, 1, this.f16861e, 0, null);
                    }
                    this.f16858b = false;
                }
                break;
            default:
                AbstractC1697a.j((H) this.f16863g);
                if (this.f16858b && (i7 = this.f16860d) != 0 && this.f16861e == i7) {
                    AbstractC1697a.i(this.f16859c != -9223372036854775807L);
                    ((H) this.f16863g).f(this.f16859c, 1, this.f16860d, 0, null);
                    this.f16858b = false;
                    break;
                }
                break;
        }
    }

    @Override // t3.f
    public final void d(long j3, int i7) {
        switch (this.f16857a) {
            case 0:
                if ((i7 & 4) != 0) {
                    this.f16858b = true;
                    this.f16859c = j3;
                    this.f16861e = 0;
                    this.f16860d = 2;
                    break;
                }
                break;
            default:
                if ((i7 & 4) != 0) {
                    this.f16858b = true;
                    this.f16859c = j3;
                    this.f16860d = 0;
                    this.f16861e = 0;
                    break;
                }
                break;
        }
    }

    @Override // t3.f
    public final void e(N2.o oVar, C1500D c1500d) {
        switch (this.f16857a) {
            case 0:
                int i7 = 0;
                while (true) {
                    H[] hArr = (H[]) this.f16863g;
                    if (i7 < hArr.length) {
                        C1499C c1499c = (C1499C) ((List) this.f16862f).get(i7);
                        c1500d.a();
                        c1500d.b();
                        H hE = oVar.E(c1500d.f16800d, 3);
                        C1486o c1486o = new C1486o();
                        c1500d.b();
                        c1486o.f16617a = c1500d.f16801e;
                        c1486o.l = M.j("application/dvbsubs");
                        c1486o.f16629o = Collections.singletonList(c1499c.f16796b);
                        c1486o.f16620d = c1499c.f16795a;
                        hE.e(new C1487p(c1486o));
                        hArr[i7] = hE;
                        i7++;
                    }
                    break;
                }
                break;
            default:
                c1500d.a();
                c1500d.b();
                H hE2 = oVar.E(c1500d.f16800d, 5);
                this.f16863g = hE2;
                C1486o c1486o2 = new C1486o();
                c1500d.b();
                c1486o2.f16617a = c1500d.f16801e;
                c1486o2.l = M.j("application/id3");
                hE2.e(new C1487p(c1486o2));
                break;
        }
    }

    public C1505e() {
        this.f16857a = 1;
        this.f16862f = new w2.m(10);
        this.f16859c = -9223372036854775807L;
    }
}
