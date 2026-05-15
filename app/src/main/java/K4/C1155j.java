package k4;

import android.content.Context;
import e4.C0854c;
import java.util.ArrayList;

/* JADX INFO: renamed from: k4.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1155j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p4.h f14122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14124c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p4.h f14125d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q4.h f14126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0854c f14127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f14128g;

    public C1155j(p4.h hVar, ArrayList arrayList, int i7, p4.h hVar2, q4.h hVar3, C0854c c0854c, boolean z6) {
        this.f14122a = hVar;
        this.f14123b = arrayList;
        this.f14124c = i7;
        this.f14125d = hVar2;
        this.f14126e = hVar3;
        this.f14127f = c0854c;
        this.f14128g = z6;
    }

    public final void a(p4.h hVar, C1153h c1153h) {
        Context context = hVar.f15053a;
        p4.h hVar2 = this.f14122a;
        if (context != hVar2.f15053a) {
            throw new IllegalStateException(("Interceptor '" + c1153h + "' cannot modify the request's context.").toString());
        }
        if (hVar.f15054b == p4.j.f15077a) {
            throw new IllegalStateException(("Interceptor '" + c1153h + "' cannot set the request's data to null.").toString());
        }
        if (hVar.f15055c != hVar2.f15055c) {
            throw new IllegalStateException(("Interceptor '" + c1153h + "' cannot modify the request's target.").toString());
        }
        if (hVar.f15073w != hVar2.f15073w) {
            throw new IllegalStateException(("Interceptor '" + c1153h + "' cannot modify the request's lifecycle.").toString());
        }
        if (hVar.f15074x == hVar2.f15074x) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + c1153h + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p4.h r13, e5.AbstractC0865c r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof k4.C1154i
            if (r0 == 0) goto L13
            r0 = r14
            k4.i r0 = (k4.C1154i) r0
            int r1 = r0.f14121s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14121s = r1
            goto L18
        L13:
            k4.i r0 = new k4.i
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f14119q
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f14121s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            k4.h r13 = r0.f14118p
            k4.j r0 = r0.f14117o
            android.support.v4.media.session.b.K(r14)
            goto L6c
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            android.support.v4.media.session.b.K(r14)
            java.util.ArrayList r6 = r12.f14123b
            int r14 = r12.f14124c
            if (r14 <= 0) goto L47
            int r2 = r14 + (-1)
            java.lang.Object r2 = r6.get(r2)
            k4.h r2 = (k4.C1153h) r2
            r12.a(r13, r2)
        L47:
            java.lang.Object r2 = r6.get(r14)
            k4.h r2 = (k4.C1153h) r2
            int r7 = r14 + 1
            k4.j r4 = new k4.j
            p4.h r5 = r12.f14122a
            e4.c r10 = r12.f14127f
            q4.h r9 = r12.f14126e
            boolean r11 = r12.f14128g
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f14117o = r12
            r0.f14118p = r2
            r0.f14121s = r3
            java.lang.Object r14 = r2.d(r4, r0)
            if (r14 != r1) goto L6a
            return r1
        L6a:
            r0 = r12
            r13 = r2
        L6c:
            p4.i r14 = (p4.i) r14
            p4.h r1 = r14.b()
            r0.a(r1, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.C1155j.b(p4.h, e5.c):java.lang.Object");
    }
}
