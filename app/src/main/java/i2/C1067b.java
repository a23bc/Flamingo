package i2;

import android.os.PowerManager;

/* JADX INFO: renamed from: i2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1067b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1067b f13354a = new C1067b();

    public final boolean a(PowerManager powerManager) {
        return powerManager.isLowPowerStandbyEnabled() || powerManager.isDeviceLightIdleMode();
    }
}
