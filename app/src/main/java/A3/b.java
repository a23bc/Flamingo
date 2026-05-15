package A3;

import A2.k0;
import android.content.res.AssetManager;
import android.os.Build;
import j5.AbstractC1107a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import k.I;
import x.C1808A;
import z.C2026a0;
import z.C2042i0;
import z.M0;
import z.P0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f482f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f483g;
    public Object h;

    public b(P0 p02, I i7, n0.c cVar, n1.d dVar) {
        this.f478b = p02;
        this.f479c = i7;
        this.f480d = cVar;
        this.f481e = dVar;
        this.f482f = y5.j.a(Integer.MAX_VALUE, 6, null);
        this.h = new V1.a(27);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(A3.b r16, z.P0 r17, z.C2026a0 r18, float r19, float r20, e5.AbstractC0865c r21) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.b.a(A3.b, z.P0, z.a0, float, float, e5.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(A3.b r14, m5.C1220v r15, m5.C1217s r16, z.P0 r17, m5.C1220v r18, long r19, e5.AbstractC0865c r21) throws java.lang.Throwable {
        /*
            r0 = r19
            r2 = r21
            boolean r3 = r2 instanceof z.C2036f0
            if (r3 == 0) goto L17
            r3 = r2
            z.f0 r3 = (z.C2036f0) r3
            int r4 = r3.f20829u
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f20829u = r4
            goto L1c
        L17:
            z.f0 r3 = new z.f0
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f20828t
            d5.a r4 = d5.EnumC0830a.f11264o
            int r5 = r3.f20829u
            r6 = 1
            if (r5 == 0) goto L40
            if (r5 != r6) goto L38
            m5.v r14 = r3.f20827s
            z.P0 r0 = r3.f20826r
            m5.s r1 = r3.f20825q
            m5.v r4 = r3.f20824p
            A3.b r3 = r3.f20823o
            android.support.v4.media.session.b.K(r2)
            r9 = r14
            r8 = r0
            r14 = r3
            goto L6d
        L38:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L40:
            android.support.v4.media.session.b.K(r2)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L4c
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        L4c:
            z.g0 r2 = new z.g0
            r5 = 0
            r2.<init>(r14, r5)
            r3.f20823o = r14
            r3.f20824p = r15
            r7 = r16
            r3.f20825q = r7
            r8 = r17
            r3.f20826r = r8
            r9 = r18
            r3.f20827s = r9
            r3.f20829u = r6
            java.lang.Object r2 = w5.AbstractC1767D.D(r0, r2, r3)
            if (r2 != r4) goto L6b
            return r4
        L6b:
            r4 = r15
            r1 = r7
        L6d:
            z.a0 r2 = (z.C2026a0) r2
            if (r2 == 0) goto La8
            java.lang.Object r0 = r4.f14439o
            z.a0 r0 = (z.C2026a0) r0
            boolean r0 = r0.f20775c
            z.a0 r3 = new z.a0
            long r10 = r2.f20773a
            long r12 = r2.f20774b
            r20 = r0
            r15 = r3
            r16 = r10
            r18 = r12
            r15.<init>(r16, r18, r20)
            r0 = r15
            r4.f14439o = r0
            long r3 = r8.e(r10)
            float r0 = r8.g(r3)
            r1.f14436o = r0
            r0 = 30
            r3 = 0
            w.m r0 = w.AbstractC1671d.b(r3, r3, r0)
            r9.f14439o = r0
            r14.g(r2)
            float r14 = r1.f14436o
            boolean r14 = z.Z.a(r14)
            r14 = r14 ^ r6
            goto La9
        La8:
            r14 = 0
        La9:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.b.b(A3.b, m5.v, m5.s, z.P0, m5.v, long, e5.c):java.lang.Object");
    }

    public static C2026a0 f(y5.c cVar) {
        C2026a0 c2026a0 = null;
        t5.i iVarT = AbstractC1107a.t(new C2042i0(new C1808A(2, cVar), null));
        while (iVarT.hasNext()) {
            C2026a0 c2026a0A = (C2026a0) iVarT.next();
            if (c2026a0 != null) {
                c2026a0A = c2026a0.a(c2026a0A);
            }
            c2026a0 = c2026a0A;
        }
        return c2026a0;
    }

    public float c(M0 m02, float f7) {
        P0 p02 = (P0) this.f478b;
        long jH = p02.h(p02.d(f7));
        P0 p03 = m02.f20688a;
        return p02.g(p02.e(p03.c(p03.f20720k, jH, 1)));
    }

    public FileInputStream d(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e7) {
            String message = e7.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public void e(int i7, Serializable serializable) {
        ((Executor) this.f478b).execute(new k0(this, i7, serializable, 1));
    }

    public void g(C2026a0 c2026a0) {
        long j3 = c2026a0.f20774b;
        V1.a aVar = (V1.a) this.h;
        aVar.getClass();
        long j7 = c2026a0.f20773a;
        ((L0.d) aVar.f7389o).a(j3, Float.intBitsToFloat((int) (j7 >> 32)));
        ((L0.d) aVar.f7390p).a(j3, Float.intBitsToFloat((int) (j7 & 4294967295L)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(z.P0 r5, z.C2034e0 r6, e5.AbstractC0865c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof z.C2044j0
            if (r0 == 0) goto L13
            r0 = r7
            z.j0 r0 = (z.C2044j0) r0
            int r1 = r0.f20871q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20871q = r1
            goto L18
        L13:
            z.j0 r0 = new z.j0
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f20869o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f20871q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            android.support.v4.media.session.b.K(r7)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            android.support.v4.media.session.b.K(r7)
            r4.f477a = r3
            z.k0 r7 = new z.k0
            r2 = 0
            r7.<init>(r5, r6, r2)
            r0.f20871q = r3
            w5.x0 r5 = new w5.x0
            c5.i r6 = r0.getContext()
            r5.<init>(r0, r6)
            java.lang.Object r5 = N5.d.V(r5, r5, r7)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r5 = 0
            r4.f477a = r5
            Y4.o r5 = Y4.o.f8736a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.b.h(z.P0, z.e0, e5.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        this.f477a = false;
        this.f478b = executor;
        this.f479c = eVar;
        this.f483g = str;
        this.f482f = file;
        int i7 = Build.VERSION.SDK_INT;
        ?? r32 = 0;
        r32 = 0;
        if (i7 >= 24) {
            if (i7 >= 31) {
                r32 = f.f496d;
            } else {
                switch (i7) {
                    case 24:
                    case 25:
                        r32 = f.h;
                        break;
                    case 26:
                        r32 = f.f499g;
                        break;
                    case 27:
                        r32 = f.f498f;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        r32 = f.f497e;
                        break;
                }
            }
        }
        this.f480d = r32;
    }
}
