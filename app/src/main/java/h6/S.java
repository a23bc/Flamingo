package h6;

import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class S implements InterfaceC1180a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12933o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1182c f12935q;

    public /* synthetic */ S(InterfaceC1180a interfaceC1180a, InterfaceC1182c interfaceC1182c, int i7) {
        this.f12933o = i7;
        this.f12934p = interfaceC1180a;
        this.f12935q = interfaceC1182c;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f12933o) {
            case 0:
                InterfaceC1180a interfaceC1180a = this.f12934p;
                AbstractC1209k.f(interfaceC1180a, "$nowPageLambda");
                InterfaceC1182c interfaceC1182c = this.f12935q;
                AbstractC1209k.f(interfaceC1182c, "$nowPageOnChanged");
                if (AbstractC1209k.a(interfaceC1180a.a(), "Lyric")) {
                    interfaceC1182c.b("Album");
                } else {
                    interfaceC1182c.b("Lyric");
                }
                break;
            case 1:
                InterfaceC1180a interfaceC1180a2 = this.f12934p;
                AbstractC1209k.f(interfaceC1180a2, "$nowPageLambda");
                InterfaceC1182c interfaceC1182c2 = this.f12935q;
                AbstractC1209k.f(interfaceC1182c2, "$nowPageOnChanged");
                if (AbstractC1209k.a(interfaceC1180a2.a(), "PlayingList")) {
                    interfaceC1182c2.b("Album");
                } else {
                    interfaceC1182c2.b("PlayingList");
                }
                break;
            case 2:
                InterfaceC1180a interfaceC1180a3 = this.f12934p;
                AbstractC1209k.f(interfaceC1180a3, "$nowPageLambda");
                InterfaceC1182c interfaceC1182c3 = this.f12935q;
                AbstractC1209k.f(interfaceC1182c3, "$nowPageOnChanged");
                if (AbstractC1209k.a(interfaceC1180a3.a(), "Lyric")) {
                    interfaceC1182c3.b("Album");
                } else {
                    interfaceC1182c3.b("Lyric");
                }
                break;
            default:
                InterfaceC1180a interfaceC1180a4 = this.f12934p;
                AbstractC1209k.f(interfaceC1180a4, "$nowPageLambda");
                InterfaceC1182c interfaceC1182c4 = this.f12935q;
                AbstractC1209k.f(interfaceC1182c4, "$nowPageOnChanged");
                if (AbstractC1209k.a(interfaceC1180a4.a(), "PlayingList")) {
                    interfaceC1182c4.b("Album");
                } else {
                    interfaceC1182c4.b("PlayingList");
                }
                break;
        }
        return Y4.o.f8736a;
    }
}
