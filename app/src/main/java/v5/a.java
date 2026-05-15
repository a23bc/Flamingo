package V5;

import Y4.o;
import a.AbstractC0509a;
import f0.C0912t;
import g2.n;
import g2.s;
import l2.C1162b;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class a implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f7608o = new a();

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        C0912t c0912t = (C0912t) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0912t.z()) {
            c0912t.Q();
        } else {
            float f7 = 24;
            AbstractC0509a.g(new Z1.a(R.drawable.flamingo_appwidget_icon), new s(new C1162b(f7)).c(new n(new C1162b(f7))), 0, c0912t, 48, 24);
        }
        return o.f8736a;
    }
}
