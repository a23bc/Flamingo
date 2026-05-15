package G3;

import C2.I;
import androidx.lifecycle.EnumC0592o;
import androidx.lifecycle.InterfaceC0595s;
import androidx.lifecycle.InterfaceC0597u;
import m5.AbstractC1209k;
import y3.C2019h;
import y3.x;
import z5.J;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0595s {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f2757o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f2758p;

    public /* synthetic */ a(int i7, Object obj) {
        this.f2757o = i7;
        this.f2758p = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0595s
    public final void g(InterfaceC0597u interfaceC0597u, EnumC0592o enumC0592o) {
        switch (this.f2757o) {
            case 0:
                EnumC0592o enumC0592o2 = EnumC0592o.ON_START;
                I i7 = (I) this.f2758p;
                if (enumC0592o == enumC0592o2) {
                    i7.f983c = true;
                } else if (enumC0592o == EnumC0592o.ON_STOP) {
                    i7.f983c = false;
                }
                break;
            case 1:
                ((J) this.f2758p).j(null, enumC0592o.a());
                break;
            default:
                x xVar = (x) this.f2758p;
                AbstractC1209k.f(xVar, "this$0");
                xVar.f20507s = enumC0592o.a();
                if (xVar.f20493c != null) {
                    for (C2019h c2019h : xVar.f20497g) {
                        c2019h.getClass();
                        c2019h.f20409r = enumC0592o.a();
                        c2019h.i();
                    }
                }
                break;
        }
    }
}
