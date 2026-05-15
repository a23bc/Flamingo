package H;

import android.os.Build;
import java.util.Locale;
import m5.AbstractC1209k;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f2907a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        AbstractC1209k.e(lowerCase, "toLowerCase(...)");
        f2907a = lowerCase.equals("robolectric") ? new l0() : null;
    }
}
