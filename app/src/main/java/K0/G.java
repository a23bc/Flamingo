package K0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import m5.AbstractC1209k;
import m5.InterfaceC1205g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class G implements PointerInputEventHandler, InterfaceC1205g {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l5.e f3829o;

    public G(l5.e eVar) {
        this.f3829o = eVar;
    }

    @Override // m5.InterfaceC1205g
    public final Y4.c a() {
        return this.f3829o;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof InterfaceC1205g)) {
            return false;
        }
        return AbstractC1209k.a(this.f3829o, ((InterfaceC1205g) obj).a());
    }

    public final int hashCode() {
        return this.f3829o.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(y yVar, c5.d dVar) {
        return this.f3829o.invoke(yVar, dVar);
    }
}
