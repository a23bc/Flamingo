package q;

import android.content.Context;
import android.view.View;
import p.SubMenuC1271D;
import yos.music.player.R;

/* JADX INFO: renamed from: q.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1313g extends p.v {
    public final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1321k f15311m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1313g(C1321k c1321k, Context context, p.l lVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, lVar, true);
        this.f15311m = c1321k;
        this.f14884f = 8388613;
        k.I i7 = c1321k.f15333K;
        this.h = i7;
        p.t tVar = this.f14886i;
        if (tVar != null) {
            tVar.j(i7);
        }
    }

    @Override // p.v
    public final void c() {
        switch (this.l) {
            case 0:
                C1321k c1321k = this.f15311m;
                c1321k.f15330H = null;
                c1321k.getClass();
                super.c();
                break;
            default:
                C1321k c1321k2 = this.f15311m;
                p.l lVar = c1321k2.f15336q;
                if (lVar != null) {
                    lVar.c(true);
                }
                c1321k2.f15329G = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1313g(C1321k c1321k, Context context, SubMenuC1271D subMenuC1271D, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC1271D, false);
        this.f15311m = c1321k;
        if ((subMenuC1271D.f14752A.f14864x & 32) != 32) {
            View view2 = c1321k.f15342w;
            this.f14883e = view2 == null ? (View) c1321k.f15341v : view2;
        }
        k.I i7 = c1321k.f15333K;
        this.h = i7;
        p.t tVar = this.f14886i;
        if (tVar != null) {
            tVar.j(i7);
        }
    }
}
