package i6;

import M.t0;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import f0.Z0;
import java.util.List;
import t5.C1522f;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z0 f13551o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List f13552p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13553q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Z0 z02, List list, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f13551o = z02;
        this.f13552p = list;
        this.f13553q = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new n(this.f13551o, this.f13552p, this.f13553q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        boolean zBooleanValue = ((Boolean) this.f13551o.getValue()).booleanValue();
        List list = this.f13552p;
        return zBooleanValue ? t5.j.J(new C1522f(Z4.n.m0(list), true, new t0(this.f13553q, 12))) : list;
    }
}
