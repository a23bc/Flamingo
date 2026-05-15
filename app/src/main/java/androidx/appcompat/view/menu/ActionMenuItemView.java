package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import j.AbstractC1089a;
import j5.AbstractC1109c;
import p.AbstractC1274c;
import p.C1273b;
import p.k;
import p.l;
import p.n;
import p.y;
import q.C1302a0;
import q.InterfaceC1323l;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C1302a0 implements y, View.OnClickListener, InterfaceC1323l {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public AbstractC1274c f8941A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f8942B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f8943C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final int f8944D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f8945E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f8946F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n f8947v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f8948w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Drawable f8949x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public k f8950y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C1273b f8951z;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f8942B = h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1089a.f13596c, 0, 0);
        this.f8944D = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f8946F = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f8945E = -1;
        setSaveEnabled(false);
    }

    @Override // q.InterfaceC1323l
    public final boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.y
    public final void b(n nVar) {
        this.f8947v = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f14843a);
        setVisibility(nVar.isVisible() ? 0 : 8);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f8951z == null) {
            this.f8951z = new C1273b(this);
        }
    }

    @Override // q.InterfaceC1323l
    public final boolean c() {
        return !TextUtils.isEmpty(getText()) && this.f8947v.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p.y
    public n getItemData() {
        return this.f8947v;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (i7 < 480) {
            return (i7 >= 640 && i8 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void i() {
        boolean z6 = true;
        boolean z7 = !TextUtils.isEmpty(this.f8948w);
        if (this.f8949x != null && ((this.f8947v.f14865y & 4) != 4 || (!this.f8942B && !this.f8943C))) {
            z6 = false;
        }
        boolean z8 = z7 & z6;
        setText(z8 ? this.f8948w : null);
        CharSequence charSequence = this.f8947v.f14857q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z8 ? null : this.f8947v.f14847e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f8947v.f14858r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC1109c.y(this, z8 ? null : this.f8947v.f14847e);
        } else {
            AbstractC1109c.y(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.f8950y;
        if (kVar != null) {
            kVar.b(this.f8947v);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f8942B = h();
        i();
    }

    @Override // q.C1302a0, android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        boolean zIsEmpty = TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i9 = this.f8945E) >= 0) {
            super.setPadding(i9, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i7, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int measuredWidth = getMeasuredWidth();
        int i10 = this.f8944D;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i10) : i10;
        if (mode != 1073741824 && i10 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i8);
        }
        if (!zIsEmpty || this.f8949x == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f8949x.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1273b c1273b;
        if (this.f8947v.hasSubMenu() && (c1273b = this.f8951z) != null && c1273b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f8943C != z6) {
            this.f8943C = z6;
            n nVar = this.f8947v;
            if (nVar != null) {
                l lVar = nVar.f14854n;
                lVar.f14824k = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f8949x = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i7 = this.f8946F;
            if (intrinsicWidth > i7) {
                intrinsicHeight = (int) (intrinsicHeight * (i7 / intrinsicWidth));
                intrinsicWidth = i7;
            }
            if (intrinsicHeight > i7) {
                intrinsicWidth = (int) (intrinsicWidth * (i7 / intrinsicHeight));
            } else {
                i7 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i7);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(k kVar) {
        this.f8950y = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i7, int i8, int i9, int i10) {
        this.f8945E = i7;
        super.setPadding(i7, i8, i9, i10);
    }

    public void setPopupCallback(AbstractC1274c abstractC1274c) {
        this.f8941A = abstractC1274c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f8948w = charSequence;
        i();
    }
}
