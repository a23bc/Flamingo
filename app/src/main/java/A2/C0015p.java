package A2;

import H2.C0198o;
import N2.C0294k;
import android.content.Context;
import d.C0746L;
import java.util.HashMap;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: renamed from: A2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0015p implements D4.j {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ YosPlaybackService f408p;

    public /* synthetic */ C0015p(YosPlaybackService yosPlaybackService, int i7) {
        this.f407o = i7;
        this.f408p = yosPlaybackService;
    }

    @Override // D4.j
    public final Object get() {
        K2.g gVar;
        switch (this.f407o) {
            case 0:
                C0294k c0294k = new C0294k();
                c0294k.f5063q = new C0746L(12);
                c0294k.f5062p = true;
                return new C0198o(this.f408p, c0294k);
            case 1:
                return new J2.o(this.f408p);
            default:
                YosPlaybackService yosPlaybackService = this.f408p;
                E4.b0 b0Var = K2.g.f4002n;
                synchronized (K2.g.class) {
                    try {
                        if (K2.g.f4008t == null) {
                            F2.c cVar = new F2.c(yosPlaybackService);
                            K2.g.f4008t = new K2.g((Context) cVar.f2187q, (HashMap) cVar.f2188r, cVar.f2185o, (w2.o) cVar.f2189s, cVar.f2186p);
                        }
                        gVar = K2.g.f4008t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return gVar;
        }
    }
}
