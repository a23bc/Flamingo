package w;

import m5.AbstractC1209k;
import v.EnumC1588F;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f18655b;

    public e0(Object obj, Object obj2) {
        this.f18654a = obj;
        this.f18655b = obj2;
    }

    @Override // w.d0
    public final Object a() {
        return this.f18654a;
    }

    @Override // w.d0
    public final boolean b(EnumC1588F enumC1588F, EnumC1588F enumC1588F2) {
        return enumC1588F.equals(a()) && enumC1588F2.equals(c());
    }

    @Override // w.d0
    public final Object c() {
        return this.f18655b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (AbstractC1209k.a(this.f18654a, d0Var.a())) {
            return AbstractC1209k.a(this.f18655b, d0Var.c());
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f18654a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f18655b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
