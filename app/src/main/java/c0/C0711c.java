package c0;

import Q0.AbstractC0347f;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: c0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0711c extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f10545o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ p f10546p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0712d f10547q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ B.m f10548r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0711c(p pVar, C0712d c0712d, B.m mVar, c5.d dVar) {
        super(2, dVar);
        this.f10546p = pVar;
        this.f10547q = c0712d;
        this.f10548r = mVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0711c(this.f10546p, this.f10547q, this.f10548r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0711c) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10545o;
        B.m mVar = this.f10548r;
        C0712d c0712d = this.f10547q;
        try {
            if (i7 == 0) {
                android.support.v4.media.session.b.K(obj);
                p pVar = this.f10546p;
                this.f10545o = 1;
                if (pVar.a(this) == enumC0830a) {
                    return enumC0830a;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                android.support.v4.media.session.b.K(obj);
            }
            c0712d.f10549M.k(mVar);
            AbstractC0347f.m(c0712d);
            return Y4.o.f8736a;
        } catch (Throwable th) {
            c0712d.f10549M.k(mVar);
            AbstractC0347f.m(c0712d);
            throw th;
        }
    }
}
