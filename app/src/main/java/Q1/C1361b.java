package q1;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: q1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1361b extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1361b f15449q = new C1361b(1, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1361b f15450r = new C1361b(1, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1361b f15451s = new C1361b(1, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1361b f15452t = new C1361b(1, 3);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f15453p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1361b(int i7, int i8) {
        super(i7);
        this.f15453p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f15453p) {
            case 0:
                AbstractC1368i abstractC1368i = (AbstractC1368i) obj;
                abstractC1368i.getHandler().post(new B2.e(19, abstractC1368i.f15477E));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return Y4.o.f8736a;
    }
}
