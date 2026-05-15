package q;

import G1.C0137d;
import G1.C0139f;
import G1.InterfaceC0136c;
import G1.InterfaceC0148o;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import yos.music.player.R;

/* JADX INFO: renamed from: q.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1340u extends EditText implements InterfaceC0148o, K1.p {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J2.r f15403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final W f15404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1299A f15405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final K1.o f15406r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1299A f15407s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public C1338t f15408t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1340u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        Q0.a(context);
        P0.a(this, getContext());
        J2.r rVar = new J2.r(this);
        this.f15403o = rVar;
        rVar.d(attributeSet, R.attr.editTextStyle);
        W w7 = new W(this);
        this.f15404p = w7;
        w7.f(attributeSet, R.attr.editTextStyle);
        w7.b();
        C1299A c1299a = new C1299A();
        c1299a.f15123b = this;
        this.f15405q = c1299a;
        this.f15406r = new K1.o();
        C1299A c1299a2 = new C1299A(this);
        this.f15407s = c1299a2;
        c1299a2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerA = c1299a2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private C1338t getSuperCaller() {
        if (this.f15408t == null) {
            this.f15408t = new C1338t(this);
        }
        return this.f15408t;
    }

    @Override // G1.InterfaceC0148o
    public final C0139f a(C0139f c0139f) {
        this.f15406r.getClass();
        return K1.o.a(this, c0139f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        J2.r rVar = this.f15403o;
        if (rVar != null) {
            rVar.a();
        }
        W w7 = this.f15404p;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return android.support.v4.media.session.b.N(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        J2.r rVar = this.f15403o;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        J2.r rVar = this.f15403o;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f15404p.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f15404p.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1299A c1299a;
        if (Build.VERSION.SDK_INT >= 28 || (c1299a = this.f15405q) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c1299a.f15124c;
        return textClassifier == null ? Q.a((TextView) c1299a.f15123b) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[PHI: r1
  0x0060: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:33:0x0073, B:25:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            q.W r1 = r7.f15404p
            r1.getClass()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L18
            if (r0 == 0) goto L18
            java.lang.CharSequence r3 = r7.getText()
            I1.d.a(r8, r3)
        L18:
            j5.AbstractC1107a.u(r0, r8, r7)
            if (r0 == 0) goto L80
            if (r1 > r2) goto L80
            java.lang.String[] r2 = G1.I.d(r7)
            if (r2 == 0) goto L80
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L31
            I1.a.a(r8, r2)
            goto L46
        L31:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L3c
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L3c:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L46:
            A2.I r2 = new A2.I
            r6 = 10
            r2.<init>(r6, r7)
            if (r1 < r5) goto L56
            I1.e r1 = new I1.e
            r1.<init>(r0, r2)
        L54:
            r0 = r1
            goto L80
        L56:
            java.lang.String[] r6 = I1.d.f3444a
            if (r1 < r5) goto L62
            java.lang.String[] r1 = I1.a.b(r8)
            if (r1 == 0) goto L76
        L60:
            r6 = r1
            goto L76
        L62:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L67
            goto L76
        L67:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L73
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L73:
            if (r1 == 0) goto L76
            goto L60
        L76:
            int r1 = r6.length
            if (r1 != 0) goto L7a
            goto L80
        L7a:
            I1.f r1 = new I1.f
            r1.<init>(r0, r2)
            goto L54
        L80:
            q.A r1 = r7.f15407s
            V1.c r8 = r1.c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C1340u.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30 || i7 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i7 = Build.VERSION.SDK_INT;
        boolean zA = false;
        if (i7 < 31 && i7 >= 24 && dragEvent.getLocalState() == null && G1.I.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = D.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i7) {
        InterfaceC0136c bVar;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 31 || G1.I.d(this) == null || !(i7 == 16908322 || i7 == 16908337)) {
            return super.onTextContextMenuItem(i7);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i8 >= 31) {
                bVar = new A.b(primaryClip, 1);
            } else {
                C0137d c0137d = new C0137d(0);
                c0137d.f2693p = primaryClip;
                c0137d.f2694q = 1;
                bVar = c0137d;
            }
            bVar.i(i7 == 16908322 ? 0 : 1);
            G1.I.f(this, bVar.a());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        J2.r rVar = this.f15403o;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        J2.r rVar = this.f15403o;
        if (rVar != null) {
            rVar.f(i7);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15404p;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        W w7 = this.f15404p;
        if (w7 != null) {
            w7.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.b.P(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f15407s.d(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f15407s.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        J2.r rVar = this.f15403o;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        J2.r rVar = this.f15403o;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        W w7 = this.f15404p;
        w7.k(colorStateList);
        w7.b();
    }

    @Override // K1.p
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        W w7 = this.f15404p;
        w7.l(mode);
        w7.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i7) {
        super.setTextAppearance(context, i7);
        W w7 = this.f15404p;
        if (w7 != null) {
            w7.g(context, i7);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1299A c1299a;
        if (Build.VERSION.SDK_INT >= 28 || (c1299a = this.f15405q) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1299a.f15124c = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }
}
