package K2;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import w2.t;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f4031d = new i(-9223372036854775807L, 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f4032e = new i(-9223372036854775807L, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f4033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f4034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f4035c;

    public m(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        int i7 = t.f18881a;
        this.f4033a = Executors.newSingleThreadExecutor(new T1.a(strConcat, 1));
    }

    public final boolean a() {
        return this.f4034b != null;
    }
}
