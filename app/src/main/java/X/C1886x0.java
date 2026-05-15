package x;

import android.widget.Magnifier;

/* JADX INFO: renamed from: x.x0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1886x0 implements InterfaceC1882v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Magnifier f19856a;

    public C1886x0(Magnifier magnifier) {
        this.f19856a = magnifier;
    }

    @Override // x.InterfaceC1882v0
    public void a(long j3, long j7) {
        this.f19856a.show(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
    }

    public final void b() {
        this.f19856a.dismiss();
    }

    public final long c() {
        return (((long) this.f19856a.getHeight()) & 4294967295L) | (((long) this.f19856a.getWidth()) << 32);
    }

    public final void d() {
        this.f19856a.update();
    }
}
