package b6;

import e5.AbstractC0871i;
import w5.InterfaceC1765B;
import yos.music.player.data.libraries.YosMediaItem;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class z extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public YosMediaItem f10506o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ YosPlaybackService f10508q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(YosPlaybackService yosPlaybackService, c5.d dVar) {
        super(2, dVar);
        this.f10508q = yosPlaybackService;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        return new z(this.f10508q, dVar);
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c9, code lost:
    
        if (w5.AbstractC1767D.C(w5.M.f19498b, new V5.k(r11, null), r10) != r0) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:14:0x002c, B:35:0x00a9, B:37:0x00b1, B:28:0x0086, B:30:0x008d, B:32:0x0093), top: B:49:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b9 A[PHI: r1
  0x00b9: PHI (r1v2 ??) = (r1v19 ??), (r1v20 ??) binds: [B:39:0x00b6, B:36:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
