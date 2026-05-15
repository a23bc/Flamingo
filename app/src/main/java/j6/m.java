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
public final class m extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13766o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13767p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z0 f13768q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f13769r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13770s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC0878b0 interfaceC0878b0, Z0 z02, List list, InterfaceC0878b0 interfaceC0878b02, c5.d dVar) {
        super(2, dVar);
        this.f13767p = interfaceC0878b0;
        this.f13768q = z02;
        this.f13769r = list;
        this.f13770s = interfaceC0878b02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new m(this.f13767p, this.f13768q, this.f13769r, this.f13770s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13766o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            D5.d dVar = M.f19498b;
            l lVar = new l(this.f13768q, this.f13769r, this.f13770s, null);
            this.f13766o = 1;
            obj = AbstractC1767D.C(dVar, lVar, this);
            if (obj == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        this.f13767p.setValue((List) obj);
        return Y4.o.f8736a;
    }
}
