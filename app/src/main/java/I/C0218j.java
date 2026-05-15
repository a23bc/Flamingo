package I;

import A2.W;
import O0.m0;
import java.util.List;
import r0.C1389g;
import z.EnumC2048l0;

/* JADX INFO: renamed from: I.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0218j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1389g f3365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1.n f3366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f3367g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f3368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3370k;

    public C0218j(int i7, int i8, List list, long j3, Object obj, C1389g c1389g, n1.n nVar) {
        EnumC2048l0 enumC2048l0 = EnumC2048l0.f20894o;
        this.f3361a = i7;
        this.f3362b = list;
        this.f3363c = j3;
        this.f3364d = obj;
        this.f3365e = c1389g;
        this.f3366f = nVar;
        EnumC2048l0 enumC2048l02 = EnumC2048l0.f20894o;
        this.f3367g = false;
        int size = list.size();
        int iMax = 0;
        for (int i9 = 0; i9 < size; i9++) {
            m0 m0Var = (m0) list.get(i9);
            iMax = Math.max(iMax, !this.f3367g ? m0Var.f5417p : m0Var.f5416o);
        }
        this.h = iMax;
        this.f3368i = new int[this.f3362b.size() * 2];
        this.f3370k = Integer.MIN_VALUE;
    }

    public final void a(int i7) {
        this.f3369j += i7;
        int[] iArr = this.f3368i;
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            boolean z6 = this.f3367g;
            if ((z6 && i8 % 2 == 1) || (!z6 && i8 % 2 == 0)) {
                iArr[i8] = iArr[i8] + i7;
            }
        }
    }

    public final void b(int i7, int i8, int i9) {
        int i10;
        this.f3369j = i7;
        boolean z6 = this.f3367g;
        this.f3370k = z6 ? i9 : i8;
        List list = this.f3362b;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            m0 m0Var = (m0) list.get(i11);
            int i12 = i11 * 2;
            int[] iArr = this.f3368i;
            if (z6) {
                iArr[i12] = Math.round((1 + (this.f3366f != n1.n.f14521o ? 0.0f * (-1) : 0.0f)) * ((i8 - m0Var.f5416o) / 2.0f));
                iArr[i12 + 1] = i7;
                i10 = m0Var.f5417p;
            } else {
                iArr[i12] = i7;
                int i13 = i12 + 1;
                C1389g c1389g = this.f3365e;
                if (c1389g == null) {
                    C.b.b("null verticalAlignment");
                    throw new W();
                }
                iArr[i13] = c1389g.a(m0Var.f5417p, i9);
                i10 = m0Var.f5416o;
            }
            i7 += i10;
        }
    }
}
