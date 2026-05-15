package A5;

import d5.EnumC0830a;
import e5.AbstractC0865c;
import e5.InterfaceC0866d;
import m5.AbstractC1209k;
import u5.AbstractC1546h;
import w5.AbstractC1767D;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractC0865c implements InterfaceC2111f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC2111f f578o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c5.i f579p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f580q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c5.i f581r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c5.d f582s;

    public v(InterfaceC2111f interfaceC2111f, c5.i iVar) {
        super(s.f575o, c5.j.f10685o);
        this.f578o = interfaceC2111f;
        this.f579p = iVar;
        this.f580q = ((Number) iVar.y(0, u.f577p)).intValue();
    }

    @Override // z5.InterfaceC2111f
    public final Object f(Object obj, c5.d dVar) {
        try {
            Object objI = i(dVar, obj);
            return objI == EnumC0830a.f11264o ? objI : Y4.o.f8736a;
        } catch (Throwable th) {
            this.f581r = new q(dVar.getContext(), th);
            throw th;
        }
    }

    @Override // e5.AbstractC0863a, e5.InterfaceC0866d
    public final InterfaceC0866d getCallerFrame() {
        c5.d dVar = this.f582s;
        if (dVar instanceof InterfaceC0866d) {
            return (InterfaceC0866d) dVar;
        }
        return null;
    }

    @Override // e5.AbstractC0865c, c5.d
    public final c5.i getContext() {
        c5.i iVar = this.f581r;
        return iVar == null ? c5.j.f10685o : iVar;
    }

    @Override // e5.AbstractC0863a
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object i(c5.d dVar, Object obj) {
        c5.i context = dVar.getContext();
        AbstractC1767D.j(context);
        c5.i iVar = this.f581r;
        if (iVar != context) {
            if (iVar instanceof q) {
                throw new IllegalStateException(AbstractC1546h.C("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((q) iVar).f573o + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.y(0, new y(0, this))).intValue() != this.f580q) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f579p + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f581r = context;
        }
        this.f582s = dVar;
        w wVar = x.f584a;
        InterfaceC2111f interfaceC2111f = this.f578o;
        AbstractC1209k.d(interfaceC2111f, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        wVar.getClass();
        Object objF = interfaceC2111f.f(obj, this);
        if (!AbstractC1209k.a(objF, EnumC0830a.f11264o)) {
            this.f582s = null;
        }
        return objF;
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        Throwable thA = Y4.k.a(obj);
        if (thA != null) {
            this.f581r = new q(getContext(), thA);
        }
        c5.d dVar = this.f582s;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return EnumC0830a.f11264o;
    }
}
