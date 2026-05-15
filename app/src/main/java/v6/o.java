package v6;

import A2.W;
import O0.C0306f0;
import O0.C0318o;
import R0.AbstractC0403q0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0903o;
import f0.C0912t;
import h6.C1016f;
import h6.C1018g;
import j5.AbstractC1107a;
import j5.AbstractC1109c;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import r0.InterfaceC1398p;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class o implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f18402o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f18403p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f18404q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f18405r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f18406s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w6.c f18407t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ EnumC1649c f18408u;

    public o(float f7, InterfaceC1180a interfaceC1180a, String str, InterfaceC1398p interfaceC1398p, float f8, w6.c cVar, EnumC1649c enumC1649c) {
        this.f18402o = f7;
        this.f18403p = interfaceC1180a;
        this.f18404q = str;
        this.f18405r = interfaceC1398p;
        this.f18406s = f8;
        this.f18407t = cVar;
        this.f18408u = enumC1649c;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        int i7;
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            t6.d dVarI = AbstractC1109c.i(this.f18402o, null, 6);
            n1.d dVar = (n1.d) c0912t.j(AbstractC0403q0.h);
            Object objA = this.f18403p.a();
            p4.g gVar = new p4.g((Context) c0912t.j(AndroidCompositionLocals_androidKt.f9324b));
            gVar.f15027c = objA;
            gVar.b();
            gVar.f15040r = Integer.valueOf(R.drawable.placeholder_music_default_artwork);
            gVar.f15039q = Integer.valueOf(R.drawable.placeholder_music_default_artwork);
            gVar.f15041s = Integer.valueOf(R.drawable.placeholder_music_default_artwork);
            gVar.f15030f = String.valueOf(objA);
            gVar.f15035m = Boolean.valueOf(c6.a.f10688a);
            gVar.b();
            EnumC1649c enumC1649c = EnumC1649c.f18348o;
            EnumC1649c enumC1649c2 = this.f18408u;
            if (enumC1649c2 != enumC1649c) {
                int iOrdinal = enumC1649c2.ordinal();
                if (iOrdinal == 0) {
                    i7 = 0;
                } else if (iOrdinal == 1) {
                    i7 = 128;
                } else {
                    if (iOrdinal != 2) {
                        throw new W();
                    }
                    i7 = 400;
                }
                gVar.c(i7);
                if (enumC1649c2 == EnumC1649c.f18349p) {
                    gVar.f15031g = q4.d.f15586p;
                }
            }
            p4.h hVarA = gVar.a();
            String strValueOf = String.valueOf(this.f18404q);
            C0306f0 c0306f0 = C0318o.f5425a;
            InterfaceC1398p interfaceC1398pO = AbstractC1107a.o(androidx.compose.foundation.layout.a.b(androidx.compose.foundation.layout.c.b(this.f18405r, 1.0f), 1.0f), dVarI, this.f18406s, this.f18407t, false, c0912t, 0);
            c0912t.X(850741086);
            boolean zF = c0912t.f(dVarI);
            Object objK = c0912t.K();
            f0.W w7 = C0903o.f11850a;
            if (zF || objK == w7) {
                objK = new C1016f(dVarI, 3);
                c0912t.i0(objK);
            }
            c0912t.p(false);
            InterfaceC1398p interfaceC1398pA = androidx.compose.ui.graphics.a.a(interfaceC1398pO, (InterfaceC1182c) objK);
            c0912t.X(850752012);
            boolean zF2 = c0912t.f(dVarI) | c0912t.f(dVar);
            Object objK2 = c0912t.K();
            if (zF2 || objK2 == w7) {
                objK2 = new C1018g(dVarI, dVar, 8);
                c0912t.i0(objK2);
            }
            c0912t.p(false);
            f4.r.a(hVarA, strValueOf, androidx.compose.ui.draw.a.b(interfaceC1398pA, (InterfaceC1182c) objK2), c0306f0, null, c0912t, 1572864, 952);
        }
        return Y4.o.f8736a;
    }
}
