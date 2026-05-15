package E0;

import android.graphics.PathMeasure;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;
import y0.C1977j;

/* JADX INFO: renamed from: E0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0097h extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0097h f1744q = new C0097h(0, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C0097h f1745r = new C0097h(0, 1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1746p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0097h(int i7, int i8) {
        super(i7);
        this.f1746p = i8;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f1746p) {
            case 0:
                return new C1977j(new PathMeasure());
            default:
                return Y4.o.f8736a;
        }
    }
}
