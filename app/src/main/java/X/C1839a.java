package x;

import Q0.AbstractC0347f;
import Q0.InterfaceC0357m;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: x.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1839a implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f19704o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AbstractC1869p f19705p;

    public /* synthetic */ C1839a(AbstractC1869p abstractC1869p, int i7) {
        this.f19704o = i7;
        this.f19705p = abstractC1869p;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        InterfaceC0357m interfaceC0357m;
        switch (this.f19704o) {
            case 0:
                f0.D d4 = androidx.compose.foundation.f.f9163a;
                AbstractC1869p abstractC1869p = this.f19705p;
                InterfaceC1844c0 interfaceC1844c0 = (InterfaceC1844c0) AbstractC0347f.i(abstractC1869p, d4);
                if (!(interfaceC1844c0 instanceof InterfaceC1852g0)) {
                    C.b.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + interfaceC1844c0);
                }
                InterfaceC1852g0 interfaceC1852g0 = abstractC1869p.f19798M;
                InterfaceC1852g0 interfaceC1852g02 = (InterfaceC1852g0) interfaceC1844c0;
                abstractC1869p.f19798M = interfaceC1852g02;
                if (interfaceC1852g0 != null && !AbstractC1209k.a(interfaceC1852g02, interfaceC1852g0) && ((interfaceC0357m = abstractC1869p.f19800O) != null || !abstractC1869p.f19806U)) {
                    if (interfaceC0357m != null) {
                        abstractC1869p.C0(interfaceC0357m);
                    }
                    abstractC1869p.f19800O = null;
                    abstractC1869p.J0();
                }
                return Y4.o.f8736a;
            default:
                this.f19705p.f19796K.a();
                return Boolean.TRUE;
        }
    }
}
