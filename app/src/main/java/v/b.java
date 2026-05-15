package V;

import O0.C;
import l5.InterfaceC1182c;
import m5.AbstractC1207i;
import m5.AbstractC1208j;
import y0.C1953C;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends AbstractC1207i implements InterfaceC1182c {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f7302w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q qVar) {
        super(1, AbstractC1208j.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f7302w = qVar;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        float[] fArr = ((C1953C) obj).f20174a;
        C c7 = (C) this.f7302w.f7350F.getValue();
        if (c7 != null) {
            if (!c7.y()) {
                c7 = null;
            }
            if (c7 != null) {
                c7.z(fArr);
            }
        }
        return Y4.o.f8736a;
    }
}
