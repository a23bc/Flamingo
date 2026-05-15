package n0;

import D.L;
import H.I;
import X.K;
import f0.C0912t;
import f0.C0915u0;
import f0.C0924z;
import java.util.ArrayList;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import m5.AbstractC1223y;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC1227b {

    /* JADX INFO: renamed from: o */
    public final int f14478o;

    /* JADX INFO: renamed from: p */
    public final boolean f14479p;

    /* JADX INFO: renamed from: q */
    public Object f14480q;

    /* JADX INFO: renamed from: r */
    public C0915u0 f14481r;

    /* JADX INFO: renamed from: s */
    public ArrayList f14482s;

    public d(int i7, Object obj, boolean z6) {
        this.f14478o = i7;
        this.f14479p = z6;
        this.f14480q = obj;
    }

    @Override // l5.i
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return k(obj, obj2, obj3, obj4, (C0912t) obj5, ((Number) obj6).intValue());
    }

    @Override // l5.f
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return i(obj, (C0912t) obj2, ((Number) obj3).intValue());
    }

    public final Object e(int i7, C0912t c0912t) {
        c0912t.Z(this.f14478o);
        l(c0912t);
        int iA = i7 | (c0912t.f(this) ? e.a(2, 0) : e.a(1, 0));
        Object obj = this.f14480q;
        AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC1223y.c(2, obj);
        Object objInvoke = ((l5.e) obj).invoke(c0912t, Integer.valueOf(iA));
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new c(2, this, d.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    public final Object f(T.b bVar, T.e eVar, InterfaceC1180a interfaceC1180a, C0912t c0912t, int i7) {
        c0912t.Z(this.f14478o);
        l(c0912t);
        int iA = c0912t.f(this) ? e.a(2, 3) : e.a(1, 3);
        Object obj = this.f14480q;
        AbstractC1209k.d(obj, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC1223y.c(5, obj);
        Object objG = ((l5.h) obj).g(bVar, eVar, interfaceC1180a, c0912t, Integer.valueOf(iA | i7));
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new K(this, bVar, eVar, interfaceC1180a, i7);
        }
        return objG;
    }

    @Override // l5.h
    public final /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return f((T.b) obj, (T.e) obj2, (InterfaceC1180a) obj3, (C0912t) obj4, ((Number) obj5).intValue());
    }

    @Override // l5.g
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(obj, obj2, (C0912t) obj3, ((Number) obj4).intValue());
    }

    public final Object i(Object obj, C0912t c0912t, int i7) {
        c0912t.Z(this.f14478o);
        l(c0912t);
        int iA = c0912t.f(this) ? e.a(2, 1) : e.a(1, 1);
        Object obj2 = this.f14480q;
        AbstractC1209k.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC1223y.c(3, obj2);
        Object objD = ((l5.f) obj2).d(obj, c0912t, Integer.valueOf(iA | i7));
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new F.j(this, obj, i7, 6);
        }
        return objD;
    }

    @Override // l5.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return e(((Number) obj2).intValue(), (C0912t) obj);
    }

    public final Object j(Object obj, Object obj2, C0912t c0912t, int i7) {
        c0912t.Z(this.f14478o);
        l(c0912t);
        int iA = c0912t.f(this) ? e.a(2, 2) : e.a(1, 2);
        Object obj3 = this.f14480q;
        AbstractC1209k.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC1223y.c(4, obj3);
        Object objH = ((l5.g) obj3).h(obj, obj2, c0912t, Integer.valueOf(iA | i7));
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new I(i7, 8, this, obj, obj2);
        }
        return objH;
    }

    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, C0912t c0912t, int i7) {
        c0912t.Z(this.f14478o);
        l(c0912t);
        int iA = c0912t.f(this) ? e.a(2, 4) : e.a(1, 4);
        Object obj5 = this.f14480q;
        AbstractC1209k.d(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        AbstractC1223y.c(6, obj5);
        Object objC = ((l5.i) obj5).c(obj, obj2, obj3, obj4, c0912t, Integer.valueOf(iA | i7));
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new L(this, obj, obj2, obj3, obj4, i7);
        }
        return objC;
    }

    public final void l(C0912t c0912t) {
        C0915u0 c0915u0W;
        if (!this.f14479p || (c0915u0W = c0912t.w()) == null) {
            return;
        }
        c0912t.getClass();
        c0915u0W.f11930b |= 1;
        if (e.f(this.f14481r, c0915u0W)) {
            this.f14481r = c0915u0W;
            return;
        }
        ArrayList arrayList = this.f14482s;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f14482s = arrayList2;
            arrayList2.add(c0915u0W);
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (e.f((C0915u0) arrayList.get(i7), c0915u0W)) {
                arrayList.set(i7, c0915u0W);
                return;
            }
        }
        arrayList.add(c0915u0W);
    }

    public final void m(Y4.c cVar) {
        if (AbstractC1209k.a(this.f14480q, cVar)) {
            return;
        }
        boolean z6 = this.f14480q == null;
        this.f14480q = cVar;
        if (z6 || !this.f14479p) {
            return;
        }
        C0915u0 c0915u0 = this.f14481r;
        if (c0915u0 != null) {
            C0924z c0924z = c0915u0.f11929a;
            if (c0924z != null) {
                c0924z.q(c0915u0, null);
            }
            this.f14481r = null;
        }
        ArrayList arrayList = this.f14482s;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0915u0 c0915u02 = (C0915u0) arrayList.get(i7);
                C0924z c0924z2 = c0915u02.f11929a;
                if (c0924z2 != null) {
                    c0924z2.q(c0915u02, null);
                }
            }
            arrayList.clear();
        }
    }
}
