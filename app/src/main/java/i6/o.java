package i6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import f0.Z0;
import java.util.List;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.M;

/* JADX INFO: loaded from: classes.dex */
public final class o extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13554o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13555p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Z0 f13556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f13557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13558s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(InterfaceC0878b0 interfaceC0878b0, Z0 z02, List list, InterfaceC0878b0 interfaceC0878b02, c5.d dVar) {
        super(2, dVar);
        this.f13555p = interfaceC0878b0;
        this.f13556q = z02;
        this.f13557r = list;
        this.f13558s = interfaceC0878b02;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new o(this.f13555p, this.f13556q, this.f13557r, this.f13558s, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13554o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            D5.d dVar = M.f19498b;
            n nVar = new n(this.f13556q, this.f13557r, this.f13558s, null);
            this.f13554o = 1;
            obj = AbstractC1767D.C(dVar, nVar, this);
            if (obj == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        this.f13555p.setValue(z.f((List) obj));
        return Y4.o.f8736a;
    }
}
