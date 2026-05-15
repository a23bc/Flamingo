package R0;

import d.AbstractActivityC0759l;
import f0.C0879c;
import f0.C0894j0;
import f0.C0912t;
import f0.C0915u0;

/* JADX INFO: renamed from: R0.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0401p0 extends AbstractC0370a {

    /* JADX INFO: renamed from: w */
    public final C0894j0 f6494w;

    /* JADX INFO: renamed from: x */
    public boolean f6495x;

    public C0401p0(AbstractActivityC0759l abstractActivityC0759l) {
        super(abstractActivityC0759l);
        this.f6494w = C0879c.t(null);
    }

    @Override // R0.AbstractC0370a
    public final void a(int i7, C0912t c0912t) {
        c0912t.Z(420213850);
        int i8 = (c0912t.h(this) ? 4 : 2) | i7;
        if (c0912t.N(i8 & 1, (i8 & 3) != 2)) {
            l5.e eVar = (l5.e) this.f6494w.getValue();
            if (eVar == null) {
                c0912t.X(-1238798753);
            } else {
                c0912t.X(98586082);
                eVar.invoke(c0912t, 0);
            }
            c0912t.p(false);
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new A5.y(i7, 2, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C0401p0.class.getName();
    }

    @Override // R0.AbstractC0370a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f6495x;
    }

    public final void setContent(l5.e eVar) {
        this.f6495x = true;
        this.f6494w.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f6407r == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
