package X0;

import Y4.o;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f8242o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ float f8243p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ f f8244q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, c5.d dVar) {
        super(2, dVar);
        this.f8244q = fVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        e eVar = new e(this.f8244q, dVar);
        eVar.f8243p = ((Number) obj).floatValue();
        return eVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(Float.valueOf(((Number) obj).floatValue()), (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f8242o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            float f7 = this.f8243p;
            f fVar = this.f8244q;
            Y0.j jVar = fVar.f8245a.f8484d;
            Object objG = jVar.f8473o.g(Y0.i.f8453e);
            if (objG == null) {
                objG = null;
            }
            l5.e eVar = (l5.e) objG;
            if (eVar == null) {
                throw n1.c.p("Required value was null.");
            }
            C1892b c1892b = new C1892b((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f7)) & 4294967295L));
            this.f8242o = 1;
            obj = eVar.invoke(c1892b, this);
            if (obj == enumC0830a) {
                return enumC0830a;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((C1892b) obj).f19867a & 4294967295L)));
    }
}
