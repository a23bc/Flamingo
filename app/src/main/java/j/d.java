package J;

import K0.C0236d;
import Q0.j0;
import l5.InterfaceC1180a;
import m5.AbstractC1207i;
import m5.AbstractC1208j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d extends AbstractC1207i implements InterfaceC1180a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f3572w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0 f3573x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0236d f3574y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, j0 j0Var, C0236d c0236d) {
        super(0, AbstractC1208j.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f3572w = hVar;
        this.f3573x = j0Var;
        this.f3574y = c0236d;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        return h.B0(this.f3572w, this.f3573x, this.f3574y);
    }
}
