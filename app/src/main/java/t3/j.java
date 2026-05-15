package t3;

import N2.H;
import w2.AbstractC1697a;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f16890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f16892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f16896g;
    public long h;

    public j(H h) {
        this.f16890a = h;
    }

    public final void a(byte[] bArr, int i7, int i8) {
        if (this.f16892c) {
            int i9 = this.f16895f;
            int i10 = (i7 + 1) - i9;
            if (i10 >= i8) {
                this.f16895f = (i8 - i7) + i9;
            } else {
                this.f16893d = ((bArr[i10] & 192) >> 6) == 0;
                this.f16892c = false;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(int i7, long j3, boolean z6) {
        AbstractC1697a.i(this.h != -9223372036854775807L);
        if (this.f16894e == 182 && z6 && this.f16891b) {
            this.f16890a.f(this.h, this.f16893d ? 1 : 0, (int) (j3 - this.f16896g), i7, null);
        }
        if (this.f16894e != 179) {
            this.f16896g = j3;
        }
    }
}
