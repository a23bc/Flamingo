package b2;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import f0.C0894j0;
import f0.C0909r0;
import f0.InterfaceC0878b0;
import j2.C1103f;
import j2.C1105h;
import m5.AbstractC1209k;
import p0.AbstractC1289f;
import p0.C1285b;

/* JADX INFO: renamed from: b2.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0665j extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public int f10200o;

    /* JADX INFO: renamed from: p */
    public /* synthetic */ Object f10201p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0671m f10202q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Context f10203r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC0878b0 f10204s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0665j(C0671m c0671m, Context context, InterfaceC0878b0 interfaceC0878b0, c5.d dVar) {
        super(2, dVar);
        this.f10202q = c0671m;
        this.f10203r = context;
        this.f10204s = interfaceC0878b0;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0665j c0665j = new C0665j(this.f10202q, this.f10203r, this.f10204s, dVar);
        c0665j.f10201p = obj;
        return c0665j;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0665j) create((C0909r0) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0909r0 c0909r0;
        C1105h c1105h;
        C1285b c1285bD;
        long jD;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f10200o;
        Context context = this.f10203r;
        C0671m c0671m = this.f10202q;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            C0909r0 c0909r02 = (C0909r0) this.f10201p;
            if (c0671m.f10233i.getValue() != null || (c1105h = (C1105h) c0671m.f10229d.f51q) == null) {
                c0909r0 = c0909r02;
                obj = null;
            } else {
                this.f10201p = c0909r02;
                this.f10200o = 1;
                Object objC = ((C1103f) c0671m.f10231f).c(context, c1105h, c0671m.f10226a, this);
                if (objC == enumC0830a) {
                    return enumC0830a;
                }
                c0909r0 = c0909r02;
                obj = objC;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0909r0 = (C0909r0) this.f10201p;
            android.support.v4.media.session.b.K(obj);
        }
        InterfaceC0878b0 interfaceC0878b0 = this.f10204s;
        AbstractC1289f abstractC1289fK = p0.l.k();
        C1285b c1285b = abstractC1289fK instanceof C1285b ? (C1285b) abstractC1289fK : null;
        if (c1285b == null || (c1285bD = c1285b.D(null, null)) == null) {
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }
        try {
            AbstractC1289f abstractC1289fJ = c1285bD.j();
            try {
                C0651c c0651c = c0671m.f10230e;
                C0894j0 c0894j0 = c0671m.f10234j;
                int i8 = c0651c.f10163a;
                boolean z6 = false;
                if (Integer.MIN_VALUE <= i8 && i8 < -1) {
                    z6 = true;
                }
                if (!z6) {
                    Object systemService = context.getSystemService("appwidget");
                    AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.appwidget.AppWidgetManager");
                    AppWidgetManager appWidgetManager = (AppWidgetManager) systemService;
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    AppWidgetProviderInfo appWidgetInfo = appWidgetManager.getAppWidgetInfo(c0651c.f10163a);
                    if (appWidgetInfo == null) {
                        jD = 0;
                    } else {
                        int iMin = Math.min(appWidgetInfo.minWidth, (1 & appWidgetInfo.resizeMode) != 0 ? appWidgetInfo.minResizeWidth : Integer.MAX_VALUE);
                        int iMin2 = Math.min(appWidgetInfo.minHeight, (appWidgetInfo.resizeMode & 2) != 0 ? appWidgetInfo.minResizeHeight : Integer.MAX_VALUE);
                        float f7 = displayMetrics.density;
                        jD = i6.g.d(iMin / f7, iMin2 / f7);
                    }
                    interfaceC0878b0.setValue(new n1.i(jD));
                    if (((Bundle) c0894j0.getValue()) == null) {
                        c0894j0.setValue(appWidgetManager.getAppWidgetOptions(c0651c.f10163a));
                    }
                }
                if (obj != null) {
                    c0671m.f10233i.setValue(obj);
                }
                c0909r0.setValue(Boolean.TRUE);
                AbstractC1289f.q(abstractC1289fJ);
                c1285bD.w().d();
                c1285bD.c();
                return Y4.o.f8736a;
            } catch (Throwable th) {
                AbstractC1289f.q(abstractC1289fJ);
                throw th;
            }
        } catch (Throwable th2) {
            c1285bD.c();
            throw th2;
        }
    }
}
