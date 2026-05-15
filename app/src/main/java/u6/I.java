package u6;

import f0.C0879c;
import f0.C0912t;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f17401o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f17402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f17403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f17404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f17405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y4.c f17406t;

    public /* synthetic */ I(int i7, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, InterfaceC1180a interfaceC1180a3, InterfaceC1180a interfaceC1180a4, InterfaceC1398p interfaceC1398p) {
        this.f17403q = interfaceC1398p;
        this.f17402p = interfaceC1180a;
        this.f17404r = interfaceC1180a2;
        this.f17405s = interfaceC1180a3;
        this.f17406t = interfaceC1180a4;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17401o) {
            case 0:
                ((Integer) obj2).getClass();
                InterfaceC1398p interfaceC1398p = this.f17403q;
                AbstractC1209k.f(interfaceC1398p, "$modifier");
                InterfaceC1180a interfaceC1180a = this.f17402p;
                AbstractC1209k.f(interfaceC1180a, "$album");
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) this.f17404r;
                AbstractC1209k.f(interfaceC1180a2, "$isPlaying");
                InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) this.f17405s;
                AbstractC1209k.f(interfaceC1180a3, "$nowPage");
                InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) this.f17406t;
                AbstractC1209k.f(interfaceC1180a4, "$showMiniPlayer");
                L.d(interfaceC1398p, interfaceC1180a, interfaceC1180a2, interfaceC1180a3, interfaceC1180a4, (C0912t) obj, C0879c.B(55));
                break;
            default:
                ((Integer) obj2).getClass();
                String str = (String) this.f17404r;
                AbstractC1209k.f(str, "$text");
                String str2 = (String) this.f17405s;
                AbstractC1209k.f(str2, "$placeholder");
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) this.f17406t;
                AbstractC1209k.f(interfaceC1182c, "$onValueChange");
                InterfaceC1180a interfaceC1180a5 = this.f17402p;
                AbstractC1209k.f(interfaceC1180a5, "$onSearch");
                i6.g.k(str, str2, interfaceC1182c, interfaceC1180a5, this.f17403q, (C0912t) obj, C0879c.B(24961));
                break;
        }
        return Y4.o.f8736a;
    }

    public /* synthetic */ I(String str, String str2, InterfaceC1182c interfaceC1182c, InterfaceC1180a interfaceC1180a, InterfaceC1398p interfaceC1398p, int i7) {
        this.f17404r = str;
        this.f17405s = str2;
        this.f17406t = interfaceC1182c;
        this.f17402p = interfaceC1180a;
        this.f17403q = interfaceC1398p;
    }
}
