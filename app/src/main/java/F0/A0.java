package f0;

import d5.EnumC0830a;
import e5.AbstractC0871i;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class A0 extends AbstractC0871i implements l5.f {

    /* JADX INFO: renamed from: o */
    public List f11607o;

    /* JADX INFO: renamed from: p */
    public List f11608p;

    /* JADX INFO: renamed from: q */
    public List f11609q;

    /* JADX INFO: renamed from: r */
    public t.K f11610r;

    /* JADX INFO: renamed from: s */
    public t.K f11611s;

    /* JADX INFO: renamed from: t */
    public t.K f11612t;

    /* JADX INFO: renamed from: u */
    public Set f11613u;

    /* JADX INFO: renamed from: v */
    public t.K f11614v;

    /* JADX INFO: renamed from: w */
    public int f11615w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ X f11616x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ B0 f11617y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(B0 b0, c5.d dVar) {
        super(3, dVar);
        this.f11617y = b0;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(f0.B0 r22, java.util.List r23, java.util.List r24, java.util.List r25, t.K r26, t.K r27, t.K r28, t.K r29) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.A0.i(f0.B0, java.util.List, java.util.List, java.util.List, t.K, t.K, t.K, t.K):void");
    }

    public static final void j(List list, B0 b0) {
        list.clear();
        synchronized (b0.f11623c) {
            try {
                ArrayList arrayList = b0.f11630k;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    list.add((AbstractC0876a0) arrayList.get(i7));
                }
                b0.f11630k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        A0 a0 = new A0(this.f11617y, (c5.d) obj3);
        a0.f11616x = (X) obj2;
        a0.invokeSuspend(Y4.o.f8736a);
        return EnumC0830a.f11264o;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e7 -> B:52:0x00ef). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f5 -> B:39:0x008c). Please report as a decompilation issue!!! */
    @Override // e5.AbstractC0863a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.A0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
