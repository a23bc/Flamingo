package p0;

import e5.AbstractC0870h;

/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC0870h implements l5.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long[] f14925p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14926q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14927r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14928s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ c5.d f14929t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j f14930u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, c5.d dVar) {
        super(dVar);
        this.f14930u = jVar;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        i iVar = new i(this.f14930u, dVar);
        iVar.f14929t = (c5.d) obj;
        return iVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((t5.i) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0087 -> B:26:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c8 -> B:37:0x00ca). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
