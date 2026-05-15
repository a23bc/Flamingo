package w4;

import L2.C0247a;
import a.AbstractC0509a;
import com.tencent.mmkv.MMKV;
import f0.C0879c;
import f0.C0894j0;
import f0.InterfaceC0878b0;
import java.io.Serializable;
import m5.AbstractC1209k;
import r1.x;
import s5.InterfaceC1438c;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC0878b0 {

    /* JADX INFO: renamed from: t */
    public static final Object f19455t = AbstractC0509a.N(Y4.f.f8723o, a.f19442v);

    /* JADX INFO: renamed from: o */
    public final C0247a f19456o;

    /* JADX INFO: renamed from: p */
    public final String f19457p;

    /* JADX INFO: renamed from: q */
    public final C0894j0 f19458q;

    /* JADX INFO: renamed from: r */
    public final C0894j0 f19459r;

    /* JADX INFO: renamed from: s */
    public final Object f19460s;

    public f(C0247a c0247a, String str, Serializable serializable) {
        AbstractC1209k.f(c0247a, "dataSaverInterface");
        this.f19456o = c0247a;
        this.f19457p = str;
        this.f19458q = C0879c.t(serializable);
        this.f19459r = C0879c.t(null);
        this.f19460s = AbstractC0509a.N(Y4.f.f8723o, new x(7, this));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [Y4.e, java.lang.Object] */
    public final void b(Object obj) {
        C0894j0 c0894j0 = this.f19458q;
        Object value = c0894j0.getValue();
        c0894j0.setValue(obj);
        if (AbstractC1209k.a(value, obj)) {
            return;
        }
        Object obj2 = g.f19461a;
        if (obj2.equals(obj2)) {
            if (c0894j0.getValue() == null) {
                ((MMKV) this.f19456o.f4105p).q(this.f19457p);
                return;
            }
            Object value2 = c0894j0.getValue();
            AbstractC1209k.c(value2);
            C0894j0 c0894j02 = this.f19459r;
            InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) c0894j02.getValue();
            if (interfaceC1786g0 != null) {
                interfaceC1786g0.c(null);
            }
            c0894j02.setValue(AbstractC1767D.t((InterfaceC1765B) this.f19460s.getValue(), null, new e(value2, this, null), 3));
        }
    }

    public final Object c(InterfaceC1438c interfaceC1438c) {
        AbstractC1209k.f(interfaceC1438c, "property");
        return this.f19458q.getValue();
    }

    public final void d(InterfaceC1438c interfaceC1438c, Object obj) {
        AbstractC1209k.f(interfaceC1438c, "property");
        b(obj);
    }

    @Override // f0.Z0
    public final Object getValue() {
        return this.f19458q.getValue();
    }

    @Override // f0.InterfaceC0878b0
    public final void setValue(Object obj) {
        b(obj);
    }
}
