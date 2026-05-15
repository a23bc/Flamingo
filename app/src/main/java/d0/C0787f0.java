package d0;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import s5.InterfaceC1438c;

/* JADX INFO: renamed from: d0.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0787f0 extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0787f0 f10994q = new C0787f0(1, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0787f0 f10995r = new C0787f0(1, 1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0787f0 f10996s = new C0787f0(1, 2);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0787f0 f10997t = new C0787f0(1, 3);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10998p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0787f0(int i7, int i8) {
        super(i7);
        this.f10998p = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Y4.o oVar = Y4.o.f8736a;
        switch (this.f10998p) {
            case 0:
                InterfaceC1438c[] interfaceC1438cArr = Y0.v.f8556a;
                ((Y0.j) obj).i(Y0.t.f8549v, oVar);
                return oVar;
            case 1:
                return oVar;
            case 2:
                return Boolean.TRUE;
            default:
                InterfaceC1438c[] interfaceC1438cArr2 = Y0.v.f8556a;
                Y0.w wVar = Y0.t.l;
                InterfaceC1438c interfaceC1438c = Y0.v.f8556a[5];
                wVar.a((Y0.j) obj, Boolean.TRUE);
                return oVar;
        }
    }
}
