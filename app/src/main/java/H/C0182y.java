package H;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w.C1670c;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: H.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0182y extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0183z f2937p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0182y(C0183z c0183z, c5.d dVar) {
        super(2, dVar);
        this.f2937p = c0183z;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0182y(this.f2937p, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0182y) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f2936o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C1670c c1670c = this.f2937p.f2951n;
            this.f2936o = 1;
            if (c1670c.h(this) == enumC0830a) {
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
