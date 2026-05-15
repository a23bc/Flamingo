package U;

import K0.EnumC0246n;
import K0.L;
import K0.u;
import Y4.o;
import c5.d;
import e5.AbstractC0870h;
import l5.e;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0870h implements e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u f7017p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public EnumC0246n f7018q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7019r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f7020s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f7021t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, d dVar) {
        super(dVar);
        this.f7021t = bVar;
    }

    @Override // e5.AbstractC0863a
    public final d create(Object obj, d dVar) {
        a aVar = new a(this.f7021t, dVar);
        aVar.f7020s = obj;
        return aVar;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((L) obj, (d) obj2)).invokeSuspend(o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (r10 == r1) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0257, code lost:
    
        if (r5 != r1) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0259, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01c2, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        if (r12 == r1) goto L145;
     */
    /* JADX WARN: Path cross not found for [B:29:0x00aa, B:24:0x0089], limit reached: 190 */
    /* JADX WARN: Path cross not found for [B:32:0x00af, B:35:0x00b5], limit reached: 190 */
    /* JADX WARN: Path cross not found for [B:59:0x0120, B:54:0x0109], limit reached: 190 */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:144:0x0257 -> B:146:0x025a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00c8 -> B:40:0x00cc). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
