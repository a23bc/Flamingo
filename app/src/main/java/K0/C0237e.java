package K0;

import A2.C0001b;
import m5.AbstractC1209k;
import r0.AbstractC1397o;
import t.C1441C;
import t.C1444F;
import t.C1463s;

/* JADX INFO: renamed from: K0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0237e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O0.C f3868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3872e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1444F f3873f = new C1444F();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0244l f3874g = new C0244l();
    public final C1441C h = new C1441C(10);

    public C0237e(O0.C c7) {
        this.f3868a = c7;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r18, java.util.List r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.C0237e.a(long, java.util.List, boolean):void");
    }

    public final boolean b(C0001b c0001b, boolean z6) {
        C0244l c0244l = this.f3874g;
        if (!c0244l.a((C1463s) c0001b.f223q, this.f3868a, c0001b, z6)) {
            return false;
        }
        boolean z7 = true;
        this.f3869b = true;
        h0.e eVar = c0244l.f3894a;
        Object[] objArr = eVar.f12546o;
        int i7 = eVar.f12548q;
        boolean z8 = false;
        for (int i8 = 0; i8 < i7; i8++) {
            z8 = ((C0243k) objArr[i8]).e(c0001b, z6) || z8;
        }
        Object[] objArr2 = eVar.f12546o;
        int i9 = eVar.f12548q;
        boolean z9 = false;
        for (int i10 = 0; i10 < i9; i10++) {
            z9 = ((C0243k) objArr2[i10]).d(c0001b) || z9;
        }
        c0244l.b(c0001b);
        if (!z9 && !z8) {
            z7 = false;
        }
        this.f3869b = false;
        if (this.f3872e) {
            this.f3872e = false;
            C1444F c1444f = this.f3873f;
            int i11 = c1444f.f15984b;
            for (int i12 = 0; i12 < i11; i12++) {
                d((AbstractC1397o) c1444f.e(i12));
            }
            c1444f.c();
        }
        if (this.f3870c) {
            this.f3870c = false;
            c();
        }
        if (this.f3871d) {
            this.f3871d = false;
            c0244l.f3894a.h();
        }
        return z7;
    }

    public final void c() {
        if (this.f3869b) {
            this.f3870c = true;
            return;
        }
        C0244l c0244l = this.f3874g;
        h0.e eVar = c0244l.f3894a;
        Object[] objArr = eVar.f12546o;
        int i7 = eVar.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            ((C0243k) objArr[i8]).c();
        }
        if (this.f3871d) {
            this.f3871d = true;
        } else {
            c0244l.f3894a.h();
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
    public final void d(AbstractC1397o abstractC1397o) {
        if (this.f3869b) {
            this.f3872e = true;
            this.f3873f.a(abstractC1397o);
            return;
        }
        C0244l c0244l = this.f3874g;
        C1444F c1444f = c0244l.f3895b;
        c1444f.c();
        c1444f.a(c0244l);
        while (c1444f.h()) {
            C0244l c0244l2 = (C0244l) c1444f.j(c1444f.f15984b - 1);
            int i7 = 0;
            while (true) {
                h0.e eVar = c0244l2.f3894a;
                if (i7 < eVar.f12548q) {
                    C0243k c0243k = (C0243k) eVar.f12546o[i7];
                    if (AbstractC1209k.a(c0243k.f3887c, abstractC1397o)) {
                        c0244l2.f3894a.k(c0243k);
                        c0243k.c();
                    } else {
                        c1444f.a(c0243k);
                        i7++;
                    }
                }
            }
        }
    }
}
