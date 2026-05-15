package U5;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w.C1670c;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class O extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1670c f7160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f7161q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(C1670c c1670c, float f7, c5.d dVar) {
        super(2, dVar);
        this.f7160p = c1670c;
        this.f7161q = f7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new O(this.f7160p, this.f7161q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f7159o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C1670c c1670c = this.f7160p;
            Float f7 = new Float(((Number) c1670c.e()).floatValue() + this.f7161q);
            this.f7159o = 1;
            if (c1670c.g(this, f7) == enumC0830a) {
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
