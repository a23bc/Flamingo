package K0;

import M.E0;
import M.Q;
import M.V;
import M.Z;
import O0.w0;
import X.C0495p0;
import android.content.Context;
import j5.AbstractC1107a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import u5.AbstractC1545g;
import y0.C1953C;

/* JADX INFO: loaded from: classes.dex */
public final class E implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f3827o;

    /* JADX INFO: renamed from: p */
    public Object f3828p;

    public /* synthetic */ E() {
        this.f3827o = 0;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        boolean z6;
        switch (this.f3827o) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                B b7 = (B) this.f3828p;
                if (b7 != null) {
                    b7.f3822c = zBooleanValue;
                }
                return Y4.o.f8736a;
            case 1:
                O0.C c7 = (O0.C) obj;
                E0 e0D = ((Z) this.f3828p).d();
                if (e0D != null) {
                    e0D.f4388c = c7;
                }
                return Y4.o.f8736a;
            case 2:
                float[] fArr = ((C1953C) obj).f20174a;
                O0.C c8 = (O0.C) this.f3828p;
                if (c8.y()) {
                    w0.i(c8).C(c8, fArr);
                }
                return Y4.o.f8736a;
            case 3:
                if (V.f4486a.a(((I0.b) obj).f3439a) == Q.f4442G) {
                    ((C0495p0) this.f3828p).c();
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            default:
                String str = (String) obj;
                AbstractC1209k.f(str, "website");
                if (!AbstractC1545g.Z(str)) {
                    AbstractC1107a.B((Context) this.f3828p, str);
                }
                return Y4.o.f8736a;
        }
    }

    public /* synthetic */ E(int i7, Object obj) {
        this.f3827o = i7;
        this.f3828p = obj;
    }
}
