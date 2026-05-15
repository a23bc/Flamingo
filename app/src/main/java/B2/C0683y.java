package b2;

import androidx.glance.appwidget.UnmanagedSessionReceiver;

/* JADX INFO: renamed from: b2.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0683y implements c5.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ C0683y f10352o = new C0683y();

    public static void a(int i7) {
        synchronized (UnmanagedSessionReceiver.f9552a) {
            if (UnmanagedSessionReceiver.f9553b.get(Integer.valueOf(i7)) != null) {
                throw new ClassCastException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(android.content.Context r7, int r8, e5.AbstractC0865c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof b2.C0666j0
            if (r0 == 0) goto L13
            r0 = r9
            b2.j0 r0 = (b2.C0666j0) r0
            int r1 = r0.f10209s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10209s = r1
            goto L18
        L13:
            b2.j0 r0 = new b2.j0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f10207q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f10209s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r8 = r0.f10206p
            android.content.Context r7 = r0.f10205o
            android.support.v4.media.session.b.K(r9)     // Catch: java.io.IOException -> L5a O1.C0329a -> L5f
            goto L55
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            android.support.v4.media.session.b.K(r9)
            j2.f r9 = j2.C1103f.f13698a     // Catch: java.io.IOException -> L5a O1.C0329a -> L5f
            b2.r0 r2 = b2.r0.f10285a     // Catch: java.io.IOException -> L5a O1.C0329a -> L5f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L5a O1.C0329a -> L5f
            java.lang.String r5 = "appWidgetLayout-"
            r4.<init>(r5)     // Catch: java.io.IOException -> L5a O1.C0329a -> L5f
            r4.append(r8)     // Catch: java.io.IOException -> L5a O1.C0329a -> L5f
            java.lang.String r4 = r4.toString()     // Catch: java.io.IOException -> L5a O1.C0329a -> L5f
            r0.f10205o = r7     // Catch: java.io.IOException -> L5a O1.C0329a -> L5f
            r0.f10206p = r8     // Catch: java.io.IOException -> L5a O1.C0329a -> L5f
            r0.f10209s = r3     // Catch: java.io.IOException -> L5a O1.C0329a -> L5f
            java.lang.Object r9 = r9.c(r7, r2, r4, r0)     // Catch: java.io.IOException -> L5a O1.C0329a -> L5f
            if (r9 != r1) goto L55
            return r1
        L55:
            d2.e r9 = (d2.C0817e) r9     // Catch: java.io.IOException -> L5a O1.C0329a -> L5f
        L57:
            r1 = r7
            r4 = r8
            goto L64
        L5a:
            d2.e r9 = d2.C0817e.n()
            goto L57
        L5f:
            d2.e r9 = d2.C0817e.n()
            goto L57
        L64:
            androidx.glance.appwidget.protobuf.t r7 = r9.o()
            int r8 = Z4.p.j0(r7)
            int r8 = Z4.y.k0(r8)
            r0 = 16
            if (r8 >= r0) goto L75
            r8 = r0
        L75:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r8)
            java.util.Iterator r7 = r7.iterator()
        L7e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r7.next()
            d2.g r8 = (d2.C0819g) r8
            d2.i r2 = r8.m()
            int r8 = r8.n()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r8)
            r0.put(r2, r3)
            goto L7e
        L9b:
            java.util.LinkedHashMap r2 = Z4.y.q0(r0)
            b2.l0 r0 = new b2.l0
            int r3 = r9.p()
            java.util.Collection r7 = r2.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Set r5 = Z4.n.N0(r7)
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C0683y.b(android.content.Context, int, e5.c):java.lang.Object");
    }
}
