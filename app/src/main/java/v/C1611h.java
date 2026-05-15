package v;

import j5.AbstractC1107a;
import m5.AbstractC1210l;
import w.AbstractC1671d;
import x0.C1893c;

/* JADX INFO: renamed from: v.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1611h extends AbstractC1210l implements l5.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1611h f18094q = new C1611h(2, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1611h f18095r = new C1611h(2, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f18096p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1611h(int i7, int i8) {
        super(i7);
        this.f18096p = i8;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18096p) {
            case 0:
                long j3 = ((n1.m) obj).f14520a;
                long j7 = ((n1.m) obj2).f14520a;
                C1893c c1893c = w.t0.f18746a;
                return AbstractC1671d.k(0.0f, 400.0f, new n1.m(AbstractC1107a.b(1, 1)), 1);
            default:
                EnumC1588F enumC1588F = (EnumC1588F) obj2;
                return Boolean.valueOf(((EnumC1588F) obj) == enumC1588F && enumC1588F == EnumC1588F.f17964q);
        }
    }
}
