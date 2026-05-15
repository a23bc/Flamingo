package x3;

import android.media.VolumeProvider;
import w3.o1;
import w3.p1;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends VolumeProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f20091a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p1 p1Var, int i7, int i8, int i9, String str) {
        super(i7, i8, i9, str);
        this.f20091a = p1Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i7) {
        p1 p1Var = this.f20091a;
        p1Var.getClass();
        w2.t.G(p1Var.f19329f, new o1(p1Var, i7, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i7) {
        p1 p1Var = this.f20091a;
        p1Var.getClass();
        w2.t.G(p1Var.f19329f, new o1(p1Var, i7, 0));
    }
}
