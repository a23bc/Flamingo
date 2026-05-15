package h6;

import f0.C0886f0;
import f0.C0890h0;
import f0.InterfaceC0878b0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f13258o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13259p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0886f0 f13260q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13261r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0890h0 f13262s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0878b0 f13263t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f13264u;

    public /* synthetic */ w0(InterfaceC0878b0 interfaceC0878b0, C0886f0 c0886f0, InterfaceC0878b0 interfaceC0878b02, C0890h0 c0890h0, InterfaceC0878b0 interfaceC0878b03, InterfaceC1180a interfaceC1180a, int i7) {
        this.f13258o = i7;
        this.f13259p = interfaceC0878b0;
        this.f13260q = c0886f0;
        this.f13261r = interfaceC0878b02;
        this.f13262s = c0890h0;
        this.f13263t = interfaceC0878b03;
        this.f13264u = interfaceC1180a;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        int i7 = this.f13258o;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i7) {
            case 0:
                InterfaceC0878b0 interfaceC0878b0 = this.f13259p;
                AbstractC1209k.f(interfaceC0878b0, "$isSliding");
                C0886f0 c0886f0 = this.f13260q;
                AbstractC1209k.f(c0886f0, "$sliderPosition");
                InterfaceC0878b0 interfaceC0878b02 = this.f13261r;
                AbstractC1209k.f(interfaceC0878b02, "$playedTime");
                C0890h0 c0890h0 = this.f13262s;
                AbstractC1209k.f(c0890h0, "$playingDuration");
                InterfaceC0878b0 interfaceC0878b03 = this.f13263t;
                AbstractC1209k.f(interfaceC0878b03, "$remainingTime");
                InterfaceC1180a interfaceC1180a = this.f13264u;
                AbstractC1209k.f(interfaceC1180a, "$onSlider");
                interfaceC0878b0.setValue(Boolean.TRUE);
                c0886f0.j(fFloatValue);
                long j3 = 1000;
                long j7 = ((long) fFloatValue) / j3;
                interfaceC0878b02.setValue(M3.a.N(j7));
                interfaceC0878b03.setValue("-" + M3.a.N((c0890h0.h() / j3) - j7));
                interfaceC1180a.a();
                break;
            default:
                InterfaceC0878b0 interfaceC0878b04 = this.f13259p;
                AbstractC1209k.f(interfaceC0878b04, "$isSliding");
                C0886f0 c0886f02 = this.f13260q;
                AbstractC1209k.f(c0886f02, "$sliderPosition");
                InterfaceC0878b0 interfaceC0878b05 = this.f13261r;
                AbstractC1209k.f(interfaceC0878b05, "$playedTime");
                C0890h0 c0890h02 = this.f13262s;
                AbstractC1209k.f(c0890h02, "$playingDuration");
                InterfaceC0878b0 interfaceC0878b06 = this.f13263t;
                AbstractC1209k.f(interfaceC0878b06, "$remainingTime");
                InterfaceC1180a interfaceC1180a2 = this.f13264u;
                AbstractC1209k.f(interfaceC1180a2, "$onSlider");
                interfaceC0878b04.setValue(Boolean.TRUE);
                c0886f02.j(fFloatValue);
                long j8 = 1000;
                long j9 = ((long) fFloatValue) / j8;
                interfaceC0878b05.setValue(M3.a.N(j9));
                interfaceC0878b06.setValue("-" + M3.a.N((c0890h02.h() / j8) - j9));
                interfaceC1180a2.a();
                break;
        }
        return Y4.o.f8736a;
    }
}
