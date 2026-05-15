package z;

import e5.AbstractC0871i;
import m5.C1220v;
import w5.InterfaceC1765B;

/* JADX INFO: loaded from: classes.dex */
public final class I extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o */
    public C1220v f20653o;

    /* JADX INFO: renamed from: p */
    public C1220v f20654p;

    /* JADX INFO: renamed from: q */
    public int f20655q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ Object f20656r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ J f20657s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j3, c5.d dVar) {
        super(2, dVar);
        this.f20657s = j3;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        I i7 = new I(this.f20657s, dVar);
        i7.f20656r = obj;
        return i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((InterfaceC1765B) obj, (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x00e5, code lost:
    
        if (z.J.E0(r3, r6) != r0) goto L72;
     */
    /* JADX WARN: Path cross not found for [B:105:0x00c8, B:101:0x00b1], limit reached: 56 */
    /* JADX WARN: Path cross not found for [B:107:0x00cc, B:80:0x0056], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00b1 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:99:0x00ab, B:101:0x00b1, B:105:0x00c8, B:107:0x00cc), top: B:120:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:99:0x00ab, B:101:0x00b1, B:105:0x00c8, B:107:0x00cc), top: B:120:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0032 A[PHI: r1 r4
  0x0032: PHI (r1v11 m5.v) = (r1v3 m5.v), (r1v16 m5.v) binds: [B:74:0x002f, B:97:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x0032: PHI (r4v6 w5.B) = (r4v4 w5.B), (r4v7 w5.B) binds: [B:74:0x002f, B:97:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0056 A[PHI: r5
  0x0056: PHI (r5v7 w5.B) = (r5v0 w5.B), (r5v3 w5.B), (r5v3 w5.B), (r5v3 w5.B), (r5v5 w5.B), (r5v8 w5.B) binds: [B:79:0x004e, B:106:0x00ca, B:108:0x00d7, B:102:0x00c3, B:91:0x0082, B:72:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x00c3 -> B:80:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x00ca -> B:80:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x00d7 -> B:80:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x00e5 -> B:72:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0082 -> B:80:0x0056). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.I.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
