package d;

import java.util.ListIterator;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: d.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0735A extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f10719p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0743I f10720q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0735A(C0743I c0743i, int i7) {
        super(1);
        this.f10719p = i7;
        this.f10720q = c0743i;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f10719p) {
            case 0:
                AbstractC1209k.f((C0749b) obj, "backEvent");
                C0743I c0743i = this.f10720q;
                Z4.k kVar = c0743i.f10738b;
                ListIterator listIterator = kVar.listIterator(kVar.b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((AbstractC0773z) objPrevious).f10811a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                AbstractC0773z abstractC0773z = (AbstractC0773z) objPrevious;
                if (c0743i.f10739c != null) {
                    c0743i.b();
                }
                c0743i.f10739c = abstractC0773z;
                break;
            default:
                AbstractC1209k.f((C0749b) obj, "backEvent");
                C0743I c0743i2 = this.f10720q;
                if (c0743i2.f10739c == null) {
                    Z4.k kVar2 = c0743i2.f10738b;
                    ListIterator listIterator2 = kVar2.listIterator(kVar2.b());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((AbstractC0773z) objPrevious2).f10811a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
