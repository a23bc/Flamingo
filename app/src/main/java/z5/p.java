package z5;

import d5.EnumC0830a;
import e5.AbstractC0871i;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21313o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f21314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2110e f21315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J f21316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Float f21317s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(InterfaceC2110e interfaceC2110e, J j3, Float f7, c5.d dVar) {
        super(2, dVar);
        this.f21315q = interfaceC2110e;
        this.f21316r = j3;
        this.f21317s = f7;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        p pVar = new p(this.f21315q, this.f21316r, this.f21317s, dVar);
        pVar.f21314p = obj;
        return pVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((EnumC2104B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f21313o;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            int iOrdinal = ((EnumC2104B) this.f21314p).ordinal();
            J j3 = this.f21316r;
            if (iOrdinal == 0) {
                this.f21313o = 1;
                if (this.f21315q.b(j3, this) == enumC0830a) {
                    return enumC0830a;
                }
            } else if (iOrdinal == 2) {
                B5.u uVar = z.f21344a;
                Float f7 = this.f21317s;
                if (f7 == uVar) {
                    j3.getClass();
                    throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
                }
                j3.j(null, f7);
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
        }
        return Y4.o.f8736a;
    }
}
