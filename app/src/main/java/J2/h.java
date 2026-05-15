package J2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;
import t2.j0;
import t2.m0;
import t2.n0;

/* JADX INFO: loaded from: classes.dex */
public final class h extends m0 {

    /* JADX INFO: renamed from: C */
    public boolean f3650C;

    /* JADX INFO: renamed from: D */
    public boolean f3651D;

    /* JADX INFO: renamed from: E */
    public boolean f3652E;

    /* JADX INFO: renamed from: F */
    public boolean f3653F;

    /* JADX INFO: renamed from: G */
    public boolean f3654G;

    /* JADX INFO: renamed from: H */
    public boolean f3655H;

    /* JADX INFO: renamed from: I */
    public boolean f3656I;

    /* JADX INFO: renamed from: J */
    public final SparseArray f3657J;

    /* JADX INFO: renamed from: K */
    public final SparseBooleanArray f3658K;

    /* JADX WARN: Removed duplicated region for block: B:111:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(yos.music.player.logic.YosPlaybackService r9) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J2.h.<init>(yos.music.player.logic.YosPlaybackService):void");
    }

    @Override // t2.m0
    public final void a(j0 j0Var) {
        this.f16526A.put(j0Var.f16497a, j0Var);
    }

    @Override // t2.m0
    public final n0 b() {
        return new i(this);
    }

    @Override // t2.m0
    public final m0 c() {
        super.c();
        return this;
    }

    @Override // t2.m0
    public final m0 f(int i7, int i8) {
        super.f(i7, i8);
        return this;
    }

    public final void g() {
        this.f3650C = true;
        this.f3651D = true;
        this.f3652E = true;
        this.f3653F = true;
        this.f3654G = true;
        this.f3655H = true;
        this.f3656I = true;
    }

    public h(i iVar) {
        d(iVar);
        this.f3650C = iVar.f3678i0;
        this.f3651D = iVar.f3679j0;
        this.f3652E = iVar.f3680k0;
        this.f3653F = iVar.f3681l0;
        this.f3654G = iVar.f3682m0;
        this.f3655H = iVar.f3683n0;
        this.f3656I = iVar.f3684o0;
        SparseArray sparseArray = new SparseArray();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray2 = iVar.f3685p0;
            if (i7 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i7), new HashMap((Map) sparseArray2.valueAt(i7)));
                i7++;
            } else {
                this.f3657J = sparseArray;
                this.f3658K = iVar.f3686q0.clone();
                return;
            }
        }
    }

    public h() {
        this.f3657J = new SparseArray();
        this.f3658K = new SparseBooleanArray();
        g();
    }
}
