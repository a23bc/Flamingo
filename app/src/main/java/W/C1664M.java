package w;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w5.C1806y;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: renamed from: w.M, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1664M extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E5.a f18538o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f18539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1665N f18540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18541r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f18542s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1665N f18543t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f18544u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1664M(C1665N c1665n, InterfaceC1182c interfaceC1182c, c5.d dVar) {
        super(2, dVar);
        this.f18543t = c1665n;
        this.f18544u = (AbstractC0871i) interfaceC1182c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e5.i, l5.c] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1664M c1664m = new C1664M(this.f18543t, this.f18544u, dVar);
        c1664m.f18542s = obj;
        return c1664m;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1664M) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [l5.c] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        C1665N c1665n;
        ?? r22;
        C1663L c1663l;
        E5.a aVar;
        E5.a aVar2;
        C1665N c1665n2;
        Throwable th;
        C1663L c1663l2;
        AtomicReference atomicReference;
        E5.a aVar3;
        AtomicReference atomicReference2;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        ?? r12 = this.f18541r;
        try {
            try {
                if (r12 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    c5.g gVarN = ((InterfaceC1765B) this.f18542s).g().n(C1806y.f19581p);
                    AbstractC1209k.c(gVarN);
                    C1663L c1663l3 = new C1663L((InterfaceC1786g0) gVarN);
                    while (true) {
                        c1665n = this.f18543t;
                        AtomicReference atomicReference3 = c1665n.f18545a;
                        C1663L c1663l4 = (C1663L) atomicReference3.get();
                        if (c1663l4 != null && 1 - 1 < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c1663l4, c1663l3)) {
                            if (atomicReference3.get() != c1663l4) {
                                break;
                            }
                        }
                        if (c1663l4 != null) {
                            c1663l4.f18537a.c(new A5.p("Mutation interrupted", 1));
                        }
                        this.f18542s = c1663l3;
                        E5.d dVar = c1665n.f18546b;
                        this.f18538o = dVar;
                        AbstractC0871i abstractC0871i = this.f18544u;
                        this.f18539p = abstractC0871i;
                        this.f18540q = c1665n;
                        this.f18541r = 1;
                        if (dVar.d(this) != enumC0830a) {
                            r22 = abstractC0871i;
                            c1663l = c1663l3;
                            aVar = dVar;
                        }
                    }
                    return enumC0830a;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1665n2 = (C1665N) this.f18539p;
                    E5.a aVar4 = this.f18538o;
                    c1663l2 = (C1663L) this.f18542s;
                    try {
                        android.support.v4.media.session.b.K(obj);
                        aVar3 = aVar4;
                        atomicReference2 = c1665n2.f18545a;
                        while (!atomicReference2.compareAndSet(c1663l2, null) && atomicReference2.get() == c1663l2) {
                        }
                        ((E5.d) aVar3).f(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = c1665n2.f18545a;
                        while (!atomicReference.compareAndSet(c1663l2, null)) {
                        }
                        throw th;
                    }
                }
                C1665N c1665n3 = this.f18540q;
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) this.f18539p;
                E5.a aVar5 = this.f18538o;
                c1663l = (C1663L) this.f18542s;
                android.support.v4.media.session.b.K(obj);
                c1665n = c1665n3;
                r22 = interfaceC1182c;
                aVar = aVar5;
                this.f18542s = c1663l;
                this.f18538o = aVar2;
                this.f18539p = c1665n;
                this.f18540q = null;
                this.f18541r = 2;
                Object objB = r22.b(this);
                if (objB != enumC0830a) {
                    c1665n2 = c1665n;
                    obj = objB;
                    c1663l2 = c1663l;
                    aVar3 = aVar2;
                    atomicReference2 = c1665n2.f18545a;
                    while (!atomicReference2.compareAndSet(c1663l2, null)) {
                    }
                    ((E5.d) aVar3).f(null);
                    return obj;
                }
                return enumC0830a;
            } catch (Throwable th3) {
                c1665n2 = c1665n;
                th = th3;
                c1663l2 = c1663l;
                atomicReference = c1665n2.f18545a;
                while (!atomicReference.compareAndSet(c1663l2, null) && atomicReference.get() == c1663l2) {
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
