package r1;

import A2.W;
import K0.C0236d;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.K;
import d.AbstractDialogC0760m;
import d.C0743I;
import java.util.UUID;
import m5.AbstractC1209k;
import o5.AbstractC1267a;
import yos.music.player.R;

/* JADX INFO: loaded from: classes.dex */
public final class w extends AbstractDialogC0760m {

    /* JADX INFO: renamed from: r */
    public C0236d f15728r;

    /* JADX INFO: renamed from: s */
    public u f15729s;

    /* JADX INFO: renamed from: t */
    public final View f15730t;

    /* JADX INFO: renamed from: u */
    public final t f15731u;

    /* JADX INFO: renamed from: v */
    public boolean f15732v;

    public w(C0236d c0236d, u uVar, View view, n1.n nVar, n1.d dVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), uVar.f15726e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f15728r = c0236d;
        this.f15729s = uVar;
        this.f15730t = view;
        float f7 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        android.support.v4.media.session.b.G(window, this.f15729s.f15726e);
        window.setGravity(17);
        if (!this.f15729s.f15726e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                o.f15709a.a(attributes);
            }
            if (i7 >= 30) {
                p pVar = p.f15710a;
                pVar.a(attributes, 0);
                pVar.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        t tVar = new t(getContext(), window);
        setTitle(this.f15729s.f15727f);
        tVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        tVar.setClipChildren(false);
        tVar.setElevation(dVar.v(f7));
        tVar.setOutlineProvider(new B0.p(2));
        this.f15731u = tVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(tVar);
        K.m(tVar, K.g(view));
        K.n(tVar, K.h(view));
        AbstractC1267a.K(tVar, AbstractC1267a.w(view));
        f(this.f15728r, this.f15729s, nVar);
        C0743I c0743i = this.f10797q;
        C1409c c1409c = new C1409c(this, 1);
        AbstractC1209k.f(c0743i, "<this>");
        c0743i.a(this, new Y1.l(c1409c));
    }

    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof t) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    public final void f(C0236d c0236d, u uVar, n1.n nVar) {
        int i7;
        this.f15728r = c0236d;
        this.f15729s = uVar;
        EnumC1406E enumC1406E = uVar.f15724c;
        boolean zC = n.c(this.f15730t);
        int iOrdinal = enumC1406E.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zC = true;
            } else {
                if (iOrdinal != 2) {
                    throw new W();
                }
                zC = false;
            }
        }
        Window window = getWindow();
        AbstractC1209k.c(window);
        window.setFlags(zC ? 8192 : -8193, 8192);
        int iOrdinal2 = nVar.ordinal();
        if (iOrdinal2 == 0) {
            i7 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new W();
            }
            i7 = 1;
        }
        t tVar = this.f15731u;
        tVar.setLayoutDirection(i7);
        boolean z6 = tVar.f15716A;
        boolean z7 = uVar.f15726e;
        boolean z8 = uVar.f15725d;
        boolean z9 = (z6 && z8 == tVar.f15720y && z7 == tVar.f15721z) ? false : true;
        tVar.f15720y = z8;
        tVar.f15721z = z7;
        if (z9) {
            Window window2 = tVar.f15718w;
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i8 = z8 ? -2 : -1;
            if (i8 != attributes.width || !tVar.f15716A) {
                window2.setLayout(i8, -2);
                tVar.f15716A = true;
            }
        }
        setCanceledOnTouchOutside(uVar.f15723b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z7 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (!this.f15729s.f15722a || !keyEvent.isTracking() || keyEvent.isCanceled() || i7 != 111) {
            return super.onKeyUp(i7, keyEvent);
        }
        this.f15728r.a();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x008b  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            r1.u r1 = r9.f15729s
            boolean r1 = r1.f15723b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L8b
            r1.t r1 = r9.f15731u
            r1.getClass()
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L39
            goto L6e
        L39:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = o5.AbstractC1267a.H(r5)
            if (r7 > r5) goto L6e
            if (r5 > r6) goto L6e
            float r5 = r10.getY()
            int r5 = o5.AbstractC1267a.H(r5)
            if (r8 > r5) goto L6e
            if (r5 > r1) goto L6e
            goto L8b
        L6e:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L88
            if (r10 == r4) goto L7c
            if (r10 == r2) goto L79
            goto L95
        L79:
            r9.f15732v = r3
            return r0
        L7c:
            boolean r10 = r9.f15732v
            if (r10 == 0) goto L95
            K0.d r10 = r9.f15728r
            r10.a()
            r9.f15732v = r3
            return r4
        L88:
            r9.f15732v = r4
            return r4
        L8b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L96
            if (r10 == r4) goto L96
            if (r10 == r2) goto L96
        L95:
            return r0
        L96:
            r9.f15732v = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.w.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
