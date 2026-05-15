package g1;

import E0.K;
import K0.E;
import M.C0265j;
import M.C0276v;
import R0.C0415x;
import a.AbstractC0509a;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import b1.C0613I;
import b1.L;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import x0.C1893c;

/* JADX INFO: renamed from: g1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0983y implements InterfaceC0975q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f12394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A0.b f12395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorC0984z f12396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1182c f12398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1182c f12399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0980v f12400g;
    public C0969k h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f12401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f12402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f12403k;
    public final C0961c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h0.e f12404m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public B2.e f12405n;

    public C0983y(View view, C0415x c0415x) {
        A0.b bVar = new A0.b(view);
        ExecutorC0984z executorC0984z = new ExecutorC0984z(0, Choreographer.getInstance());
        this.f12394a = view;
        this.f12395b = bVar;
        this.f12396c = executorC0984z;
        this.f12398e = C0960b.f12329s;
        this.f12399f = C0960b.f12330t;
        this.f12400g = new C0980v(L.f9943b, "", 4);
        this.h = C0969k.f12361g;
        this.f12401i = new ArrayList();
        this.f12402j = AbstractC0509a.N(Y4.f.f8724p, new K(26, this));
        this.l = new C0961c(c0415x, bVar);
        this.f12404m = new h0.e(new EnumC0982x[16]);
    }

    /* JADX WARN: Type inference failed for: r12v14, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v22, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [Y4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [Y4.e, java.lang.Object] */
    @Override // g1.InterfaceC0975q
    public final void a(C0980v c0980v, C0980v c0980v2) {
        boolean z6 = (L.b(this.f12400g.f12385b, c0980v2.f12385b) && AbstractC1209k.a(this.f12400g.f12386c, c0980v2.f12386c)) ? false : true;
        this.f12400g = c0980v2;
        int size = this.f12401i.size();
        for (int i7 = 0; i7 < size; i7++) {
            InputConnectionC0976r inputConnectionC0976r = (InputConnectionC0976r) ((WeakReference) this.f12401i.get(i7)).get();
            if (inputConnectionC0976r != null) {
                inputConnectionC0976r.f12374d = c0980v2;
            }
        }
        C0961c c0961c = this.l;
        synchronized (c0961c.f12336c) {
            c0961c.f12342j = null;
            c0961c.l = null;
            c0961c.f12343k = null;
            c0961c.f12344m = C0960b.f12327q;
            c0961c.f12345n = null;
            c0961c.f12346o = null;
        }
        if (AbstractC1209k.a(c0980v, c0980v2)) {
            if (z6) {
                A0.b bVar = this.f12395b;
                int iF = L.f(c0980v2.f12385b);
                int iE = L.e(c0980v2.f12385b);
                L l = this.f12400g.f12386c;
                int iF2 = l != null ? L.f(l.f9945a) : -1;
                L l7 = this.f12400g.f12386c;
                ((InputMethodManager) bVar.f51q.getValue()).updateSelection((View) bVar.f50p, iF, iE, iF2, l7 != null ? L.e(l7.f9945a) : -1);
                return;
            }
            return;
        }
        if (c0980v != null && (!AbstractC1209k.a(c0980v.f12384a.f9970p, c0980v2.f12384a.f9970p) || (L.b(c0980v.f12385b, c0980v2.f12385b) && !AbstractC1209k.a(c0980v.f12386c, c0980v2.f12386c)))) {
            A0.b bVar2 = this.f12395b;
            ((InputMethodManager) bVar2.f51q.getValue()).restartInput((View) bVar2.f50p);
            return;
        }
        int size2 = this.f12401i.size();
        for (int i8 = 0; i8 < size2; i8++) {
            InputConnectionC0976r inputConnectionC0976r2 = (InputConnectionC0976r) ((WeakReference) this.f12401i.get(i8)).get();
            if (inputConnectionC0976r2 != null) {
                C0980v c0980v3 = this.f12400g;
                A0.b bVar3 = this.f12395b;
                if (inputConnectionC0976r2.h) {
                    inputConnectionC0976r2.f12374d = c0980v3;
                    if (inputConnectionC0976r2.f12376f) {
                        ((InputMethodManager) bVar3.f51q.getValue()).updateExtractedText((View) bVar3.f50p, inputConnectionC0976r2.f12375e, I0.c.U(c0980v3));
                    }
                    L l8 = c0980v3.f12386c;
                    int iF3 = l8 != null ? L.f(l8.f9945a) : -1;
                    L l9 = c0980v3.f12386c;
                    int iE2 = l9 != null ? L.e(l9.f9945a) : -1;
                    long j3 = c0980v3.f12385b;
                    ((InputMethodManager) bVar3.f51q.getValue()).updateSelection((View) bVar3.f50p, L.f(j3), L.e(j3), iF3, iE2);
                }
            }
        }
    }

    @Override // g1.InterfaceC0975q
    public final void b(C0980v c0980v, B2.m mVar, C0613I c0613i, E e7, C1893c c1893c, C1893c c1893c2) {
        C0961c c0961c = this.l;
        synchronized (c0961c.f12336c) {
            try {
                c0961c.f12342j = c0980v;
                c0961c.l = mVar;
                c0961c.f12343k = c0613i;
                c0961c.f12344m = e7;
                c0961c.f12345n = c1893c;
                c0961c.f12346o = c1893c2;
                if (c0961c.f12338e || c0961c.f12337d) {
                    c0961c.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // g1.InterfaceC0975q
    public final void c(C1893c c1893c) {
        Rect rect;
        this.f12403k = new Rect(AbstractC1267a.H(c1893c.f19869a), AbstractC1267a.H(c1893c.f19870b), AbstractC1267a.H(c1893c.f19871c), AbstractC1267a.H(c1893c.f19872d));
        if (!this.f12401i.isEmpty() || (rect = this.f12403k) == null) {
            return;
        }
        this.f12394a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // g1.InterfaceC0975q
    public final void d() {
        i(EnumC0982x.f12389o);
    }

    @Override // g1.InterfaceC0975q
    public final void e() {
        i(EnumC0982x.f12391q);
    }

    @Override // g1.InterfaceC0975q
    public final void f() {
        i(EnumC0982x.f12392r);
    }

    @Override // g1.InterfaceC0975q
    public final void g() {
        this.f12397d = false;
        this.f12398e = C0960b.f12331u;
        this.f12399f = C0960b.f12332v;
        this.f12403k = null;
        i(EnumC0982x.f12390p);
    }

    @Override // g1.InterfaceC0975q
    public final void h(C0980v c0980v, C0969k c0969k, C0265j c0265j, C0276v c0276v) {
        this.f12397d = true;
        this.f12400g = c0980v;
        this.h = c0969k;
        this.f12398e = c0265j;
        this.f12399f = c0276v;
        i(EnumC0982x.f12389o);
    }

    public final void i(EnumC0982x enumC0982x) {
        this.f12404m.b(enumC0982x);
        if (this.f12405n == null) {
            B2.e eVar = new B2.e(17, this);
            this.f12396c.execute(eVar);
            this.f12405n = eVar;
        }
    }
}
