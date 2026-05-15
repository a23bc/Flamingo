package o6;

import Y4.o;
import f0.C0888g0;
import f0.C0912t;
import i6.g;
import l5.e;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f14723o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C0888g0 f14724p;

    public /* synthetic */ c(C0888g0 c0888g0, int i7) {
        this.f14723o = i7;
        this.f14724p = c0888g0;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14723o) {
            case 0:
                C0912t c0912t = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
                    c0912t.Q();
                } else {
                    g.e(false, I0.c.S(R.string.settings_extend_version, c0912t), String.valueOf(this.f14724p.h()), c0912t, 3072);
                }
                break;
            default:
                C0912t c0912t2 = (C0912t) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0912t2.z()) {
                    c0912t2.Q();
                } else {
                    g.e(false, I0.c.S(R.string.settings_extend_version, c0912t2), String.valueOf(this.f14724p.h()), c0912t2, 3072);
                }
                break;
        }
        return o.f8736a;
    }
}
