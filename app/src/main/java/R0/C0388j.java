package R0;

import android.content.ClipboardManager;
import android.content.Context;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: R0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0388j implements InterfaceC0395m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipboardManager f6469a;

    public C0388j(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f6469a = (ClipboardManager) systemService;
    }
}
