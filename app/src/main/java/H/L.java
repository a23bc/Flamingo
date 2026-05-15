package H;

import D.A0;
import I.C0211c;
import android.app.Activity;
import f0.C0879c;
import f0.C0912t;
import j5.AbstractC1110d;
import java.util.List;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import r0.C1395m;
import r0.InterfaceC1398p;
import yos.music.player.CrashActivity;
import yos.music.player.data.libraries.YosMediaItem;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f2803o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f2804p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f2805q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f2806r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f2807s;

    public /* synthetic */ L(D0.b bVar, String str, InterfaceC1398p interfaceC1398p, InterfaceC1180a interfaceC1180a, int i7) {
        this.f2803o = 4;
        this.f2804p = bVar;
        this.f2806r = str;
        this.f2805q = interfaceC1398p;
        this.f2807s = interfaceC1180a;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        Y4.o oVar = Y4.o.f8736a;
        Object obj3 = this.f2806r;
        Object obj4 = this.f2805q;
        Object obj5 = this.f2807s;
        Object obj6 = this.f2804p;
        switch (this.f2803o) {
            case 0:
                ((Integer) obj2).getClass();
                B5.i iVar = (B5.i) obj6;
                InterfaceC1398p interfaceC1398p = (InterfaceC1398p) obj4;
                E.c(iVar, interfaceC1398p, (X) obj3, (M) obj5, (C0912t) obj, C0879c.B(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i7 = CrashActivity.f20572H;
                CrashActivity crashActivity = (CrashActivity) obj6;
                AbstractC1209k.f(crashActivity, "$tmp0_rcvr");
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) obj5;
                AbstractC1209k.f(interfaceC1180a, "$onRestart");
                crashActivity.l((Activity) obj4, (String) obj3, interfaceC1180a, (C0912t) obj, C0879c.B(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                y3.x xVar = (y3.x) obj6;
                AbstractC1209k.f(xVar, "$navController");
                C0211c c0211c = (C0211c) obj4;
                AbstractC1209k.f(c0211c, "$pagerState");
                InterfaceC1182c interfaceC1182c = (InterfaceC1182c) obj5;
                AbstractC1209k.f(interfaceC1182c, "$nowPageOnChanged");
                I0.c.d(xVar, c0211c, (Z5.a) obj3, interfaceC1182c, (C0912t) obj, C0879c.B(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                YosMediaItem yosMediaItem = (YosMediaItem) obj4;
                AbstractC1209k.f(yosMediaItem, "$music");
                List list = (List) obj3;
                AbstractC1209k.f(list, "$mainArtists");
                InterfaceC1180a interfaceC1180a2 = (InterfaceC1180a) obj5;
                AbstractC1209k.f(interfaceC1180a2, "$onClick");
                j6.i.c((C1395m) obj6, yosMediaItem, list, interfaceC1180a2, (C0912t) obj, C0879c.B(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                D0.b bVar = (D0.b) obj6;
                AbstractC1209k.f(bVar, "$icon");
                String str = (String) obj3;
                AbstractC1209k.f(str, "$label");
                InterfaceC1180a interfaceC1180a3 = (InterfaceC1180a) obj5;
                AbstractC1209k.f(interfaceC1180a3, "$onClick");
                j6.i.d(bVar, str, (InterfaceC1398p) obj4, interfaceC1180a3, (C0912t) obj, C0879c.B(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                InterfaceC1180a interfaceC1180a4 = (InterfaceC1180a) obj6;
                AbstractC1209k.f(interfaceC1180a4, "$nowLabel");
                InterfaceC1182c interfaceC1182c2 = (InterfaceC1182c) obj3;
                AbstractC1209k.f(interfaceC1182c2, "$onLabelChange");
                InterfaceC1398p interfaceC1398p2 = (InterfaceC1398p) obj4;
                AbstractC1209k.f(interfaceC1398p2, "$modifier");
                j0.k.a(interfaceC1180a4, interfaceC1182c2, (List) obj5, interfaceC1398p2, (C0912t) obj, C0879c.B(3073));
                break;
            default:
                ((Integer) obj2).getClass();
                String str2 = (String) obj6;
                AbstractC1209k.f(str2, "$title");
                InterfaceC1182c interfaceC1182c3 = (InterfaceC1182c) obj5;
                AbstractC1209k.f(interfaceC1182c3, "$content");
                AbstractC1110d.l(str2, (InterfaceC1180a) obj4, (A0) obj3, interfaceC1182c3, (C0912t) obj, C0879c.B(1));
                break;
        }
        return oVar;
    }

    public /* synthetic */ L(Object obj, Object obj2, Object obj3, Object obj4, int i7, int i8) {
        this.f2803o = i8;
        this.f2804p = obj;
        this.f2805q = obj2;
        this.f2806r = obj3;
        this.f2807s = obj4;
    }

    public /* synthetic */ L(InterfaceC1180a interfaceC1180a, InterfaceC1182c interfaceC1182c, List list, InterfaceC1398p interfaceC1398p, int i7) {
        this.f2803o = 5;
        this.f2804p = interfaceC1180a;
        this.f2806r = interfaceC1182c;
        this.f2807s = list;
        this.f2805q = interfaceC1398p;
    }
}
