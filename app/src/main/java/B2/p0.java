package b2;

import android.content.Context;
import android.os.Build;
import android.widget.RemoteViews;
import g2.C0985a;
import g2.C0986b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import l2.AbstractC1166f;
import l2.C1162b;
import l2.C1163c;
import l2.C1164d;
import l2.C1165e;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f10273a = Z4.y.m0(new Y4.h(s0.f10316r, Integer.valueOf(R.layout.glance_text)), new Y4.h(s0.f10317s, Integer.valueOf(R.layout.glance_list)), new Y4.h(s0.f10318t, Integer.valueOf(R.layout.glance_check_box)), new Y4.h(s0.f10319u, Integer.valueOf(R.layout.glance_check_box_backport)), new Y4.h(s0.f10320v, Integer.valueOf(R.layout.glance_button)), new Y4.h(s0.f10300F, Integer.valueOf(R.layout.glance_swtch)), new Y4.h(s0.f10301G, Integer.valueOf(R.layout.glance_swtch_backport)), new Y4.h(s0.f10321w, Integer.valueOf(R.layout.glance_frame)), new Y4.h(s0.f10302H, Integer.valueOf(R.layout.glance_image_crop)), new Y4.h(s0.f10305K, Integer.valueOf(R.layout.glance_image_crop_decorative)), new Y4.h(s0.f10303I, Integer.valueOf(R.layout.glance_image_fit)), new Y4.h(s0.f10306L, Integer.valueOf(R.layout.glance_image_fit_decorative)), new Y4.h(s0.f10304J, Integer.valueOf(R.layout.glance_image_fill_bounds)), new Y4.h(s0.f10307M, Integer.valueOf(R.layout.glance_image_fill_bounds_decorative)), new Y4.h(s0.f10322x, Integer.valueOf(R.layout.glance_linear_progress_indicator)), new Y4.h(s0.f10323y, Integer.valueOf(R.layout.glance_circular_progress_indicator)), new Y4.h(s0.f10324z, Integer.valueOf(R.layout.glance_vertical_grid_one_column)), new Y4.h(s0.f10295A, Integer.valueOf(R.layout.glance_vertical_grid_two_columns)), new Y4.h(s0.f10296B, Integer.valueOf(R.layout.glance_vertical_grid_three_columns)), new Y4.h(s0.f10297C, Integer.valueOf(R.layout.glance_vertical_grid_four_columns)), new Y4.h(s0.f10298D, Integer.valueOf(R.layout.glance_vertical_grid_five_columns)), new Y4.h(s0.f10299E, Integer.valueOf(R.layout.glance_vertical_grid_auto_fit)), new Y4.h(s0.f10308N, Integer.valueOf(R.layout.glance_radio_button)), new Y4.h(s0.f10309O, Integer.valueOf(R.layout.glance_radio_button_backport)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f10274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f10275c;

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, java.util.Map] */
    static {
        int size = AbstractC0637G.f10052f.size();
        f10274b = size;
        f10275c = Build.VERSION.SDK_INT >= 31 ? AbstractC0637G.h : AbstractC0637G.h / size;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static final x0 a(L0 l02, Z1.o oVar, int i7) {
        int i8 = Build.VERSION.SDK_INT;
        Context context = l02.f10084a;
        if (i8 >= 31) {
            int i9 = AbstractC0637G.h;
            if (i7 >= i9) {
                throw new IllegalArgumentException(Z1.l.p("Index of the root view cannot be more than ", i9, i7, ", currently ").toString());
            }
            I0 i02 = new I0(1, 1);
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), AbstractC0637G.f10053g + i7);
            g2.s sVar = (g2.s) oVar.b(null, o0.f10262s);
            if (sVar != null) {
                M3.a.C(remoteViews, sVar, R.id.rootView);
            }
            g2.n nVar = (g2.n) oVar.b(null, o0.f10263t);
            if (nVar != null) {
                M3.a.B(remoteViews, nVar, R.id.rootView);
            }
            if (i8 >= 33) {
                remoteViews.removeAllViews(R.id.rootView);
            }
            return new x0(remoteViews, new C0664i0(R.id.rootView, 0, i8 >= 33 ? Z4.w.f8819o : Z4.y.l0(new Y4.h(0, Z4.y.l0(new Y4.h(i02, Integer.valueOf(R.id.rootStubId))))), 2));
        }
        int i10 = f10274b * i7;
        int i11 = AbstractC0637G.h;
        if (i10 >= i11) {
            throw new IllegalArgumentException(("Index of the root view cannot be more than " + (i11 / 4) + ", currently " + i7).toString());
        }
        g2.s sVar2 = (g2.s) oVar.b(null, o0.f10260q);
        AbstractC1166f abstractC1166f = C1165e.f14165a;
        AbstractC1166f abstractC1166f2 = sVar2 != null ? sVar2.f12457a : abstractC1166f;
        g2.n nVar2 = (g2.n) oVar.b(null, o0.f10261r);
        if (nVar2 != null) {
            abstractC1166f = nVar2.f12446a;
        }
        C1164d c1164d = C1164d.f14164a;
        int i12 = abstractC1166f2.equals(c1164d) ? 4 : 1;
        int i13 = abstractC1166f.equals(c1164d) ? 4 : 1;
        I0 i03 = new I0(i12 == 2 ? 1 : i12, i13 != 2 ? i13 : 1);
        Integer num = (Integer) AbstractC0637G.f10052f.get(i03);
        if (num != null) {
            return new x0(new RemoteViews(context.getPackageName(), i10 + AbstractC0637G.f10053g + num.intValue()), new C0664i0(0, 0, Z4.y.l0(new Y4.h(0, Z4.y.l0(new Y4.h(i03, Integer.valueOf(R.id.rootStubId))))), 3));
        }
        throw new IllegalStateException("Cannot find root element for size [" + Z1.l.y(i12) + ", " + Z1.l.y(i13) + ']');
    }

    public static final C0664i0 b(RemoteViews remoteViews, L0 l02, s0 s0Var, int i7, Z1.o oVar, C0985a c0985a, C0986b c0986b) {
        int iIntValue;
        if (i7 > 10) {
            Objects.toString(s0Var);
            new IllegalArgumentException(s0Var + " container cannot have more than 10 elements");
        }
        int i8 = i7 <= 10 ? i7 : 10;
        Integer numF = f(s0Var, oVar);
        if (numF != null) {
            iIntValue = numF.intValue();
        } else {
            C0681w c0681w = (C0681w) AbstractC0637G.f10047a.get(new C0682x(s0Var, i8, c0985a, c0986b));
            Integer numValueOf = c0681w != null ? Integer.valueOf(c0681w.f10344a) : null;
            if (numValueOf == null) {
                throw new IllegalArgumentException("Cannot find container " + s0Var + " with " + i7 + " children");
            }
            iIntValue = numValueOf.intValue();
        }
        Map map = (Map) AbstractC0637G.f10048b.get(s0Var);
        if (map == null) {
            throw new IllegalArgumentException("Cannot find generated children for " + s0Var);
        }
        C0664i0 c0664i0D = d(remoteViews, l02, iIntValue, oVar);
        int i9 = c0664i0D.f10198b;
        int i10 = c0664i0D.f10197a;
        C0664i0 c0664i0 = new C0664i0(i10, i9, map);
        if (Build.VERSION.SDK_INT >= 33) {
            remoteViews.removeAllViews(i10);
        }
        return c0664i0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public static final C0664i0 c(RemoteViews remoteViews, L0 l02, s0 s0Var, Z1.o oVar) {
        Integer numF = f(s0Var, oVar);
        if (numF != null || (numF = (Integer) f10273a.get(s0Var)) != null) {
            return d(remoteViews, l02, numF.intValue(), oVar);
        }
        throw new IllegalArgumentException("Cannot use `insertView` with a container like " + s0Var);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
    public static final C0664i0 d(RemoteViews remoteViews, L0 l02, int i7, Z1.o oVar) {
        Integer numValueOf;
        g2.s sVar = (g2.s) oVar.b(null, o0.f10264u);
        AbstractC1166f abstractC1166f = C1165e.f14165a;
        AbstractC1166f abstractC1166f2 = sVar != null ? sVar.f12457a : abstractC1166f;
        g2.n nVar = (g2.n) oVar.b(null, o0.f10265v);
        if (nVar != null) {
            abstractC1166f = nVar.f12446a;
        }
        if (oVar.e()) {
            numValueOf = null;
        } else {
            if (l02.f10091i.getAndSet(true)) {
                throw new IllegalStateException("At most one view can be set as AppWidgetBackground.");
            }
            numValueOf = Integer.valueOf(android.R.id.background);
        }
        int i8 = Build.VERSION.SDK_INT;
        int i9 = l02.f10088e;
        if (i8 >= 33) {
            int iIntValue = numValueOf != null ? numValueOf.intValue() : l02.f10090g.incrementAndGet();
            RemoteViews remoteViewsA = n0.f10242a.a(l02.f10084a.getPackageName(), i7, iIntValue);
            int i10 = l02.h.f10197a;
            if (i8 >= 31) {
                z0.f10356a.a(remoteViews, i10, remoteViewsA, i9);
            } else {
                remoteViews.addView(i10, remoteViewsA);
            }
            return new C0664i0(iIntValue, 0, null, 6);
        }
        if (i8 >= 31) {
            C1163c c1163c = C1163c.f14163a;
            return new C0664i0(M3.a.V(remoteViews, l02, e(remoteViews, l02, i9, abstractC1166f2.equals(c1163c) ? 3 : 1, abstractC1166f.equals(c1163c) ? 3 : 1), i7, numValueOf), 0, null, 6);
        }
        int iG = g(abstractC1166f2);
        int iG2 = g(abstractC1166f);
        int iE = e(remoteViews, l02, i9, iG, iG2);
        if (iG != 2 && iG2 != 2) {
            return new C0664i0(M3.a.V(remoteViews, l02, iE, i7, numValueOf), 0, null, 6);
        }
        C0672m0 c0672m0 = (C0672m0) AbstractC0637G.f10051e.get(new I0(iG, iG2));
        if (c0672m0 != null) {
            return new C0664i0(M3.a.V(remoteViews, l02, R.id.glanceViewStub, i7, numValueOf), M3.a.V(remoteViews, l02, iE, c0672m0.f10237a, null), null, 4);
        }
        throw new IllegalArgumentException("Could not find complex layout for width=" + Z1.l.y(iG) + ", height=" + Z1.l.y(iG2));
    }

    public static final int e(RemoteViews remoteViews, L0 l02, int i7, int i8, int i9) {
        I0 i02 = new I0(i8 == 2 ? 1 : i8, i9 != 2 ? i9 : 1);
        Map map = (Map) l02.h.f10199c.get(Integer.valueOf(i7));
        if (map == null) {
            throw new IllegalStateException(n1.c.s(i7, "Parent doesn't have child position "));
        }
        Integer num = (Integer) map.get(i02);
        if (num == null) {
            StringBuilder sbV = n1.c.v(i7, "No child for position ", " and size ");
            sbV.append(Z1.l.y(i8));
            sbV.append(" x ");
            sbV.append(Z1.l.y(i9));
            throw new IllegalStateException(sbV.toString());
        }
        int iIntValue = num.intValue();
        Collection collectionValues = map.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((Number) obj).intValue() != iIntValue) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            M3.a.V(remoteViews, l02, ((Number) it.next()).intValue(), R.layout.glance_deleted_view, Integer.valueOf(R.id.deletedViewId));
        }
        return iIntValue;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    public static final Integer f(s0 s0Var, Z1.o oVar) {
        if (Build.VERSION.SDK_INT >= 33) {
            C0647a c0647a = (C0647a) oVar.b(null, o0.f10266w);
            g2.s sVar = (g2.s) oVar.b(null, o0.f10267x);
            C1163c c1163c = C1163c.f14163a;
            boolean zEquals = sVar != null ? sVar.f12457a.equals(c1163c) : false;
            g2.n nVar = (g2.n) oVar.b(null, o0.f10268y);
            boolean zEquals2 = nVar != null ? nVar.f12446a.equals(c1163c) : false;
            if (c0647a != null) {
                ?? r12 = AbstractC0637G.f10049c;
                g2.c cVar = c0647a.f10152a;
                C0672m0 c0672m0 = (C0672m0) r12.get(new C0678t(s0Var, cVar.f12413a, cVar.f12414b));
                if (c0672m0 != null) {
                    return Integer.valueOf(c0672m0.f10237a);
                }
                throw new IllegalArgumentException("Cannot find " + s0Var + " with alignment " + cVar);
            }
            if (zEquals || zEquals2) {
                C0672m0 c0672m02 = (C0672m0) AbstractC0637G.f10050d.get(new A0(s0Var, zEquals, zEquals2));
                if (c0672m02 != null) {
                    return Integer.valueOf(c0672m02.f10237a);
                }
                throw new IllegalArgumentException("Cannot find " + s0Var + " with defaultWeight set");
            }
        }
        return null;
    }

    public static final int g(AbstractC1166f abstractC1166f) {
        if (abstractC1166f instanceof C1165e) {
            return 1;
        }
        if (abstractC1166f instanceof C1163c) {
            return 3;
        }
        if (abstractC1166f instanceof C1164d) {
            return 4;
        }
        if (abstractC1166f instanceof C1162b) {
            return 2;
        }
        throw new A2.W();
    }
}
