package z;

import e5.AbstractC0870h;
import x.C1808A;

/* JADX INFO: renamed from: z.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2042i0 extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p */
    public Object f20860p;

    /* JADX INFO: renamed from: q */
    public int f20861q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ c5.d f20862r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ C1808A f20863s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2042i0(C1808A c1808a, c5.d dVar) {
        super(dVar);
        this.f20863s = c1808a;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C2042i0 c2042i0 = new C2042i0(this.f20863s, dVar);
        c2042i0.f20862r = (c5.d) obj;
        return c2042i0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2042i0) create((t5.i) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0037 -> B:31:0x0038). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            d5.a r0 = d5.EnumC0830a.f11264o
            int r1 = r4.f20861q
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r4.f20860p
            c5.d r3 = r4.f20862r
            t5.i r3 = (t5.i) r3
            android.support.v4.media.session.b.K(r5)
            goto L38
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1b:
            android.support.v4.media.session.b.K(r5)
            c5.d r5 = r4.f20862r
            t5.i r5 = (t5.i) r5
            r3 = r5
        L23:
            x.A r5 = r4.f20863s
            java.lang.Object r5 = r5.a()
            if (r5 == 0) goto L37
            r4.f20862r = r3
            r4.f20860p = r5
            r4.f20861q = r2
            r3.c(r5, r4)
            d5.a r5 = d5.EnumC0830a.f11264o
            return r0
        L37:
            r1 = 0
        L38:
            if (r1 != 0) goto L23
            Y4.o r5 = Y4.o.f8736a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2042i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
