package w3;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.HashMap;
import java.util.List;
import w2.AbstractC1697a;
import yos.music.player.logic.YosPlaybackService;

/* JADX INFO: renamed from: w3.t0 */
/* JADX INFO: loaded from: classes.dex */
public class C1751t0 {

    /* JADX INFO: renamed from: b */
    public static final Object f19361b = new Object();

    /* JADX INFO: renamed from: c */
    public static final HashMap f19362c = new HashMap();

    /* JADX INFO: renamed from: a */
    public final A0 f19363a;

    public C1751t0(YosPlaybackService yosPlaybackService, b6.v vVar, PendingIntent pendingIntent, E4.b0 b0Var, A0.b bVar, V1.a aVar) {
        Bundle bundle = Bundle.EMPTY;
        synchronized (f19361b) {
            HashMap map = f19362c;
            if (map.containsKey("")) {
                throw new IllegalStateException("Session ID must be unique. ID=");
            }
            map.put("", this);
        }
        this.f19363a = new A0(this, yosPlaybackService, vVar, pendingIntent, b0Var, bVar, aVar);
    }

    public final t2.X a() {
        return (t2.X) this.f19363a.f18914s.f2813b;
    }

    public final void b(List list) {
        AbstractC1697a.g(list, "layout must not be null");
        E4.I iP = E4.I.p(list);
        A0 a0 = this.f19363a;
        a0.f18896A = iP;
        a0.f18914s.f19341c = iP;
        a0.c(new A2.I(23, iP));
    }
}
