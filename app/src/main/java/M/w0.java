package M;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.InterfaceC0878b0;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import x0.C1892b;
import z.C2054o0;

/* JADX INFO: loaded from: classes.dex */
public final class w0 extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4722o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ C2054o0 f4723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ long f4724q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f4725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f4726s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(InterfaceC1765B interfaceC1765B, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(3, dVar);
        this.f4725r = interfaceC1765B;
        this.f4726s = interfaceC0878b0;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        long j3 = ((C1892b) obj2).f19867a;
        w0 w0Var = new w0(this.f4725r, this.f4726s, (c5.d) obj3);
        w0Var.f4723p = (C2054o0) obj;
        w0Var.f4724q = j3;
        return w0Var.invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f4722o;
        InterfaceC1765B interfaceC1765B = this.f4725r;
        InterfaceC0878b0 interfaceC0878b0 = this.f4726s;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C2054o0 c2054o0 = this.f4723p;
            AbstractC1767D.t(interfaceC1765B, null, new u0(interfaceC0878b0, this.f4724q, null), 3);
            this.f4722o = 1;
            obj = c2054o0.e(this);
            if (obj == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        AbstractC1767D.t(interfaceC1765B, null, new v0(interfaceC0878b0, ((Boolean) obj).booleanValue(), null), 3);
        return Y4.o.f8736a;
    }
}
