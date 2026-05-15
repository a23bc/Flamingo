package R1;

import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f6656o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f6657p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ l5.e f6658q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l5.e eVar, c5.d dVar) {
        super(2, dVar);
        this.f6658q = eVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        c cVar = new c(this.f6658q, dVar);
        cVar.f6657p = obj;
        return cVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f6656o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            b bVar = (b) this.f6657p;
            this.f6656o = 1;
            obj = this.f6658q.invoke(bVar, this);
            if (obj == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        b bVar2 = (b) obj;
        bVar2.f6655b.set(true);
        return bVar2;
    }
}
