package g1;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: g1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0973o extends C0972n {
    @Override // g1.InputConnectionC0971m, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.commitContent(inputContentInfo, i7, bundle);
        }
        return false;
    }
}
