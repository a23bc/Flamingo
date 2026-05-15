package c6;

import C1.k;
import D.A0;
import E4.b0;
import android.os.Bundle;
import m5.AbstractC1209k;
import t2.E;
import u1.i;
import w3.C1751t0;
import w3.N0;
import yos.music.player.R;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: loaded from: classes.dex */
public final class b extends E {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final A0 f10689v;

    public b(N0 n02, A0 a0) {
        super(n02);
        this.f10689v = a0;
    }

    @Override // t2.E
    public final int[] c(C1751t0 c1751t0, b0 b0Var, i iVar, k kVar) {
        AbstractC1209k.f(c1751t0, "mediaSession");
        AbstractC1209k.f(b0Var, "mediaButtons");
        AbstractC1209k.f(kVar, "actionFactory");
        if (M3.a.f4763b) {
            this.f10689v.getClass();
            int i7 = YosPlaybackService.f20580B;
            String str = android.support.v4.media.session.b.f8937b;
            iVar.f17174r.tickerText = i.b(str);
            if (str != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("ticker_icon", R.drawable.flamingo_ticker_icon);
                bundle.putBoolean("ticker_icon_switch", false);
                Bundle bundle2 = iVar.f17169m;
                if (bundle2 == null) {
                    iVar.f17169m = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
        }
        int[] iArrC = super.c(c1751t0, b0Var, iVar, kVar);
        AbstractC1209k.e(iArrC, "addNotificationActions(...)");
        return iArrC;
    }
}
