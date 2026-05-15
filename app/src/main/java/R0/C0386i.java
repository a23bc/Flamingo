package R0;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* JADX INFO: renamed from: R0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0386i implements InterfaceC0393l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0388j f6464a;

    public C0386i(C0388j c0388j) {
        this.f6464a = c0388j;
    }

    public final void a(C0391k0 c0391k0) {
        ClipboardManager clipboardManager = this.f6464a.f6469a;
        if (c0391k0 != null) {
            clipboardManager.setPrimaryClip(c0391k0.f6475a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            clipboardManager.clearPrimaryClip();
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
