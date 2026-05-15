package k;

import G1.C0155w;
import G1.N;
import R0.AbstractC0372b;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import j.AbstractC1089a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import o.AbstractC1243a;
import q.C1300B;
import q.C1302a0;
import q.C1313g;
import q.C1314g0;
import q.C1321k;
import q.C1329o;
import q.C1331p;
import q.C1333q;
import q.C1336s;
import q.C1340u;
import q.C1344w;
import q.C1346x;
import q.C1348y;
import q.InterfaceC1318i0;
import q.InterfaceC1320j0;
import q.P;
import q.W0;
import q.b1;
import q.g1;
import q.j1;
import t.T;

/* JADX INFO: renamed from: k.A */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C1111A extends o implements p.j, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: w0 */
    public static final T f13776w0 = new T(0);

    /* JADX INFO: renamed from: x0 */
    public static final int[] f13777x0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: y0 */
    public static final boolean f13778y0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A */
    public w f13779A;

    /* JADX INFO: renamed from: B */
    public final Object f13780B;

    /* JADX INFO: renamed from: C */
    public K f13781C;

    /* JADX INFO: renamed from: D */
    public o.h f13782D;

    /* JADX INFO: renamed from: E */
    public CharSequence f13783E;

    /* JADX INFO: renamed from: F */
    public InterfaceC1318i0 f13784F;

    /* JADX INFO: renamed from: G */
    public q f13785G;

    /* JADX INFO: renamed from: H */
    public q f13786H;

    /* JADX INFO: renamed from: I */
    public AbstractC1243a f13787I;

    /* JADX INFO: renamed from: J */
    public ActionBarContextView f13788J;

    /* JADX INFO: renamed from: K */
    public PopupWindow f13789K;

    /* JADX INFO: renamed from: L */
    public p f13790L;

    /* JADX INFO: renamed from: O */
    public boolean f13793O;

    /* JADX INFO: renamed from: P */
    public ViewGroup f13794P;

    /* JADX INFO: renamed from: Q */
    public TextView f13795Q;

    /* JADX INFO: renamed from: R */
    public View f13796R;

    /* JADX INFO: renamed from: S */
    public boolean f13797S;

    /* JADX INFO: renamed from: T */
    public boolean f13798T;

    /* JADX INFO: renamed from: U */
    public boolean f13799U;

    /* JADX INFO: renamed from: V */
    public boolean f13800V;

    /* JADX INFO: renamed from: W */
    public boolean f13801W;

    /* JADX INFO: renamed from: X */
    public boolean f13802X;

    /* JADX INFO: renamed from: Y */
    public boolean f13803Y;
    public boolean Z;
    public z[] a0;
    public z b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f13804c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f13805d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f13806e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f13807f0;

    /* JADX INFO: renamed from: g0 */
    public Configuration f13808g0;

    /* JADX INFO: renamed from: h0 */
    public final int f13809h0;

    /* JADX INFO: renamed from: i0 */
    public int f13810i0;

    /* JADX INFO: renamed from: j0 */
    public int f13811j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f13812k0;

    /* JADX INFO: renamed from: l0 */
    public x f13813l0;

    /* JADX INFO: renamed from: m0 */
    public x f13814m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f13815n0;

    /* JADX INFO: renamed from: o0 */
    public int f13816o0;

    /* JADX INFO: renamed from: q0 */
    public boolean f13818q0;

    /* JADX INFO: renamed from: r0 */
    public Rect f13819r0;

    /* JADX INFO: renamed from: s0 */
    public Rect f13820s0;

    /* JADX INFO: renamed from: t0 */
    public D f13821t0;

    /* JADX INFO: renamed from: u0 */
    public OnBackInvokedDispatcher f13822u0;

    /* JADX INFO: renamed from: v0 */
    public OnBackInvokedCallback f13823v0;

    /* JADX INFO: renamed from: x */
    public final Object f13824x;

    /* JADX INFO: renamed from: y */
    public final Context f13825y;

    /* JADX INFO: renamed from: z */
    public Window f13826z;

    /* JADX INFO: renamed from: M */
    public N f13791M = null;

    /* JADX INFO: renamed from: N */
    public final boolean f13792N = true;

    /* JADX INFO: renamed from: p0 */
    public final p f13817p0 = new p(this, 0);

    public LayoutInflaterFactory2C1111A(Context context, Window window, InterfaceC1122j interfaceC1122j, Object obj) {
        AbstractActivityC1121i abstractActivityC1121i = null;
        this.f13809h0 = -100;
        this.f13825y = context;
        this.f13780B = interfaceC1122j;
        this.f13824x = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC1121i)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC1121i = (AbstractActivityC1121i) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC1121i != null) {
                this.f13809h0 = ((LayoutInflaterFactory2C1111A) abstractActivityC1121i.l()).f13809h0;
            }
        }
        if (this.f13809h0 == -100) {
            T t7 = f13776w0;
            Integer num = (Integer) t7.get(this.f13824x.getClass().getName());
            if (num != null) {
                this.f13809h0 = num.intValue();
                t7.remove(this.f13824x.getClass().getName());
            }
        }
        if (window != null) {
            k(window);
        }
        C1336s.c();
    }

    public static B1.g l(Context context) {
        B1.g gVar;
        B1.g gVarB;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 || (gVar = o.f13928q) == null) {
            return null;
        }
        B1.g gVarW = w(context.getApplicationContext().getResources().getConfiguration());
        B1.i iVar = gVar.f722a;
        int i8 = 0;
        if (i7 < 24) {
            gVarB = iVar.isEmpty() ? B1.g.f721b : B1.g.b(s.b(iVar.get(0)));
        } else if (iVar.isEmpty()) {
            gVarB = B1.g.f721b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i8 < gVarW.f722a.size() + iVar.size()) {
                Locale locale = i8 < iVar.size() ? iVar.get(i8) : gVarW.f722a.get(i8 - iVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i8++;
            }
            gVarB = B1.g.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return gVarB.f722a.isEmpty() ? gVarW : gVarB;
    }

    public static Configuration p(Context context, int i7, B1.g gVar, Configuration configuration, boolean z6) {
        int i8 = i7 != 1 ? i7 != 2 ? z6 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i8 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                t.d(configuration2, gVar);
                return configuration2;
            }
            B1.i iVar = gVar.f722a;
            configuration2.setLocale(iVar.get(0));
            configuration2.setLayoutDirection(iVar.get(0));
        }
        return configuration2;
    }

    public static B1.g w(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? t.b(configuration) : B1.g.b(s.b(configuration.locale));
    }

    public final void A(int i7) {
        this.f13816o0 = (1 << i7) | this.f13816o0;
        if (this.f13815n0) {
            return;
        }
        View decorView = this.f13826z.getDecorView();
        p pVar = this.f13817p0;
        WeakHashMap weakHashMap = G1.I.f2641a;
        decorView.postOnAnimation(pVar);
        this.f13815n0 = true;
    }

    public final int B(Context context, int i7) {
        if (i7 != -100) {
            if (i7 != -1) {
                if (i7 != 0) {
                    if (i7 != 1 && i7 != 2) {
                        if (i7 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f13814m0 == null) {
                            this.f13814m0 = new x(this, context);
                        }
                        return this.f13814m0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return v(context).f();
                }
            }
            return i7;
        }
        return -1;
    }

    public final boolean C() {
        InterfaceC1320j0 interfaceC1320j0;
        W0 w02;
        boolean z6 = this.f13804c0;
        this.f13804c0 = false;
        z zVarY = y(0);
        if (!zVarY.f13962m) {
            AbstractC1243a abstractC1243a = this.f13787I;
            if (abstractC1243a != null) {
                abstractC1243a.a();
                return true;
            }
            z();
            K k7 = this.f13781C;
            if (k7 == null || (interfaceC1320j0 = k7.f13859f) == null || (w02 = ((b1) interfaceC1320j0).f15264a.f9080c0) == null || w02.f15243p == null) {
                return false;
            }
            W0 w03 = ((b1) interfaceC1320j0).f15264a.f9080c0;
            p.n nVar = w03 == null ? null : w03.f15243p;
            if (nVar != null) {
                nVar.collapseActionView();
            }
        } else if (!z6) {
            o(zVarY, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x0176, code lost:
    
        if (r3.f14807t.getCount() > 0) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:215:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(k.z r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.LayoutInflaterFactory2C1111A.D(k.z, android.view.KeyEvent):void");
    }

    public final boolean E(z zVar, int i7, KeyEvent keyEvent) {
        p.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f13961k || F(zVar, keyEvent)) && (lVar = zVar.h) != null) {
            return lVar.performShortcut(i7, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F(k.z r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.LayoutInflaterFactory2C1111A.F(k.z, android.view.KeyEvent):boolean");
    }

    public final void G() {
        if (this.f13793O) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z6 = false;
            if (this.f13822u0 != null && (y(0).f13962m || this.f13787I != null)) {
                z6 = true;
            }
            if (z6 && this.f13823v0 == null) {
                this.f13823v0 = v.b(this.f13822u0, this);
            } else {
                if (z6 || (onBackInvokedCallback = this.f13823v0) == null) {
                    return;
                }
                v.c(this.f13822u0, onBackInvokedCallback);
                this.f13823v0 = null;
            }
        }
    }

    @Override // k.o
    public final void b() {
        String strC;
        this.f13805d0 = true;
        j(false, true);
        u();
        Object obj = this.f13824x;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = u1.d.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e7) {
                    throw new IllegalArgumentException(e7);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                K k7 = this.f13781C;
                if (k7 == null) {
                    this.f13818q0 = true;
                } else {
                    k7.S(true);
                }
            }
            synchronized (o.f13933v) {
                o.d(this);
                o.f13932u.add(new WeakReference(this));
            }
        }
        this.f13808g0 = new Configuration(this.f13825y.getResources().getConfiguration());
        this.f13806e0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x004d  */
    @Override // k.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13824x
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = k.o.f13933v
            monitor-enter(r0)
            k.o.d(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f13815n0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.f13826z
            android.view.View r0 = r0.getDecorView()
            k.p r1 = r3.f13817p0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f13807f0 = r0
            int r0 = r3.f13809h0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.f13824x
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            t.T r0 = k.LayoutInflaterFactory2C1111A.f13776w0
            java.lang.Object r1 = r3.f13824x
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f13809h0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            t.T r0 = k.LayoutInflaterFactory2C1111A.f13776w0
            java.lang.Object r1 = r3.f13824x
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            k.x r0 = r3.f13813l0
            if (r0 == 0) goto L63
            r0.c()
        L63:
            k.x r0 = r3.f13814m0
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.LayoutInflaterFactory2C1111A.c():void");
    }

    @Override // k.o
    public final boolean e(int i7) {
        if (i7 == 8) {
            i7 = 108;
        } else if (i7 == 9) {
            i7 = 109;
        }
        if (this.f13803Y && i7 == 108) {
            return false;
        }
        if (this.f13799U && i7 == 1) {
            this.f13799U = false;
        }
        if (i7 == 1) {
            G();
            this.f13803Y = true;
            return true;
        }
        if (i7 == 2) {
            G();
            this.f13797S = true;
            return true;
        }
        if (i7 == 5) {
            G();
            this.f13798T = true;
            return true;
        }
        if (i7 == 10) {
            G();
            this.f13801W = true;
            return true;
        }
        if (i7 == 108) {
            G();
            this.f13799U = true;
            return true;
        }
        if (i7 != 109) {
            return this.f13826z.requestFeature(i7);
        }
        G();
        this.f13800V = true;
        return true;
    }

    @Override // k.o
    public final void f(int i7) {
        t();
        ViewGroup viewGroup = (ViewGroup) this.f13794P.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f13825y).inflate(i7, viewGroup);
        this.f13779A.a(this.f13826z.getCallback());
    }

    @Override // k.o
    public final void g(View view) {
        t();
        ViewGroup viewGroup = (ViewGroup) this.f13794P.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f13779A.a(this.f13826z.getCallback());
    }

    @Override // k.o
    public final void h(View view, ViewGroup.LayoutParams layoutParams) {
        t();
        ViewGroup viewGroup = (ViewGroup) this.f13794P.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f13779A.a(this.f13826z.getCallback());
    }

    @Override // k.o
    public final void i(CharSequence charSequence) {
        this.f13783E = charSequence;
        InterfaceC1318i0 interfaceC1318i0 = this.f13784F;
        if (interfaceC1318i0 != null) {
            interfaceC1318i0.setWindowTitle(charSequence);
            return;
        }
        K k7 = this.f13781C;
        if (k7 == null) {
            TextView textView = this.f13795Q;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        b1 b1Var = (b1) k7.f13859f;
        if (b1Var.f15270g) {
            return;
        }
        b1Var.h = charSequence;
        if ((b1Var.f15265b & 8) != 0) {
            Toolbar toolbar = b1Var.f15264a;
            toolbar.setTitle(charSequence);
            if (b1Var.f15270g) {
                G1.I.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.LayoutInflaterFactory2C1111A.j(boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(android.view.Window r8) {
        /*
            r7 = this;
            android.view.Window r0 = r7.f13826z
            java.lang.String r1 = "AppCompat has already installed itself into the Window"
            if (r0 != 0) goto L80
            android.view.Window$Callback r0 = r8.getCallback()
            boolean r2 = r0 instanceof k.w
            if (r2 != 0) goto L7a
            k.w r1 = new k.w
            r1.<init>(r7, r0)
            r7.f13779A = r1
            r8.setCallback(r1)
            int[] r0 = k.LayoutInflaterFactory2C1111A.f13777x0
            android.content.Context r1 = r7.f13825y
            r2 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r0)
            r3 = 0
            boolean r4 = r0.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r0.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            q.s r4 = q.C1336s.a()
            monitor-enter(r4)
            q.K0 r5 = r4.f15390a     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r1 = r5.g(r1, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            r1 = r2
        L40:
            if (r1 == 0) goto L45
            r8.setBackgroundDrawable(r1)
        L45:
            r0.recycle()
            r7.f13826z = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.f13822u0
            if (r8 != 0) goto L79
            if (r8 == 0) goto L5f
            android.window.OnBackInvokedCallback r0 = r7.f13823v0
            if (r0 == 0) goto L5f
            k.v.c(r8, r0)
            r7.f13823v0 = r2
        L5f:
            java.lang.Object r8 = r7.f13824x
            boolean r0 = r8 instanceof android.app.Activity
            if (r0 == 0) goto L74
            android.app.Activity r8 = (android.app.Activity) r8
            android.view.Window r0 = r8.getWindow()
            if (r0 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = k.v.a(r8)
            r7.f13822u0 = r8
            goto L76
        L74:
            r7.f13822u0 = r2
        L76:
            r7.H()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k.LayoutInflaterFactory2C1111A.k(android.view.Window):void");
    }

    public final void m(int i7, z zVar, p.l lVar) {
        if (lVar == null) {
            if (zVar == null && i7 >= 0) {
                z[] zVarArr = this.a0;
                if (i7 < zVarArr.length) {
                    zVar = zVarArr[i7];
                }
            }
            if (zVar != null) {
                lVar = zVar.h;
            }
        }
        if ((zVar == null || zVar.f13962m) && !this.f13807f0) {
            w wVar = this.f13779A;
            Window.Callback callback = this.f13826z.getCallback();
            wVar.getClass();
            try {
                wVar.f13946r = true;
                callback.onPanelClosed(i7, lVar);
            } finally {
                wVar.f13946r = false;
            }
        }
    }

    public final void n(p.l lVar) {
        C1321k c1321k;
        if (this.Z) {
            return;
        }
        this.Z = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f13784F;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((b1) actionBarOverlayLayout.f9023s).f15264a.f9086o;
        if (actionMenuView != null && (c1321k = actionMenuView.f9035H) != null) {
            c1321k.c();
            C1313g c1313g = c1321k.f15330H;
            if (c1313g != null && c1313g.b()) {
                c1313g.f14886i.dismiss();
            }
        }
        Window.Callback callback = this.f13826z.getCallback();
        if (callback != null && !this.f13807f0) {
            callback.onPanelClosed(108, lVar);
        }
        this.Z = false;
    }

    public final void o(z zVar, boolean z6) {
        y yVar;
        InterfaceC1318i0 interfaceC1318i0;
        C1321k c1321k;
        if (z6 && zVar.f13952a == 0 && (interfaceC1318i0 = this.f13784F) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1318i0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((b1) actionBarOverlayLayout.f9023s).f15264a.f9086o;
            if (actionMenuView != null && (c1321k = actionMenuView.f9035H) != null && c1321k.e()) {
                n(zVar.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f13825y.getSystemService("window");
        if (windowManager != null && zVar.f13962m && (yVar = zVar.f13956e) != null) {
            windowManager.removeView(yVar);
            if (z6) {
                m(zVar.f13952a, zVar, null);
            }
        }
        zVar.f13961k = false;
        zVar.l = false;
        zVar.f13962m = false;
        zVar.f13957f = null;
        zVar.f13963n = true;
        if (this.b0 == zVar) {
            this.b0 = null;
        }
        if (zVar.f13952a == 0) {
            H();
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Context cVar;
        View c7;
        if (this.f13821t0 == null) {
            int[] iArr = AbstractC1089a.f13602j;
            Context context2 = this.f13825y;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f13821t0 = new D();
            } else {
                try {
                    this.f13821t0 = (D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable unused) {
                    this.f13821t0 = new D();
                }
            }
        }
        D d4 = this.f13821t0;
        int i7 = g1.f15315a;
        d4.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1089a.f13615x, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        typedArrayObtainStyledAttributes2.recycle();
        cVar = (resourceId == 0 || ((context instanceof o.c) && ((o.c) context).f14562a == resourceId)) ? context : new o.c(context, resourceId);
        str.getClass();
        View view2 = null;
        switch (str) {
            case "RatingBar":
                c7 = new q.C(cVar, attributeSet);
                break;
            case "CheckedTextView":
                c7 = new q.r(cVar, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                c7 = new C1348y(cVar, attributeSet);
                break;
            case "TextView":
                c7 = new C1302a0(cVar, attributeSet);
                break;
            case "ImageButton":
                c7 = new C1344w(cVar, attributeSet, yos.music.player.R.attr.imageButtonStyle);
                break;
            case "SeekBar":
                c7 = new q.E(cVar, attributeSet);
                break;
            case "Spinner":
                c7 = new P(cVar, attributeSet);
                break;
            case "RadioButton":
                c7 = new C1300B(cVar, attributeSet);
                break;
            case "ToggleButton":
                c7 = new C1314g0(cVar, attributeSet);
                break;
            case "ImageView":
                c7 = new C1346x(cVar, attributeSet, 0);
                break;
            case "AutoCompleteTextView":
                c7 = new C1329o(cVar, attributeSet);
                break;
            case "CheckBox":
                c7 = new C1333q(cVar, attributeSet);
                break;
            case "EditText":
                c7 = new C1340u(cVar, attributeSet);
                break;
            case "Button":
                c7 = new C1331p(cVar, attributeSet);
                break;
            default:
                c7 = null;
                break;
        }
        if (c7 == null && context != cVar) {
            Object[] objArr = d4.f13838a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = cVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i8 = 0;
                    while (true) {
                        String[] strArr = D.f13837g;
                        if (i8 < 3) {
                            View viewA = d4.a(cVar, str, strArr[i8]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i8++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewA2 = d4.a(cVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused2) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th) {
                objArr[0] = null;
                objArr[1] = null;
                throw th;
            }
            c7 = view2;
        }
        if (c7 != null) {
            Context context3 = c7.getContext();
            if ((context3 instanceof ContextWrapper) && c7.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, D.f13833c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c7.setOnClickListener(new C(c7, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = cVar.obtainStyledAttributes(attributeSet, D.f13834d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z6 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = G1.I.f2641a;
                    new C0155w(yos.music.player.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).g(c7, Boolean.valueOf(z6));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = cVar.obtainStyledAttributes(attributeSet, D.f13835e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    G1.I.i(c7, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = cVar.obtainStyledAttributes(attributeSet, D.f13836f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z7 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = G1.I.f2641a;
                    new C0155w(yos.music.player.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).g(c7, Boolean.valueOf(z7));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c7;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.LayoutInflaterFactory2C1111A.q(android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0048, code lost:
    
        if (r6.e() != false) goto L89;
     */
    @Override // p.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(p.l r6) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.LayoutInflaterFactory2C1111A.r(p.l):void");
    }

    public final void s(int i7) {
        z zVarY = y(i7);
        if (zVarY.h != null) {
            Bundle bundle = new Bundle();
            zVarY.h.t(bundle);
            if (bundle.size() > 0) {
                zVarY.f13965p = bundle;
            }
            zVarY.h.w();
            zVarY.h.clear();
        }
        zVarY.f13964o = true;
        zVarY.f13963n = true;
        if ((i7 == 108 || i7 == 0) && this.f13784F != null) {
            z zVarY2 = y(0);
            zVarY2.f13961k = false;
            F(zVarY2, null);
        }
    }

    public final void t() {
        ViewGroup viewGroup;
        if (this.f13793O) {
            return;
        }
        int[] iArr = AbstractC1089a.f13602j;
        Context context = this.f13825y;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            e(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            e(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            e(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            e(10);
        }
        this.f13802X = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        u();
        this.f13826z.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f13803Y) {
            viewGroup = this.f13801W ? (ViewGroup) layoutInflaterFrom.inflate(yos.music.player.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(yos.music.player.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f13802X) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(yos.music.player.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f13800V = false;
            this.f13799U = false;
        } else if (this.f13799U) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(yos.music.player.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new o.c(context, typedValue.resourceId) : context).inflate(yos.music.player.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1318i0 interfaceC1318i0 = (InterfaceC1318i0) viewGroup.findViewById(yos.music.player.R.id.decor_content_parent);
            this.f13784F = interfaceC1318i0;
            interfaceC1318i0.setWindowCallback(this.f13826z.getCallback());
            if (this.f13800V) {
                ((ActionBarOverlayLayout) this.f13784F).j(109);
            }
            if (this.f13797S) {
                ((ActionBarOverlayLayout) this.f13784F).j(2);
            }
            if (this.f13798T) {
                ((ActionBarOverlayLayout) this.f13784F).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f13799U + ", windowActionBarOverlay: " + this.f13800V + ", android:windowIsFloating: " + this.f13802X + ", windowActionModeOverlay: " + this.f13801W + ", windowNoTitle: " + this.f13803Y + " }");
        }
        q qVar = new q(this, 0);
        WeakHashMap weakHashMap = G1.I.f2641a;
        G1.B.h(viewGroup, qVar);
        if (this.f13784F == null) {
            this.f13795Q = (TextView) viewGroup.findViewById(yos.music.player.R.id.title);
        }
        boolean z6 = j1.f15320a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(yos.music.player.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f13826z.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f13826z.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q(this, 1));
        this.f13794P = viewGroup;
        Object obj = this.f13824x;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f13783E;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1318i0 interfaceC1318i02 = this.f13784F;
            if (interfaceC1318i02 != null) {
                interfaceC1318i02.setWindowTitle(title);
            } else {
                K k7 = this.f13781C;
                if (k7 != null) {
                    b1 b1Var = (b1) k7.f13859f;
                    if (!b1Var.f15270g) {
                        b1Var.h = title;
                        if ((b1Var.f15265b & 8) != 0) {
                            Toolbar toolbar = b1Var.f15264a;
                            toolbar.setTitle(title);
                            if (b1Var.f15270g) {
                                G1.I.i(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f13795Q;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f13794P.findViewById(R.id.content);
        View decorView = this.f13826z.getDecorView();
        contentFrameLayout2.f9052u.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f13793O = true;
        z zVarY = y(0);
        if (this.f13807f0 || zVarY.h != null) {
            return;
        }
        A(108);
    }

    public final void u() {
        if (this.f13826z == null) {
            Object obj = this.f13824x;
            if (obj instanceof Activity) {
                k(((Activity) obj).getWindow());
            }
        }
        if (this.f13826z == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0372b v(Context context) {
        if (this.f13813l0 == null) {
            if (A0.b.f48s == null) {
                Context applicationContext = context.getApplicationContext();
                A0.b.f48s = new A0.b(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f13813l0 = new x(this, A0.b.f48s);
        }
        return this.f13813l0;
    }

    @Override // p.j
    public final boolean x(p.l lVar, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f13826z.getCallback();
        if (callback != null && !this.f13807f0) {
            p.l lVarK = lVar.k();
            z[] zVarArr = this.a0;
            int length = zVarArr != null ? zVarArr.length : 0;
            int i7 = 0;
            while (true) {
                if (i7 < length) {
                    zVar = zVarArr[i7];
                    if (zVar != null && zVar.h == lVarK) {
                        break;
                    }
                    i7++;
                } else {
                    zVar = null;
                    break;
                }
            }
            if (zVar != null) {
                return callback.onMenuItemSelected(zVar.f13952a, menuItem);
            }
        }
        return false;
    }

    public final z y(int i7) {
        z[] zVarArr = this.a0;
        if (zVarArr == null || zVarArr.length <= i7) {
            z[] zVarArr2 = new z[i7 + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.a0 = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i7];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f13952a = i7;
        zVar2.f13963n = false;
        zVarArr[i7] = zVar2;
        return zVar2;
    }

    public final void z() {
        t();
        if (this.f13799U && this.f13781C == null) {
            Object obj = this.f13824x;
            if (obj instanceof Activity) {
                this.f13781C = new K((Activity) obj, this.f13800V);
            } else if (obj instanceof Dialog) {
                this.f13781C = new K((Dialog) obj);
            }
            K k7 = this.f13781C;
            if (k7 != null) {
                k7.S(this.f13818q0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
