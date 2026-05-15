package V;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.atomic.AtomicReference;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;
import w5.w0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f7333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f7334p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, c5.d dVar) {
        super(2, dVar);
        this.f7334p = kVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        j jVar = new j(this.f7334p, dVar);
        jVar.f7333o = obj;
        return jVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        boolean z6;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        android.support.v4.media.session.b.K(obj);
        InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f7333o;
        k kVar = this.f7334p;
        InterfaceC1786g0 interfaceC1786g0 = (InterfaceC1786g0) kVar.f7336b.getAndSet(null);
        AtomicReference atomicReference = kVar.f7336b;
        w0 w0VarT = AbstractC1767D.t(interfaceC1765B, null, new i(interfaceC1786g0, kVar, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, w0VarT)) {
                z6 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z6 = false;
                break;
            }
        }
        return Boolean.valueOf(z6);
    }
}
