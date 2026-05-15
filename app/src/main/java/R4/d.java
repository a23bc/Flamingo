package r4;

import android.graphics.drawable.Drawable;
import f4.q;
import p4.i;
import p4.n;

/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a */
    public final q f15776a;

    /* JADX INFO: renamed from: b */
    public final i f15777b;

    public d(q qVar, i iVar) {
        this.f15776a = qVar;
        this.f15777b = iVar;
    }

    @Override // r4.f
    public final void a() {
        i iVar = this.f15777b;
        boolean z6 = iVar instanceof n;
        q qVar = this.f15776a;
        if (z6) {
            Drawable drawable = ((n) iVar).f15092a;
            qVar.getClass();
        } else if (iVar instanceof p4.d) {
            iVar.getClass();
            qVar.getClass();
        }
    }
}
