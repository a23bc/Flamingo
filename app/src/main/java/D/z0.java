package D;

import G1.C0141h;
import android.view.View;
import java.util.WeakHashMap;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: u */
    public static final WeakHashMap f1422u = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final C0054a f1423a = C0058c.d(4, "captionBar");

    /* JADX INFO: renamed from: b */
    public final C0054a f1424b;

    /* JADX INFO: renamed from: c */
    public final C0054a f1425c;

    /* JADX INFO: renamed from: d */
    public final C0054a f1426d;

    /* JADX INFO: renamed from: e */
    public final C0054a f1427e;

    /* JADX INFO: renamed from: f */
    public final C0054a f1428f;

    /* JADX INFO: renamed from: g */
    public final C0054a f1429g;
    public final C0054a h;

    /* JADX INFO: renamed from: i */
    public final C0054a f1430i;

    /* JADX INFO: renamed from: j */
    public final v0 f1431j;

    /* JADX INFO: renamed from: k */
    public final v0 f1432k;
    public final v0 l;

    /* JADX INFO: renamed from: m */
    public final v0 f1433m;

    /* JADX INFO: renamed from: n */
    public final v0 f1434n;

    /* JADX INFO: renamed from: o */
    public final v0 f1435o;

    /* JADX INFO: renamed from: p */
    public final v0 f1436p;

    /* JADX INFO: renamed from: q */
    public final v0 f1437q;

    /* JADX INFO: renamed from: r */
    public final boolean f1438r;

    /* JADX INFO: renamed from: s */
    public int f1439s;

    /* JADX INFO: renamed from: t */
    public final W f1440t;

    public z0(View view) {
        C0054a c0054aD = C0058c.d(128, "displayCutout");
        this.f1424b = c0054aD;
        C0054a c0054aD2 = C0058c.d(8, "ime");
        this.f1425c = c0054aD2;
        C0054a c0054aD3 = C0058c.d(32, "mandatorySystemGestures");
        this.f1426d = c0054aD3;
        this.f1427e = C0058c.d(2, "navigationBars");
        this.f1428f = C0058c.d(1, "statusBars");
        C0054a c0054aD4 = C0058c.d(7, "systemBars");
        this.f1429g = c0054aD4;
        C0054a c0054aD5 = C0058c.d(16, "systemGestures");
        this.h = c0054aD5;
        C0054a c0054aD6 = C0058c.d(64, "tappableElement");
        this.f1430i = c0054aD6;
        v0 v0Var = new v0(new Z(0, 0, 0, 0), "waterfall");
        this.f1431j = v0Var;
        new u0(new u0(c0054aD4, c0054aD2), c0054aD);
        new u0(new u0(new u0(c0054aD6, c0054aD3), c0054aD5), v0Var);
        this.f1432k = C0058c.e(4, "captionBarIgnoringVisibility");
        this.l = C0058c.e(2, "navigationBarsIgnoringVisibility");
        this.f1433m = C0058c.e(1, "statusBarsIgnoringVisibility");
        this.f1434n = C0058c.e(7, "systemBarsIgnoringVisibility");
        this.f1435o = C0058c.e(64, "tappableElementIgnoringVisibility");
        this.f1436p = C0058c.e(8, "imeAnimationTarget");
        this.f1437q = C0058c.e(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f1438r = bool != null ? bool.booleanValue() : false;
        this.f1440t = new W(this);
    }

    public static void a(z0 z0Var, G1.m0 m0Var) {
        boolean z6 = false;
        z0Var.f1423a.f(m0Var, 0);
        z0Var.f1425c.f(m0Var, 0);
        z0Var.f1424b.f(m0Var, 0);
        z0Var.f1427e.f(m0Var, 0);
        z0Var.f1428f.f(m0Var, 0);
        z0Var.f1429g.f(m0Var, 0);
        z0Var.h.f(m0Var, 0);
        z0Var.f1430i.f(m0Var, 0);
        z0Var.f1426d.f(m0Var, 0);
        z0Var.f1432k.f(AbstractC0060d.n(m0Var.f2725a.h(4)));
        z0Var.l.f(AbstractC0060d.n(m0Var.f2725a.h(2)));
        z0Var.f1433m.f(AbstractC0060d.n(m0Var.f2725a.h(1)));
        z0Var.f1434n.f(AbstractC0060d.n(m0Var.f2725a.h(7)));
        z0Var.f1435o.f(AbstractC0060d.n(m0Var.f2725a.h(64)));
        C0141h c0141hF = m0Var.f2725a.f();
        if (c0141hF != null) {
            z0Var.f1431j.f(AbstractC0060d.n(c0141hF.a()));
        }
        synchronized (p0.l.f14941c) {
            t.K k7 = p0.l.f14947j.h;
            if (k7 != null) {
                if (k7.h()) {
                    z6 = true;
                }
            }
        }
        if (z6) {
            p0.l.a();
        }
    }
}
