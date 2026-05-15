package x;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: renamed from: x.y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1888y0 implements InterfaceC1884w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1888y0 f19859b = new C1888y0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1888y0 f19860c = new C1888y0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19861a;

    public /* synthetic */ C1888y0(int i7) {
        this.f19861a = i7;
    }

    @Override // x.InterfaceC1884w0
    public final boolean a() {
        switch (this.f19861a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // x.InterfaceC1884w0
    public final InterfaceC1882v0 b(View view, n1.d dVar) {
        switch (this.f19861a) {
            case 0:
                return new C1886x0(new Magnifier(view));
            default:
                return new C1890z0(new Magnifier(view));
        }
    }
}
