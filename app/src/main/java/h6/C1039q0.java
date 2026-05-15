package h6;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w.C1670c;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: h6.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1039q0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1670c f13170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f13171q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1039q0(C1670c c1670c, float f7, c5.d dVar) {
        super(2, dVar);
        this.f13170p = c1670c;
        this.f13171q = f7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1039q0(this.f13170p, this.f13171q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1039q0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13169o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            float fFloatValue = ((Number) this.f13170p.e()).floatValue();
            float f7 = this.f13171q;
            if (fFloatValue != f7) {
                C1670c c1670c = this.f13170p;
                Float f8 = new Float(f7);
                w.S s7 = new w.S(1.2f, 800.0f, new Float(0.001f));
                this.f13169o = 1;
                if (C1670c.c(c1670c, f8, s7, null, null, this, 12) == enumC0830a) {
                    return enumC0830a;
                }
            }
            return Y4.o.f8736a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        android.support.v4.media.session.b.K(obj);
        return Y4.o.f8736a;
    }
}
