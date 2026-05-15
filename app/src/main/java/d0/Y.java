package d0;

import D.C0081w;
import f0.C0903o;
import f0.C0912t;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1210l;
import r0.C1395m;
import r0.InterfaceC1398p;
import w5.InterfaceC1765B;
import y0.InterfaceC1963M;
import yos.music.player.R;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC1210l implements l5.f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1765B f10925A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ n0.d f10926B;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f10927p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f10928q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n0 f10929r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1395m f10930s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f10931t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f10932u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1963M f10933v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f10934w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ long f10935x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f10936y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ n0.d f10937z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(long j3, InterfaceC1180a interfaceC1180a, n0 n0Var, C1395m c1395m, float f7, InterfaceC1182c interfaceC1182c, InterfaceC1963M interfaceC1963M, long j7, long j8, float f8, n0.d dVar, InterfaceC1765B interfaceC1765B, n0.d dVar2) {
        super(3);
        this.f10927p = j3;
        this.f10928q = interfaceC1180a;
        this.f10929r = n0Var;
        this.f10930s = c1395m;
        this.f10931t = f7;
        this.f10932u = interfaceC1182c;
        this.f10933v = interfaceC1963M;
        this.f10934w = j7;
        this.f10935x = j8;
        this.f10936y = f8;
        this.f10937z = dVar;
        this.f10925A = interfaceC1765B;
        this.f10926B = dVar2;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i7 = 1;
        int i8 = 0;
        C0081w c0081w = (C0081w) obj;
        C0912t c0912t = (C0912t) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= c0912t.f(c0081w) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18 && c0912t.z()) {
            c0912t.Q();
        } else {
            int iG = n1.a.g(c0081w.f1409b);
            n0 n0Var = this.f10929r;
            H.d(this.f10927p, this.f10928q, ((o0) n0Var.f11048a.f11062g.getValue()) != o0.f11052o, c0912t, 0);
            String strG = H.g(R.string.m3c_bottom_sheet_pane_title, c0912t);
            InterfaceC1398p interfaceC1398pA = androidx.compose.foundation.layout.b.f9200a.a(androidx.compose.foundation.layout.c.b(androidx.compose.foundation.layout.c.l(this.f10930s, this.f10931t), 1.0f));
            c0912t.Y(-1482644208);
            boolean zF = c0912t.f(strG);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (zF || objK == w7) {
                objK = new Y0.m(strG, 3);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pA2 = Y0.l.a(interfaceC1398pA, false, (InterfaceC1182c) objK);
            c0912t.Y(-1482644143);
            boolean zF2 = c0912t.f(n0Var);
            Object objK2 = c0912t.K();
            if (zF2 || objK2 == w7) {
                objK2 = new S(n0Var, i8);
                c0912t.i0(objK2);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pE = androidx.compose.foundation.layout.a.e(interfaceC1398pA2, (InterfaceC1182c) objK2);
            c0912t.Y(-1482643839);
            boolean zF3 = c0912t.f(n0Var);
            Object objK3 = c0912t.K();
            InterfaceC1182c interfaceC1182c = this.f10932u;
            if (zF3 || objK3 == w7) {
                EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
                float f7 = m0.f11046a;
                objK3 = new l0(n0Var, interfaceC1182c);
                c0912t.i0(objK3);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pA3 = androidx.compose.ui.input.nestedscroll.a.a(interfaceC1398pE, (J0.a) objK3, null);
            C0801p c0801p = n0Var.f11048a;
            C0800o c0800o = c0801p.f11060e;
            EnumC2048l0 enumC2048l02 = EnumC2048l0.f20894o;
            boolean zC = n0Var.c();
            boolean z6 = c0801p.f11065k.getValue() != null;
            c0912t.Y(-1482643097);
            boolean zF4 = c0912t.f(interfaceC1182c);
            Object objK4 = c0912t.K();
            if (zF4 || objK4 == w7) {
                objK4 = new T(interfaceC1182c, null);
                c0912t.i0(objK4);
            }
            c0912t.p(false);
            F0.a(androidx.compose.ui.layout.a.f(z.L.a(interfaceC1398pA3, c0800o, enumC2048l02, zC, null, z6, null, (l5.f) objK4, false, 168), new V4.o(n0Var, iG, i7)), this.f10933v, this.f10934w, this.f10935x, this.f10936y, n0.e.b(c0912t, 1096570852, new X(this.f10937z, this.f10929r, this.f10928q, this.f10925A, this.f10926B)), c0912t, 12582912, 96);
        }
        return Y4.o.f8736a;
    }
}
