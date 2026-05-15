package z3;

import j5.AbstractC1107a;
import java.util.Iterator;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.AbstractC1210l;
import v.C1598P;
import v.C1599Q;
import v.C1618o;
import y3.C2019h;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AbstractC1210l implements InterfaceC1182c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f21184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f21185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f21186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f21187s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(g gVar, InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, int i7) {
        super(1);
        this.f21184p = i7;
        this.f21185q = gVar;
        this.f21186r = interfaceC1182c;
        this.f21187s = interfaceC1182c2;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        InterfaceC1182c interfaceC1182c = this.f21187s;
        InterfaceC1182c interfaceC1182c2 = this.f21186r;
        Object obj2 = null;
        g gVar = this.f21185q;
        switch (this.f21184p) {
            case 0:
                C1618o c1618o = (C1618o) obj;
                AbstractC1209k.f(c1618o, "$this$null");
                y3.s sVar = ((C2019h) c1618o.c()).f20407p;
                AbstractC1209k.d(sVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                f fVar = (f) sVar;
                if (((Boolean) gVar.f21145c.getValue()).booleanValue()) {
                    int i7 = y3.s.f20461v;
                    Iterator it = AbstractC1107a.r(fVar).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC1182c interfaceC1182c3 = (InterfaceC1182c) u.f21195c.get(((y3.s) it.next()).f20468u);
                            C1598P c1598p = interfaceC1182c3 != null ? (C1598P) interfaceC1182c3.b(c1618o) : null;
                            if (c1598p != null) {
                                obj2 = c1598p;
                            }
                        }
                    }
                    return obj2 == null ? (C1598P) interfaceC1182c2.b(c1618o) : obj2;
                }
                int i8 = y3.s.f20461v;
                Iterator it2 = AbstractC1107a.r(fVar).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        InterfaceC1182c interfaceC1182c4 = (InterfaceC1182c) u.f21193a.get(((y3.s) it2.next()).f20468u);
                        C1598P c1598p2 = interfaceC1182c4 != null ? (C1598P) interfaceC1182c4.b(c1618o) : null;
                        if (c1598p2 != null) {
                            obj2 = c1598p2;
                        }
                    }
                }
                return obj2 == null ? (C1598P) interfaceC1182c.b(c1618o) : obj2;
            default:
                C1618o c1618o2 = (C1618o) obj;
                AbstractC1209k.f(c1618o2, "$this$null");
                y3.s sVar2 = ((C2019h) c1618o2.a()).f20407p;
                AbstractC1209k.d(sVar2, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                f fVar2 = (f) sVar2;
                if (((Boolean) gVar.f21145c.getValue()).booleanValue()) {
                    int i9 = y3.s.f20461v;
                    Iterator it3 = AbstractC1107a.r(fVar2).iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            InterfaceC1182c interfaceC1182c5 = (InterfaceC1182c) u.f21196d.get(((y3.s) it3.next()).f20468u);
                            C1599Q c1599q = interfaceC1182c5 != null ? (C1599Q) interfaceC1182c5.b(c1618o2) : null;
                            if (c1599q != null) {
                                obj2 = c1599q;
                            }
                        }
                    }
                    return obj2 == null ? (C1599Q) interfaceC1182c2.b(c1618o2) : obj2;
                }
                int i10 = y3.s.f20461v;
                Iterator it4 = AbstractC1107a.r(fVar2).iterator();
                while (true) {
                    if (it4.hasNext()) {
                        InterfaceC1182c interfaceC1182c6 = (InterfaceC1182c) u.f21194b.get(((y3.s) it4.next()).f20468u);
                        C1599Q c1599q2 = interfaceC1182c6 != null ? (C1599Q) interfaceC1182c6.b(c1618o2) : null;
                        if (c1599q2 != null) {
                            obj2 = c1599q2;
                        }
                    }
                }
                return obj2 == null ? (C1599Q) interfaceC1182c.b(c1618o2) : obj2;
        }
    }
}
