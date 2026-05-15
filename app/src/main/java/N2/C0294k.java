package N2;

import E4.b0;
import H2.C0197n;
import com.hchen.superlyricapi.BuildConfig;
import d.C0746L;
import d2.C0821i;
import i3.C1083d;
import java.util.ArrayList;
import t3.C1498B;
import t3.C1502b;
import u3.C1534d;

/* JADX INFO: renamed from: N2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0294k implements p {

    /* JADX INFO: renamed from: s */
    public static final int[] f5058s = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: t */
    public static final V.o f5059t = new V.o(new B2.g(15));

    /* JADX INFO: renamed from: u */
    public static final V.o f5060u = new V.o(new B2.g(16));

    /* JADX INFO: renamed from: o */
    public b0 f5061o;

    /* JADX INFO: renamed from: p */
    public boolean f5062p;

    /* JADX INFO: renamed from: q */
    public C0746L f5063q;

    /* JADX INFO: renamed from: r */
    public int f5064r;

    public final void a(int i7, ArrayList arrayList) {
        switch (i7) {
            case 0:
                arrayList.add(new C1083d(1));
                break;
            case 1:
                arrayList.add(new C1083d(2));
                break;
            case 2:
                arrayList.add(new C1502b());
                break;
            case 3:
                arrayList.add(new O2.a());
                break;
            case 4:
                m mVarQ = f5059t.q(0);
                if (mVarQ == null) {
                    arrayList.add(new S2.b());
                } else {
                    arrayList.add(mVarQ);
                }
                break;
            case 5:
                arrayList.add(new T2.b());
                break;
            case 6:
                arrayList.add(new f3.d(this.f5063q, this.f5062p ? 0 : 2));
                break;
            case 7:
                arrayList.add(new g3.d());
                break;
            case 8:
                arrayList.add(new h3.j(this.f5063q, this.f5062p ? 0 : 32));
                arrayList.add(new h3.m(this.f5063q, this.f5062p ? 0 : 16));
                break;
            case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                arrayList.add(new C1083d(0));
                break;
            case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                arrayList.add(new t3.x());
                break;
            case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                if (this.f5061o == null) {
                    E4.G g6 = E4.I.f1870p;
                    this.f5061o = b0.f1913s;
                }
                arrayList.add(new C1498B(!this.f5062p ? 1 : 0, this.f5063q, new w2.r(0L), new k.I(11, this.f5061o)));
                break;
            case 12:
                C1534d c1534d = new C1534d();
                c1534d.f17270c = 0;
                c1534d.f17271d = -1L;
                c1534d.f17273f = -1;
                c1534d.f17274g = -1L;
                arrayList.add(c1534d);
                break;
            case 14:
                arrayList.add(new C0197n(this.f5064r));
                break;
            case 15:
                m mVarQ2 = f5060u.q(new Object[0]);
                if (mVarQ2 != null) {
                    arrayList.add(mVarQ2);
                }
                break;
            case 16:
                arrayList.add(new P2.b(!this.f5062p ? 1 : 0, this.f5063q));
                break;
            case 17:
                arrayList.add(new R2.a(1));
                break;
            case 18:
                arrayList.add(new Q2.a(2));
                break;
            case 19:
                arrayList.add(new R2.a(0));
                break;
            case BuildConfig.API_VERSION /* 20 */:
                arrayList.add(new Q2.a(1));
                break;
            case 21:
                arrayList.add(new Q2.a(0));
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:411:0x0230 A[Catch: all -> 0x024d, TRY_ENTER, TryCatch #0 {all -> 0x024d, blocks: (B:247:0x001f, B:249:0x0032, B:252:0x0039, B:411:0x0230, B:412:0x0233, B:415:0x023b, B:418:0x0241, B:421:0x0247, B:422:0x024a, B:425:0x024f, B:426:0x0255, B:428:0x025b, B:430:0x0265, B:432:0x026d, B:434:0x0275, B:436:0x027d, B:438:0x0285, B:440:0x028d, B:441:0x0295, B:256:0x0045), top: B:447:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0241 A[Catch: all -> 0x024d, TryCatch #0 {all -> 0x024d, blocks: (B:247:0x001f, B:249:0x0032, B:252:0x0039, B:411:0x0230, B:412:0x0233, B:415:0x023b, B:418:0x0241, B:421:0x0247, B:422:0x024a, B:425:0x024f, B:426:0x0255, B:428:0x025b, B:430:0x0265, B:432:0x026d, B:434:0x0275, B:436:0x027d, B:438:0x0285, B:440:0x028d, B:441:0x0295, B:256:0x0045), top: B:447:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x025b A[Catch: all -> 0x024d, TryCatch #0 {all -> 0x024d, blocks: (B:247:0x001f, B:249:0x0032, B:252:0x0039, B:411:0x0230, B:412:0x0233, B:415:0x023b, B:418:0x0241, B:421:0x0247, B:422:0x024a, B:425:0x024f, B:426:0x0255, B:428:0x025b, B:430:0x0265, B:432:0x026d, B:434:0x0275, B:436:0x027d, B:438:0x0285, B:440:0x028d, B:441:0x0295, B:256:0x0045), top: B:447:0x001f }] */
    @Override // N2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized N2.m[] g(android.net.Uri r22, java.util.Map r23) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.C0294k.g(android.net.Uri, java.util.Map):N2.m[]");
    }
}
