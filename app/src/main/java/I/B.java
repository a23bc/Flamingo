package I;

import z.C2053o;
import z.InterfaceC2058q0;

/* JADX INFO: loaded from: classes.dex */
public final class B implements InterfaceC2058q0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3256a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3257b;

    public B(InterfaceC2058q0 interfaceC2058q0, K k7) {
        this.f3257b = interfaceC2058q0;
    }

    @Override // z.InterfaceC2058q0
    public final float a(float f7) {
        switch (this.f3256a) {
            case 0:
                return ((InterfaceC2058q0) this.f3257b).a(f7);
            default:
                if (Float.isNaN(f7)) {
                    return 0.0f;
                }
                C2053o c2053o = (C2053o) this.f3257b;
                float fFloatValue = ((Number) c2053o.f20925a.b(Float.valueOf(f7))).floatValue();
                c2053o.f20929e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
                c2053o.f20930f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
                return fFloatValue;
        }
    }

    public B(C2053o c2053o) {
        this.f3257b = c2053o;
    }
}
