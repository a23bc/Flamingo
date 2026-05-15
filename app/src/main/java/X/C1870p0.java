package x;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.concurrent.atomic.AtomicReference;
import m5.AbstractC1209k;
import w5.C1806y;
import w5.InterfaceC1765B;
import w5.InterfaceC1786g0;

/* JADX INFO: renamed from: x.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1870p0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public E5.a f19809o;

    /* JADX INFO: renamed from: p */
    public Object f19810p;

    /* JADX INFO: renamed from: q */
    public Object f19811q;

    /* JADX INFO: renamed from: r */
    public C1872q0 f19812r;

    /* JADX INFO: renamed from: s */
    public int f19813s;

    /* JADX INFO: renamed from: t */
    public /* synthetic */ Object f19814t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ EnumC1862l0 f19815u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C1872q0 f19816v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC0871i f19817w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f19818x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1870p0(EnumC1862l0 enumC1862l0, C1872q0 c1872q0, l5.e eVar, Object obj, c5.d dVar) {
        super(2, dVar);
        this.f19815u = enumC1862l0;
        this.f19816v = c1872q0;
        this.f19817w = (AbstractC0871i) eVar;
        this.f19818x = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [e5.i, l5.e] */
    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C1870p0 c1870p0 = new C1870p0(this.f19815u, this.f19816v, this.f19817w, this.f19818x, dVar);
        c1870p0.f19814t = obj;
        return c1870p0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1870p0) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [l5.e] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        C1872q0 c1872q0;
        Object obj2;
        C1866n0 c1866n0;
        E5.a aVar;
        ?? r52;
        C1872q0 c1872q02;
        Throwable th;
        C1866n0 c1866n02;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        ?? r12 = this.f19813s;
        try {
            try {
                if (r12 == 0) {
                    android.support.v4.media.session.b.K(obj);
                    c5.g gVarN = ((InterfaceC1765B) this.f19814t).g().n(C1806y.f19581p);
                    AbstractC1209k.c(gVarN);
                    C1866n0 c1866n03 = new C1866n0(this.f19815u, (InterfaceC1786g0) gVarN);
                    c1872q0 = this.f19816v;
                    C1872q0.a(c1872q0, c1866n03);
                    this.f19814t = c1866n03;
                    E5.d dVar = c1872q0.f19824b;
                    this.f19809o = dVar;
                    AbstractC0871i abstractC0871i = this.f19817w;
                    this.f19810p = abstractC0871i;
                    Object obj3 = this.f19818x;
                    this.f19811q = obj3;
                    this.f19812r = c1872q0;
                    this.f19813s = 1;
                    if (dVar.d(this) != enumC0830a) {
                        obj2 = obj3;
                        c1866n0 = c1866n03;
                        aVar = dVar;
                        r52 = abstractC0871i;
                    }
                    return enumC0830a;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1872q02 = (C1872q0) this.f19810p;
                    aVar = this.f19809o;
                    c1866n02 = (C1866n0) this.f19814t;
                    try {
                        android.support.v4.media.session.b.K(obj);
                        atomicReference2 = c1872q02.f19823a;
                        while (!atomicReference2.compareAndSet(c1866n02, null) && atomicReference2.get() == c1866n02) {
                        }
                        ((E5.d) aVar).f(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = c1872q02.f19823a;
                        while (!atomicReference.compareAndSet(c1866n02, null)) {
                        }
                        throw th;
                    }
                }
                C1872q0 c1872q03 = this.f19812r;
                obj2 = this.f19811q;
                l5.e eVar = (l5.e) this.f19810p;
                E5.a aVar2 = this.f19809o;
                c1866n0 = (C1866n0) this.f19814t;
                android.support.v4.media.session.b.K(obj);
                c1872q0 = c1872q03;
                aVar = aVar2;
                r52 = eVar;
                this.f19814t = c1866n0;
                this.f19809o = aVar;
                this.f19810p = c1872q0;
                this.f19811q = null;
                this.f19812r = null;
                this.f19813s = 2;
                Object objInvoke = r52.invoke(obj2, this);
                if (objInvoke != enumC0830a) {
                    c1872q02 = c1872q0;
                    obj = objInvoke;
                    c1866n02 = c1866n0;
                    atomicReference2 = c1872q02.f19823a;
                    while (!atomicReference2.compareAndSet(c1866n02, null)) {
                    }
                    ((E5.d) aVar).f(null);
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
        } catch (Throwable th4) {
            ((E5.d) r12).f(null);
            throw th4;
        }
    }
}
