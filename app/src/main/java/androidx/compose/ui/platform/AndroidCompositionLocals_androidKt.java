package androidx.compose.ui.platform;

import B0.b;
import E3.f;
import G0.a;
import K0.A;
import R0.AbstractC0403q0;
import R0.C0373b0;
import R0.C0398o;
import R0.C0402q;
import R0.C0406s0;
import R0.C0408t0;
import R0.C0410u0;
import R0.C0415x;
import R0.H0;
import R0.N;
import R0.O;
import R0.P;
import R0.Q;
import V.o;
import W0.c;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import f0.AbstractC0911s0;
import f0.C0879c;
import f0.C0903o;
import f0.C0912t;
import f0.C0913t0;
import f0.C0915u0;
import f0.D;
import f0.InterfaceC0878b0;
import f0.a1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import n0.d;
import n0.e;
import n2.AbstractC1228a;
import o0.AbstractC1253j;
import o0.C1252i;
import o0.InterfaceC1251h;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a */
    public static final D f9323a = new D(N.f6350q);

    /* JADX INFO: renamed from: b */
    public static final a1 f9324b = new a1(N.f6351r);

    /* JADX INFO: renamed from: c */
    public static final D f9325c = new D(C0402q.f6499t);

    /* JADX INFO: renamed from: d */
    public static final a1 f9326d = new a1(N.f6352s);

    /* JADX INFO: renamed from: e */
    public static final a1 f9327e = new a1(N.f6353t);

    /* JADX INFO: renamed from: f */
    public static final a1 f9328f = new a1(N.f6354u);

    public static final void a(C0415x c0415x, d dVar, C0912t c0912t, int i7) {
        InterfaceC0878b0 interfaceC0878b0;
        LinkedHashMap linkedHashMap;
        boolean z6;
        c0912t.Z(-520299287);
        int i8 = (c0912t.h(c0415x) ? 4 : 2) | i7 | (c0912t.h(dVar) ? 32 : 16);
        if (c0912t.N(i8 & 1, (i8 & 19) != 18)) {
            Context context = c0415x.getContext();
            Object objK = c0912t.K();
            Object obj = C0903o.f11850a;
            if (objK == obj) {
                objK = C0879c.t(new Configuration(context.getResources().getConfiguration()));
                c0912t.i0(objK);
            }
            InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) objK;
            Object objK2 = c0912t.K();
            if (objK2 == obj) {
                objK2 = new b(11, interfaceC0878b02);
                c0912t.i0(objK2);
            }
            c0415x.setConfigurationChangeObserver((InterfaceC1182c) objK2);
            Object objK3 = c0912t.K();
            if (objK3 == obj) {
                objK3 = new C0373b0();
                c0912t.i0(objK3);
            }
            C0373b0 c0373b0 = (C0373b0) objK3;
            C0398o viewTreeOwners = c0415x.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objK4 = c0912t.K();
            f fVar = viewTreeOwners.f6489b;
            if (objK4 == obj) {
                Object parent = c0415x.getParent();
                AbstractC1209k.d(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = InterfaceC1251h.class.getSimpleName() + ':' + strValueOf;
                o oVarB = fVar.b();
                Bundle bundleF = oVarB.f(str);
                if (bundleF != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleF.keySet()) {
                        ArrayList parcelableArrayList = bundleF.getParcelableArrayList(str2);
                        AbstractC1209k.d(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str2, parcelableArrayList);
                        interfaceC0878b02 = interfaceC0878b02;
                    }
                } else {
                    linkedHashMap = null;
                }
                interfaceC0878b0 = interfaceC0878b02;
                C0402q c0402q = C0402q.f6500u;
                a1 a1Var = AbstractC1253j.f14649a;
                C1252i c1252i = new C1252i(linkedHashMap, c0402q);
                try {
                    oVarB.G(str, new C0408t0(0, c1252i));
                    z6 = true;
                } catch (IllegalArgumentException unused) {
                    z6 = false;
                }
                objK4 = new C0406s0(c1252i, new C0410u0(z6, oVarB, str));
                c0912t.i0(objK4);
            } else {
                interfaceC0878b0 = interfaceC0878b02;
            }
            Object obj2 = (C0406s0) objK4;
            Y4.o oVar = Y4.o.f8736a;
            boolean zH = c0912t.h(obj2);
            Object objK5 = c0912t.K();
            if (zH || objK5 == obj) {
                objK5 = new b(12, obj2);
                c0912t.i0(objK5);
            }
            C0879c.d(oVar, (InterfaceC1182c) objK5, c0912t);
            Object objK6 = c0912t.K();
            if (objK6 == obj) {
                objK6 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new H0() : new G0.b(c0415x.getView(), 1);
                c0912t.i0(objK6);
            }
            a aVar = (a) objK6;
            Configuration configuration = (Configuration) interfaceC0878b0.getValue();
            Object objK7 = c0912t.K();
            if (objK7 == obj) {
                objK7 = new c();
                c0912t.i0(objK7);
            }
            c cVar = (c) objK7;
            Object objK8 = c0912t.K();
            Object obj3 = objK8;
            if (objK8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                c0912t.i0(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objK9 = c0912t.K();
            if (objK9 == obj) {
                objK9 = new P(configuration3, cVar);
                c0912t.i0(objK9);
            }
            P p7 = (P) objK9;
            boolean zH2 = c0912t.h(context);
            Object objK10 = c0912t.K();
            if (zH2 || objK10 == obj) {
                objK10 = new A(context, 3, p7);
                c0912t.i0(objK10);
            }
            C0879c.d(cVar, (InterfaceC1182c) objK10, c0912t);
            Object objK11 = c0912t.K();
            if (objK11 == obj) {
                objK11 = new W0.d();
                c0912t.i0(objK11);
            }
            W0.d dVar2 = (W0.d) objK11;
            Object objK12 = c0912t.K();
            if (objK12 == obj) {
                objK12 = new Q(dVar2);
                c0912t.i0(objK12);
            }
            Q q7 = (Q) objK12;
            boolean zH3 = c0912t.h(context);
            Object objK13 = c0912t.K();
            if (zH3 || objK13 == obj) {
                objK13 = new A(context, 4, q7);
                c0912t.i0(objK13);
            }
            C0879c.d(dVar2, (InterfaceC1182c) objK13, c0912t);
            AbstractC0911s0 abstractC0911s0 = AbstractC0403q0.f6521v;
            C0879c.b(new C0913t0[]{f9323a.a((Configuration) interfaceC0878b0.getValue()), f9324b.a(context), AbstractC1228a.f14530a.a(viewTreeOwners.f6488a), F3.a.f2311a.a(fVar), AbstractC1253j.f14649a.a(obj2), f9328f.a(c0415x.getView()), f9326d.a(cVar), f9327e.a(dVar2), abstractC0911s0.a(Boolean.valueOf(((Boolean) c0912t.j(abstractC0911s0)).booleanValue() | c0415x.getScrollCaptureInProgress$ui_release())), AbstractC0403q0.l.a(aVar)}, e.e(1059770793, new O(c0415x, c0373b0, dVar), c0912t), c0912t, 56);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new O0.Q(c0415x, dVar, i7, 2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final AbstractC0911s0 getLocalLifecycleOwner() {
        return AbstractC1228a.f14530a;
    }

    public static final AbstractC0911s0 getLocalSavedStateRegistryOwner() {
        return F3.a.f2311a;
    }
}
