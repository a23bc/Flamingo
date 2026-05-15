package b2;

import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import w5.AbstractC1767D;
import yos.music.player.R;

/* JADX INFO: renamed from: b2.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0660g0 implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GlanceRemoteViewsService f10182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10185d;

    public C0660g0(GlanceRemoteViewsService glanceRemoteViewsService, int i7, int i8, String str) {
        this.f10182a = glanceRemoteViewsService;
        this.f10183b = i7;
        this.f10184c = i8;
        this.f10185d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(b2.C0660g0 r8, b2.C0651c r9, e5.AbstractC0865c r10) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        /*
            boolean r0 = r10 instanceof b2.C0656e0
            if (r0 == 0) goto L13
            r0 = r10
            b2.e0 r0 = (b2.C0656e0) r0
            int r1 = r0.f10174r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10174r = r1
            goto L18
        L13:
            b2.e0 r0 = new b2.e0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f10172p
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f10174r
            Y4.o r3 = Y4.o.f8736a
            r4 = 3
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            r8 = 2
            if (r2 == r8) goto L38
            if (r2 != r4) goto L30
            android.support.v4.media.session.b.K(r10)
            return r3
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            android.support.v4.media.session.b.K(r10)
            w5.g0 r10 = (w5.InterfaceC1786g0) r10
            goto L9b
        L3e:
            b2.g0 r8 = r0.f10171o
            android.support.v4.media.session.b.K(r10)
            goto L8f
        L44:
            android.support.v4.media.session.b.K(r10)
            androidx.glance.appwidget.GlanceRemoteViewsService r10 = r8.f10182a
            android.appwidget.AppWidgetManager r10 = android.appwidget.AppWidgetManager.getInstance(r10)
            int r2 = r8.f10183b
            android.appwidget.AppWidgetProviderInfo r10 = r10.getAppWidgetInfo(r2)
            if (r10 == 0) goto L7a
            android.content.ComponentName r10 = r10.provider
            if (r10 == 0) goto L7a
            java.lang.String r10 = r10.getClassName()
            if (r10 == 0) goto L7a
            java.lang.Class r10 = java.lang.Class.forName(r10)
            r2 = 0
            java.lang.Class[] r7 = new java.lang.Class[r2]
            java.lang.reflect.Constructor r10 = r10.getDeclaredConstructor(r7)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r10 = r10.newInstance(r2)
            java.lang.String r2 = "null cannot be cast to non-null type androidx.glance.appwidget.GlanceAppWidgetReceiver"
            m5.AbstractC1209k.d(r10, r2)
            yos.music.player.appwidget.layout.TwoByTwoReceiver r10 = (yos.music.player.appwidget.layout.TwoByTwoReceiver) r10
            A0.b r10 = r10.f20579b
            goto L7b
        L7a:
            r10 = r6
        L7b:
            if (r10 == 0) goto L93
            i2.p r2 = i2.q.f13411a
            b2.f0 r7 = new b2.f0
            r7.<init>(r8, r9, r10, r6)
            r0.f10171o = r8
            r0.f10174r = r5
            java.lang.Object r10 = r2.a(r7, r0)
            if (r10 != r1) goto L8f
            goto La7
        L8f:
            w5.g0 r10 = (w5.InterfaceC1786g0) r10
            if (r10 != 0) goto L9b
        L93:
            b2.y r9 = androidx.glance.appwidget.UnmanagedSessionReceiver.f9552a
            int r8 = r8.f10183b
            b2.C0683y.a(r8)
            r10 = r6
        L9b:
            if (r10 == 0) goto La8
            r0.f10171o = r6
            r0.f10174r = r4
            java.lang.Object r8 = r10.j(r0)
            if (r8 != r1) goto La8
        La7:
            return r1
        La8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0660g0.a(b2.g0, b2.c, e5.c):java.lang.Object");
    }

    public final v0 b() {
        v0 v0Var;
        w0 w0Var = GlanceRemoteViewsService.f9551o;
        int i7 = this.f10183b;
        int i8 = this.f10184c;
        String str = this.f10185d;
        w0 w0Var2 = GlanceRemoteViewsService.f9551o;
        synchronized (w0Var2) {
            v0Var = (v0) w0Var2.f10345a.get(w0.a(str, i7, i8));
            if (v0Var == null) {
                v0Var = v0.f10340d;
            }
        }
        return v0Var;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return b().f10341a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i7) {
        try {
            return b().f10341a[i7];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i7) {
        try {
            return b().f10342b[i7];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f10182a.getPackageName(), R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return b().f10343c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        b().getClass();
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() throws Throwable {
        AbstractC1767D.x(c5.j.f10685o, new C0654d0(this, null));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        w0 w0Var = GlanceRemoteViewsService.f9551o;
        int i7 = this.f10183b;
        int i8 = this.f10184c;
        String str = this.f10185d;
        w0 w0Var2 = GlanceRemoteViewsService.f9551o;
        synchronized (w0Var2) {
            w0Var2.f10345a.remove(w0.a(str, i7, i8));
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }
}
