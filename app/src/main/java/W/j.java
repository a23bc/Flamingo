package W;

import O0.C;
import Q0.j0;
import b1.C0613I;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f7682c = new j(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f7683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0613I f7684b;

    public j(C c7, C0613I c0613i) {
        this.f7683a = c7;
        this.f7684b = c0613i;
    }

    public static j a(j jVar, j0 j0Var, C0613I c0613i, int i7) {
        C c7 = j0Var;
        if ((i7 & 1) != 0) {
            c7 = jVar.f7683a;
        }
        if ((i7 & 2) != 0) {
            c0613i = jVar.f7684b;
        }
        return new j(c7, c0613i);
    }
}
