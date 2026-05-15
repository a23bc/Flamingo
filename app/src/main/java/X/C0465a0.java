package X;

import java.util.ArrayList;
import t.AbstractC1461p;
import t.C1439A;

/* JADX INFO: renamed from: X.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0465a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O0.C f8026c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E f8028e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0489m0 f8029f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1439A f8030g;
    public final ArrayList h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8033k;

    public C0465a0(long j3, long j7, O0.C c7, boolean z6, E e7, C0489m0 c0489m0) {
        this.f8024a = j3;
        this.f8025b = j7;
        this.f8026c = c7;
        this.f8027d = z6;
        this.f8028e = e7;
        this.f8029f = c0489m0;
        int i7 = AbstractC1461p.f16100a;
        this.f8030g = new C1439A(6);
        this.h = new ArrayList();
        this.f8031i = -1;
        this.f8032j = -1;
        this.f8033k = -1;
    }

    public final int a(int i7, EnumC0484k enumC0484k, EnumC0484k enumC0484k2) {
        if (i7 == -1) {
            int iOrdinal = AbstractC0498r0.x(enumC0484k, enumC0484k2).ordinal();
            if (iOrdinal == 0) {
                return this.f8033k - 1;
            }
            if (iOrdinal == 1) {
                return this.f8033k;
            }
            if (iOrdinal != 2) {
                throw new A2.W();
            }
        }
        return i7;
    }
}
