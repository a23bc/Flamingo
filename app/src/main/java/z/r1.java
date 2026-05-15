package z;

import d5.EnumC0830a;
import o0.C1247d;

/* JADX INFO: loaded from: classes.dex */
public abstract class r1 {

    /* JADX INFO: renamed from: a */
    public static final C1247d f20949a = new C1247d(23);

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final boolean a(K0.L l) {
        ?? r52 = l.f3846t.f3854H.f3896a;
        int size = r52.size();
        boolean z6 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            if (((K0.u) r52.get(i7)).f3913d) {
                z6 = true;
                break;
            }
            i7++;
        }
        return !z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x003d, code lost:
    
        if (a(r7) == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0057  */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0049 -> B:48:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(K0.L r7, K0.EnumC0246n r8, e5.AbstractC0863a r9) {
        /*
            boolean r0 = r9 instanceof z.T
            if (r0 == 0) goto L13
            r0 = r9
            z.T r0 = (z.T) r0
            int r1 = r0.f20738r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20738r = r1
            goto L18
        L13:
            z.T r0 = new z.T
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f20737q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f20738r
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            K0.n r7 = r0.f20736p
            K0.L r8 = r0.f20735o
            android.support.v4.media.session.b.K(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L4c
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            android.support.v4.media.session.b.K(r9)
            boolean r9 = a(r7)
            if (r9 != 0) goto L65
        L3f:
            r0.f20735o = r7
            r0.f20736p = r8
            r0.f20738r = r3
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L4c
            return r1
        L4c:
            K0.m r9 = (K0.C0245m) r9
            java.lang.Object r9 = r9.f3896a
            int r2 = r9.size()
            r4 = 0
        L55:
            if (r4 >= r2) goto L65
            java.lang.Object r5 = r9.get(r4)
            K0.u r5 = (K0.u) r5
            boolean r5 = r5.f3913d
            if (r5 == 0) goto L62
            goto L3f
        L62:
            int r4 = r4 + 1
            goto L55
        L65:
            Y4.o r7 = Y4.o.f8736a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z.r1.b(K0.L, K0.n, e5.a):java.lang.Object");
    }

    public static final Object c(K0.y yVar, l5.e eVar, c5.d dVar) {
        Object objB0 = ((K0.N) yVar).B0(new U(dVar.getContext(), eVar, null), dVar);
        return objB0 == EnumC0830a.f11264o ? objB0 : Y4.o.f8736a;
    }
}
