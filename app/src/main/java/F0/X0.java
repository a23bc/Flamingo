package f0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class X0 extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t.K f11773o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC1182c f11774p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y5.g f11775q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public A2.I f11776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f11777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11778t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f11779u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f11780v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(InterfaceC1180a interfaceC1180a, c5.d dVar) {
        super(2, dVar);
        this.f11780v = interfaceC1180a;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        X0 x02 = new X0(this.f11780v, dVar);
        x02.f11779u = obj;
        return x02;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((X0) create((InterfaceC2111f) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
        return EnumC0830a.f11264o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0190, code lost:
    
        r7 = r17;
        r3 = 3;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Path cross not found for [B:45:0x00fd, B:57:0x012e], limit reached: 130 */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0154 A[EDGE_INSN: B:128:0x0154->B:72:0x0154 BREAK  A[LOOP:0: B:38:0x00db->B:99:0x01ac], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8 A[Catch: all -> 0x0026, PHI: r2 r6 r7 r8 r9 r10 r11 r12
  0x00d8: PHI (r2v9 java.lang.Object) = (r2v12 java.lang.Object), (r2v15 java.lang.Object) binds: [B:34:0x00d4, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r6v1 int) = (r6v14 int), (r6v0 int) binds: [B:34:0x00d4, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r7v7 A2.I) = (r7v23 A2.I), (r7v26 A2.I) binds: [B:34:0x00d4, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r8v1 y5.g) = (r8v2 y5.g), (r8v5 y5.g) binds: [B:34:0x00d4, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r9v1 l5.c) = (r9v2 l5.c), (r9v5 l5.c) binds: [B:34:0x00d4, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r10v1 t.K) = (r10v2 t.K), (r10v5 t.K) binds: [B:34:0x00d4, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r11v2 z5.f) = (r11v3 z5.f), (r11v8 z5.f) binds: [B:34:0x00d4, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE]
  0x00d8: PHI (r12v5 java.lang.Object) = (r12v10 java.lang.Object), (r12v11 java.lang.Object) binds: [B:34:0x00d4, B:16:0x0042] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #5 {all -> 0x0026, blocks: (B:8:0x0020, B:33:0x00c2, B:36:0x00d8, B:81:0x0181, B:97:0x01a8, B:98:0x01ab, B:15:0x003f, B:18:0x0054, B:25:0x0093, B:29:0x00a8, B:104:0x01ba, B:105:0x01bd, B:26:0x009d, B:28:0x00a5, B:101:0x01b5, B:102:0x01b8), top: B:121:0x000a, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0156 A[Catch: all -> 0x0196, TRY_LEAVE, TryCatch #4 {all -> 0x0196, blocks: (B:50:0x0119, B:66:0x0145, B:70:0x014f, B:73:0x0156, B:77:0x016e, B:79:0x0177, B:54:0x0124, B:58:0x0130), top: B:119:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ac A[LOOP:0: B:38:0x00db->B:99:0x01ac, LOOP_END] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x018f -> B:85:0x0190). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.X0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
