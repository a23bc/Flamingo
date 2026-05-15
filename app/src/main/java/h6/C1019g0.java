package h6;

import f0.C0890h0;
import f0.C0903o;
import f0.C0912t;
import f0.InterfaceC0878b0;
import java.util.Arrays;
import l5.InterfaceC1180a;

/* JADX INFO: renamed from: h6.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1019g0 implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f13058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f13059s;

    public C1019g0(InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC0878b0 interfaceC0878b0, C0890h0 c0890h0, boolean z6) {
        this.f13055o = interfaceC1180a;
        this.f13056p = interfaceC1180a2;
        this.f13057q = interfaceC0878b0;
        this.f13058r = c0890h0;
        this.f13059s = z6;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            String str = (String) this.f13055o.a();
            Boolean bool = (Boolean) this.f13056p.a();
            boolean zBooleanValue = bool.booleanValue();
            InterfaceC0878b0 interfaceC0878b0 = this.f13057q;
            Object value = interfaceC0878b0.getValue();
            C0890h0 c0890h0 = this.f13058r;
            Long lValueOf = Long.valueOf(c0890h0.h());
            boolean z6 = this.f13059s;
            Object[] objArr = {value, str, lValueOf, bool, Boolean.valueOf(z6)};
            c0912t.X(970924616);
            boolean zG = c0912t.g(z6) | c0912t.f(str) | c0912t.g(zBooleanValue) | c0912t.f(interfaceC0878b0) | c0912t.f(c0890h0);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (zG || objK == w7) {
                U u7 = new U(this.f13059s, str, zBooleanValue, this.f13057q, this.f13058r, null);
                c0912t.i0(u7);
                objK = u7;
            }
            l5.e eVar = (l5.e) objK;
            c0912t.p(false);
            boolean zF = false;
            for (Object obj3 : Arrays.copyOf(objArr, 5)) {
                zF |= c0912t.f(obj3);
            }
            Object objK2 = c0912t.K();
            if (zF || objK2 == w7) {
                c0912t.i0(new f0.U(c0912t.f11889R, eVar));
            }
        }
        return Y4.o.f8736a;
    }
}
