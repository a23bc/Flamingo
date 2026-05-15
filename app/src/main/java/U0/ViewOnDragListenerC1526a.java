package u0;

import K0.C0238f;
import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import Q0.E0;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import k.I;
import m5.C1216r;
import r0.AbstractC1397o;
import t.C1446a;
import t.C1451f;

/* JADX INFO: renamed from: u0.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC1526a implements View.OnDragListener, InterfaceC1527b {

    /* JADX INFO: renamed from: a */
    public final d f17129a;

    /* JADX INFO: renamed from: b */
    public final C1451f f17130b;

    /* JADX INFO: renamed from: c */
    public final AndroidDragAndDropManager$modifier$1 f17131c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public ViewOnDragListenerC1526a() {
        d dVar = new d();
        dVar.f17135E = 0L;
        this.f17129a = dVar;
        this.f17130b = new C1451f(0);
        this.f17131c = new AbstractC0344d0() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f9279a.f17129a.hashCode();
            }

            @Override // Q0.AbstractC0344d0
            public final AbstractC1397o k() {
                return this.f9279a.f17129a;
            }

            @Override // Q0.AbstractC0344d0
            public final /* bridge */ /* synthetic */ void m(AbstractC1397o abstractC1397o) {
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        I i7 = new I(12, dragEvent);
        int action = dragEvent.getAction();
        d dVar = this.f17129a;
        C1451f c1451f = this.f17130b;
        switch (action) {
            case 1:
                C1216r c1216r = new C1216r();
                C0238f c0238f = new C0238f(i7, dVar, c1216r);
                if (c0238f.b(dVar) == E0.f5783o) {
                    AbstractC0347f.C(dVar, c0238f);
                }
                boolean z6 = c1216r.f14435o;
                c1451f.getClass();
                C1446a c1446a = new C1446a(c1451f);
                while (c1446a.hasNext()) {
                    ((d) c1446a.next()).F0(i7);
                }
                break;
            case 2:
                dVar.E0(i7);
                break;
            case 4:
                B0.b bVar = new B0.b(27, i7);
                if (bVar.b(dVar) == E0.f5783o) {
                    AbstractC0347f.C(dVar, bVar);
                }
                c1451f.clear();
                break;
            case 5:
                dVar.C0(i7);
                break;
            case 6:
                dVar.D0(i7);
                break;
        }
        return false;
    }
}
