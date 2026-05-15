package U5;

import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import y0.C1960J;

/* JADX INFO: renamed from: U5.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0443o implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D4.i f7252p;

    public /* synthetic */ C0443o(D4.i iVar, int i7) {
        this.f7251o = i7;
        this.f7252p = iVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        C1960J c1960j = (C1960J) obj;
        switch (this.f7251o) {
            case 0:
                D4.i iVar = this.f7252p;
                AbstractC1209k.f(iVar, "$yosBottomSheetConfig");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                float fO = (iVar.o() * 0.1f) + 0.9f;
                c1960j.i(fO);
                c1960j.j(fO);
                break;
            case 1:
                D4.i iVar2 = this.f7252p;
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                if (iVar2.p() >= 1.0f) {
                    c1960j.a(0.0f);
                }
                break;
            default:
                D4.i iVar3 = this.f7252p;
                AbstractC1209k.f(iVar3, "$yosBottomSheetConfig");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                c1960j.e(2);
                c1960j.a(iVar3.o());
                break;
        }
        return Y4.o.f8736a;
    }
}
