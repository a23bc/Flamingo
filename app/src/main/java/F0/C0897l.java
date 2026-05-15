package f0;

import d5.EnumC0830a;
import e5.AbstractC0870h;
import m5.AbstractC1209k;
import m5.AbstractC1223y;
import t.C1444F;

/* JADX INFO: renamed from: f0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0897l extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11820p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11821q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11822r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11823s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ c5.d f11824t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0899m f11825u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0897l(C0899m c0899m, c5.d dVar) {
        super(dVar);
        this.f11825u = c0899m;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0897l c0897l = new C0897l(this.f11825u, dVar);
        c0897l.f11824t = (c5.d) obj;
        return c0897l;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0897l) create((t5.i) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        t5.i iVar;
        int i7;
        int i8;
        int i9;
        String strS;
        int i10;
        int i11;
        String str;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i12 = this.f11823s;
        if (i12 == 0) {
            android.support.v4.media.session.b.K(obj);
            iVar = (t5.i) this.f11824t;
            i7 = 0;
            i8 = 0;
            i9 = 0;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = this.f11822r;
            i8 = this.f11821q;
            i9 = this.f11820p;
            iVar = (t5.i) this.f11824t;
            android.support.v4.media.session.b.K(obj);
        }
        C0899m c0899m = this.f11825u;
        t.x xVar = c0899m.f11838q;
        if (i9 >= Math.min(c0899m.f11839r, xVar.f16127b)) {
            return Y4.o.f8736a;
        }
        int i13 = i9 + 1;
        int iB = xVar.b(i9);
        C1444F c1444f = c0899m.f11836o;
        switch (iB) {
            case 0:
                strS = "up";
                break;
            case 1:
                int i14 = i8 + 1;
                Object objE = c1444f.e(i8);
                i8 = i14;
                strS = "down " + objE;
                break;
            case 2:
                strS = "remove " + xVar.b(i13) + ' ' + xVar.b(i9 + 2);
                i13 = i9 + 3;
                break;
            case 3:
                strS = "move " + xVar.b(i13) + ' ' + xVar.b(i9 + 2) + ' ' + xVar.b(i9 + 3);
                i13 = i9 + 4;
                break;
            case 4:
                strS = "clear";
                break;
            case 5:
                i10 = i9 + 2;
                int iB2 = xVar.b(i13);
                i11 = i8 + 1;
                str = "insertBottomUp " + iB2 + ' ' + c1444f.e(i8);
                int i15 = i11;
                i13 = i10;
                strS = str;
                i8 = i15;
                break;
            case 6:
                i10 = i9 + 2;
                int iB3 = xVar.b(i13);
                i11 = i8 + 1;
                str = "insertTopDown " + iB3 + ' ' + c1444f.e(i8);
                int i152 = i11;
                i13 = i10;
                strS = str;
                i8 = i152;
                break;
            case 7:
                int i16 = i8 + 1;
                Object objE2 = c1444f.e(i8);
                AbstractC1209k.d(objE2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                AbstractC1223y.c(2, objE2);
                i8 += 2;
                strS = "apply " + ((l5.e) objE2) + ' ' + c1444f.e(i16);
                break;
            case 8:
                strS = "reuse " + c0899m.f11837p.e(i7);
                i7++;
                break;
            default:
                strS = n1.c.s(iB, "unknown op: ");
                break;
        }
        this.f11824t = iVar;
        this.f11820p = i13;
        this.f11821q = i8;
        this.f11822r = i7;
        this.f11823s = 1;
        iVar.c(i9 + ": " + strS, this);
        return enumC0830a;
    }
}
