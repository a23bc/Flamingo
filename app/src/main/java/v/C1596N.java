package v;

import l5.InterfaceC1182c;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: v.N, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1596N extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f17992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1597O f17993q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1596N(C1597O c1597o, int i7) {
        super(1);
        this.f17992p = i7;
        this.f17993q = c1597o;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f17992p) {
            case 0:
                w.d0 d0Var = (w.d0) obj;
                EnumC1588F enumC1588F = EnumC1588F.f17962o;
                EnumC1588F enumC1588F2 = EnumC1588F.f17963p;
                boolean zB = d0Var.b(enumC1588F, enumC1588F2);
                Object obj2 = null;
                C1597O c1597o = this.f17993q;
                if (zB) {
                    C1584B c1584b = c1597o.f17997G.f18004a.f18187b;
                    if (c1584b != null) {
                        obj2 = c1584b.f17947c;
                    }
                } else if (d0Var.b(enumC1588F2, EnumC1588F.f17964q)) {
                    C1584B c1584b2 = c1597o.f17998H.f18007a.f18187b;
                    if (c1584b2 != null) {
                        obj2 = c1584b2.f17947c;
                    }
                } else {
                    obj2 = androidx.compose.animation.b.f9114d;
                }
                return obj2 == null ? androidx.compose.animation.b.f9114d : obj2;
            default:
                w.d0 d0Var2 = (w.d0) obj;
                EnumC1588F enumC1588F3 = EnumC1588F.f17962o;
                EnumC1588F enumC1588F4 = EnumC1588F.f17963p;
                boolean zB2 = d0Var2.b(enumC1588F3, enumC1588F4);
                C1597O c1597o2 = this.f17993q;
                if (zB2) {
                    C1598P c1598p = c1597o2.f17997G;
                    return androidx.compose.animation.b.f9113c;
                }
                if (!d0Var2.b(enumC1588F4, EnumC1588F.f17964q)) {
                    return androidx.compose.animation.b.f9113c;
                }
                v0 v0Var = c1597o2.f17998H.f18007a;
                return androidx.compose.animation.b.f9113c;
        }
    }
}
