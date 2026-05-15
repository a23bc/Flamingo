package y4;

import android.os.Handler;
import android.os.Looper;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: y4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2023b extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C2023b f20526p = new C2023b(0);

    @Override // l5.InterfaceC1180a
    public final Object a() {
        return new Handler(Looper.getMainLooper());
    }
}
