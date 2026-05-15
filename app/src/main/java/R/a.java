package R;

import H.F;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6159o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f6160p;

    public /* synthetic */ a(h hVar, int i7) {
        this.f6159o = i7;
        this.f6160p = hVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f6159o) {
            case 0:
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) obj;
                h hVar = this.f6160p;
                Handler handler = hVar.f6178a.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1180a.a();
                } else {
                    Handler handler2 = hVar.f6178a.getHandler();
                    if (handler2 != null) {
                        handler2.post(new c(interfaceC1180a, 0));
                    }
                }
                return Y4.o.f8736a;
            case 1:
                ActionMode actionMode = this.f6160p.h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return Y4.o.f8736a;
            case 2:
                ActionMode actionMode2 = this.f6160p.h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return Y4.o.f8736a;
            default:
                h hVar2 = this.f6160p;
                hVar2.f6182e.e();
                return new F(5, hVar2);
        }
    }
}
