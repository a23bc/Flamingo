package U5;

import f0.C0888g0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: U5.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0452y implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7292o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f7293p;

    public /* synthetic */ C0452y(C0888g0 c0888g0, int i7) {
        this.f7292o = i7;
        this.f7293p = c0888g0;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f7292o) {
            case 0:
                C0888g0 c0888g0 = this.f7293p;
                AbstractC1209k.f(c0888g0, "$height");
                c0888g0.j((int) (((n1.m) obj).f14520a & 4294967295L));
                break;
            case 1:
                C0888g0 c0888g02 = this.f7293p;
                AbstractC1209k.f(c0888g02, "$parentHeight");
                c0888g02.j((int) (((n1.m) obj).f14520a & 4294967295L));
                break;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                C0888g0 c0888g03 = this.f7293p;
                AbstractC1209k.f(c0888g03, "$repeatMode");
                c0888g03.j(iIntValue);
                break;
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                C0888g0 c0888g04 = this.f7293p;
                AbstractC1209k.f(c0888g04, "$repeatMode");
                c0888g04.j(iIntValue2);
                break;
            default:
                O0.C c7 = (O0.C) obj;
                C0888g0 c0888g05 = this.f7293p;
                AbstractC1209k.f(c0888g05, "$layoutHeightPx");
                AbstractC1209k.f(c7, "coordinates");
                if (c0888g05.h() != ((int) (c7.G() & 4294967295L))) {
                    c0888g05.j((int) (c7.G() & 4294967295L));
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
