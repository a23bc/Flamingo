package t3;

import N2.J;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class u implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f17027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f17028b = new J(10, new byte[10]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17029c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w2.r f17031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f17032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17033g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17034i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f17035j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f17036k;
    public long l;

    public u(f fVar) {
        this.f17027a = fVar;
    }

    @Override // t3.E
    public final void a() {
        this.f17029c = 0;
        this.f17030d = 0;
        this.h = false;
        this.f17027a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [N2.J] */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [t3.f] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
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
    @Override // t3.E
    public final void b(int i7, w2.m mVar) {
        int i8;
        ?? r7;
        int i9;
        AbstractC1697a.j(this.f17031e);
        int i10 = i7 & 1;
        ?? r32 = this.f17027a;
        int i11 = 2;
        ?? r8 = 0;
        if (i10 != 0) {
            int i12 = this.f17029c;
            if (i12 != 0 && i12 != 1) {
                if (i12 == 2) {
                    AbstractC1697a.w("Unexpected start indicator reading extended header");
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f17035j != -1) {
                        AbstractC1697a.w("Unexpected start indicator: expected " + this.f17035j + " more bytes");
                    }
                    r32.c(mVar.f18869c == 0);
                }
            }
            this.f17029c = 1;
            this.f17030d = 0;
        }
        int i13 = i7;
        while (mVar.a() > 0) {
            int i14 = this.f17029c;
            if (i14 != 0) {
                ?? r10 = this.f17028b;
                if (i14 != 1) {
                    if (i14 == i11) {
                        if (d(mVar, r10.f4989d, Math.min(10, this.f17034i)) && d(mVar, null, this.f17034i)) {
                            r10.q(r8);
                            this.l = -9223372036854775807L;
                            if (this.f17032f) {
                                r10.t(4);
                                long jI = ((long) r10.i(3)) << 30;
                                r10.t(1);
                                long jI2 = ((long) (r10.i(15) << 15)) | jI;
                                r10.t(1);
                                long jI3 = jI2 | ((long) r10.i(15));
                                r10.t(1);
                                if (!this.h && this.f17033g) {
                                    r10.t(4);
                                    long jI4 = ((long) r10.i(3)) << 30;
                                    r10.t(1);
                                    long jI5 = jI4 | ((long) (r10.i(15) << 15));
                                    r10.t(1);
                                    long jI6 = jI5 | ((long) r10.i(15));
                                    r10.t(1);
                                    this.f17031e.b(jI6);
                                    this.h = true;
                                }
                                this.l = this.f17031e.b(jI3);
                            }
                            i13 |= this.f17036k ? 4 : 0;
                            r32.d(this.l, i13);
                            this.f17029c = 3;
                            this.f17030d = 0;
                            r8 = 0;
                            i11 = 2;
                        }
                    } else {
                        if (i14 != 3) {
                            throw new IllegalStateException();
                        }
                        int iA = mVar.a();
                        int i15 = this.f17035j;
                        ?? r102 = i15 == -1 ? r8 : iA - i15;
                        if (r102 > 0) {
                            iA -= r102;
                            mVar.F(mVar.f18868b + iA);
                        }
                        r32.b(mVar);
                        int i16 = this.f17035j;
                        if (i16 != -1) {
                            int i17 = i16 - iA;
                            this.f17035j = i17;
                            if (i17 == 0) {
                                r32.c(r8);
                                this.f17029c = 1;
                                this.f17030d = r8;
                            }
                        }
                    }
                    i8 = i11;
                    r7 = r8;
                } else {
                    ?? r72 = r8;
                    if (d(mVar, r10.f4989d, 9)) {
                        r10.q(r72 == true ? 1 : 0);
                        int i18 = r10.i(24);
                        if (i18 != 1) {
                            n1.c.x(i18, "Unexpected start code prefix: ");
                            this.f17035j = -1;
                            i9 = 0;
                            i8 = 2;
                        } else {
                            r10.t(8);
                            int i19 = r10.i(16);
                            r10.t(5);
                            this.f17036k = r10.h();
                            i8 = 2;
                            r10.t(2);
                            this.f17032f = r10.h();
                            this.f17033g = r10.h();
                            r10.t(6);
                            int i20 = r10.i(8);
                            this.f17034i = i20;
                            if (i19 == 0) {
                                this.f17035j = -1;
                            } else {
                                int i21 = (i19 - 3) - i20;
                                this.f17035j = i21;
                                if (i21 < 0) {
                                    AbstractC1697a.w("Found negative packet payload size: " + this.f17035j);
                                    this.f17035j = -1;
                                }
                            }
                            i9 = 2;
                        }
                        this.f17029c = i9;
                        r7 = 0;
                        this.f17030d = 0;
                    } else {
                        i8 = 2;
                        r7 = r72;
                    }
                }
            } else {
                i8 = i11;
                r7 = r8;
                mVar.H(mVar.a());
            }
            r8 = r7;
            i11 = i8;
        }
    }

    @Override // t3.E
    public final void c(w2.r rVar, N2.o oVar, C1500D c1500d) {
        this.f17031e = rVar;
        this.f17027a.e(oVar, c1500d);
    }

    public final boolean d(w2.m mVar, byte[] bArr, int i7) {
        int iMin = Math.min(mVar.a(), i7 - this.f17030d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            mVar.H(iMin);
        } else {
            mVar.e(bArr, this.f17030d, iMin);
        }
        int i8 = this.f17030d + iMin;
        this.f17030d = i8;
        return i8 == i7;
    }
}
