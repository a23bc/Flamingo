package h6;

import X.C0467b0;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0890h0;
import f0.InterfaceC0878b0;
import m5.AbstractC1209k;
import m5.C1216r;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class U extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f12947o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f12948p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12949q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f12950r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f12951s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f12952t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f12953u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f12954v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f12955w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(boolean z6, String str, boolean z7, InterfaceC0878b0 interfaceC0878b0, C0890h0 c0890h0, c5.d dVar) {
        super(2, dVar);
        this.f12951s = z6;
        this.f12952t = str;
        this.f12953u = z7;
        this.f12954v = interfaceC0878b0;
        this.f12955w = c0890h0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        U u7 = new U(this.f12951s, this.f12952t, this.f12953u, this.f12954v, this.f12955w, dVar);
        u7.f12950r = obj;
        return u7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1216r c1216r;
        long j3;
        int i7 = 1;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i8 = this.f12949q;
        Y4.o oVar = Y4.o.f8736a;
        if (i8 == 0) {
            android.support.v4.media.session.b.K(obj);
            InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f12950r;
            C1216r c1216r2 = new C1216r();
            AbstractC1767D.n(interfaceC1765B.g()).t(new C0467b0(c1216r2, i7));
            if (!this.f12951s) {
                String str2 = this.f12952t;
                boolean zA = AbstractC1209k.a(str2, "Lyric");
                InterfaceC0878b0 interfaceC0878b0 = this.f12954v;
                if (!zA || !this.f12953u) {
                    interfaceC0878b0.setValue(Boolean.TRUE);
                    return oVar;
                }
                if (((Boolean) interfaceC0878b0.getValue()).booleanValue()) {
                    this.f12950r = c1216r2;
                    this.f12947o = str2;
                    this.f12948p = 2500L;
                    this.f12949q = 1;
                    if (AbstractC1767D.i(2500L, this) != enumC0830a) {
                        str = str2;
                        c1216r = c1216r2;
                        j3 = 2500;
                    }
                    return enumC0830a;
                }
            }
            return oVar;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            android.support.v4.media.session.b.K(obj);
            return oVar;
        }
        long j7 = this.f12948p;
        String str3 = this.f12947o;
        c1216r = (C1216r) this.f12950r;
        android.support.v4.media.session.b.K(obj);
        str = str3;
        j3 = j7;
        if (!c1216r.f14435o) {
            D5.e eVar = w5.M.f19497a;
            x5.d dVar = B5.n.f912a;
            T t7 = new T(this.f12955w, j3, str, this.f12953u, this.f12954v, null);
            this.f12950r = null;
            this.f12947o = null;
            this.f12949q = 2;
            if (AbstractC1767D.C(dVar, t7, this) == enumC0830a) {
                return enumC0830a;
            }
        }
        return oVar;
    }
}
