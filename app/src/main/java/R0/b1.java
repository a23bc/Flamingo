package R0;

import A5.C0025a;
import android.os.Build;
import android.view.View;
import m5.C1220v;
import z5.InterfaceC2111f;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements InterfaceC2111f {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6418o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f6419p;

    public /* synthetic */ b1(int i7, Object obj) {
        this.f6418o = i7;
        this.f6419p = obj;
    }

    @Override // z5.InterfaceC2111f
    public final Object f(Object obj, c5.d dVar) {
        switch (this.f6418o) {
            case 0:
                ((F0) this.f6419p).f6308o.j(((Number) obj).floatValue());
                return Y4.o.f8736a;
            case 1:
                V.o oVar = (V.o) this.f6419p;
                if (Build.VERSION.SDK_INT >= 34) {
                    oVar.r().startStylusHandwriting((View) oVar.f7342p);
                }
                return Y4.o.f8736a;
            default:
                ((C1220v) this.f6419p).f14439o = obj;
                throw new C0025a(this);
        }
    }
}
