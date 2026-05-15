package K0;

import Q0.AbstractC0347f;
import R0.AbstractC0403q0;
import R0.C0407t;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class p extends AbstractC0240h {
    @Override // K0.AbstractC0240h
    public final void C0(r rVar) {
        s sVar = (s) AbstractC0347f.i(this, AbstractC0403q0.f6520u);
        if (sVar != null) {
            C0407t c0407t = (C0407t) sVar;
            if (rVar == null) {
                r.f3906a.getClass();
                rVar = t.f3907a;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                R0.K.f6319a.a(c0407t.f6531b, rVar);
            }
        }
    }

    @Override // K0.AbstractC0240h
    public final boolean E0(int i7) {
        return (i7 == 3 || i7 == 4) ? false : true;
    }

    @Override // Q0.F0
    public final /* bridge */ /* synthetic */ Object o() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
