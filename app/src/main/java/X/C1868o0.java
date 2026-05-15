package x;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.atomic.AtomicReference;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w5.C1806y;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: renamed from: x.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1868o0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E5.a f19782o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f19783p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public C1872q0 f19784q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19785r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f19786s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1872q0 f19787t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC0871i f19788u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1868o0(C1872q0 c1872q0, InterfaceC1182c interfaceC1182c, c5.d dVar) {
        super(2, dVar);
        EnumC1862l0 enumC1862l0 = EnumC1862l0.f19772o;
        this.f19787t = c1872q0;
        this.f19788u = (AbstractC0871i) interfaceC1182c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [e5.i, l5.c] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        ?? r12 = this.f19788u;
        EnumC1862l0 enumC1862l0 = EnumC1862l0.f19772o;
        C1868o0 c1868o0 = new C1868o0(this.f19787t, r12, dVar);
        c1868o0.f19786s = obj;
        return c1868o0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1868o0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [l5.c] */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        C1872q0 c1872q0;
        ?? r32;
        C1866n0 c1866n0;
        E5.a aVar;
        E5.a aVar2;
        C1872q0 c1872q02;
        Throwable th;
        C1866n0 c1866n02;
        AtomicReference atomicReference;
        E5.a aVar3;
        AtomicReference atomicReference2;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        ?? r12 = this.f19785r;
        try {
            try {
                if (r12 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    c5.g gVarN = ((InterfaceC1765B) this.f19786s).g().n(C1806y.f19581p);
                    AbstractC1209k.c(gVarN);
                    C1866n0 c1866n03 = new C1866n0(EnumC1862l0.f19772o, (InterfaceC1786g0) gVarN);
                    c1872q0 = this.f19787t;
                    C1872q0.a(c1872q0, c1866n03);
                    this.f19786s = c1866n03;
                    E5.d dVar = c1872q0.f19824b;
                    this.f19782o = dVar;
                    AbstractC0871i abstractC0871i = this.f19788u;
                    this.f19783p = abstractC0871i;
                    this.f19784q = c1872q0;
                    this.f19785r = 1;
                    if (dVar.d(this) != enumC0830a) {
                        r32 = abstractC0871i;
                        c1866n0 = c1866n03;
                        aVar = dVar;
                    }
                    return enumC0830a;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1872q02 = (C1872q0) this.f19783p;
                    E5.a aVar4 = this.f19782o;
                    c1866n02 = (C1866n0) this.f19786s;
                    try {
                        android.support.v4.media.session.b.K(obj);
                        aVar3 = aVar4;
                        atomicReference2 = c1872q02.f19823a;
                        while (!atomicReference2.compareAndSet(c1866n02, null) && atomicReference2.get() == c1866n02) {
                        }
                        ((E5.d) aVar3).f(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = c1872q02.f19823a;
                        while (!atomicReference.compareAndSet(c1866n02, null)) {
                        }
                        throw th;
                    }
                }
                C1872q0 c1872q03 = this.f19784q;
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) this.f19783p;
                E5.a aVar5 = this.f19782o;
                c1866n0 = (C1866n0) this.f19786s;
                android.support.v4.media.session.b.K(obj);
                c1872q0 = c1872q03;
                r32 = interfaceC1182c;
                aVar = aVar5;
                this.f19786s = c1866n0;
                this.f19782o = aVar2;
                this.f19783p = c1872q0;
                this.f19784q = null;
                this.f19785r = 2;
                Object objB = r32.b(this);
                if (objB != enumC0830a) {
                    c1872q02 = c1872q0;
                    obj = objB;
                    c1866n02 = c1866n0;
                    aVar3 = aVar2;
                    atomicReference2 = c1872q02.f19823a;
                    while (!atomicReference2.compareAndSet(c1866n02, null)) {
                    }
                    ((E5.d) aVar3).f(null);
                    return obj;
                }
                return enumC0830a;
            } catch (Throwable th3) {
                c1872q02 = c1872q0;
                th = th3;
                c1866n02 = c1866n0;
                atomicReference = c1872q02.f19823a;
                while (!atomicReference.compareAndSet(c1866n02, null) && atomicReference.get() == c1866n02) {
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
