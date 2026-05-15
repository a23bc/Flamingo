package h6;

import D.AbstractC0060d;
import F.C0130c;
import f0.C0912t;
import m5.AbstractC1209k;
import r0.C1395m;

/* JADX INFO: renamed from: h6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1012d implements l5.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C1012d f13008p = new C1012d(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1012d f13009q = new C1012d(1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C1012d f13010r = new C1012d(2);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C1012d f13011s = new C1012d(3);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C1012d f13012t = new C1012d(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13013o;

    public /* synthetic */ C1012d(int i7) {
        this.f13013o = i7;
    }

    @Override // l5.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f13013o) {
            case 0:
                C0912t c0912t = (C0912t) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue & 17) == 16 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    AbstractC0060d.d(c0912t, androidx.compose.foundation.layout.c.c(C1395m.f15634a, 12));
                }
                break;
            case 1:
                C0912t c0912t2 = (C0912t) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC1209k.f((C0130c) obj, "$this$item");
                if ((iIntValue2 & 17) == 16 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    AbstractC0060d.d(c0912t2, androidx.compose.foundation.layout.c.c(C1395m.f15634a, 12));
                }
                break;
            case 2:
                C0912t c0912t3 = (C0912t) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                AbstractC1209k.f((d0.D0) obj, "it");
                if ((iIntValue3 & 17) == 16 && c0912t3.z()) {
                    c0912t3.Q();
                }
                break;
            case 3:
                C0912t c0912t4 = (C0912t) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                AbstractC1209k.f((d0.D0) obj, "it");
                if ((iIntValue4 & 17) == 16 && c0912t4.z()) {
                    c0912t4.Q();
                }
                break;
            default:
                C0912t c0912t5 = (C0912t) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                AbstractC1209k.f((d0.D0) obj, "it");
                if ((iIntValue5 & 17) == 16 && c0912t5.z()) {
                    c0912t5.Q();
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
