package z3;

import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.InterfaceC0595s;
import androidx.lifecycle.InterfaceC0597u;
import y3.C2019h;

/* JADX INFO: loaded from: classes.dex */
public final class i implements InterfaceC0595s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f21149o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p0.p f21150p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C2019h f21151q;

    public i(p0.p pVar, C2019h c2019h, boolean z6) {
        this.f21149o = z6;
        this.f21150p = pVar;
        this.f21151q = c2019h;
    }

    @Override // androidx.lifecycle.InterfaceC0595s
    public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
        C2019h c2019h = this.f21151q;
        boolean z6 = this.f21149o;
        p0.p pVar = this.f21150p;
        if (z6 && !pVar.contains(c2019h)) {
            pVar.add(c2019h);
        }
        if (enumC0592o == EnumC0592o.ON_START && !pVar.contains(c2019h)) {
            pVar.add(c2019h);
        }
        if (enumC0592o == EnumC0592o.ON_STOP) {
            pVar.remove(c2019h);
        }
    }
}
