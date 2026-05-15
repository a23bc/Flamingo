package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ float f10908o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f10909p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(InterfaceC1182c interfaceC1182c, c5.d dVar) {
        super(3, dVar);
        this.f10909p = interfaceC1182c;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        T t7 = new T(this.f10909p, (c5.d) obj3);
        t7.f10908o = fFloatValue;
        Y4.o oVar = Y4.o.f8736a;
        t7.invokeSuspend(oVar);
        return oVar;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        this.f10909p.b(new Float(this.f10908o));
        return Y4.o.f8736a;
    }
}
