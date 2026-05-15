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
public final class d extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14140o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f14141p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z0 f14142q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f14143r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f14144s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC0878b0 interfaceC0878b0, Z0 z02, List list, InterfaceC0878b0 interfaceC0878b02, c5.d dVar) {
        super(2, dVar);
        this.f14141p = interfaceC0878b0;
        this.f14142q = z02;
        this.f14143r = list;
        this.f14144s = interfaceC0878b02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new d(this.f14141p, this.f14142q, this.f14143r, this.f14144s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f14140o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            D5.d dVar = M.f19498b;
            c cVar = new c(this.f14141p, this.f14142q, this.f14143r, this.f14144s, null);
            this.f14140o = 1;
            if (AbstractC1767D.C(dVar, cVar, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return o.f8736a;
    }
}
