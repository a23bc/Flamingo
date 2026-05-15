package k6;

import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import f0.Z0;
import java.util.List;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.M;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f14136p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z0 f14137q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f14138r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f14139s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC0878b0 interfaceC0878b0, Z0 z02, List list, InterfaceC0878b0 interfaceC0878b02, c5.d dVar) {
        super(2, dVar);
        this.f14136p = interfaceC0878b0;
        this.f14137q = z02;
        this.f14138r = list;
        this.f14139s = interfaceC0878b02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new c(this.f14136p, this.f14137q, this.f14138r, this.f14139s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f14135o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            D5.d dVar = M.f19498b;
            b bVar = new b(this.f14137q, this.f14138r, this.f14139s, null);
            this.f14135o = 1;
            obj = AbstractC1767D.C(dVar, bVar, this);
            if (obj == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        this.f14136p.setValue((List) obj);
        return o.f8736a;
    }
}
