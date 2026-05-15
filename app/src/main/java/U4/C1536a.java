package u4;

import Y4.o;
import f0.C0886f0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import w.C1670c;
import y0.C1960J;

/* JADX INFO: renamed from: u4.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1536a implements InterfaceC1182c {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f17280o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC0878b0 f17281p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ C0886f0 f17282q;

    public /* synthetic */ C1536a(InterfaceC0878b0 interfaceC0878b0, C0886f0 c0886f0, int i7) {
        this.f17280o = i7;
        this.f17281p = interfaceC0878b0;
        this.f17282q = c0886f0;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f17280o) {
            case 0:
                C1960J c1960j = (C1960J) obj;
                InterfaceC0878b0 interfaceC0878b0 = this.f17281p;
                C0886f0 c0886f0 = this.f17282q;
                AbstractC1209k.f(c0886f0, "$offset$delegate");
                AbstractC1209k.f(c1960j, "$this$graphicsLayer");
                if (((Boolean) interfaceC0878b0.getValue()).booleanValue()) {
                    c1960j.u(c0886f0.h());
                } else {
                    c1960j.r(c0886f0.h());
                }
                break;
            case 1:
                C1670c c1670c = (C1670c) obj;
                InterfaceC0878b0 interfaceC0878b02 = this.f17281p;
                C0886f0 c0886f02 = this.f17282q;
                AbstractC1209k.f(c0886f02, "$offset$delegate");
                AbstractC1209k.f(c1670c, "$this$animateTo");
                c0886f02.j(((Number) ((l5.e) interfaceC0878b02.getValue()).invoke(Float.valueOf(c0886f02.h()), Float.valueOf(((Number) c1670c.e()).floatValue() - c0886f02.h()))).floatValue());
                break;
            default:
                C1670c c1670c2 = (C1670c) obj;
                InterfaceC0878b0 interfaceC0878b03 = this.f17281p;
                C0886f0 c0886f03 = this.f17282q;
                AbstractC1209k.f(c0886f03, "$offset$delegate");
                AbstractC1209k.f(c1670c2, "$this$animateTo");
                c0886f03.j(((Number) ((l5.e) interfaceC0878b03.getValue()).invoke(Float.valueOf(c0886f03.h()), Float.valueOf(((Number) c1670c2.e()).floatValue() - c0886f03.h()))).floatValue());
                break;
        }
        return o.f8736a;
    }
}
