package K0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import r0.InterfaceC1398p;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {

    /* JADX INFO: renamed from: a */
    public static final C0245m f3830a = new C0245m(Z4.v.f8818o, null);

    public static final N a(PointerInputEventHandler pointerInputEventHandler) {
        return new N(null, null, null, pointerInputEventHandler);
    }

    public static final InterfaceC1398p b(InterfaceC1398p interfaceC1398p, Object obj, PointerInputEventHandler pointerInputEventHandler) {
        return interfaceC1398p.f(new SuspendPointerInputElement(obj, null, null, pointerInputEventHandler, 6));
    }
}
