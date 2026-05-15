package androidx.glance.session;

import B5.n;
import D5.e;
import N3.h;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import i2.I;
import i2.InterfaceC1076k;
import i2.q;
import m5.AbstractC1204f;
import w5.AbstractC1805x;
import w5.M;

/* JADX INFO: loaded from: classes.dex */
public final class SessionWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final String f9672A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final WorkerParameters f9673w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final InterfaceC1076k f9674x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final I f9675y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final AbstractC1805x f9676z;

    public SessionWorker(Context context, WorkerParameters workerParameters, InterfaceC1076k interfaceC1076k, I i7, AbstractC1805x abstractC1805x) {
        super(context, workerParameters);
        this.f9673w = workerParameters;
        this.f9674x = interfaceC1076k;
        this.f9675y = i7;
        this.f9676z = abstractC1805x;
        h hVar = this.f9838p.f9844b;
        interfaceC1076k.getClass();
        Object obj = hVar.f5135a.get("KEY");
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            throw new IllegalStateException("SessionWorker must be started with a key");
        }
        this.f9672A = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(e5.AbstractC0865c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof i2.r
            if (r0 == 0) goto L13
            r0 = r6
            i2.r r0 = (i2.r) r0
            int r1 = r0.f13414q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13414q = r1
            goto L18
        L13:
            i2.r r0 = new i2.r
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13412o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f13414q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            android.support.v4.media.session.b.K(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            android.support.v4.media.session.b.K(r6)
            i2.I r6 = r5.f9675y
            B2.g r6 = r6.f13328d
            i2.w r2 = new i2.w
            r4 = 0
            r2.<init>(r5, r4)
            r0.f13414q = r3
            java.lang.Object r6 = a.AbstractC0509a.b0(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            N3.o r6 = (N3.o) r6
            if (r6 != 0) goto L62
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r1 = "TIMEOUT_EXIT_REASON"
            r6.put(r1, r0)
            N3.h r0 = new N3.h
            r0.<init>(r6)
            N3.h.b(r0)
            N3.n r6 = new N3.n
            r6.<init>(r0)
        L62:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.glance.session.SessionWorker.h(e5.c):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final AbstractC1805x i() {
        return this.f9676z;
    }

    public SessionWorker(Context context, WorkerParameters workerParameters) {
        this(context, workerParameters, q.f13411a, null, null, 24, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionWorker(Context context, WorkerParameters workerParameters, InterfaceC1076k interfaceC1076k, I i7, AbstractC1805x abstractC1805x, int i8, AbstractC1204f abstractC1204f) {
        InterfaceC1076k interfaceC1076k2 = (i8 & 4) != 0 ? q.f13411a : interfaceC1076k;
        I i9 = (i8 & 8) != 0 ? new I() : i7;
        if ((i8 & 16) != 0) {
            e eVar = M.f19497a;
            abstractC1805x = n.f912a;
        }
        this(context, workerParameters, interfaceC1076k2, i9, abstractC1805x);
    }
}
