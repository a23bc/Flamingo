package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: q.x */
/* JADX INFO: loaded from: classes.dex */
public class C1346x extends ImageView {

    /* JADX INFO: renamed from: o */
    public final J2.r f15430o;

    /* JADX INFO: renamed from: p */
    public final D4.i f15431p;

    /* JADX INFO: renamed from: q */
    public boolean f15432q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1346x(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Q0.a(context);
        this.f15432q = false;
        P0.a(this, getContext());
        J2.r rVar = new J2.r(this);
        this.f15430o = rVar;
        rVar.d(attributeSet, i7);
        D4.i iVar = new D4.i(this);
        this.f15431p = iVar;
        iVar.w(attributeSet, i7);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        J2.r rVar = this.f15430o;
        if (rVar != null) {
            rVar.a();
        }
        D4.i iVar = this.f15431p;
        if (iVar != null) {
            iVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        J2.r rVar = this.f15430o;
        if (rVar != null) {
            return rVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        J2.r rVar = this.f15430o;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        F5.h hVar;
        D4.i iVar = this.f15431p;
        if (iVar == null || (hVar = (F5.h) iVar.f1584r) == null) {
            return null;
        }
        return (ColorStateList) hVar.f2360c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        F5.h hVar;
        D4.i iVar = this.f15431p;
        if (iVar == null || (hVar = (F5.h) iVar.f1584r) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f2361d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f15431p.f1583q).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        J2.r rVar = this.f15430o;
        if (rVar != null) {
            rVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i7) {
        super.setBackgroundResource(i7);
        J2.r rVar = this.f15430o;
        if (rVar != null) {
            rVar.f(i7);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        D4.i iVar = this.f15431p;
        if (iVar != null) {
            iVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        D4.i iVar = this.f15431p;
        if (iVar != null && drawable != null && !this.f15432q) {
            iVar.f1582p = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (iVar != null) {
            iVar.c();
            if (this.f15432q) {
                return;
            }
            ImageView imageView = (ImageView) iVar.f1583q;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(iVar.f1582p);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i7) {
        super.setImageLevel(i7);
        this.f15432q = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i7) {
        D4.i iVar = this.f15431p;
        if (iVar != null) {
            ImageView imageView = (ImageView) iVar.f1583q;
            if (i7 != 0) {
                Drawable drawableV = i6.g.v(imageView.getContext(), i7);
                if (drawableV != null) {
                    AbstractC1322k0.a(drawableV);
                }
                imageView.setImageDrawable(drawableV);
            } else {
                imageView.setImageDrawable(null);
            }
            iVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        D4.i iVar = this.f15431p;
        if (iVar != null) {
            iVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        J2.r rVar = this.f15430o;
        if (rVar != null) {
            rVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        J2.r rVar = this.f15430o;
        if (rVar != null) {
            rVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        D4.i iVar = this.f15431p;
        if (iVar != null) {
            if (((F5.h) iVar.f1584r) == null) {
                iVar.f1584r = new F5.h();
            }
            F5.h hVar = (F5.h) iVar.f1584r;
            hVar.f2360c = colorStateList;
            hVar.f2359b = true;
            iVar.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        D4.i iVar = this.f15431p;
        if (iVar != null) {
            if (((F5.h) iVar.f1584r) == null) {
                iVar.f1584r = new F5.h();
            }
            F5.h hVar = (F5.h) iVar.f1584r;
            hVar.f2361d = mode;
            hVar.f2358a = true;
            iVar.c();
        }
    }
}
