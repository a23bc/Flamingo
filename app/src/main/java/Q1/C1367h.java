package q1;

import android.os.Parcelable;
import android.util.SparseArray;
import l5.InterfaceC1180a;
import m5.AbstractC1210l;

/* JADX INFO: renamed from: q1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1367h extends AbstractC1210l implements InterfaceC1180a {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f15471p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ q f15472q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1367h(q qVar, int i7) {
        super(0);
        this.f15471p = i7;
        this.f15472q = qVar;
    }

    @Override // l5.InterfaceC1180a
    public final Object a() {
        switch (this.f15471p) {
            case 0:
                this.f15472q.getLayoutNode().D();
                break;
            case 1:
                q qVar = this.f15472q;
                if (qVar.f15490s && qVar.isAttachedToWindow() && qVar.getView().getParent() == qVar) {
                    qVar.getSnapshotObserver().a(qVar, C1361b.f15449q, qVar.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f15472q.f15519N.saveHierarchyState(sparseArray);
                break;
            case 3:
                q qVar2 = this.f15472q;
                qVar2.getReleaseBlock().b(qVar2.f15519N);
                q.o(qVar2);
                break;
            case 4:
                q qVar3 = this.f15472q;
                qVar3.getResetBlock().b(qVar3.f15519N);
                break;
            default:
                q qVar4 = this.f15472q;
                qVar4.getUpdateBlock().b(qVar4.f15519N);
                break;
        }
        return Y4.o.f8736a;
    }
}
