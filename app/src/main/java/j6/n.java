package j6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import f0.Z0;
import java.util.List;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.M;

/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13772p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z0 f13773q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f13774r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13775s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC0878b0 interfaceC0878b0, Z0 z02, List list, InterfaceC0878b0 interfaceC0878b02, c5.d dVar) {
        super(2, dVar);
        this.f13772p = interfaceC0878b0;
        this.f13773q = z02;
        this.f13774r = list;
        this.f13775s = interfaceC0878b02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new n(this.f13772p, this.f13773q, this.f13774r, this.f13775s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13771o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            D5.d dVar = M.f19498b;
            m mVar = new m(this.f13772p, this.f13773q, this.f13774r, this.f13775s, null);
            this.f13771o = 1;
            if (AbstractC1767D.C(dVar, mVar, this) == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return Y4.o.f8736a;
    }
}
