package b2;

import O1.InterfaceC0335g;
import a.AbstractC0509a;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import d5.EnumC0830a;
import w5.AbstractC1767D;
import yos.music.player.appwidget.layout.TwoByTwoReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0645O f10124d = new C0645O();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Q1.b f10125e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static R1.d f10126f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final R1.e f10127g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppWidgetManager f10129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Y4.m f10130c = AbstractC0509a.O(new E0.K(17, this));

    static {
        Q1.a aVar = Q1.a.f6101p;
        D5.d dVar = w5.M.f19498b;
        w5.y0 y0VarC = AbstractC1767D.c();
        dVar.getClass();
        f10125e = new Q1.b(aVar, AbstractC1767D.a(I0.c.L(dVar, y0VarC)));
        f10127g = new R1.e("list::Providers");
    }

    public W(Context context) {
        this.f10128a = context;
        this.f10129b = AppWidgetManager.getInstance(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.Serializable a(java.lang.Class r8, e5.AbstractC0865c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof b2.T
            if (r0 == 0) goto L13
            r0 = r9
            b2.T r0 = (b2.T) r0
            int r1 = r0.f10115s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10115s = r1
            goto L18
        L13:
            b2.T r0 = new b2.T
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f10113q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f10115s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Class r8 = r0.f10112p
            b2.W r0 = r0.f10111o
            android.support.v4.media.session.b.K(r9)
            goto L44
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            android.support.v4.media.session.b.K(r9)
            r0.f10111o = r7
            r0.f10112p = r8
            r0.f10115s = r3
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            r0 = r7
        L44:
            b2.P r9 = (b2.C0646P) r9
            java.lang.String r8 = r8.getCanonicalName()
            if (r8 == 0) goto L90
            java.util.Map r9 = r9.f10106b
            java.lang.Object r8 = r9.get(r8)
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L59
            Z4.v r8 = Z4.v.f8818o
            return r8
        L59:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L62:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r8.next()
            android.content.ComponentName r1 = (android.content.ComponentName) r1
            android.appwidget.AppWidgetManager r2 = r0.f10129b
            int[] r1 = r2.getAppWidgetIds(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.length
            r2.<init>(r3)
            int r3 = r1.length
            r4 = 0
        L7c:
            if (r4 >= r3) goto L8b
            r5 = r1[r4]
            b2.c r6 = new b2.c
            r6.<init>(r5)
            r2.add(r6)
            int r4 = r4 + 1
            goto L7c
        L8b:
            Z4.t.l0(r9, r2)
            goto L62
        L8f:
            return r9
        L90:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "no canonical provider name"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.W.a(java.lang.Class, e5.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(e5.AbstractC0865c r12) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.W.b(e5.c):java.lang.Object");
    }

    public final Object c(TwoByTwoReceiver twoByTwoReceiver, A0.b bVar, C0652c0 c0652c0) {
        f10124d.getClass();
        String canonicalName = twoByTwoReceiver.getClass().getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no receiver name");
        }
        String canonicalName2 = bVar.getClass().getCanonicalName();
        if (canonicalName2 == null) {
            throw new IllegalArgumentException("no provider name");
        }
        Object objA = ((InterfaceC0335g) this.f10130c.getValue()).a(new V(canonicalName, canonicalName2, null), c0652c0);
        return objA == EnumC0830a.f11264o ? objA : Y4.o.f8736a;
    }
}
