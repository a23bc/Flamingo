package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0585h implements InterfaceC0595s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f9741o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f9742p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f9743q;

    public C0585h(InterfaceC0583f interfaceC0583f, InterfaceC0595s interfaceC0595s) {
        AbstractC1209k.f(interfaceC0583f, "defaultLifecycleObserver");
        this.f9742p = interfaceC0583f;
        this.f9743q = interfaceC0595s;
    }

    @Override // androidx.lifecycle.InterfaceC0595s
    public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
        switch (this.f9741o) {
            case 0:
                int i7 = AbstractC0584g.f9740a[enumC0592o.ordinal()];
                InterfaceC0583f interfaceC0583f = (InterfaceC0583f) this.f9742p;
                switch (i7) {
                    case 1:
                        interfaceC0583f.d(interfaceC0597u);
                        break;
                    case 2:
                        interfaceC0583f.i(interfaceC0597u);
                        break;
                    case 3:
                        interfaceC0583f.b(interfaceC0597u);
                        break;
                    case 4:
                        interfaceC0583f.h(interfaceC0597u);
                        break;
                    case 5:
                        interfaceC0583f.j(interfaceC0597u);
                        break;
                    case 6:
                        interfaceC0583f.c(interfaceC0597u);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new A2.W();
                }
                InterfaceC0595s interfaceC0595s = (InterfaceC0595s) this.f9743q;
                if (interfaceC0595s != null) {
                    interfaceC0595s.g(interfaceC0597u, enumC0592o);
                    return;
                }
                return;
            case 1:
                if (enumC0592o == EnumC0592o.ON_START) {
                    ((K) this.f9742p).l(this);
                    ((V.o) this.f9743q).H();
                    return;
                }
                return;
            default:
                HashMap map = ((C0579b) this.f9743q).f9731a;
                List list = (List) map.get(enumC0592o);
                InterfaceC0596t interfaceC0596t = (InterfaceC0596t) this.f9742p;
                C0579b.a(list, interfaceC0597u, enumC0592o, interfaceC0596t);
                C0579b.a((List) map.get(EnumC0592o.ON_ANY), interfaceC0597u, enumC0592o, interfaceC0596t);
                return;
        }
    }

    public C0585h(InterfaceC0596t interfaceC0596t) {
        this.f9742p = interfaceC0596t;
        C0581d c0581d = C0581d.f9735c;
        Class<?> cls = interfaceC0596t.getClass();
        C0579b c0579b = (C0579b) c0581d.f9736a.get(cls);
        this.f9743q = c0579b == null ? c0581d.a(cls, null) : c0579b;
    }

    public C0585h(V.o oVar, K k7) {
        this.f9742p = k7;
        this.f9743q = oVar;
    }
}
