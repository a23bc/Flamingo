package i2;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.atomic.AtomicReference;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: loaded from: classes.dex */
public final class M extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13346o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f13347p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w f13348q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B2.g f13349r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(w wVar, B2.g gVar, c5.d dVar) {
        super(2, dVar);
        this.f13348q = wVar;
        this.f13349r = gVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        M m7 = new M(this.f13348q, this.f13349r, dVar);
        m7.f13347p = obj;
        return m7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((M) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        AtomicReference atomicReference;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f13346o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f13347p;
            AtomicReference atomicReference2 = new AtomicReference(null);
            L l = new L(this.f13348q, this.f13349r, interfaceC1765B, atomicReference2, null);
            this.f13347p = atomicReference2;
            this.f13346o = 1;
            obj = AbstractC1767D.h(l, this);
            if (obj == enumC0830a) {
                return enumC0830a;
            }
            atomicReference = atomicReference2;
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atomicReference = (AtomicReference) this.f13347p;
            android.support.v4.media.session.b.K(obj);
        }
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) atomicReference.get();
        if (interfaceC1786g0 != null) {
            interfaceC1786g0.c(null);
        }
        return obj;
    }
}
