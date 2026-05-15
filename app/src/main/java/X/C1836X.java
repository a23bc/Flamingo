package x;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: x.X */
/* JADX INFO: loaded from: classes.dex */
public final class C1836X extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f19698o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ C1838Z f19699p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1836X(C1838Z c1838z, c5.d dVar) {
        super(2, dVar);
        this.f19699p = c1838z;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1836X(this.f19699p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1836X) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f19698o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            this.f19698o = 1;
            if (C1838Z.B0(this.f19699p, this) == enumC0830a) {
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
