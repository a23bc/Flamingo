package g1;

import android.os.Handler;

/* JADX INFO: renamed from: g1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0972n extends InputConnectionC0971m {
    @Override // g1.InputConnectionC0971m
    public final void a(V.v vVar) {
        vVar.closeConnection();
    }

    @Override // g1.InputConnectionC0971m, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.deleteSurroundingTextInCodePoints(i7, i8);
        }
        return false;
    }

    @Override // g1.InputConnectionC0971m, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }
}
