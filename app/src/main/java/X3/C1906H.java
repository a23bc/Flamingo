package x3;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: x3.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1906H extends C1904F {
    @Override // x3.C1904F
    public final void G() {
        this.f19983a.prepare();
    }

    @Override // x3.C1904F
    public final void H(String str, Bundle bundle) {
        this.f19983a.prepareFromMediaId(str, bundle);
    }

    @Override // x3.C1904F
    public final void I(String str, Bundle bundle) {
        this.f19983a.prepareFromSearch(str, bundle);
    }

    @Override // x3.C1904F
    public final void J(Uri uri, Bundle bundle) {
        this.f19983a.prepareFromUri(uri, bundle);
    }
}
