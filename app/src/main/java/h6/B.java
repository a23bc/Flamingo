package h6;

import f0.C0879c;
import f0.C0912t;
import l5.InterfaceC1180a;
import m5.AbstractC1209k;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f12770o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1398p f12771p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12772q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1180a f12773r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ float f12774s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f12775t;

    public /* synthetic */ B(InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a, InterfaceC1180a interfaceC1180a2, float f7, int i7, int i8) {
        this.f12770o = i8;
        this.f12771p = interfaceC1398p;
        this.f12772q = interfaceC1180a;
        this.f12773r = interfaceC1180a2;
        this.f12774s = f7;
        this.f12775t = i7;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12770o) {
            case 0:
                ((Integer) obj2).getClass();
                InterfaceC1398p interfaceC1398p = this.f12771p;
                AbstractC1209k.f(interfaceC1398p, "$modifier");
                InterfaceC1180a interfaceC1180a = this.f12772q;
                AbstractC1209k.f(interfaceC1180a, "$onLyrics");
                InterfaceC1180a interfaceC1180a2 = this.f12773r;
                AbstractC1209k.f(interfaceC1180a2, "$nowPage");
                M3.a.h(interfaceC1398p, interfaceC1180a, interfaceC1180a2, this.f12774s, (C0912t) obj, C0879c.B(this.f12775t | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                InterfaceC1398p interfaceC1398p2 = this.f12771p;
                AbstractC1209k.f(interfaceC1398p2, "$modifier");
                InterfaceC1180a interfaceC1180a3 = this.f12772q;
                AbstractC1209k.f(interfaceC1180a3, "$onPlaylist");
                InterfaceC1180a interfaceC1180a4 = this.f12773r;
                AbstractC1209k.f(interfaceC1180a4, "$nowPage");
                M3.a.p(interfaceC1398p2, interfaceC1180a3, interfaceC1180a4, this.f12774s, (C0912t) obj, C0879c.B(this.f12775t | 1));
                break;
        }
        return Y4.o.f8736a;
    }
}
