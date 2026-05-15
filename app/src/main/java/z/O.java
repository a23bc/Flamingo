package z;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class O extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f20697o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f20698p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ P f20699q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ long f20700r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(P p7, long j3, c5.d dVar) {
        super(2, dVar);
        this.f20699q = p7;
        this.f20700r = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        O o7 = new O(this.f20699q, this.f20700r, dVar);
        o7.f20698p = obj;
        return o7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f20697o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f20698p;
            P p7 = this.f20699q;
            l5.f fVar = p7.f20709R;
            long jF = n1.r.f(this.f20700r, p7.f20710S ? -1.0f : 1.0f);
            EnumC2048l0 enumC2048l0 = p7.f20706O;
            K k7 = L.f20674a;
            Float f7 = new Float(enumC2048l0 == EnumC2048l0.f20894o ? n1.r.c(jF) : n1.r.b(jF));
            this.f20697o = 1;
            if (fVar.d(interfaceC1765B, f7, this) == enumC0830a) {
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
