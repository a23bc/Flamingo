package k4;

import Y4.o;
import e4.C0854c;
import e5.AbstractC0871i;
import n4.C1230a;
import p4.l;
import w5.InterfaceC1765B;

/* JADX INFO: renamed from: k4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1152g extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1153h f14107p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ p4.h f14108q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f14109r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f14110s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0854c f14111t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C1230a f14112u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1155j f14113v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1152g(C1153h c1153h, p4.h hVar, Object obj, l lVar, C0854c c0854c, C1230a c1230a, C1155j c1155j, c5.d dVar) {
        super(2, dVar);
        this.f14107p = c1153h;
        this.f14108q = hVar;
        this.f14109r = obj;
        this.f14110s = lVar;
        this.f14111t = c0854c;
        this.f14112u = c1230a;
        this.f14113v = c1155j;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new C1152g(this.f14107p, this.f14108q, this.f14109r, this.f14110s, this.f14111t, this.f14112u, this.f14113v, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C1152g) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            r16 = this;
            r5 = r16
            d5.a r6 = d5.EnumC0830a.f11264o
            int r0 = r5.f14106o
            r7 = 1
            if (r0 == 0) goto L19
            if (r0 != r7) goto L11
            android.support.v4.media.session.b.K(r17)
            r0 = r17
            goto L2f
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L19:
            android.support.v4.media.session.b.K(r17)
            r5.f14106o = r7
            p4.l r3 = r5.f14110s
            e4.c r4 = r5.f14111t
            k4.h r0 = r5.f14107p
            p4.h r1 = r5.f14108q
            java.lang.Object r2 = r5.f14109r
            java.lang.Object r0 = k4.C1153h.b(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto L2f
            return r6
        L2f:
            k4.a r0 = (k4.C1146a) r0
            k4.h r1 = r5.f14107p
            k.I r1 = r1.f14116c
            p4.h r2 = r5.f14108q
            p4.a r2 = r2.f15066p
            boolean r2 = r2.f15004p
            r3 = 0
            r4 = 0
            n4.a r6 = r5.f14112u
            if (r2 != 0) goto L43
        L41:
            r1 = r3
            goto L97
        L43:
            java.lang.Object r1 = r1.f13847p
            e4.k r1 = (e4.C0862k) r1
            Y4.m r1 = r1.f11595b
            java.lang.Object r1 = r1.getValue()
            n4.c r1 = (n4.C1232c) r1
            if (r1 == 0) goto L41
            if (r6 != 0) goto L54
            goto L41
        L54:
            android.graphics.drawable.Drawable r2 = r0.f14057a
            boolean r8 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r8 == 0) goto L5d
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            goto L5e
        L5d:
            r2 = r4
        L5e:
            if (r2 == 0) goto L41
            android.graphics.Bitmap r2 = r2.getBitmap()
            if (r2 != 0) goto L67
            goto L41
        L67:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            boolean r9 = r0.f14058b
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            java.lang.String r10 = "coil#is_sampled"
            r8.put(r10, r9)
            java.lang.String r9 = r0.f14060d
            if (r9 == 0) goto L80
            java.lang.String r10 = "coil#disk_cache_key"
            r8.put(r10, r9)
        L80:
            java.util.Map r9 = r6.f14540p
            java.util.Map r9 = j5.AbstractC1107a.D(r9)
            n4.a r10 = new n4.a
            java.lang.String r11 = r6.f14539o
            r10.<init>(r11, r9)
            java.util.Map r8 = j5.AbstractC1107a.D(r8)
            n4.g r1 = r1.f14543a
            r1.p(r10, r2, r8)
            r1 = r7
        L97:
            android.graphics.drawable.Drawable r9 = r0.f14057a
            if (r1 == 0) goto L9d
            r12 = r6
            goto L9e
        L9d:
            r12 = r4
        L9e:
            android.graphics.Bitmap$Config r1 = s4.e.f15919a
            k4.j r1 = r5.f14113v
            boolean r2 = r1 instanceof k4.C1155j
            if (r2 == 0) goto Lac
            boolean r1 = r1.f14128g
            if (r1 == 0) goto Lac
            r15 = r7
            goto Lad
        Lac:
            r15 = r3
        Lad:
            p4.n r8 = new p4.n
            java.lang.String r13 = r0.f14060d
            boolean r14 = r0.f14058b
            p4.h r10 = r5.f14108q
            g4.f r11 = r0.f14059c
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.C1152g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
