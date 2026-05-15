package w3;

import java.util.List;
import t2.BinderC1478g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P implements S {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19036o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ U f19037p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ List f19038q;

    public /* synthetic */ P(U u7, List list, int i7) {
        this.f19036o = i7;
        this.f19037p = u7;
        this.f19038q = list;
    }

    @Override // w3.S
    public final void e(InterfaceC1741o interfaceC1741o, int i7) {
        switch (this.f19036o) {
            case 0:
                U u7 = this.f19037p;
                u7.getClass();
                E4.F fO = E4.I.o();
                int i8 = 0;
                while (true) {
                    List list = this.f19038q;
                    if (i8 >= list.size()) {
                        interfaceC1741o.P(u7.f19061c, i7, new BinderC1478g(fO.f()), true);
                    } else {
                        fO.a(((t2.G) list.get(i8)).b(true));
                        i8++;
                    }
                    break;
                }
                break;
            default:
                U u8 = this.f19037p;
                u8.getClass();
                E4.F fO2 = E4.I.o();
                int i9 = 0;
                while (true) {
                    List list2 = this.f19038q;
                    if (i9 >= list2.size()) {
                        interfaceC1741o.Z(u8.f19061c, i7, new BinderC1478g(fO2.f()));
                    } else {
                        fO2.a(((t2.G) list2.get(i9)).b(true));
                        i9++;
                    }
                    break;
                }
                break;
        }
    }
}
