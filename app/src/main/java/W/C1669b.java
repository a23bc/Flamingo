package w;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.CancellationException;
import l5.InterfaceC1182c;
import m5.C1216r;

/* JADX INFO: renamed from: w.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1669b extends AbstractC0871i implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public C1680m f18616o;

    /* JADX INFO: renamed from: p */
    public C1216r f18617p;

    /* JADX INFO: renamed from: q */
    public int f18618q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C1670c f18619r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ Object f18620s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ a0 f18621t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ long f18622u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1182c f18623v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669b(C1670c c1670c, Object obj, a0 a0Var, long j3, InterfaceC1182c interfaceC1182c, c5.d dVar) {
        super(1, dVar);
        this.f18619r = c1670c;
        this.f18620s = obj;
        this.f18621t = a0Var;
        this.f18622u = j3;
        this.f18623v = interfaceC1182c;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        a0 a0Var = this.f18621t;
        return new C1669b(this.f18619r, this.f18620s, a0Var, this.f18622u, this.f18623v, (c5.d) obj).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        C1216r c1216r;
        C1680m c1680m;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f18618q;
        int i8 = 1;
        C1670c c1670c = this.f18619r;
        try {
            if (i7 == 0) {
                android.support.v4.media.session.b.K(obj);
                c1670c.f18630c.f18711q = (r) c1670c.f18628a.f18722a.b(this.f18620s);
                a0 a0Var = this.f18621t;
                c1670c.f18632e.setValue(a0Var.f18610c);
                c1670c.f18631d.setValue(Boolean.TRUE);
                C1680m c1680m2 = c1670c.f18630c;
                C1680m c1680m3 = new C1680m(c1680m2.f18709o, c1680m2.f18710p.getValue(), AbstractC1671d.g(c1680m2.f18711q), c1680m2.f18712r, Long.MIN_VALUE, c1680m2.f18714t);
                C1216r c1216r2 = new C1216r();
                long j3 = this.f18622u;
                C1668a c1668a = new C1668a(c1670c, c1680m3, this.f18623v, c1216r2, 0);
                this.f18616o = c1680m3;
                this.f18617p = c1216r2;
                this.f18618q = 1;
                if (AbstractC1671d.d(c1680m3, a0Var, j3, c1668a, this) == enumC0830a) {
                    return enumC0830a;
                }
                c1216r = c1216r2;
                c1680m = c1680m3;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1216r = this.f18617p;
                c1680m = this.f18616o;
                android.support.v4.media.session.b.K(obj);
            }
            if (!c1216r.f14435o) {
                i8 = 2;
            }
            C1670c.a(c1670c);
            return new C1677j(c1680m, i8);
        } catch (CancellationException e7) {
            C1670c.a(c1670c);
            throw e7;
        }
    }
}
