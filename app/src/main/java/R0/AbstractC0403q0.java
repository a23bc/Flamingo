package R0;

import f0.C0879c;
import f0.C0912t;
import f0.C0913t0;
import f0.C0915u0;

/* JADX INFO: renamed from: R0.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0403q0 {

    /* JADX INFO: renamed from: a */
    public static final f0.a1 f6502a = new f0.a1(N.f6356w);

    /* JADX INFO: renamed from: b */
    public static final f0.a1 f6503b = new f0.a1(N.f6357x);

    /* JADX INFO: renamed from: c */
    public static final f0.a1 f6504c = new f0.a1(N.f6359z);

    /* JADX INFO: renamed from: d */
    public static final f0.a1 f6505d = new f0.a1(N.f6358y);

    /* JADX INFO: renamed from: e */
    public static final f0.a1 f6506e = new f0.a1(N.f6332B);

    /* JADX INFO: renamed from: f */
    public static final f0.a1 f6507f = new f0.a1(N.f6331A);

    /* JADX INFO: renamed from: g */
    public static final f0.a1 f6508g = new f0.a1(N.f6338H);
    public static final f0.a1 h = new f0.a1(N.f6334D);

    /* JADX INFO: renamed from: i */
    public static final f0.a1 f6509i = new f0.a1(N.f6335E);

    /* JADX INFO: renamed from: j */
    public static final f0.a1 f6510j = new f0.a1(N.f6337G);

    /* JADX INFO: renamed from: k */
    public static final f0.a1 f6511k = new f0.a1(N.f6336F);
    public static final f0.a1 l = new f0.a1(N.f6339I);

    /* JADX INFO: renamed from: m */
    public static final f0.a1 f6512m = new f0.a1(N.f6340J);

    /* JADX INFO: renamed from: n */
    public static final f0.a1 f6513n = new f0.a1(N.f6341K);

    /* JADX INFO: renamed from: o */
    public static final f0.a1 f6514o = new f0.a1(N.f6345O);

    /* JADX INFO: renamed from: p */
    public static final f0.a1 f6515p = new f0.a1(N.f6344N);

    /* JADX INFO: renamed from: q */
    public static final f0.a1 f6516q = new f0.a1(N.f6346P);

    /* JADX INFO: renamed from: r */
    public static final f0.a1 f6517r = new f0.a1(N.f6347Q);

    /* JADX INFO: renamed from: s */
    public static final f0.a1 f6518s = new f0.a1(N.f6348R);

    /* JADX INFO: renamed from: t */
    public static final f0.a1 f6519t = new f0.a1(N.f6349S);

    /* JADX INFO: renamed from: u */
    public static final f0.a1 f6520u = new f0.a1(N.f6342L);

    /* JADX INFO: renamed from: v */
    public static final f0.D f6521v = new f0.D(N.f6343M);

    /* JADX INFO: renamed from: w */
    public static final f0.a1 f6522w = new f0.a1(N.f6333C);

    public static final void a(Q0.s0 s0Var, C0373b0 c0373b0, n0.d dVar, C0912t c0912t, int i7) {
        c0912t.Z(1925803616);
        int i8 = i7 | (c0912t.f(s0Var) ? 4 : 2) | (c0912t.f(c0373b0) ? 32 : 16) | (c0912t.h(dVar) ? 256 : 128);
        if (c0912t.N(i8 & 1, (i8 & 147) != 146)) {
            C0415x c0415x = (C0415x) s0Var;
            C0913t0 c0913t0A = f6502a.a(c0415x.getAccessibilityManager());
            C0913t0 c0913t0A2 = f6503b.a(c0415x.getAutofill());
            C0913t0 c0913t0A3 = f6505d.a(c0415x.getAutofillManager());
            C0913t0 c0913t0A4 = f6504c.a(c0415x.getAutofillTree());
            C0913t0 c0913t0A5 = f6506e.a(c0415x.m2getClipboardManager());
            C0913t0 c0913t0A6 = f6507f.a(c0415x.m1getClipboard());
            C0913t0 c0913t0A7 = h.a(c0415x.getDensity());
            C0913t0 c0913t0A8 = f6509i.a(c0415x.getFocusOwner());
            C0913t0 c0913t0A9 = f6510j.a(c0415x.getFontLoader());
            c0913t0A9.f11919c = false;
            C0913t0 c0913t0A10 = f6511k.a(c0415x.getFontFamilyResolver());
            c0913t0A10.f11919c = false;
            C0879c.b(new C0913t0[]{c0913t0A, c0913t0A2, c0913t0A3, c0913t0A4, c0913t0A5, c0913t0A6, c0913t0A7, c0913t0A8, c0913t0A9, c0913t0A10, l.a(c0415x.getHapticFeedBack()), f6512m.a(c0415x.getInputModeManager()), f6513n.a(c0415x.getLayoutDirection()), f6514o.a(c0415x.getTextInputService()), f6515p.a(c0415x.getSoftwareKeyboardController()), f6516q.a(c0415x.getTextToolbar()), f6517r.a(c0373b0), f6518s.a(c0415x.getViewConfiguration()), f6519t.a(c0415x.getWindowInfo()), f6520u.a(c0415x.getPointerIconService()), f6508g.a(c0415x.getGraphicsContext())}, dVar, c0912t, 8 | ((i8 >> 3) & 112));
        } else {
            c0912t.Q();
        }
        C0915u0 c0915u0R = c0912t.r();
        if (c0915u0R != null) {
            c0915u0R.f11932d = new O(s0Var, c0373b0, dVar, i7, 1);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
