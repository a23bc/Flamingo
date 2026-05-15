package L2;

import android.hardware.display.DisplayManager;

/* JADX INFO: loaded from: classes.dex */
public final class s implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a */
    public final DisplayManager f4200a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u f4201b;

    public s(u uVar, DisplayManager displayManager) {
        this.f4201b = uVar;
        this.f4200a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        if (i7 == 0) {
            u.a(this.f4201b, this.f4200a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
    }
}
