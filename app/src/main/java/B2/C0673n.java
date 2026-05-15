package b2;

import android.content.Context;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: b2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0673n extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f10238o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ A0.b f10239p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Context f10240q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C0651c f10241r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0673n(A0.b bVar, Context context, C0651c c0651c, c5.d dVar) {
        super(2, dVar);
        this.f10239p = bVar;
        this.f10240q = context;
        this.f10241r = c0651c;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C0673n(this.f10239p, this.f10240q, this.f10241r, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0673n) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10238o;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return Y4.o.f8736a;
        }
        android.support.v4.media.session.b.K(obj);
        this.f10238o = 1;
        this.f10239p.j0(this);
        return enumC0830a;
    }
}
