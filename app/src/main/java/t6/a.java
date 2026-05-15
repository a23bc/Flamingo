package t6;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f0.C0912t;
import m5.AbstractC1209k;
import y0.AbstractC1959I;
import y0.C1987t;
import yos.music.player.data.libraries.SettingsLibrary;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a */
    public static final long f17113a = AbstractC1959I.d(4294262855L);

    /* JADX INFO: renamed from: b */
    public static final long f17114b = AbstractC1959I.d(4293280614L);

    /* JADX INFO: renamed from: c */
    public static final long f17115c = AbstractC1959I.d(4287137678L);

    /* JADX INFO: renamed from: d */
    public static final long f17116d = AbstractC1959I.d(4287532435L);

    /* JADX INFO: renamed from: e */
    public static final long f17117e;

    /* JADX INFO: renamed from: f */
    public static final long f17118f;

    /* JADX INFO: renamed from: g */
    public static final long f17119g;
    public static final long h;

    /* JADX INFO: renamed from: i */
    public static final long f17120i;

    /* JADX INFO: renamed from: j */
    public static final long f17121j;

    static {
        int i7 = C1987t.f20263k;
        long j3 = C1987t.f20259f;
        f17117e = j3;
        f17118f = C1987t.f20255b;
        f17119g = AbstractC1959I.d(4294111734L);
        h = AbstractC1959I.d(4278190082L);
        f17120i = j3;
        f17121j = AbstractC1959I.d(4280032286L);
    }

    public static final boolean a(C0912t c0912t) {
        c0912t.X(-1422917670);
        SettingsLibrary settingsLibrary = SettingsLibrary.INSTANCE;
        boolean zA = AbstractC1209k.a(settingsLibrary.getCustomTheme(), "Auto") ? (((Configuration) c0912t.j(AndroidCompositionLocals_androidKt.f9323a)).uiMode & 48) == 32 : AbstractC1209k.a(settingsLibrary.getCustomTheme(), "Dark");
        c0912t.p(false);
        return zA;
    }

    public static final long b(long j3, long j7, C0912t c0912t) {
        c0912t.X(-1381904234);
        if (a(c0912t)) {
            j3 = j7;
        }
        c0912t.p(false);
        return j3;
    }
}
