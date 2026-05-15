package r1;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import s5.InterfaceC1438c;

/* JADX INFO: renamed from: r1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1411e extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1411e f15673q = new C1411e(1, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1411e f15674r = new C1411e(1, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1411e f15675s = new C1411e(1, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1411e f15676t = new C1411e(1, 3);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final C1411e f15677u = new C1411e(1, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final C1411e f15678v = new C1411e(1, 5);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15679p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1411e(int i7, int i8) {
        super(i7);
        this.f15679p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        switch (this.f15679p) {
            case 0:
                InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
                ((Y0.j) obj).i(Y0.t.f8550w, oVar);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                InterfaceC1438c[] interfaceC1438cArr2 = Y0.v.f8556a;
                ((Y0.j) obj).i(Y0.t.f8549v, oVar);
                break;
            case 4:
                break;
            default:
                z zVar = (z) obj;
                if (zVar.isAttachedToWindow()) {
                    zVar.n();
                }
                break;
        }
        return oVar;
    }
}
