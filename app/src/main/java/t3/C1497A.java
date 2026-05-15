package t3;

import N2.AbstractC0285b;
import N2.H;
import java.util.List;
import t2.C1486o;
import t2.C1487p;
import t2.M;
import w2.AbstractC1697a;

/* JADX INFO: renamed from: t3.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1497A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f16778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H[] f16779c;

    public C1497A(int i7, List list) {
        this.f16777a = i7;
        switch (i7) {
            case 1:
                this.f16778b = list;
                this.f16779c = new H[list.size()];
                break;
            default:
                this.f16778b = list;
                this.f16779c = new H[list.size()];
                break;
        }
    }

    public void a(long j3, w2.m mVar) {
        if (mVar.a() < 9) {
            return;
        }
        int iG = mVar.g();
        int iG2 = mVar.g();
        int iU = mVar.u();
        if (iG == 434 && iG2 == 1195456820 && iU == 3) {
            AbstractC0285b.e(j3, mVar, this.f16779c);
        }
    }

    public final void b(N2.o oVar, C1500D c1500d) {
        switch (this.f16777a) {
            case 0:
                int i7 = 0;
                while (true) {
                    H[] hArr = this.f16779c;
                    if (i7 < hArr.length) {
                        c1500d.a();
                        c1500d.b();
                        H hE = oVar.E(c1500d.f16800d, 3);
                        C1487p c1487p = (C1487p) this.f16778b.get(i7);
                        String str = c1487p.f16701m;
                        AbstractC1697a.c("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = c1487p.f16691a;
                        if (str2 == null) {
                            c1500d.b();
                            str2 = c1500d.f16801e;
                        }
                        C1486o c1486o = new C1486o();
                        c1486o.f16617a = str2;
                        c1486o.l = M.j(str);
                        c1486o.f16621e = c1487p.f16695e;
                        c1486o.f16620d = c1487p.f16694d;
                        c1486o.f16612E = c1487p.f16685F;
                        c1486o.f16629o = c1487p.f16704p;
                        hE.e(new C1487p(c1486o));
                        hArr[i7] = hE;
                        i7++;
                    }
                    break;
                }
                break;
            default:
                int i8 = 0;
                while (true) {
                    H[] hArr2 = this.f16779c;
                    if (i8 < hArr2.length) {
                        c1500d.a();
                        c1500d.b();
                        H hE2 = oVar.E(c1500d.f16800d, 3);
                        C1487p c1487p2 = (C1487p) this.f16778b.get(i8);
                        String str3 = c1487p2.f16701m;
                        AbstractC1697a.c("Invalid closed caption MIME type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        C1486o c1486o2 = new C1486o();
                        c1500d.b();
                        c1486o2.f16617a = c1500d.f16801e;
                        c1486o2.l = M.j(str3);
                        c1486o2.f16621e = c1487p2.f16695e;
                        c1486o2.f16620d = c1487p2.f16694d;
                        c1486o2.f16612E = c1487p2.f16685F;
                        c1486o2.f16629o = c1487p2.f16704p;
                        hE2.e(new C1487p(c1486o2));
                        hArr2[i8] = hE2;
                        i8++;
                    }
                    break;
                }
                break;
        }
    }
}
