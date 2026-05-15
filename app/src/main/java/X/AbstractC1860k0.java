package x;

import android.os.Build;
import androidx.compose.foundation.MagnifierElement;
import l5.InterfaceC1182c;
import r0.C1395m;
import r0.InterfaceC1398p;

/* JADX INFO: renamed from: x.k0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1860k0 {

    /* JADX INFO: renamed from: a */
    public static final Y0.w f19768a = new Y0.w("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static InterfaceC1398p b(InterfaceC1182c interfaceC1182c, InterfaceC1182c interfaceC1182c2, InterfaceC1884w0 interfaceC1884w0) {
        return a() ? new MagnifierElement(interfaceC1182c, interfaceC1182c2, interfaceC1884w0) : C1395m.f15634a;
    }
}
