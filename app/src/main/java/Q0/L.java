package Q0;

import O0.AbstractC0299c;
import O0.C0322t;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import m5.AbstractC1209k;
import x0.C1892b;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O0.m0 f5842a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC0337a f5847f;
    public final /* synthetic */ int h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5843b = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f5848g = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public L(InterfaceC0337a interfaceC0337a, int i7) {
        this.h = i7;
        this.f5842a = (O0.m0) interfaceC0337a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l5.e, m5.i] */
    /* JADX WARN: Type inference failed for: r12v7, types: [O0.m0, Q0.a] */
    public static final void a(L l, C0322t c0322t, int i7, j0 j0Var) {
        l.getClass();
        float f7 = i7;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f7);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f7);
        while (true) {
            long jF = (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
            do {
                switch (l.h) {
                    case 0:
                        r0 r0Var = j0Var.f6046Y;
                        if (r0Var != null) {
                            jF = ((R0.A0) r0Var).c(jF, false);
                        }
                        jF = i6.h.F(jF, j0Var.f6037P);
                        break;
                    default:
                        U uH0 = j0Var.H0();
                        AbstractC1209k.c(uH0);
                        long j3 = uH0.f5889D;
                        jF = C1892b.h((((long) Float.floatToRawIntBits((int) (j3 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L), jF);
                        break;
                }
                j0Var = j0Var.f6028G;
                AbstractC1209k.c(j0Var);
                if (j0Var.equals(l.f5842a.o())) {
                    int iRound = Math.round(c0322t instanceof C0322t ? Float.intBitsToFloat((int) (jF & 4294967295L)) : Float.intBitsToFloat((int) (jF >> 32)));
                    HashMap map = l.f5848g;
                    if (map.containsKey(c0322t)) {
                        AbstractC1209k.f(map, "<this>");
                        Object obj = map.get(c0322t);
                        if (obj == null && !map.containsKey(c0322t)) {
                            throw new NoSuchElementException("Key " + c0322t + " is missing in the map.");
                        }
                        int iIntValue = ((Number) obj).intValue();
                        C0322t c0322t2 = AbstractC0299c.f5374a;
                        iRound = ((Number) c0322t.f5444a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(c0322t, Integer.valueOf(iRound));
                    return;
                }
            } while (!l.b(j0Var).containsKey(c0322t));
            float fC = l.c(j0Var, c0322t);
            jFloatToRawIntBits = Float.floatToRawIntBits(fC);
            iFloatToRawIntBits = Float.floatToRawIntBits(fC);
        }
    }

    public final Map b(j0 j0Var) {
        switch (this.h) {
            case 0:
                return j0Var.r0().a();
            default:
                U uH0 = j0Var.H0();
                AbstractC1209k.c(uH0);
                return uH0.r0().a();
        }
    }

    public final int c(j0 j0Var, C0322t c0322t) {
        switch (this.h) {
            case 0:
                return j0Var.m0(c0322t);
            default:
                U uH0 = j0Var.H0();
                AbstractC1209k.c(uH0);
                return uH0.m0(c0322t);
        }
    }

    public final boolean d() {
        return this.f5844c || this.f5845d || this.f5846e;
    }

    public final boolean e() {
        h();
        return this.f5847f != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O0.m0, Q0.a] */
    public final void f() {
        this.f5843b = true;
        ?? r02 = this.f5842a;
        InterfaceC0337a interfaceC0337aQ = r02.q();
        if (interfaceC0337aQ == null) {
            return;
        }
        if (this.f5844c) {
            interfaceC0337aQ.requestLayout();
        }
        if (this.f5845d) {
            r02.N();
        }
        if (this.f5846e) {
            r02.requestLayout();
        }
        interfaceC0337aQ.a().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [O0.m0, Q0.a] */
    public final void g() {
        HashMap map = this.f5848g;
        map.clear();
        B0.b bVar = new B0.b(7, this);
        ?? r22 = this.f5842a;
        r22.F(bVar);
        map.putAll(b(r22.o()));
        this.f5843b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [O0.m0, Q0.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [Q0.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            O0.m0 r1 = r2.f5842a
            if (r0 == 0) goto L9
            goto L51
        L9:
            Q0.a r0 = r1.q()
            if (r0 != 0) goto L10
            goto L53
        L10:
            Q0.L r0 = r0.a()
            Q0.a r1 = r0.f5847f
            if (r1 == 0) goto L23
            Q0.L r0 = r1.a()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            Q0.a r0 = r2.f5847f
            if (r0 == 0) goto L53
            Q0.L r1 = r0.a()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            Q0.a r1 = r0.q()
            if (r1 == 0) goto L41
            Q0.L r1 = r1.a()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            Q0.a r0 = r0.q()
            if (r0 == 0) goto L50
            Q0.L r0 = r0.a()
            if (r0 == 0) goto L50
            Q0.a r1 = r0.f5847f
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f5847f = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q0.L.h():void");
    }
}
