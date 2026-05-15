package t;

import b2.w0;
import d.C0746L;
import m5.AbstractC1209k;
import u.AbstractC1525a;

/* JADX INFO: renamed from: t.u */
/* JADX INFO: loaded from: classes.dex */
public class C1465u {

    /* JADX INFO: renamed from: a */
    public final int f16110a;

    /* JADX INFO: renamed from: b */
    public final w0 f16111b;

    /* JADX INFO: renamed from: c */
    public final C0746L f16112c;

    /* JADX INFO: renamed from: d */
    public int f16113d;

    /* JADX INFO: renamed from: e */
    public int f16114e;

    /* JADX INFO: renamed from: f */
    public int f16115f;

    public C1465u(int i7) {
        this.f16110a = i7;
        if (i7 <= 0) {
            AbstractC1525a.c("maxSize <= 0");
            throw null;
        }
        this.f16111b = new w0(2);
        this.f16112c = new C0746L(19);
    }

    public void a(Object obj) {
        AbstractC1209k.f(obj, "key");
    }

    public void b(Object obj, Object obj2, Object obj3) {
        AbstractC1209k.f(obj, "key");
        AbstractC1209k.f(obj2, "oldValue");
    }

    public final Object c(Object obj) {
        AbstractC1209k.f(obj, "key");
        synchronized (this.f16112c) {
            w0 w0Var = this.f16111b;
            w0Var.getClass();
            Object obj2 = w0Var.f10345a.get(obj);
            if (obj2 != null) {
                this.f16114e++;
                return obj2;
            }
            this.f16115f++;
            a(obj);
            return null;
        }
    }

    public final Object d(Object obj, Object obj2) {
        Object objPut;
        AbstractC1209k.f(obj, "key");
        synchronized (this.f16112c) {
            this.f16113d += f(obj, obj2);
            w0 w0Var = this.f16111b;
            w0Var.getClass();
            objPut = w0Var.f10345a.put(obj, obj2);
            if (objPut != null) {
                this.f16113d -= f(obj, objPut);
            }
        }
        if (objPut != null) {
            b(obj, objPut, obj2);
        }
        h(this.f16110a);
        return objPut;
    }

    public final Object e(Object obj) {
        Object objRemove;
        synchronized (this.f16112c) {
            w0 w0Var = this.f16111b;
            w0Var.getClass();
            objRemove = w0Var.f10345a.remove(obj);
            if (objRemove != null) {
                this.f16113d -= f(obj, objRemove);
            }
        }
        if (objRemove != null) {
            b(obj, objRemove, null);
        }
        return objRemove;
    }

    public final int f(Object obj, Object obj2) {
        int iG = g(obj, obj2);
        if (iG >= 0) {
            return iG;
        }
        String str = "Negative size: " + obj + '=' + obj2;
        AbstractC1209k.f(str, "message");
        throw new IllegalStateException(str);
    }

    public int g(Object obj, Object obj2) {
        AbstractC1209k.f(obj, "key");
        AbstractC1209k.f(obj2, "value");
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x008d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r7) {
        /*
            r6 = this;
        L0:
            d.L r0 = r6.f16112c
            monitor-enter(r0)
            int r1 = r6.f16113d     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 < 0) goto L1c
            b2.w0 r1 = r6.f16111b     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r1.f10345a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L1a
            int r1 = r6.f16113d     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L1c
            goto L1a
        L17:
            r7 = move-exception
            goto L96
        L1a:
            r1 = 1
            goto L1d
        L1c:
            r1 = r2
        L1d:
            if (r1 == 0) goto L8e
            int r1 = r6.f16113d     // Catch: java.lang.Throwable -> L17
            if (r1 <= r7) goto L8c
            b2.w0 r1 = r6.f16111b     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r1.f10345a     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L2e
            goto L8c
        L2e:
            b2.w0 r1 = r6.f16111b     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r1.f10345a     // Catch: java.lang.Throwable -> L17
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = "<get-entries>(...)"
            m5.AbstractC1209k.e(r1, r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L17
            boolean r3 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L17
            r4 = 0
            if (r3 == 0) goto L51
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L17
            boolean r3 = r1.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L4c
        L4a:
            r1 = r4
            goto L60
        L4c:
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L17
            goto L60
        L51:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L17
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L5c
            goto L4a
        L5c:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L17
        L60:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L66
            monitor-exit(r0)
            return
        L66:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L17
            b2.w0 r3 = r6.f16111b     // Catch: java.lang.Throwable -> L17
            r3.getClass()     // Catch: java.lang.Throwable -> L17
            java.lang.String r5 = "key"
            m5.AbstractC1209k.f(r2, r5)     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r3 = r3.f10345a     // Catch: java.lang.Throwable -> L17
            r3.remove(r2)     // Catch: java.lang.Throwable -> L17
            int r3 = r6.f16113d     // Catch: java.lang.Throwable -> L17
            int r5 = r6.f(r2, r1)     // Catch: java.lang.Throwable -> L17
            int r3 = r3 - r5
            r6.f16113d = r3     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            r6.b(r2, r1, r4)
            goto L0
        L8c:
            monitor-exit(r0)
            return
        L8e:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L17
            throw r1     // Catch: java.lang.Throwable -> L17
        L96:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C1465u.h(int):void");
    }

    public final String toString() {
        String str;
        synchronized (this.f16112c) {
            try {
                int i7 = this.f16114e;
                int i8 = this.f16115f + i7;
                str = "LruCache[maxSize=" + this.f16110a + ",hits=" + this.f16114e + ",misses=" + this.f16115f + ",hitRate=" + (i8 != 0 ? (i7 * 100) / i8 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
