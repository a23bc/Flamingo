package m;

import android.graphics.drawable.Animatable;
import j0.k;

/* JADX INFO: renamed from: m.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1184a extends k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14263a;

    /* JADX INFO: renamed from: b */
    public final Animatable f14264b;

    public /* synthetic */ C1184a(Animatable animatable, int i7) {
        this.f14263a = i7;
        this.f14264b = animatable;
    }

    @Override // j0.k
    public final void D() {
        switch (this.f14263a) {
            case 0:
                this.f14264b.start();
                break;
            default:
                ((L3.e) this.f14264b).start();
                break;
        }
    }

    @Override // j0.k
    public final void E() {
        switch (this.f14263a) {
            case 0:
                this.f14264b.stop();
                break;
            default:
                ((L3.e) this.f14264b).stop();
                break;
        }
    }
}
