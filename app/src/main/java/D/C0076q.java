package D;

import I.C0211c;
import O0.InterfaceC0298b0;
import U5.C0453z;
import android.content.Context;
import android.os.Bundle;
import f0.InterfaceC0878b0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.C1218t;
import w5.AbstractC1767D;
import w5.InterfaceC1765B;
import y3.C2019h;
import yos.music.player.R;

/* JADX INFO: renamed from: D.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0076q implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1375o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1376p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f1377q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1378r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1379s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f1380t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1381u;

    public /* synthetic */ C0076q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i7) {
        this.f1375o = i7;
        this.f1376p = obj;
        this.f1377q = obj2;
        this.f1378r = obj3;
        this.f1379s = obj4;
        this.f1380t = obj5;
        this.f1381u = obj6;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        Object objPrevious;
        switch (this.f1375o) {
            case 0:
                O0.l0 l0Var = (O0.l0) obj;
                O0.m0[] m0VarArr = (O0.m0[]) this.f1376p;
                int length = m0VarArr.length;
                int i7 = 0;
                int i8 = 0;
                while (i8 < length) {
                    int i9 = i7;
                    O0.m0 m0Var = m0VarArr[i8];
                    AbstractC1209k.d(m0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    AbstractC0074o.b(l0Var, m0Var, (O0.Y) ((List) this.f1377q).get(i9), ((InterfaceC0298b0) this.f1378r).getLayoutDirection(), ((C1218t) this.f1379s).f14437o, ((C1218t) this.f1380t).f14437o, ((r) this.f1381u).f1384a);
                    i8++;
                    i7 = i9 + 1;
                }
                return Y4.o.f8736a;
            default:
                String str = (String) obj;
                InterfaceC0878b0 interfaceC0878b0 = (InterfaceC0878b0) this.f1376p;
                AbstractC1209k.f(interfaceC0878b0, "$nowLabel");
                Context context = (Context) this.f1377q;
                AbstractC1209k.f(context, "$context");
                InterfaceC0878b0 interfaceC0878b02 = (InterfaceC0878b0) this.f1378r;
                AbstractC1209k.f(interfaceC0878b02, "$route");
                InterfaceC1765B interfaceC1765B = (InterfaceC1765B) this.f1379s;
                AbstractC1209k.f(interfaceC1765B, "$scope");
                y3.x xVar = (y3.x) this.f1380t;
                AbstractC1209k.f(xVar, "$navController");
                C0211c c0211c = (C0211c) this.f1381u;
                AbstractC1209k.f(c0211c, "$pagerState");
                AbstractC1209k.f(str, "it");
                interfaceC0878b0.setValue(str);
                String string = context.getString(R.string.page_home_title);
                AbstractC1209k.e(string, "getString(...)");
                String string2 = context.getString(R.string.page_library_title);
                AbstractC1209k.e(string2, "getString(...)");
                if (AbstractC1209k.a(interfaceC0878b02.getValue(), "HomePage")) {
                    AbstractC1767D.t(interfaceC1765B, null, new C0453z(c0211c, str, string, string2, null), 3);
                } else {
                    AbstractC1767D.t(interfaceC1765B, null, new U5.A(c0211c, str, string, string2, null), 3);
                    Z4.k kVar = xVar.f20497g;
                    boolean zC = false;
                    if (!kVar.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = kVar.listIterator(kVar.b());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                objPrevious = listIterator.previous();
                                C2019h c2019h = (C2019h) objPrevious;
                                y3.s sVar = c2019h.f20407p;
                                Bundle bundleC = c2019h.c();
                                sVar.getClass();
                                boolean z6 = true;
                                if (!AbstractC1209k.a(sVar.f20468u, "HomePage")) {
                                    y3.r rVarE = sVar.e("HomePage");
                                    if (sVar.equals(rVarE != null ? rVarE.f20456o : null)) {
                                        if (bundleC != null) {
                                            Bundle bundle = rVarE.f20457p;
                                            if (bundle != null) {
                                                Set<String> setKeySet = bundle.keySet();
                                                AbstractC1209k.e(setKeySet, "matchingArgs.keySet()");
                                                for (String str2 : setKeySet) {
                                                    if (bundleC.containsKey(str2)) {
                                                        if (Z4.y.p0(rVarE.f20456o.f20466s).get(str2) != null) {
                                                            throw new ClassCastException();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            rVarE.getClass();
                                        }
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                }
                                if (!z6) {
                                    arrayList.add(xVar.f20511w.b(c2019h.f20407p.f20462o));
                                }
                                if (z6) {
                                }
                            } else {
                                objPrevious = null;
                            }
                        }
                        C2019h c2019h2 = (C2019h) objPrevious;
                        y3.s sVar2 = c2019h2 != null ? c2019h2.f20407p : null;
                        if (sVar2 != null) {
                            zC = xVar.c(arrayList, sVar2, false, false);
                        }
                    }
                    if (zC) {
                        xVar.b();
                    }
                }
                return Y4.o.f8736a;
        }
    }
}
