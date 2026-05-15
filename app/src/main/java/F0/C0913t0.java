package f0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;
import j.AbstractC1089a;
import q.AbstractC1322k0;

/* JADX INFO: renamed from: f0.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0913t0 {

    /* JADX INFO: renamed from: a */
    public boolean f11917a;

    /* JADX INFO: renamed from: b */
    public boolean f11918b;

    /* JADX INFO: renamed from: c */
    public boolean f11919c;

    /* JADX INFO: renamed from: d */
    public final Object f11920d;

    /* JADX INFO: renamed from: e */
    public Object f11921e;

    /* JADX INFO: renamed from: f */
    public Object f11922f;

    public /* synthetic */ C0913t0(TextView textView) {
        this.f11921e = null;
        this.f11922f = null;
        this.f11917a = false;
        this.f11918b = false;
        this.f11920d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f11920d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f11917a || this.f11918b) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f11917a) {
                    drawableMutate.setTintList((ColorStateList) this.f11921e);
                }
                if (this.f11918b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f11922f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        q.r rVar = (q.r) this.f11920d;
        Drawable checkMarkDrawable = rVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f11917a || this.f11918b) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f11917a) {
                    drawableMutate.setTintList((ColorStateList) this.f11921e);
                }
                if (this.f11918b) {
                    drawableMutate.setTintMode((PorterDuff.Mode) this.f11922f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(rVar.getDrawableState());
                }
                rVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public Object c() {
        if (this.f11917a) {
            return null;
        }
        Object obj = this.f11922f;
        if (obj != null) {
            return obj;
        }
        AbstractC0914u.d("Unexpected form of a provided value");
        throw new A2.W();
    }

    public void d(AttributeSet attributeSet, int i7) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f11920d;
        Context context = compoundButton.getContext();
        int[] iArr = AbstractC1089a.f13604m;
        q.S0 s0K = q.S0.k(context, attributeSet, iArr, i7);
        TypedArray typedArray = (TypedArray) s0K.f15226q;
        G1.I.g(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) s0K.f15226q, i7);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(i6.g.v(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(i6.g.v(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(i6.g.v(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(s0K.f(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(AbstractC1322k0.b(typedArray.getInt(3, -1), null));
            }
            s0K.l();
        } catch (Throwable th) {
            s0K.l();
            throw th;
        }
    }

    public C0913t0(AbstractC0911s0 abstractC0911s0, Object obj, boolean z6, Q0 q02, boolean z7) {
        this.f11920d = abstractC0911s0;
        this.f11917a = z6;
        this.f11921e = q02;
        this.f11918b = z7;
        this.f11922f = obj;
        this.f11919c = true;
    }
}
