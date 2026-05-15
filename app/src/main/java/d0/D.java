package d0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w5.C1806y;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;
import x.EnumC1862l0;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E5.a f10825o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f10826p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public E f10827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10828r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f10829s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ EnumC1862l0 f10830t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ E f10831u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f10832v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D(EnumC1862l0 enumC1862l0, E e7, InterfaceC1182c interfaceC1182c, c5.d dVar) {
        super(2, dVar);
        this.f10830t = enumC1862l0;
        this.f10831u = e7;
        this.f10832v = (AbstractC0871i) interfaceC1182c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e5.i, l5.c] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        D d4 = new D(this.f10830t, this.f10831u, this.f10832v, dVar);
        d4.f10829s = obj;
        return d4;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [l5.c] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        E e7;
        ?? r42;
        C c7;
        E5.a aVar;
        E5.a aVar2;
        E e8;
        Throwable th;
        C c8;
        AtomicReference atomicReference;
        E5.a aVar3;
        AtomicReference atomicReference2;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        ?? r12 = this.f10828r;
        try {
            try {
                if (r12 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    c5.g gVarN = ((InterfaceC1765B) this.f10829s).g().n(C1806y.f19581p);
                    AbstractC1209k.c(gVarN);
                    C c9 = new C(this.f10830t, (InterfaceC1786g0) gVarN);
                    while (true) {
                        e7 = this.f10831u;
                        AtomicReference atomicReference3 = e7.f10845a;
                        C c10 = (C) atomicReference3.get();
                        if (c10 != null && c9.f10819a.compareTo(c10.f10819a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c10, c9)) {
                            if (atomicReference3.get() != c10) {
                                break;
                            }
                        }
                        if (c10 != null) {
                            c10.f10820b.c(null);
                        }
                        this.f10829s = c9;
                        E5.d dVar = e7.f10846b;
                        this.f10825o = dVar;
                        AbstractC0871i abstractC0871i = this.f10832v;
                        this.f10826p = abstractC0871i;
                        this.f10827q = e7;
                        this.f10828r = 1;
                        if (dVar.d(this) != enumC0830a) {
                            r42 = abstractC0871i;
                            c7 = c9;
                            aVar = dVar;
                        }
                    }
                    return enumC0830a;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e8 = (E) this.f10826p;
                    E5.a aVar4 = this.f10825o;
                    c8 = (C) this.f10829s;
                    try {
                        android.support.v4.media.session.b.K(obj);
                        aVar3 = aVar4;
                        atomicReference2 = e8.f10845a;
                        while (!atomicReference2.compareAndSet(c8, null) && atomicReference2.get() == c8) {
                        }
                        ((E5.d) aVar3).f(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = e8.f10845a;
                        while (!atomicReference.compareAndSet(c8, null)) {
                        }
                        throw th;
                    }
                }
                E e9 = this.f10827q;
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) this.f10826p;
                E5.a aVar5 = this.f10825o;
                c7 = (C) this.f10829s;
                android.support.v4.media.session.b.K(obj);
                e7 = e9;
                r42 = interfaceC1182c;
                aVar = aVar5;
                this.f10829s = c7;
                this.f10825o = aVar2;
                this.f10826p = e7;
                this.f10827q = null;
                this.f10828r = 2;
                Object objB = r42.b(this);
                if (objB != enumC0830a) {
                    e8 = e7;
                    obj = objB;
                    c8 = c7;
                    aVar3 = aVar2;
                    atomicReference2 = e8.f10845a;
                    while (!atomicReference2.compareAndSet(c8, null)) {
                    }
                    ((E5.d) aVar3).f(null);
                    return obj;
                }
                return enumC0830a;
            } catch (Throwable th3) {
                e8 = e7;
                th = th3;
                c8 = c7;
                atomicReference = e8.f10845a;
                while (!atomicReference.compareAndSet(c8, null) && atomicReference.get() == c8) {
                }
                throw th;
            }
            aVar2 = aVar;
        } catch (Throwable th4) {
            ((E5.d) r12).f(null);
            throw th4;
        }
    }
}
