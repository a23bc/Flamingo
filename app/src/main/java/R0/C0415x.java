package R0;

import A2.AbstractC0002c;
import A2.RunnableC0022x;
import G1.AbstractC0144k;
import K0.C0233a;
import K0.C0236d;
import K0.C0237e;
import K0.C0242j;
import K0.InterfaceC0241i;
import L2.C0247a;
import O0.RunnableC0326x;
import Q0.AbstractC0344d0;
import Q0.AbstractC0347f;
import Q0.AbstractC0358n;
import Q0.C0338a0;
import Q0.C0342c0;
import Q0.C0352h0;
import Q0.C0363t;
import Q0.EnumC0367x;
import R0.C0383g0;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.InterfaceC0583f;
import androidx.lifecycle.InterfaceC0597u;
import b1.C0622g;
import f0.C0879c;
import f0.C0894j0;
import g1.C0969k;
import g1.C0972n;
import g1.C0973o;
import g1.C0974p;
import g1.C0980v;
import g1.C0981w;
import g1.C0983y;
import g1.InputConnectionC0971m;
import g1.InputConnectionC0976r;
import j5.AbstractC1109c;
import j5.AbstractC1110d;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import m5.C1220v;
import o5.AbstractC1267a;
import r0.AbstractC1397o;
import r0.C1395m;
import r0.C1400r;
import r0.InterfaceC1398p;
import t.AbstractC1458m;
import t.C1444F;
import t.C1463s;
import u0.ViewOnDragListenerC1526a;
import w0.C1696d;
import w5.AbstractC1767D;
import x0.C1893c;
import y0.AbstractC1959I;
import y0.C1953C;
import y0.C1967Q;
import y0.C1969b;
import y0.C1972e;
import y0.C1986s;
import yos.music.player.R;

/* JADX INFO: renamed from: R0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0415x extends ViewGroup implements Q0.s0, Q0.z0, InterfaceC0241i, InterfaceC0583f, Q0.q0 {

    /* JADX INFO: renamed from: V0 */
    public static Class f6555V0;

    /* JADX INFO: renamed from: W0 */
    public static Method f6556W0;

    /* JADX INFO: renamed from: X0 */
    public static Method f6557X0;

    /* JADX INFO: renamed from: Y0 */
    public static final C1444F f6558Y0 = new C1444F();

    /* JADX INFO: renamed from: Z0 */
    public static RunnableC0396n f6559Z0;

    /* JADX INFO: renamed from: a1 */
    public static Method f6560a1;

    /* JADX INFO: renamed from: A */
    public final RunnableC0326x f6561A;

    /* JADX INFO: renamed from: A0 */
    public int f6562A0;

    /* JADX INFO: renamed from: B */
    public final Q0.K f6563B;

    /* JADX INFO: renamed from: B0 */
    public final C0894j0 f6564B0;

    /* JADX INFO: renamed from: C */
    public final t.y f6565C;

    /* JADX INFO: renamed from: C0 */
    public final G0.b f6566C0;

    /* JADX INFO: renamed from: D */
    public final Z0.a f6567D;

    /* JADX INFO: renamed from: D0 */
    public final H0.c f6568D0;

    /* JADX INFO: renamed from: E */
    public final C0415x f6569E;

    /* JADX INFO: renamed from: E0 */
    public final P0.c f6570E0;

    /* JADX INFO: renamed from: F */
    public final Y0.q f6571F;

    /* JADX INFO: renamed from: F0 */
    public final V f6572F0;

    /* JADX INFO: renamed from: G */
    public final F f6573G;

    /* JADX INFO: renamed from: G0 */
    public MotionEvent f6574G0;

    /* JADX INFO: renamed from: H */
    public t0.c f6575H;

    /* JADX INFO: renamed from: H0 */
    public long f6576H0;

    /* JADX INFO: renamed from: I */
    public final C0384h f6577I;

    /* JADX INFO: renamed from: I0 */
    public final V.o f6578I0;

    /* JADX INFO: renamed from: J */
    public final C1972e f6579J;

    /* JADX INFO: renamed from: J0 */
    public final C1444F f6580J0;

    /* JADX INFO: renamed from: K */
    public final s0.k f6581K;

    /* JADX INFO: renamed from: K0 */
    public float f6582K0;

    /* JADX INFO: renamed from: L */
    public final ArrayList f6583L;

    /* JADX INFO: renamed from: L0 */
    public float f6584L0;

    /* JADX INFO: renamed from: M */
    public ArrayList f6585M;

    /* JADX INFO: renamed from: M0 */
    public final B3.c f6586M0;

    /* JADX INFO: renamed from: N */
    public boolean f6587N;

    /* JADX INFO: renamed from: N0 */
    public final B2.e f6588N0;

    /* JADX INFO: renamed from: O */
    public boolean f6589O;

    /* JADX INFO: renamed from: O0 */
    public boolean f6590O0;

    /* JADX INFO: renamed from: P */
    public final C0242j f6591P;

    /* JADX INFO: renamed from: P0 */
    public final C0411v f6592P0;

    /* JADX INFO: renamed from: Q */
    public final B0.a f6593Q;

    /* JADX INFO: renamed from: Q0 */
    public final InterfaceC0385h0 f6594Q0;

    /* JADX INFO: renamed from: R */
    public InterfaceC1182c f6595R;

    /* JADX INFO: renamed from: R0 */
    public boolean f6596R0;

    /* JADX INFO: renamed from: S */
    public final U3.h f6597S;
    public final C0247a S0;

    /* JADX INFO: renamed from: T */
    public final s0.c f6598T;
    public View T0;

    /* JADX INFO: renamed from: U */
    public boolean f6599U;

    /* JADX INFO: renamed from: U0 */
    public final C0407t f6600U0;

    /* JADX INFO: renamed from: V */
    public final C0388j f6601V;

    /* JADX INFO: renamed from: W */
    public final C0386i f6602W;
    public final Q0.u0 a0;
    public boolean b0;

    /* JADX INFO: renamed from: c0 */
    public C0377d0 f6603c0;

    /* JADX INFO: renamed from: d0 */
    public n1.a f6604d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f6605e0;

    /* JADX INFO: renamed from: f0 */
    public final C0338a0 f6606f0;

    /* JADX INFO: renamed from: g0 */
    public long f6607g0;

    /* JADX INFO: renamed from: h0 */
    public final int[] f6608h0;

    /* JADX INFO: renamed from: i0 */
    public final float[] f6609i0;

    /* JADX INFO: renamed from: j0 */
    public final float[] f6610j0;

    /* JADX INFO: renamed from: k0 */
    public final float[] f6611k0;

    /* JADX INFO: renamed from: l0 */
    public long f6612l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f6613m0;

    /* JADX INFO: renamed from: n0 */
    public long f6614n0;

    /* JADX INFO: renamed from: o */
    public long f6615o;

    /* JADX INFO: renamed from: o0 */
    public final C0894j0 f6616o0;

    /* JADX INFO: renamed from: p */
    public final boolean f6617p;

    /* JADX INFO: renamed from: p0 */
    public final f0.G f6618p0;

    /* JADX INFO: renamed from: q */
    public final Q0.N f6619q;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC1182c f6620q0;

    /* JADX INFO: renamed from: r */
    public final C0894j0 f6621r;

    /* JADX INFO: renamed from: r0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC0390k f6622r0;

    /* JADX INFO: renamed from: s */
    public final View f6623s;

    /* JADX INFO: renamed from: s0 */
    public final ViewTreeObserverOnScrollChangedListenerC0392l f6624s0;

    /* JADX INFO: renamed from: t */
    public final boolean f6625t;

    /* JADX INFO: renamed from: t0 */
    public final ViewTreeObserverOnTouchModeChangeListenerC0394m f6626t0;

    /* JADX INFO: renamed from: u */
    public final w0.k f6627u;

    /* JADX INFO: renamed from: u0 */
    public final C0983y f6628u0;

    /* JADX INFO: renamed from: v */
    public c5.i f6629v;

    /* JADX INFO: renamed from: v0 */
    public final C0981w f6630v0;

    /* JADX INFO: renamed from: w */
    public final ViewOnDragListenerC1526a f6631w;

    /* JADX INFO: renamed from: w0 */
    public final AtomicReference f6632w0;

    /* JADX INFO: renamed from: x */
    public final E0 f6633x;

    /* JADX INFO: renamed from: x0 */
    public final C0404r0 f6634x0;

    /* JADX INFO: renamed from: y */
    public final C1986s f6635y;

    /* JADX INFO: renamed from: y0 */
    public final B0 f6636y0;

    /* JADX INFO: renamed from: z */
    public final C0375c0 f6637z;

    /* JADX INFO: renamed from: z0 */
    public final C0894j0 f6638z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v23, types: [R0.k] */
    /* JADX WARN: Type inference failed for: r1v24, types: [R0.l] */
    /* JADX WARN: Type inference failed for: r1v25, types: [R0.m] */
    public C0415x(Context context, c5.i iVar) {
        U3.h hVar;
        s0.c cVar;
        super(context);
        final C0415x c0415x = this;
        c0415x.f6615o = 9205357640488583168L;
        c0415x.f6617p = true;
        c0415x.f6619q = new Q0.N();
        n1.f fVarB = AbstractC1109c.b(context);
        f0.W w7 = f0.W.f11765r;
        c0415x.f6621r = new C0894j0(fVarB, w7);
        int i7 = Build.VERSION.SDK_INT;
        boolean z6 = i7 >= 35;
        c0415x.f6625t = z6;
        Y0.d dVar = new Y0.d();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(dVar);
        AbstractC0344d0 abstractC0344d0 = new AbstractC0344d0() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            public final int hashCode() {
                return this.f9322a.hashCode();
            }

            @Override // Q0.AbstractC0344d0
            public final AbstractC1397o k() {
                C0383g0 c0383g0 = new C0383g0();
                c0383g0.f6461C = this.f9322a;
                return c0383g0;
            }

            @Override // Q0.AbstractC0344d0
            public final void m(AbstractC1397o abstractC1397o) {
                ((C0383g0) abstractC1397o).f6461C = this.f9322a;
            }
        };
        c0415x.f6627u = new w0.k(c0415x, c0415x);
        c0415x.f6629v = iVar;
        c0415x.f6631w = new ViewOnDragListenerC1526a();
        c0415x.f6633x = new E0();
        InterfaceC1398p interfaceC1398pA = androidx.compose.ui.input.key.a.a(C1395m.f15634a, new C0405s(c0415x, 0));
        InterfaceC1398p interfaceC1398pA2 = androidx.compose.ui.input.rotary.a.a();
        c0415x.f6635y = new C1986s();
        c0415x.f6637z = new C0375c0(ViewConfiguration.get(context));
        RunnableC0326x runnableC0326x = new RunnableC0326x();
        c0415x.f6561A = runnableC0326x;
        Q0.K k7 = new Q0.K(3);
        k7.c0(O0.r0.f5440b);
        k7.Z(c0415x.getDensity());
        k7.e0(c0415x.getViewConfiguration());
        k7.d0(n1.c.g((AbstractC0344d0) androidx.compose.ui.layout.b.b(runnableC0326x), emptySemanticsElement).f(interfaceC1398pA2).f(interfaceC1398pA).f(((w0.k) c0415x.getFocusOwner()).f18790e).f(c0415x.m3getDragAndDropManager().f17131c).f(abstractC0344d0));
        c0415x.f6563B = k7;
        t.y yVar = AbstractC1458m.f16088a;
        c0415x.f6565C = new t.y();
        c0415x.getLayoutNodes();
        c0415x.f6567D = new Z0.a();
        c0415x.f6569E = c0415x;
        c0415x.f6571F = new Y0.q(c0415x.getRoot(), dVar, c0415x.getLayoutNodes());
        F f7 = new F(c0415x);
        c0415x.f6573G = f7;
        boolean z7 = z6;
        c0415x.f6575H = new t0.c(c0415x, new R.o(0, c0415x, M.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 1));
        C0384h c0384h = new C0384h();
        Object systemService = context.getSystemService("accessibility");
        AbstractC1209k.d(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        c0415x.f6577I = c0384h;
        c0415x.f6579J = new C1972e(c0415x);
        c0415x.f6581K = new s0.k();
        c0415x.f6583L = new ArrayList();
        c0415x.f6591P = new C0242j();
        Q0.K root = c0415x.getRoot();
        B0.a aVar = new B0.a();
        aVar.f606b = root;
        aVar.f607c = new C0237e(root.f5821T.f6002c);
        aVar.f608d = new A.b(27);
        aVar.f609e = new C0363t();
        c0415x.f6593Q = aVar;
        c0415x.f6595R = C0402q.f6496q;
        if (k()) {
            s0.k autofillTree = c0415x.getAutofillTree();
            hVar = new U3.h();
            hVar.f7042o = c0415x;
            hVar.f7043p = autofillTree;
            AutofillManager autofillManagerH = X.r.h(c0415x.getContext().getSystemService(X.r.C()));
            if (autofillManagerH == null) {
                throw new IllegalStateException("Autofill service could not be located.");
            }
            hVar.f7044q = autofillManagerH;
            c0415x.setImportantForAutofill(1);
            U0.a aVarF = N5.d.F(c0415x);
            AutofillId autofillIdO = aVarF != null ? AbstractC0002c.o(aVarF.f7026a) : null;
            if (autofillIdO == null) {
                throw n1.c.p("Required value was null.");
            }
            hVar.f7045r = autofillIdO;
        } else {
            hVar = null;
        }
        c0415x.f6597S = hVar;
        if (k()) {
            AutofillManager autofillManagerH2 = X.r.h(context.getSystemService(X.r.C()));
            if (autofillManagerH2 == null) {
                throw n1.c.p("Autofill service could not be located.");
            }
            c0415x = this;
            cVar = new s0.c(new k.I(10, autofillManagerH2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            cVar = null;
        }
        c0415x.f6598T = cVar;
        c0415x.f6601V = new C0388j(context);
        c0415x.f6602W = new C0386i(c0415x.m2getClipboardManager());
        c0415x.a0 = new Q0.u0(new C0405s(c0415x, 1));
        c0415x.f6606f0 = new C0338a0(c0415x.getRoot());
        long j3 = Integer.MAX_VALUE;
        c0415x.f6607g0 = (j3 & 4294967295L) | (j3 << 32);
        c0415x.f6608h0 = new int[]{0, 0};
        float[] fArrA = C1953C.a();
        c0415x.f6609i0 = fArrA;
        c0415x.f6610j0 = C1953C.a();
        c0415x.f6611k0 = C1953C.a();
        c0415x.f6612l0 = -1L;
        c0415x.f6614n0 = 9187343241974906880L;
        c0415x.f6616o0 = C0879c.t(null);
        c0415x.f6618p0 = C0879c.o(new C0411v(c0415x, 1));
        c0415x.f6622r0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: R0.k
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f6474o.O();
            }
        };
        c0415x.f6624s0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: R0.l
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                this.f6479a.O();
            }
        };
        c0415x.f6626t0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: R0.m
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z8) {
                H0.c cVar2 = this.f6485o.f6568D0;
                int i8 = z8 ? 1 : 2;
                cVar2.getClass();
                cVar2.f2955a.setValue(new H0.a(i8));
            }
        };
        C0983y c0983y = new C0983y(c0415x.getView(), c0415x);
        c0415x.f6628u0 = c0983y;
        c0415x.f6630v0 = new C0981w(c0983y);
        c0415x.f6632w0 = new AtomicReference(null);
        c0415x.f6634x0 = new C0404r0(c0415x.getTextInputService());
        c0415x.f6636y0 = new B0();
        c0415x.f6638z0 = new C0894j0(android.support.v4.media.session.b.m(context), w7);
        c0415x.f6562A0 = i7 >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        n1.n nVar = layoutDirection != 0 ? layoutDirection != 1 ? null : n1.n.f14522p : n1.n.f14521o;
        c0415x.f6564B0 = C0879c.t(nVar == null ? n1.n.f14521o : nVar);
        c0415x.f6566C0 = new G0.b(c0415x, 0);
        c0415x.f6568D0 = new H0.c(c0415x.isInTouchMode() ? 1 : 2);
        c0415x.f6570E0 = new P0.c(c0415x);
        V v3 = new V();
        new E0.K(11, v3);
        Q0[] q0Arr = Q0.f6370o;
        c0415x.f6572F0 = v3;
        c0415x.f6578I0 = new V.o(27, (byte) 0);
        c0415x.f6580J0 = new C1444F();
        c0415x.f6586M0 = new B3.c(6, c0415x);
        c0415x.f6588N0 = new B2.e(7, c0415x);
        c0415x.f6592P0 = new C0411v(c0415x, 0);
        c0415x.f6594Q0 = i7 < 29 ? new C0387i0(fArrA) : new C0389j0();
        c0415x.addOnAttachStateChangeListener(c0415x.f6575H);
        c0415x.setWillNotDraw(false);
        c0415x.setFocusable(true);
        if (i7 >= 26) {
            L.f6322a.a(c0415x, 1, false);
        }
        c0415x.setFocusableInTouchMode(true);
        c0415x.setClipChildren(false);
        G1.I.h(c0415x, f7);
        c0415x.setOnDragListener(c0415x.m3getDragAndDropManager());
        c0415x.getRoot().b(c0415x);
        if (i7 >= 29) {
            H.f6311a.a(c0415x);
        }
        if (z7) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            c0415x.f6623s = view;
            c0415x.addView(view, -1);
        }
        c0415x.S0 = i7 >= 31 ? new C0247a(14) : null;
        c0415x.f6600U0 = new C0407t(c0415x);
    }

    public static final void a(C0415x c0415x, int i7, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iD;
        F f7 = c0415x.f6573G;
        if (AbstractC1209k.a(str, f7.f6277G)) {
            int iD2 = f7.f6275E.d(i7);
            if (iD2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iD2);
                return;
            }
            return;
        }
        if (!AbstractC1209k.a(str, f7.f6278H) || (iD = f7.f6276F.d(i7)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iD);
    }

    public final C0398o get_viewTreeOwners() {
        return (C0398o) this.f6616o0.getValue();
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void l(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof C0415x) {
                ((C0415x) childAt).B();
            } else if (childAt instanceof ViewGroup) {
                l((ViewGroup) childAt);
            }
        }
    }

    public static long m(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == Integer.MIN_VALUE) {
            return (((long) 0) << 32) | ((long) size);
        }
        if (mode == 0) {
            return (((long) 0) << 32) | ((long) Integer.MAX_VALUE);
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j3 = size;
        return (j3 << 32) | j3;
    }

    public static View o(View view, int i7) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (AbstractC1209k.a(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i7))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View viewO = o(viewGroup.getChildAt(i8), i7);
            if (viewO != null) {
                return viewO;
            }
        }
        return null;
    }

    public static void r(Q0.K k7) {
        k7.E();
        h0.e eVarA = k7.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            r((Q0.K) objArr[i8]);
        }
    }

    private void setDensity(n1.d dVar) {
        this.f6621r.setValue(dVar);
    }

    private void setFontFamilyResolver(f1.d dVar) {
        this.f6638z0.setValue(dVar);
    }

    private void setLayoutDirection(n1.n nVar) {
        this.f6564B0.setValue(nVar);
    }

    private final void set_viewTreeOwners(C0398o c0398o) {
        this.f6616o0.setValue(c0398o);
    }

    public static boolean t(MotionEvent motionEvent) {
        boolean z6 = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z6) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i7 = 1; i7 < pointerCount; i7++) {
                z6 = (Float.floatToRawIntBits(motionEvent.getX(i7)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i7)) & Integer.MAX_VALUE) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !G0.f6310a.a(motionEvent, i7));
                if (z6) {
                    break;
                }
            }
        }
        return z6;
    }

    public final void A(Q0.r0 r0Var, boolean z6) {
        ArrayList arrayList = this.f6583L;
        if (!z6) {
            if (this.f6587N) {
                return;
            }
            arrayList.remove(r0Var);
            ArrayList arrayList2 = this.f6585M;
            if (arrayList2 != null) {
                arrayList2.remove(r0Var);
                return;
            }
            return;
        }
        if (!this.f6587N) {
            arrayList.add(r0Var);
            return;
        }
        ArrayList arrayList3 = this.f6585M;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f6585M = arrayList3;
        }
        arrayList3.add(r0Var);
    }

    public final void B() {
        s0.c cVar;
        if (this.f6599U) {
            p0.u uVar = getSnapshotObserver().f6075a;
            synchronized (uVar.f14977g) {
                try {
                    h0.e eVar = uVar.f14976f;
                    int i7 = eVar.f12548q;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i7; i9++) {
                        p0.t tVar = (p0.t) eVar.f12546o[i9];
                        tVar.e();
                        if (!tVar.f14966f.j()) {
                            i8++;
                        } else if (i8 > 0) {
                            Object[] objArr = eVar.f12546o;
                            objArr[i9 - i8] = objArr[i9];
                        }
                    }
                    int i10 = i7 - i8;
                    Z4.l.d0(eVar.f12546o, i10, i7);
                    eVar.f12548q = i10;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f6599U = false;
        }
        C0377d0 c0377d0 = this.f6603c0;
        if (c0377d0 != null) {
            l(c0377d0);
        }
        if (k() && (cVar = this.f6598T) != null) {
            t.z zVar = cVar.h;
            if (zVar.f16132d == 0 && cVar.f15831i) {
                ((AutofillManager) cVar.f15824a.f13847p).commit();
                cVar.f15831i = false;
            }
            if (zVar.f16132d != 0) {
                cVar.f15831i = true;
            }
        }
        while (this.f6580J0.h() && this.f6580J0.e(0) != null) {
            int i11 = this.f6580J0.f15984b;
            for (int i12 = 0; i12 < i11; i12++) {
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) this.f6580J0.e(i12);
                C1444F c1444f = this.f6580J0;
                if (i12 < 0 || i12 >= c1444f.f15984b) {
                    c1444f.m(i12);
                    throw null;
                }
                Object[] objArr2 = c1444f.f15983a;
                Object obj = objArr2[i12];
                objArr2[i12] = null;
                if (interfaceC1180a != null) {
                    interfaceC1180a.a();
                }
            }
            this.f6580J0.k(0, i11);
        }
    }

    public final void C(Q0.K k7) {
        F f7 = this.f6573G;
        f7.f6271A = true;
        if (f7.q()) {
            f7.r(k7);
        }
        t0.c cVar = this.f6575H;
        cVar.f16150u = true;
        if (cVar.k()) {
            cVar.f16151v.k(Y4.o.f8736a);
        }
    }

    public final void D(Q0.K k7, boolean z6, boolean z7, boolean z8) {
        Q0.K kV;
        Q0.K kV2;
        C0338a0 c0338a0 = this.f6606f0;
        if (!z6) {
            if (c0338a0.q(k7, z7) && z8) {
                J(k7);
                return;
            }
            return;
        }
        c0338a0.getClass();
        if (k7.f5837v == null) {
            N0.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        Q0.P p7 = k7.f5822U;
        int iOrdinal = p7.f5859d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw new A2.W();
                }
                if (!p7.f5860e || z7) {
                    p7.f5860e = true;
                    p7.f5869p.f5948I = true;
                    if (k7.f5829e0) {
                        return;
                    }
                    boolean zA = AbstractC1209k.a(k7.K(), Boolean.TRUE);
                    A0.b bVar = c0338a0.f5926b;
                    if ((zA || C0338a0.i(k7)) && ((kV = k7.v()) == null || !kV.f5822U.f5860e)) {
                        bVar.K(k7, EnumC0367x.f6089o);
                    } else if ((k7.J() || C0338a0.j(k7)) && ((kV2 = k7.v()) == null || !kV2.r())) {
                        bVar.K(k7, EnumC0367x.f6091q);
                    }
                    if (c0338a0.f5928d || !z8) {
                        return;
                    }
                    J(k7);
                    return;
                }
                return;
            }
        }
        c0338a0.h.b(new Q0.Z(k7, true, z7));
    }

    public final void E(Q0.K k7, boolean z6, boolean z7) {
        C0338a0 c0338a0 = this.f6606f0;
        if (!z6) {
            c0338a0.getClass();
            int iOrdinal = k7.f5822U.f5859d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            if (iOrdinal != 4) {
                throw new A2.W();
            }
            Q0.K kV = k7.v();
            boolean z8 = kV == null || kV.J();
            Q0.P p7 = k7.f5822U;
            if (!z7) {
                if (k7.r()) {
                    return;
                }
                if (k7.q() && k7.J() == z8 && k7.J() == p7.f5869p.f5947H) {
                    return;
                }
            }
            C0342c0 c0342c0 = p7.f5869p;
            c0342c0.f5949J = true;
            c0342c0.f5950K = true;
            if (!k7.f5829e0 && c0342c0.f5947H && z8) {
                if ((kV == null || !kV.q()) && (kV == null || !kV.r())) {
                    c0338a0.f5926b.K(k7, EnumC0367x.f6092r);
                }
                if (c0338a0.f5928d) {
                    return;
                }
                J(null);
                return;
            }
            return;
        }
        c0338a0.getClass();
        int iOrdinal2 = k7.f5822U.f5859d.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                return;
            }
            if (iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    return;
                }
                if (iOrdinal2 != 4) {
                    throw new A2.W();
                }
            }
        }
        Q0.P p8 = k7.f5822U;
        if ((p8.f5860e || p8.f5861f) && !z7) {
            return;
        }
        p8.f5861f = true;
        p8.f5862g = true;
        C0342c0 c0342c02 = p8.f5869p;
        c0342c02.f5949J = true;
        c0342c02.f5950K = true;
        if (k7.f5829e0) {
            return;
        }
        Q0.K kV2 = k7.v();
        boolean zA = AbstractC1209k.a(k7.K(), Boolean.TRUE);
        A0.b bVar = c0338a0.f5926b;
        if (zA && ((kV2 == null || !kV2.f5822U.f5860e) && (kV2 == null || !kV2.f5822U.f5861f))) {
            bVar.K(k7, EnumC0367x.f6090p);
        } else if (k7.J() && ((kV2 == null || !kV2.q()) && (kV2 == null || !kV2.r()))) {
            bVar.K(k7, EnumC0367x.f6092r);
        }
        if (c0338a0.f5928d) {
            return;
        }
        J(null);
    }

    public final void F() {
        F f7 = this.f6573G;
        f7.f6271A = true;
        if (f7.q() && !f7.f6282L) {
            f7.f6282L = true;
            f7.l.post(f7.f6284N);
        }
        t0.c cVar = this.f6575H;
        cVar.f16150u = true;
        if (!cVar.k() || cVar.f16142B) {
            return;
        }
        cVar.f16142B = true;
        cVar.f16152w.post(cVar.f16143C);
    }

    public final void G() {
        if (this.f6613m0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f6612l0) {
            this.f6612l0 = jCurrentAnimationTimeMillis;
            InterfaceC0385h0 interfaceC0385h0 = this.f6594Q0;
            float[] fArr = this.f6610j0;
            interfaceC0385h0.a(this, fArr);
            M.A(fArr, this.f6611k0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f6608h0;
            view.getLocationOnScreen(iArr);
            float f7 = iArr[0];
            float f8 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f6614n0 = (((long) Float.floatToRawIntBits(f7 - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f8 - iArr[1])) & 4294967295L);
        }
    }

    public final void H(MotionEvent motionEvent) {
        this.f6612l0 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC0385h0 interfaceC0385h0 = this.f6594Q0;
        float[] fArr = this.f6610j0;
        interfaceC0385h0.a(this, fArr);
        M.A(fArr, this.f6611k0);
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        long jB = C1953C.b((((long) Float.floatToRawIntBits(x6)) << 32) | (((long) Float.floatToRawIntBits(y6)) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jB >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jB & 4294967295L));
        this.f6614n0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    public final boolean I() {
        if (isFocused() || hasFocus()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void J(Q0.K k7) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (k7 != null) {
            while (k7 != null && k7.s() == Q0.I.f5794o) {
                if (!this.f6605e0) {
                    Q0.K kV = k7.v();
                    if (kV == null) {
                        break;
                    }
                    long j3 = kV.f5821T.f6002c.f5419r;
                    if (n1.a.f(j3) && n1.a.e(j3)) {
                        break;
                    }
                }
                k7 = k7.v();
            }
            if (k7 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long K(long j3) {
        G();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (this.f6614n0 >> 32));
        return C1953C.b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (this.f6614n0 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), this.f6611k0);
    }

    public final int L(MotionEvent motionEvent) {
        Object obj;
        if (this.f6596R0) {
            this.f6596R0 = false;
            int metaState = motionEvent.getMetaState();
            this.f6633x.getClass();
            V0.f6382a.setValue(new K0.D(metaState));
        }
        C0242j c0242j = this.f6591P;
        V.o oVarA = c0242j.a(motionEvent, this);
        B0.a aVar = this.f6593Q;
        if (oVarA == null) {
            if (!aVar.f605a) {
                ((C1463s) ((A.b) aVar.f608d).f3p).b();
                ((C0237e) aVar.f607c).c();
            }
            return 0;
        }
        ArrayList arrayList = (ArrayList) oVarA.f7342p;
        int size = arrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                int i7 = size - 1;
                obj = arrayList.get(size);
                if (((K0.w) obj).f3930e) {
                    break;
                }
                if (i7 < 0) {
                    break;
                }
                size = i7;
            }
            obj = null;
        } else {
            obj = null;
        }
        K0.w wVar = (K0.w) obj;
        if (wVar != null) {
            this.f6615o = wVar.f3929d;
        }
        int iG = aVar.g(oVarA, this, u(motionEvent));
        oVarA.f7343q = null;
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 0 && actionMasked != 5) || (iG & 1) != 0) {
            return iG;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c0242j.f3883c.delete(pointerId);
        c0242j.f3882b.delete(pointerId);
        return iG;
    }

    public final void M(MotionEvent motionEvent, int i7, long j3, boolean z6) {
        int actionMasked = motionEvent.getActionMasked();
        int i8 = 1;
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i7 != 9 && i7 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i9 = 0; i9 < pointerCount; i9++) {
            pointerPropertiesArr[i9] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            pointerCoordsArr[i10] = new MotionEvent.PointerCoords();
        }
        int i11 = 0;
        while (i11 < pointerCount) {
            int i12 = ((actionIndex < 0 || i11 < actionIndex) ? 0 : i8) + i11;
            motionEvent.getPointerProperties(i12, pointerPropertiesArr[i11]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i11];
            motionEvent.getPointerCoords(i12, pointerCoords);
            long jX = x((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(pointerCoords.x)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jX >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jX & 4294967295L));
            i11++;
            actionIndex = actionIndex;
            i8 = 1;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j3 : motionEvent.getDownTime(), j3, i7, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z6 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        V.o oVarA = this.f6591P.a(motionEventObtain, this);
        AbstractC1209k.c(oVarA);
        this.f6593Q.g(oVarA, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N(V.d r6, e5.AbstractC0865c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof R0.C0413w
            if (r0 == 0) goto L13
            r0 = r7
            R0.w r0 = (R0.C0413w) r0
            int r1 = r0.f6548q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6548q = r1
            goto L18
        L13:
            R0.w r0 = new R0.w
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f6546o
            d5.a r1 = d5.EnumC0830a.f11264o
            int r2 = r0.f6548q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2b:
            android.support.v4.media.session.b.K(r7)
            goto L49
        L2f:
            android.support.v4.media.session.b.K(r7)
            java.util.concurrent.atomic.AtomicReference r7 = r5.f6632w0
            R0.s r2 = new R0.s
            r4 = 2
            r2.<init>(r5, r4)
            r0.f6548q = r3
            r0.s r3 = new r0.s
            r4 = 0
            r3.<init>(r2, r7, r6, r4)
            java.lang.Object r6 = w5.AbstractC1767D.h(r3, r0)
            if (r6 != r1) goto L49
            return
        L49:
            A2.W r6 = new A2.W
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.C0415x.N(V.d, e5.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O() {
        /*
            r17 = this;
            r0 = r17
            int[] r1 = r0.f6608h0
            r0.getLocationOnScreen(r1)
            long r2 = r0.f6607g0
            r4 = 32
            long r5 = r2 >> r4
            int r5 = (int) r5
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            int r2 = (int) r2
            r3 = 0
            r8 = r1[r3]
            r9 = 1
            if (r5 != r8) goto L27
            r10 = r1[r9]
            if (r2 != r10) goto L27
            long r10 = r0.f6612l0
            r12 = 0
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L44
        L27:
            r1 = r1[r9]
            long r10 = (long) r8
            long r10 = r10 << r4
            long r12 = (long) r1
            long r12 = r12 & r6
            long r10 = r10 | r12
            r0.f6607g0 = r10
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r1) goto L44
            if (r2 == r1) goto L44
            Q0.K r1 = r0.getRoot()
            Q0.P r1 = r1.f5822U
            Q0.c0 r1 = r1.f5869p
            r1.l0()
            r1 = r9
            goto L45
        L44:
            r1 = r3
        L45:
            r0.G()
            android.view.View r2 = r0.T0
            if (r2 != 0) goto L52
            android.view.View r2 = r0.getRootView()
            r0.T0 = r2
        L52:
            Z0.a r5 = r0.getRectManager()
            long r10 = r0.f6607g0
            long r12 = r0.f6614n0
            long r12 = i6.h.H(r12)
            int r8 = r2.getWidth()
            int r2 = r2.getHeight()
            r5.getClass()
            float[] r14 = r0.f6610j0
            int r15 = N5.d.e(r14)
            r15 = r15 & 2
            if (r15 != 0) goto L74
            goto L75
        L74:
            r14 = 0
        L75:
            Z0.b r15 = r5.f8740b
            r16 = r4
            long r3 = r15.f8750c
            boolean r3 = n1.k.b(r12, r3)
            if (r3 != 0) goto L85
            r15.f8750c = r12
            r3 = r9
            goto L86
        L85:
            r3 = 0
        L86:
            long r12 = r15.f8751d
            boolean r4 = n1.k.b(r10, r12)
            if (r4 != 0) goto L91
            r15.f8751d = r10
            r3 = r9
        L91:
            if (r14 == 0) goto L94
            r3 = r9
        L94:
            long r10 = (long) r8
            long r10 = r10 << r16
            long r12 = (long) r2
            long r6 = r6 & r12
            long r6 = r6 | r10
            long r10 = r15.f8752e
            int r2 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r2 == 0) goto La3
            r15.f8752e = r6
            r3 = r9
        La3:
            if (r3 != 0) goto Lac
            boolean r2 = r5.f8743e
            if (r2 == 0) goto Laa
            goto Lac
        Laa:
            r3 = 0
            goto Lad
        Lac:
            r3 = r9
        Lad:
            r5.f8743e = r3
            Q0.a0 r2 = r0.f6606f0
            r2.b(r1)
            Z0.a r1 = r0.getRectManager()
            r1.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.C0415x.O():void");
    }

    public final void P(float f7) {
        if (this.f6625t) {
            if (f7 > 0.0f) {
                if (Float.isNaN(this.f6582K0) || f7 > this.f6582K0) {
                    this.f6582K0 = f7;
                    return;
                }
                return;
            }
            if (f7 < 0.0f) {
                if (Float.isNaN(this.f6584L0) || f7 < this.f6584L0) {
                    this.f6584L0 = f7;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        Y0.j jVarY;
        InterfaceC1182c interfaceC1182c;
        if (k()) {
            s0.c cVar = this.f6598T;
            if (cVar != null) {
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    int iKeyAt = sparseArray.keyAt(i7);
                    AutofillValue autofillValueI = X.r.i(sparseArray.get(iKeyAt));
                    if (autofillValueI.isText()) {
                        Q0.K k7 = (Q0.K) cVar.f15825b.f8492c.b(iKeyAt);
                        if (k7 != null && (jVarY = k7.y()) != null) {
                            Object objG = jVarY.f8473o.g(Y0.i.f8455g);
                            if (objG == null) {
                                objG = null;
                            }
                            Y0.a aVar = (Y0.a) objG;
                            if (aVar != null && (interfaceC1182c = (InterfaceC1182c) aVar.f8431b) != null) {
                            }
                        }
                    } else if (!autofillValueI.isDate() && !autofillValueI.isList()) {
                        autofillValueI.isToggle();
                    }
                }
            }
            U3.h hVar = this.f6597S;
            if (hVar != null) {
                s0.k kVar = (s0.k) hVar.f7043p;
                if (kVar.f15834a.isEmpty()) {
                    return;
                }
                int size2 = sparseArray.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    int iKeyAt2 = sparseArray.keyAt(i8);
                    AutofillValue autofillValueI2 = X.r.i(sparseArray.get(iKeyAt2));
                    if (autofillValueI2.isText()) {
                        autofillValueI2.getTextValue().toString();
                        if (kVar.f15834a.get(Integer.valueOf(iKeyAt2)) != null) {
                            throw new ClassCastException();
                        }
                    } else {
                        if (autofillValueI2.isDate()) {
                            throw new Y4.g("An operation is not implemented: b/138604541: Add onFill() callback for date");
                        }
                        if (autofillValueI2.isList()) {
                            throw new Y4.g("An operation is not implemented: b/138604541: Add onFill() callback for list");
                        }
                        if (autofillValueI2.isToggle()) {
                            throw new Y4.g("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final void b(InterfaceC0597u interfaceC0597u) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(M.y());
        }
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final /* synthetic */ void c(InterfaceC0597u interfaceC0597u) {
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.f6573G.h(i7, this.f6615o, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i7) {
        return this.f6573G.h(i7, this.f6615o, true);
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final /* synthetic */ void d(InterfaceC0597u interfaceC0597u) {
        Z1.l.c(interfaceC0597u);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws Throwable {
        if (!isAttachedToWindow()) {
            r(getRoot());
        }
        y(true);
        p0.l.k().m();
        this.f6587N = true;
        C1986s c1986s = this.f6635y;
        C1969b c1969b = c1986s.f20254a;
        Canvas canvas2 = c1969b.f20227a;
        c1969b.f20227a = canvas;
        getRoot().j(c1969b, null);
        c1986s.f20254a.f20227a = canvas2;
        ArrayList arrayList = this.f6583L;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((A0) ((Q0.r0) arrayList.get(i7))).f();
            }
        }
        int i8 = T0.f6377o;
        arrayList.clear();
        this.f6587N = false;
        ArrayList arrayList2 = this.f6585M;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.f6625t) {
            AbstractC0381f0.a(this, this.f6582K0);
            View view = this.f6623s;
            if (view == null) {
                AbstractC1209k.m("frameRateCategoryView");
                throw null;
            }
            AbstractC0381f0.a(view, this.f6584L0);
            if (!Float.isNaN(this.f6584L0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.f6582K0 = Float.NaN;
            this.f6584L0 = Float.NaN;
        }
        getRectManager().a();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) throws Exception {
        C0352h0 c0352h0;
        M0.a aVar;
        int size;
        C0352h0 c0352h02;
        AbstractC1397o abstractC1397oF;
        C0352h0 c0352h03;
        if (this.f6590O0) {
            B2.e eVar = this.f6588N0;
            removeCallbacks(eVar);
            if (motionEvent.getActionMasked() == 8) {
                this.f6590O0 = false;
            } else {
                eVar.run();
            }
        }
        if (t(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 8) {
            if (!motionEvent.isFromSource(2)) {
                float x6 = motionEvent.getX();
                float y6 = motionEvent.getY();
                Float.floatToRawIntBits(x6);
                Float.floatToRawIntBits(y6);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                w0.k kVar = (w0.k) getFocusOwner();
                if (kVar.f18789d.f18782e) {
                    System.out.getClass();
                } else {
                    w0.u uVarG = w0.f.g(kVar.f18788c);
                    if (uVarG != null) {
                        if (!uVarG.f15637o.f15636B) {
                            N0.a.b("visitAncestors called on an unattached node");
                        }
                        AbstractC1397o abstractC1397o = uVarG.f15637o;
                        Q0.K kX = AbstractC0347f.x(uVarG);
                        while (kX != null) {
                            if ((kX.f5821T.f6005f.f15640r & 2097152) != 0) {
                                while (abstractC1397o != null) {
                                    if ((abstractC1397o.f15639q & 2097152) != 0) {
                                        AbstractC1397o abstractC1397oF2 = abstractC1397o;
                                        h0.e eVar2 = null;
                                        while (abstractC1397oF2 != null) {
                                            if ((abstractC1397oF2.f15639q & 2097152) != 0 && (abstractC1397oF2 instanceof AbstractC0358n)) {
                                                int i7 = 0;
                                                for (AbstractC1397o abstractC1397o2 = ((AbstractC0358n) abstractC1397oF2).f6056D; abstractC1397o2 != null; abstractC1397o2 = abstractC1397o2.f15642t) {
                                                    if ((abstractC1397o2.f15639q & 2097152) != 0) {
                                                        i7++;
                                                        if (i7 == 1) {
                                                            abstractC1397oF2 = abstractC1397o2;
                                                        } else {
                                                            if (eVar2 == null) {
                                                                eVar2 = new h0.e(new AbstractC1397o[16]);
                                                            }
                                                            if (abstractC1397oF2 != null) {
                                                                eVar2.b(abstractC1397oF2);
                                                                abstractC1397oF2 = null;
                                                            }
                                                            eVar2.b(abstractC1397o2);
                                                        }
                                                    }
                                                }
                                                if (i7 == 1) {
                                                }
                                            }
                                            abstractC1397oF2 = AbstractC0347f.f(eVar2);
                                        }
                                    }
                                    abstractC1397o = abstractC1397o.f15641s;
                                }
                            }
                            kX = kX.v();
                            abstractC1397o = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (q(motionEvent) & 1) != 0;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        motionEvent.getAxisValue(26);
        Context context = getContext();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 26) {
            Method method = G1.J.f2646a;
            AbstractC0144k.d(viewConfiguration);
        } else {
            G1.J.a(viewConfiguration, context);
        }
        Context context2 = getContext();
        if (i8 >= 26) {
            AbstractC0144k.c(viewConfiguration);
        } else {
            G1.J.a(viewConfiguration, context2);
        }
        motionEvent.getEventTime();
        motionEvent.getDeviceId();
        w0.k kVar2 = (w0.k) getFocusOwner();
        if (kVar2.f18789d.f18782e) {
            System.out.getClass();
            return false;
        }
        w0.u uVarG2 = w0.f.g(kVar2.f18788c);
        if (uVarG2 != null) {
            if (!uVarG2.f15637o.f15636B) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1397o abstractC1397o3 = uVarG2.f15637o;
            Q0.K kX2 = AbstractC0347f.x(uVarG2);
            loop0: while (true) {
                if (kX2 == null) {
                    abstractC1397oF = null;
                    break;
                }
                if ((kX2.f5821T.f6005f.f15640r & 16384) != 0) {
                    while (abstractC1397o3 != null) {
                        if ((abstractC1397o3.f15639q & 16384) != 0) {
                            abstractC1397oF = abstractC1397o3;
                            h0.e eVar3 = null;
                            while (abstractC1397oF != null) {
                                if (abstractC1397oF instanceof M0.a) {
                                    break loop0;
                                }
                                if ((abstractC1397oF.f15639q & 16384) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                                    int i9 = 0;
                                    for (AbstractC1397o abstractC1397o4 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o4 != null; abstractC1397o4 = abstractC1397o4.f15642t) {
                                        if ((abstractC1397o4.f15639q & 16384) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                abstractC1397oF = abstractC1397o4;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new h0.e(new AbstractC1397o[16]);
                                                }
                                                if (abstractC1397oF != null) {
                                                    eVar3.b(abstractC1397oF);
                                                    abstractC1397oF = null;
                                                }
                                                eVar3.b(abstractC1397o4);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                abstractC1397oF = AbstractC0347f.f(eVar3);
                            }
                        }
                        abstractC1397o3 = abstractC1397o3.f15641s;
                    }
                }
                kX2 = kX2.v();
                abstractC1397o3 = (kX2 == null || (c0352h03 = kX2.f5821T) == null) ? null : c0352h03.f6004e;
            }
            aVar = (M0.a) abstractC1397oF;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            M0.a aVar2 = aVar;
            if (!aVar2.f15637o.f15636B) {
                N0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1397o abstractC1397o5 = aVar2.f15637o.f15641s;
            Q0.K kX3 = AbstractC0347f.x(aVar);
            ArrayList arrayList = null;
            while (kX3 != null) {
                if ((kX3.f5821T.f6005f.f15640r & 16384) != 0) {
                    while (abstractC1397o5 != null) {
                        if ((abstractC1397o5.f15639q & 16384) != 0) {
                            AbstractC1397o abstractC1397oF3 = abstractC1397o5;
                            h0.e eVar4 = null;
                            while (abstractC1397oF3 != null) {
                                if (abstractC1397oF3 instanceof M0.a) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC1397oF3);
                                } else if ((abstractC1397oF3.f15639q & 16384) != 0 && (abstractC1397oF3 instanceof AbstractC0358n)) {
                                    int i10 = 0;
                                    for (AbstractC1397o abstractC1397o6 = ((AbstractC0358n) abstractC1397oF3).f6056D; abstractC1397o6 != null; abstractC1397o6 = abstractC1397o6.f15642t) {
                                        if ((abstractC1397o6.f15639q & 16384) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC1397oF3 = abstractC1397o6;
                                            } else {
                                                if (eVar4 == null) {
                                                    eVar4 = new h0.e(new AbstractC1397o[16]);
                                                }
                                                if (abstractC1397oF3 != null) {
                                                    eVar4.b(abstractC1397oF3);
                                                    abstractC1397oF3 = null;
                                                }
                                                eVar4.b(abstractC1397o6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC1397oF3 = AbstractC0347f.f(eVar4);
                            }
                        }
                        abstractC1397o5 = abstractC1397o5.f15641s;
                    }
                }
                kX3 = kX3.v();
                abstractC1397o5 = (kX3 == null || (c0352h02 = kX3.f5821T) == null) ? null : c0352h02.f6004e;
            }
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                while (true) {
                    int i11 = size - 1;
                    ((M0.a) arrayList.get(size)).getClass();
                    if (i11 < 0) {
                        break;
                    }
                    size = i11;
                }
            }
            AbstractC1397o abstractC1397oF4 = aVar2.f15637o;
            h0.e eVar5 = null;
            while (abstractC1397oF4 != null) {
                if (abstractC1397oF4 instanceof M0.a) {
                } else if ((abstractC1397oF4.f15639q & 16384) != 0 && (abstractC1397oF4 instanceof AbstractC0358n)) {
                    int i12 = 0;
                    for (AbstractC1397o abstractC1397o7 = ((AbstractC0358n) abstractC1397oF4).f6056D; abstractC1397o7 != null; abstractC1397o7 = abstractC1397o7.f15642t) {
                        if ((abstractC1397o7.f15639q & 16384) != 0) {
                            i12++;
                            if (i12 == 1) {
                                abstractC1397oF4 = abstractC1397o7;
                            } else {
                                if (eVar5 == null) {
                                    eVar5 = new h0.e(new AbstractC1397o[16]);
                                }
                                if (abstractC1397oF4 != null) {
                                    eVar5.b(abstractC1397oF4);
                                    abstractC1397oF4 = null;
                                }
                                eVar5.b(abstractC1397o7);
                            }
                        }
                    }
                    if (i12 == 1) {
                    }
                }
                abstractC1397oF4 = AbstractC0347f.f(eVar5);
            }
            if (!super.dispatchGenericMotionEvent(motionEvent)) {
                AbstractC1397o abstractC1397oF5 = aVar2.f15637o;
                h0.e eVar6 = null;
                while (abstractC1397oF5 != null) {
                    if (abstractC1397oF5 instanceof M0.a) {
                    } else if ((abstractC1397oF5.f15639q & 16384) != 0 && (abstractC1397oF5 instanceof AbstractC0358n)) {
                        int i13 = 0;
                        for (AbstractC1397o abstractC1397o8 = ((AbstractC0358n) abstractC1397oF5).f6056D; abstractC1397o8 != null; abstractC1397o8 = abstractC1397o8.f15642t) {
                            if ((abstractC1397o8.f15639q & 16384) != 0) {
                                i13++;
                                if (i13 == 1) {
                                    abstractC1397oF5 = abstractC1397o8;
                                } else {
                                    if (eVar6 == null) {
                                        eVar6 = new h0.e(new AbstractC1397o[16]);
                                    }
                                    if (abstractC1397oF5 != null) {
                                        eVar6.b(abstractC1397oF5);
                                        abstractC1397oF5 = null;
                                    }
                                    eVar6.b(abstractC1397o8);
                                }
                            }
                        }
                        if (i13 == 1) {
                        }
                    }
                    abstractC1397oF5 = AbstractC0347f.f(eVar6);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        C0402q c0402q = ((M0.a) arrayList.get(i14)).f4755C;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0168 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.C0415x.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((w0.k) getFocusOwner()).d(keyEvent, new C0236d(this, 4, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f6633x.getClass();
        V0.f6382a.setValue(new K0.D(metaState));
        return ((w0.k) getFocusOwner()).d(keyEvent, w0.h.f18783p) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0352h0 c0352h0;
        if (isFocused()) {
            w0.k kVar = (w0.k) getFocusOwner();
            if (kVar.f18789d.f18782e) {
                System.out.getClass();
            } else {
                w0.u uVarG = w0.f.g(kVar.f18788c);
                if (uVarG != null) {
                    if (!uVarG.f15637o.f15636B) {
                        N0.a.b("visitAncestors called on an unattached node");
                    }
                    AbstractC1397o abstractC1397o = uVarG.f15637o;
                    Q0.K kX = AbstractC0347f.x(uVarG);
                    while (kX != null) {
                        if ((kX.f5821T.f6005f.f15640r & 131072) != 0) {
                            while (abstractC1397o != null) {
                                if ((abstractC1397o.f15639q & 131072) != 0) {
                                    AbstractC1397o abstractC1397oF = abstractC1397o;
                                    h0.e eVar = null;
                                    while (abstractC1397oF != null) {
                                        if ((abstractC1397oF.f15639q & 131072) != 0 && (abstractC1397oF instanceof AbstractC0358n)) {
                                            int i7 = 0;
                                            for (AbstractC1397o abstractC1397o2 = ((AbstractC0358n) abstractC1397oF).f6056D; abstractC1397o2 != null; abstractC1397o2 = abstractC1397o2.f15642t) {
                                                if ((abstractC1397o2.f15639q & 131072) != 0) {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        abstractC1397oF = abstractC1397o2;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new h0.e(new AbstractC1397o[16]);
                                                        }
                                                        if (abstractC1397oF != null) {
                                                            eVar.b(abstractC1397oF);
                                                            abstractC1397oF = null;
                                                        }
                                                        eVar.b(abstractC1397o2);
                                                    }
                                                }
                                            }
                                            if (i7 == 1) {
                                            }
                                        }
                                        abstractC1397oF = AbstractC0347f.f(eVar);
                                    }
                                }
                                abstractC1397o = abstractC1397o.f15641s;
                            }
                        }
                        kX = kX.v();
                        abstractC1397o = (kX == null || (c0352h0 = kX.f5821T) == null) ? null : c0352h0.f6004e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            G.f6309a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Exception {
        if (this.f6590O0) {
            B2.e eVar = this.f6588N0;
            removeCallbacks(eVar);
            MotionEvent motionEvent2 = this.f6574G0;
            AbstractC1209k.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f6590O0 = false;
            } else {
                eVar.run();
            }
        }
        if (!t(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || v(motionEvent))) {
            int iQ = q(motionEvent);
            if ((iQ & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((iQ & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i7) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return o(this, i7);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i7));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        C1893c c1893cD;
        if (view == null || this.f6606f0.f5927c) {
            return super.focusSearch(view, i7);
        }
        Object obj = C0414w0.f6549f.get();
        AbstractC1209k.c(obj);
        View viewB = ((C0414w0) obj).b(i7, view, this);
        if (view == this) {
            w0.u uVarG = w0.f.g(((w0.k) getFocusOwner()).f18788c);
            c1893cD = uVarG != null ? w0.f.j(uVarG) : null;
            if (c1893cD == null) {
                c1893cD = w0.f.d(view, this);
            }
        } else {
            c1893cD = w0.f.d(view, this);
        }
        C1696d c1696dD = w0.f.D(i7);
        int i8 = c1696dD != null ? c1696dD.f18776a : 6;
        C1220v c1220v = new C1220v();
        if (((w0.k) getFocusOwner()).e(i8, c1893cD, new J0.h(c1220v, 2)) != null) {
            Object obj2 = c1220v.f14439o;
            if (obj2 != null) {
                if (viewB != null) {
                    if (i8 == 1 || i8 == 2) {
                        return super.focusSearch(view, i7);
                    }
                    if (w0.f.o(w0.f.j((w0.u) obj2), w0.f.d(viewB, this), c1893cD, i8)) {
                    }
                }
                return this;
            }
            if (viewB == null) {
            }
            return viewB;
        }
        return view;
    }

    public final C0377d0 getAndroidViewsHandler$ui_release() {
        if (this.f6603c0 == null) {
            C0377d0 c0377d0 = new C0377d0(getContext());
            this.f6603c0 = c0377d0;
            addView(c0377d0, -1);
            requestLayout();
        }
        C0377d0 c0377d02 = this.f6603c0;
        AbstractC1209k.c(c0377d02);
        return c0377d02;
    }

    public s0.f getAutofill() {
        return this.f6597S;
    }

    public s0.j getAutofillManager() {
        return this.f6598T;
    }

    public s0.k getAutofillTree() {
        return this.f6581K;
    }

    public final InterfaceC1182c getConfigurationChangeObserver() {
        return this.f6595R;
    }

    public final t0.c getContentCaptureManager$ui_release() {
        return this.f6575H;
    }

    public c5.i getCoroutineContext() {
        return this.f6629v;
    }

    public n1.d getDensity() {
        return (n1.d) this.f6621r.getValue();
    }

    public C1893c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            w0.u uVarG = w0.f.g(((w0.k) getFocusOwner()).f18788c);
            if (uVarG != null) {
                return w0.f.j(uVarG);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return w0.f.d(viewFindFocus, this);
        }
        return null;
    }

    public w0.i getFocusOwner() {
        return this.f6627u;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C1893c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f19869a);
            rect.top = Math.round(embeddedViewFocusRect.f19870b);
            rect.right = Math.round(embeddedViewFocusRect.f19871c);
            rect.bottom = Math.round(embeddedViewFocusRect.f19872d);
            return;
        }
        if (AbstractC1209k.a(((w0.k) getFocusOwner()).e(6, null, C0402q.f6497r), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public f1.d getFontFamilyResolver() {
        return (f1.d) this.f6638z0.getValue();
    }

    public f1.c getFontLoader() {
        return this.f6636y0;
    }

    public y0.y getGraphicsContext() {
        return this.f6579J;
    }

    public G0.a getHapticFeedBack() {
        return this.f6566C0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f6606f0.f5926b.b0();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public H0.b getInputModeManager() {
        return this.f6568D0;
    }

    public final RunnableC0326x getInsetsListener() {
        return this.f6561A;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f6612l0;
    }

    @Override // android.view.View, android.view.ViewParent
    public n1.n getLayoutDirection() {
        return (n1.n) this.f6564B0.getValue();
    }

    public long getMeasureIteration() {
        C0338a0 c0338a0 = this.f6606f0;
        if (!c0338a0.f5927c) {
            N0.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return c0338a0.f5931g;
    }

    public P0.c getModifierLocalManager() {
        return this.f6570E0;
    }

    public O0.l0 getPlacementScope() {
        int i7 = O0.o0.f5431b;
        return new O0.T(1, this);
    }

    public K0.s getPointerIconService() {
        return this.f6600U0;
    }

    public Z0.a getRectManager() {
        return this.f6567D;
    }

    public Q0.K getRoot() {
        return this.f6563B;
    }

    public Q0.z0 getRootForTest() {
        return this.f6569E;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        C0247a c0247a;
        if (Build.VERSION.SDK_INT < 31 || (c0247a = this.S0) == null) {
            return false;
        }
        return ((Boolean) ((C0894j0) c0247a.f4105p).getValue()).booleanValue();
    }

    public Y0.q getSemanticsOwner() {
        return this.f6571F;
    }

    public Q0.N getSharedDrawScope() {
        return this.f6619q;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C0379e0.f6446a.a(this) : this.b0;
    }

    public Q0.u0 getSnapshotObserver() {
        return this.a0;
    }

    public O0 getSoftwareKeyboardController() {
        return this.f6634x0;
    }

    public C0981w getTextInputService() {
        return this.f6630v0;
    }

    public P0 getTextToolbar() {
        return this.f6572F0;
    }

    public final Q0.y0 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public S0 getViewConfiguration() {
        return this.f6637z;
    }

    public final C0398o getViewTreeOwners() {
        return (C0398o) this.f6618p0.getValue();
    }

    public U0 getWindowInfo() {
        return this.f6633x;
    }

    public final s0.c get_autofillManager$ui_release() {
        return this.f6598T;
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final /* synthetic */ void h(InterfaceC0597u interfaceC0597u) {
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final void i(InterfaceC0597u interfaceC0597u) {
        AbstractC1209k.f(interfaceC0597u, "owner");
    }

    @Override // androidx.lifecycle.InterfaceC0583f
    public final /* synthetic */ void j(InterfaceC0597u interfaceC0597u) {
    }

    public final Q0.r0 n(l5.e eVar, Q0.i0 i0Var, B0.d dVar) {
        Reference referencePoll;
        h0.e eVar2;
        Object obj;
        if (dVar != null) {
            return new A0(dVar, null, this, eVar, i0Var);
        }
        do {
            V.o oVar = this.f6578I0;
            referencePoll = ((ReferenceQueue) oVar.f7343q).poll();
            eVar2 = (h0.e) oVar.f7342p;
            if (referencePoll != null) {
                eVar2.k(referencePoll);
            }
        } while (referencePoll != null);
        while (true) {
            int i7 = eVar2.f12548q;
            if (i7 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar2.l(i7 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        Q0.r0 r0Var = (Q0.r0) obj;
        if (r0Var == null) {
            return new A0(getGraphicsContext().b(), getGraphicsContext(), this, eVar, i0Var);
        }
        A0 a0 = (A0) r0Var;
        y0.y yVar = a0.f6236p;
        if (yVar == null) {
            throw n1.c.p("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!a0.f6235o.f631s) {
            N0.a.a("layer should have been released before reuse");
        }
        a0.f6235o = yVar.b();
        a0.f6241u = false;
        a0.f6238r = eVar;
        a0.f6239s = i0Var;
        a0.f6230E = false;
        a0.f6231F = false;
        a0.f6232G = true;
        C1953C.d(a0.f6242v);
        float[] fArr = a0.f6243w;
        if (fArr != null) {
            C1953C.d(fArr);
        }
        a0.f6228C = C1967Q.f20224b;
        a0.f6233H = false;
        long j3 = Integer.MAX_VALUE;
        a0.f6240t = (j3 & 4294967295L) | (j3 << 32);
        a0.f6229D = null;
        a0.f6227B = 0;
        return r0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        androidx.lifecycle.K kH;
        InterfaceC0597u interfaceC0597u;
        U3.h hVar;
        super.onAttachedToWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            setShowLayoutBounds(M.y());
        }
        this.f6561A.onViewAttachedToWindow(this);
        if (i7 > 28) {
            if (f6559Z0 == null) {
                RunnableC0396n runnableC0396n = new RunnableC0396n();
                f6559Z0 = runnableC0396n;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f6555V0 == null) {
                        f6555V0 = Class.forName("android.os.SystemProperties");
                    }
                    if (f6557X0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f6555V0;
                        f6557X0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f6557X0;
                    if (method != null) {
                        method.invoke(null, runnableC0396n);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            C1444F c1444f = f6558Y0;
            synchronized (c1444f) {
                c1444f.a(this);
            }
        }
        this.f6633x.f6269a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.f6633x.getClass();
        this.f6633x.getClass();
        s(getRoot());
        r(getRoot());
        getSnapshotObserver().f6075a.e();
        if (k() && (hVar = this.f6597S) != null) {
            s0.i iVar = s0.i.f15833a;
            iVar.getClass();
            ((AutofillManager) hVar.f7044q).registerCallback(iVar);
        }
        InterfaceC0597u interfaceC0597uG = androidx.lifecycle.K.g(this);
        E3.f fVarW = AbstractC1267a.w(this);
        C0398o viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC0597uG != null && fVarW != null && (interfaceC0597uG != (interfaceC0597u = viewTreeOwners.f6488a) || fVarW != interfaceC0597u))) {
            if (interfaceC0597uG == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (fVarW == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (kH = viewTreeOwners.f6488a.h()) != null) {
                kH.l(this);
            }
            interfaceC0597uG.h().a(this);
            C0398o c0398o = new C0398o(interfaceC0597uG, fVarW);
            set_viewTreeOwners(c0398o);
            InterfaceC1182c interfaceC1182c = this.f6620q0;
            if (interfaceC1182c != null) {
                interfaceC1182c.b(c0398o);
            }
            this.f6620q0 = null;
        }
        H0.c cVar = this.f6568D0;
        int i8 = isInTouchMode() ? 1 : 2;
        cVar.getClass();
        cVar.f2955a.setValue(new H0.a(i8));
        C0398o viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.K kH2 = viewTreeOwners2 != null ? viewTreeOwners2.f6488a.h() : null;
        if (kH2 == null) {
            throw n1.c.p("No lifecycle owner exists");
        }
        kH2.a(this);
        kH2.a(this.f6575H);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f6622r0);
        getViewTreeObserver().addOnScrollChangedListener(this.f6624s0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f6626t0);
        if (Build.VERSION.SDK_INT >= 31) {
            J.f6316a.b(this);
        }
        s0.c cVar2 = this.f6598T;
        if (cVar2 != null) {
            ((w0.k) getFocusOwner()).f18792g.a(cVar2);
            getSemanticsOwner().f8493d.a(cVar2);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C1400r c1400r = (C1400r) this.f6632w0.get();
        U u7 = (U) (c1400r != null ? c1400r.f15650b : null);
        if (u7 == null) {
            return this.f6628u0.f12397d;
        }
        C1400r c1400r2 = (C1400r) u7.f6381r.get();
        C0 c02 = (C0) (c1400r2 != null ? c1400r2.f15650b : null);
        return c02 != null && (c02.f6260e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(AbstractC1109c.b(getContext()));
        this.f6633x.getClass();
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f6562A0) {
            this.f6562A0 = i7 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(android.support.v4.media.session.b.m(getContext()));
        }
        this.f6595R.b(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i7;
        C1400r c1400r = (C1400r) this.f6632w0.get();
        U u7 = (U) (c1400r != null ? c1400r.f15650b : null);
        if (u7 == null) {
            C0983y c0983y = this.f6628u0;
            if (c0983y.f12397d) {
                C0969k c0969k = c0983y.h;
                C0980v c0980v = c0983y.f12400g;
                int i8 = c0969k.f12366e;
                boolean z6 = c0969k.f12362a;
                if (i8 == 1) {
                    i7 = z6 ? 6 : 0;
                } else if (i8 == 0) {
                    i7 = 1;
                } else if (i8 == 2) {
                    i7 = 2;
                } else if (i8 == 6) {
                    i7 = 5;
                } else if (i8 == 5) {
                    i7 = 7;
                } else if (i8 == 3) {
                    i7 = 3;
                } else if (i8 == 4) {
                    i7 = 4;
                } else {
                    if (i8 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                }
                editorInfo.imeOptions = i7;
                int i9 = c0969k.f12365d;
                if (i9 == 1) {
                    editorInfo.inputType = 1;
                } else if (i9 == 2) {
                    editorInfo.inputType = 1;
                    editorInfo.imeOptions = Integer.MIN_VALUE | i7;
                } else if (i9 == 3) {
                    editorInfo.inputType = 2;
                } else if (i9 == 4) {
                    editorInfo.inputType = 3;
                } else if (i9 == 5) {
                    editorInfo.inputType = 17;
                } else if (i9 == 6) {
                    editorInfo.inputType = 33;
                } else if (i9 == 7) {
                    editorInfo.inputType = 129;
                } else if (i9 == 8) {
                    editorInfo.inputType = 18;
                } else {
                    if (i9 != 9) {
                        throw new IllegalStateException("Invalid Keyboard Type");
                    }
                    editorInfo.inputType = 8194;
                }
                if (!z6) {
                    int i10 = editorInfo.inputType;
                    if ((i10 & 1) == 1) {
                        editorInfo.inputType = i10 | 131072;
                        if (i8 == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                }
                int i11 = editorInfo.inputType;
                if ((i11 & 1) == 1) {
                    int i12 = c0969k.f12363b;
                    if (i12 == 1) {
                        editorInfo.inputType = i11 | 4096;
                    } else if (i12 == 2) {
                        editorInfo.inputType = i11 | 8192;
                    } else if (i12 == 3) {
                        editorInfo.inputType = i11 | 16384;
                    }
                    if (c0969k.f12364c) {
                        editorInfo.inputType |= 32768;
                    }
                }
                long j3 = c0980v.f12385b;
                int i13 = b1.L.f9944c;
                editorInfo.initialSelStart = (int) (j3 >> 32);
                editorInfo.initialSelEnd = (int) (j3 & 4294967295L);
                I1.d.a(editorInfo, c0980v.f12384a.f9970p);
                editorInfo.imeOptions |= 33554432;
                if (T1.j.d()) {
                    T1.j.a().i(editorInfo);
                }
                InputConnectionC0976r inputConnectionC0976r = new InputConnectionC0976r(c0983y.f12400g, new C0247a(27, c0983y), c0983y.h.f12364c);
                c0983y.f12401i.add(new WeakReference(inputConnectionC0976r));
                return inputConnectionC0976r;
            }
        } else {
            C1400r c1400r2 = (C1400r) u7.f6381r.get();
            C0 c02 = (C0) (c1400r2 != null ? c1400r2.f15650b : null);
            if (c02 != null) {
                synchronized (c02.f6258c) {
                    if (c02.f6260e) {
                        return null;
                    }
                    V.v vVarA = c02.f6256a.a(editorInfo);
                    B0.b bVar = new B0.b(15, c02);
                    int i14 = Build.VERSION.SDK_INT;
                    InputConnection c0974p = i14 >= 34 ? new C0974p(vVarA, bVar) : i14 >= 25 ? new C0973o(vVarA, bVar) : i14 >= 24 ? new C0972n(vVarA, bVar) : new InputConnectionC0971m(vVarA, bVar);
                    c02.f6259d.b(new Q0.H0(c0974p));
                    return c0974p;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        Y0.o oVar;
        String strA;
        t0.c cVar = this.f6575H;
        cVar.getClass();
        for (long j3 : jArr) {
            Y0.p pVar = (Y0.p) cVar.f().b((int) j3);
            if (pVar != null && (oVar = pVar.f8488a) != null) {
                T4.i.r();
                ViewTranslationRequest.Builder builderM = T4.i.m(cVar.f16144o.getAutofillId(), oVar.f8487g);
                Object objG = oVar.f8484d.f8473o.g(Y0.t.f8515A);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null && (strA = p1.a.a(list, "\n", null, 62)) != null) {
                    builderM.setValue("android:text", TranslationRequestValue.forText(new C0622g(strA)));
                    consumer.accept(builderM.build());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        U3.h hVar;
        super.onDetachedFromWindow();
        this.f6561A.onViewDetachedFromWindow(this);
        if (this.f6625t) {
            View view = this.f6623s;
            if (view == null) {
                AbstractC1209k.m("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 > 28) {
            C1444F c1444f = f6558Y0;
            synchronized (c1444f) {
                c1444f.i(this);
            }
        }
        p0.u uVar = getSnapshotObserver().f6075a;
        A2.I i8 = uVar.h;
        if (i8 != null) {
            i8.k();
        }
        uVar.a();
        this.f6633x.getClass();
        C0398o viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.K kH = viewTreeOwners != null ? viewTreeOwners.f6488a.h() : null;
        if (kH == null) {
            throw n1.c.p("No lifecycle owner exists");
        }
        kH.l(this.f6575H);
        kH.l(this);
        if (k() && (hVar = this.f6597S) != null) {
            s0.i iVar = s0.i.f15833a;
            iVar.getClass();
            ((AutofillManager) hVar.f7044q).unregisterCallback(iVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f6622r0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f6624s0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f6626t0);
        if (i7 >= 31) {
            J.f6316a.a(this);
        }
        s0.c cVar = this.f6598T;
        if (cVar != null) {
            getSemanticsOwner().f8493d.i(cVar);
            ((w0.k) getFocusOwner()).f18792g.i(cVar);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z6, int i7, Rect rect) {
        super.onFocusChanged(z6, i7, rect);
        if (z6 || hasFocus()) {
            return;
        }
        w0.f.e(((w0.k) getFocusOwner()).f18788c, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        this.f6612l0 = 0L;
        this.f6606f0.k(this.f6592P0);
        this.f6604d0 = null;
        O();
        if (this.f6603c0 != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i9 - i7, i10 - i8);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        C0338a0 c0338a0 = this.f6606f0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                s(getRoot());
            }
            long jM = m(i7);
            long jM2 = m(i8);
            long jX = AbstractC1110d.x((int) (jM >>> 32), (int) (jM & 4294967295L), (int) (jM2 >>> 32), (int) (4294967295L & jM2));
            n1.a aVar = this.f6604d0;
            if (aVar == null) {
                this.f6604d0 = new n1.a(jX);
                this.f6605e0 = false;
            } else if (!n1.a.b(aVar.f14505a, jX)) {
                this.f6605e0 = true;
            }
            c0338a0.r(jX);
            c0338a0.m();
            setMeasuredDimension(getRoot().f5822U.f5869p.f5416o, getRoot().f5822U.f5869p.f5417p);
            if (this.f6603c0 != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f5822U.f5869p.f5416o, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f5822U.f5869p.f5417p, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x00a4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onProvideAutofillVirtualStructure(android.view.ViewStructure r12, int r13) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.C0415x.onProvideAutofillVirtualStructure(android.view.ViewStructure, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        K0.r rVar;
        int toolType = motionEvent.getToolType(i7);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (rVar = ((C0407t) getPointerIconService()).f6530a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i7);
        }
        Context context = getContext();
        return rVar instanceof C0233a ? PointerIcon.getSystemIcon(context, ((C0233a) rVar).f3860b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        if (this.f6617p) {
            n1.n nVar = i7 != 0 ? i7 != 1 ? null : n1.n.f14522p : n1.n.f14521o;
            if (nVar == null) {
                nVar = n1.n.f14521o;
            }
            setLayoutDirection(nVar);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C0247a c0247a;
        if (Build.VERSION.SDK_INT < 31 || (c0247a = this.S0) == null) {
            return;
        }
        Y0.q semanticsOwner = getSemanticsOwner();
        c5.i coroutineContext = getCoroutineContext();
        h0.e eVar = new h0.e(new X0.k[16]);
        AbstractC1267a.R(semanticsOwner.a(), 0, new X0.j(1, 8, h0.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
        Z4.l.o0(eVar.f12546o, new F2.v(3, new InterfaceC1182c[]{X0.d.f8239r, X0.d.f8240s}), 0, eVar.f12548q);
        int i7 = eVar.f12548q;
        X0.k kVar = (X0.k) (i7 == 0 ? null : eVar.f12546o[i7 - 1]);
        if (kVar == null) {
            return;
        }
        B5.d dVarA = AbstractC1767D.a(coroutineContext);
        Y0.o oVar = kVar.f8258a;
        n1.l lVar = kVar.f8260c;
        X0.f fVar = new X0.f(oVar, lVar, dVarA, c0247a, this);
        Q0.j0 j0Var = kVar.f8261d;
        C1893c c1893cM = O0.w0.i(j0Var).m(j0Var, true);
        long jA = lVar.a();
        ScrollCaptureTarget scrollCaptureTargetH = T4.i.h(this, AbstractC1959I.t(j0.k.C(c1893cM)), new Point((int) (jA >> 32), (int) (jA & 4294967295L)), fVar);
        scrollCaptureTargetH.setScrollBounds(AbstractC1959I.t(lVar));
        consumer.accept(scrollCaptureTargetH);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        t0.c cVar = this.f6575H;
        cVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC1209k.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            j0.k.t(cVar, longSparseArray);
        } else {
            cVar.f16144o.post(new RunnableC0022x(cVar, 10, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z6) {
        boolean zY;
        this.f6633x.f6269a.setValue(Boolean.valueOf(z6));
        this.f6596R0 = true;
        super.onWindowFocusChanged(z6);
        if (!z6 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zY = M.y())) {
            return;
        }
        setShowLayoutBounds(zY);
        r(getRoot());
    }

    public final void p(Q0.K k7, boolean z6) {
        this.f6606f0.g(k7, z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int q(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.C0415x.q(android.view.MotionEvent):int");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (((w0.k) getFocusOwner()).f18788c.D0().a()) {
            return super.requestFocus(i7, rect);
        }
        C1696d c1696dD = w0.f.D(i7);
        int i8 = c1696dD != null ? c1696dD.f18776a : 7;
        return AbstractC1209k.a(((w0.k) getFocusOwner()).e(i8, rect != null ? AbstractC1959I.z(rect) : null, new C0409u(i8, 0)), Boolean.TRUE);
    }

    public final void s(Q0.K k7) {
        this.f6606f0.q(k7, false);
        h0.e eVarA = k7.A();
        Object[] objArr = eVarA.f12546o;
        int i7 = eVarA.f12548q;
        for (int i8 = 0; i8 < i7; i8++) {
            s((Q0.K) objArr[i8]);
        }
    }

    public void setAccessibilityEventBatchIntervalMillis(long j3) {
        this.f6573G.h = j3;
    }

    public final void setConfigurationChangeObserver(InterfaceC1182c interfaceC1182c) {
        this.f6595R = interfaceC1182c;
    }

    public final void setContentCaptureManager$ui_release(t0.c cVar) {
        this.f6575H = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [r0.o] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [h0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public void setCoroutineContext(c5.i iVar) {
        this.f6629v = iVar;
        AbstractC1397o abstractC1397o = getRoot().f5821T.f6005f;
        if (abstractC1397o instanceof K0.N) {
            ((K0.N) abstractC1397o).D0();
        }
        if (!abstractC1397o.f15637o.f15636B) {
            N0.a.b("visitSubtreeIf called on an unattached node");
        }
        h0.e eVar = new h0.e(new AbstractC1397o[16]);
        AbstractC1397o abstractC1397o2 = abstractC1397o.f15637o;
        AbstractC1397o abstractC1397o3 = abstractC1397o2.f15642t;
        if (abstractC1397o3 == null) {
            AbstractC0347f.b(eVar, abstractC1397o2);
        } else {
            eVar.b(abstractC1397o3);
        }
        while (true) {
            int i7 = eVar.f12548q;
            if (i7 == 0) {
                return;
            }
            AbstractC1397o abstractC1397o4 = (AbstractC1397o) eVar.l(i7 - 1);
            if ((abstractC1397o4.f15640r & 16) != 0) {
                for (AbstractC1397o abstractC1397o5 = abstractC1397o4; abstractC1397o5 != null; abstractC1397o5 = abstractC1397o5.f15642t) {
                    if ((abstractC1397o5.f15639q & 16) != 0) {
                        ?? F6 = abstractC1397o5;
                        ?? eVar2 = 0;
                        while (F6 != 0) {
                            if (F6 instanceof Q0.x0) {
                                Q0.x0 x0Var = (Q0.x0) F6;
                                if (x0Var instanceof K0.N) {
                                    ((K0.N) x0Var).D0();
                                }
                            } else if ((F6.f15639q & 16) != 0 && (F6 instanceof AbstractC0358n)) {
                                AbstractC1397o abstractC1397o6 = ((AbstractC0358n) F6).f6056D;
                                int i8 = 0;
                                F6 = F6;
                                eVar2 = eVar2;
                                while (abstractC1397o6 != null) {
                                    if ((abstractC1397o6.f15639q & 16) != 0) {
                                        i8++;
                                        eVar2 = eVar2;
                                        if (i8 == 1) {
                                            F6 = abstractC1397o6;
                                        } else {
                                            if (eVar2 == 0) {
                                                eVar2 = new h0.e(new AbstractC1397o[16]);
                                            }
                                            if (F6 != 0) {
                                                eVar2.b(F6);
                                                F6 = 0;
                                            }
                                            eVar2.b(abstractC1397o6);
                                        }
                                    }
                                    abstractC1397o6 = abstractC1397o6.f15642t;
                                    F6 = F6;
                                    eVar2 = eVar2;
                                }
                                if (i8 == 1) {
                                }
                            }
                            F6 = AbstractC0347f.f(eVar2);
                        }
                    }
                }
            }
            AbstractC0347f.b(eVar, abstractC1397o4);
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j3) {
        this.f6612l0 = j3;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC1182c interfaceC1182c) {
        C0398o viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            interfaceC1182c.b(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f6620q0 = interfaceC1182c;
    }

    public void setShowLayoutBounds(boolean z6) {
        this.b0 = z6;
    }

    public void setUncaughtExceptionHandler(Q0.y0 y0Var) {
        this.f6606f0.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean u(MotionEvent motionEvent) {
        float x6 = motionEvent.getX();
        float y6 = motionEvent.getY();
        return 0.0f <= x6 && x6 <= ((float) getWidth()) && 0.0f <= y6 && y6 <= ((float) getHeight());
    }

    public final boolean v(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f6574G0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void w(float[] fArr) {
        G();
        C1953C.e(fArr, this.f6610j0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f6614n0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f6614n0 & 4294967295L));
        float[] fArr2 = this.f6609i0;
        C1953C.d(fArr2);
        C1953C.f(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        M.D(fArr, fArr2);
    }

    public final long x(long j3) {
        G();
        long jB = C1953C.b(j3, this.f6610j0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f6614n0 >> 32)) + Float.intBitsToFloat((int) (jB >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.f6614n0 & 4294967295L)) + Float.intBitsToFloat((int) (jB & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public final void y(boolean z6) {
        C0411v c0411v;
        C0338a0 c0338a0 = this.f6606f0;
        if (c0338a0.f5926b.b0() || ((h0.e) c0338a0.f5929e.f7342p).f12548q != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z6) {
                try {
                    c0411v = this.f6592P0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                c0411v = null;
            }
            if (c0338a0.k(c0411v)) {
                requestLayout();
            }
            c0338a0.b(false);
            if (this.f6589O) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f6589O = false;
            }
            Trace.endSection();
        }
    }

    public final void z(Q0.K k7, long j3) {
        C0338a0 c0338a0 = this.f6606f0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c0338a0.l(k7, j3);
            if (!c0338a0.f5926b.b0()) {
                c0338a0.b(false);
                if (this.f6589O) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f6589O = false;
                }
            }
            getRectManager().a();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        AbstractC1209k.c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i7, layoutParams, true);
    }

    public C0384h getAccessibilityManager() {
        return this.f6577I;
    }

    /* JADX INFO: renamed from: getClipboard */
    public C0386i m1getClipboard() {
        return this.f6602W;
    }

    /* JADX INFO: renamed from: getClipboardManager */
    public C0388j m2getClipboardManager() {
        return this.f6601V;
    }

    /* JADX INFO: renamed from: getDragAndDropManager */
    public ViewOnDragListenerC1526a m3getDragAndDropManager() {
        return this.f6631w;
    }

    public t.y getLayoutNodes() {
        return this.f6565C;
    }

    public C0415x getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, int i8) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i7;
        layoutParamsGenerateDefaultLayoutParams.height = i8;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i7, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @Y4.a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @Y4.a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui_release(Q0.y0 y0Var) {
    }
}
