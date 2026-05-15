package c2;

import android.os.StrictMode;

/* JADX INFO: renamed from: c2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0731f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0731f f10662a = new C0731f();

    public final StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
