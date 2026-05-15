package L3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import j5.AbstractC1110d;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t.C1450e;

/* JADX INFO: loaded from: classes.dex */
public final class q extends h {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final PorterDuff.Mode f4307x = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public o f4308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PorterDuffColorFilter f4309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorFilter f4310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4312t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final float[] f4313u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Matrix f4314v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f4315w;

    public q() {
        this.f4312t = true;
        this.f4313u = new float[9];
        this.f4314v = new Matrix();
        this.f4315w = new Rect();
        o oVar = new o();
        oVar.f4298c = null;
        oVar.f4299d = f4307x;
        oVar.f4297b = new n();
        this.f4308p = oVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4259o;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f4315w;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4310r;
        if (colorFilter == null) {
            colorFilter = this.f4309q;
        }
        Matrix matrix = this.f4314v;
        canvas.getMatrix(matrix);
        float[] fArr = this.f4313u;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        o oVar = this.f4308p;
        Bitmap bitmap = oVar.f4301f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != oVar.f4301f.getHeight()) {
            oVar.f4301f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            oVar.f4305k = true;
        }
        if (this.f4312t) {
            o oVar2 = this.f4308p;
            if (oVar2.f4305k || oVar2.f4302g != oVar2.f4298c || oVar2.h != oVar2.f4299d || oVar2.f4304j != oVar2.f4300e || oVar2.f4303i != oVar2.f4297b.getRootAlpha()) {
                o oVar3 = this.f4308p;
                oVar3.f4301f.eraseColor(0);
                Canvas canvas2 = new Canvas(oVar3.f4301f);
                n nVar = oVar3.f4297b;
                nVar.a(nVar.f4289g, n.f4282p, canvas2, iMin, iMin2);
                o oVar4 = this.f4308p;
                oVar4.f4302g = oVar4.f4298c;
                oVar4.h = oVar4.f4299d;
                oVar4.f4303i = oVar4.f4297b.getRootAlpha();
                oVar4.f4304j = oVar4.f4300e;
                oVar4.f4305k = false;
            }
        } else {
            o oVar5 = this.f4308p;
            oVar5.f4301f.eraseColor(0);
            Canvas canvas3 = new Canvas(oVar5.f4301f);
            n nVar2 = oVar5.f4297b;
            nVar2.a(nVar2.f4289g, n.f4282p, canvas3, iMin, iMin2);
        }
        o oVar6 = this.f4308p;
        if (oVar6.f4297b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (oVar6.l == null) {
                Paint paint2 = new Paint();
                oVar6.l = paint2;
                paint2.setFilterBitmap(true);
            }
            oVar6.l.setAlpha(oVar6.f4297b.getRootAlpha());
            oVar6.l.setColorFilter(colorFilter);
            paint = oVar6.l;
        }
        canvas.drawBitmap(oVar6.f4301f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.getAlpha() : this.f4308p.f4297b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4308p.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.getColorFilter() : this.f4310r;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4259o != null && Build.VERSION.SDK_INT >= 24) {
            return new p(this.f4259o.getConstantState());
        }
        this.f4308p.f4296a = getChangingConfigurations();
        return this.f4308p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4308p.f4297b.f4290i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4308p.f4297b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.isAutoMirrored() : this.f4308p.f4300e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        o oVar = this.f4308p;
        if (oVar == null) {
            return false;
        }
        n nVar = oVar.f4297b;
        if (nVar.f4294n == null) {
            nVar.f4294n = Boolean.valueOf(nVar.f4289g.a());
        }
        if (nVar.f4294n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f4308p.f4298c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4311s && super.mutate() == this) {
            o oVar = this.f4308p;
            o oVar2 = new o();
            oVar2.f4298c = null;
            oVar2.f4299d = f4307x;
            if (oVar != null) {
                oVar2.f4296a = oVar.f4296a;
                n nVar = new n(oVar.f4297b);
                oVar2.f4297b = nVar;
                if (oVar.f4297b.f4287e != null) {
                    nVar.f4287e = new Paint(oVar.f4297b.f4287e);
                }
                if (oVar.f4297b.f4286d != null) {
                    oVar2.f4297b.f4286d = new Paint(oVar.f4297b.f4286d);
                }
                oVar2.f4298c = oVar.f4298c;
                oVar2.f4299d = oVar.f4299d;
                oVar2.f4300e = oVar.f4300e;
            }
            this.f4308p = oVar2;
            this.f4311s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z6;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f4308p;
        ColorStateList colorStateList = oVar.f4298c;
        if (colorStateList == null || (mode = oVar.f4299d) == null) {
            z6 = false;
        } else {
            this.f4309q = a(colorStateList, mode);
            invalidateSelf();
            z6 = true;
        }
        n nVar = oVar.f4297b;
        if (nVar.f4294n == null) {
            nVar.f4294n = Boolean.valueOf(nVar.f4289g.a());
        }
        if (nVar.f4294n.booleanValue()) {
            boolean zB = oVar.f4297b.f4289g.b(iArr);
            oVar.f4305k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f4308p.f4297b.getRootAlpha() != i7) {
            this.f4308p.f4297b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.setAutoMirrored(z6);
        } else {
            this.f4308p.f4300e = z6;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4310r = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            i6.g.B(drawable, i7);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        o oVar = this.f4308p;
        if (oVar.f4298c != colorStateList) {
            oVar.f4298c = colorStateList;
            this.f4309q = a(colorStateList, oVar.f4299d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        o oVar = this.f4308p;
        if (oVar.f4299d != mode) {
            oVar.f4299d = mode;
            this.f4309q = a(oVar.f4298c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        Drawable drawable = this.f4259o;
        return drawable != null ? drawable.setVisible(z6, z7) : super.setVisible(z6, z7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        n nVar;
        boolean z6;
        int i7;
        int i8;
        int i9;
        char c7;
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Resources resources2 = resources;
        Drawable drawable = this.f4259o;
        if (drawable != null) {
            drawable.inflate(resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f4308p;
        oVar.f4297b = new n();
        TypedArray typedArrayG = x1.b.g(resources2, theme, attributeSet, a.f4237a);
        o oVar2 = this.f4308p;
        n nVar2 = oVar2.f4297b;
        int i11 = !x1.b.d(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = 3;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        oVar2.f4299d = mode;
        ColorStateList colorStateListA = x1.b.a(typedArrayG, xmlPullParser, theme);
        if (colorStateListA != null) {
            oVar2.f4298c = colorStateListA;
        }
        boolean z7 = oVar2.f4300e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z7 = typedArrayG.getBoolean(5, z7);
        }
        oVar2.f4300e = z7;
        float f7 = nVar2.f4291j;
        boolean z8 = false;
        int i13 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f7 = typedArrayG.getFloat(7, f7);
        }
        nVar2.f4291j = f7;
        float f8 = nVar2.f4292k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f8 = typedArrayG.getFloat(8, f8);
        }
        nVar2.f4292k = f8;
        if (nVar2.f4291j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f8 > 0.0f) {
            nVar2.h = typedArrayG.getDimension(3, nVar2.h);
            int i14 = 2;
            float dimension = typedArrayG.getDimension(2, nVar2.f4290i);
            nVar2.f4290i = dimension;
            if (nVar2.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = nVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayG.getFloat(4, alpha);
                }
                nVar2.setAlpha(alpha);
                String string = typedArrayG.getString(0);
                if (string != null) {
                    nVar2.f4293m = string;
                    nVar2.f4295o.put(string, nVar2);
                }
                typedArrayG.recycle();
                oVar.f4296a = getChangingConfigurations();
                oVar.f4305k = true;
                o oVar3 = this.f4308p;
                n nVar3 = oVar3.f4297b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(nVar3.f4289g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z9 = true;
                while (eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != i12)) {
                    if (eventType == i14) {
                        String name = xmlPullParser.getName();
                        k kVar = (k) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        i7 = depth;
                        C1450e c1450e = nVar3.f4295o;
                        if (zEquals) {
                            j jVar = new j();
                            jVar.f4261e = 0.0f;
                            jVar.f4263g = 1.0f;
                            jVar.h = 1.0f;
                            nVar = nVar3;
                            jVar.f4264i = 0.0f;
                            jVar.f4265j = 1.0f;
                            jVar.f4266k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            jVar.l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            jVar.f4267m = join2;
                            jVar.f4268n = 4.0f;
                            TypedArray typedArrayG2 = x1.b.g(resources2, theme, attributeSet, a.f4239c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayG2.getString(0);
                                if (string2 != null) {
                                    jVar.f4280b = string2;
                                }
                                String string3 = typedArrayG2.getString(2);
                                if (string3 != null) {
                                    jVar.f4279a = AbstractC1110d.u(string3);
                                }
                                jVar.f4262f = x1.b.b(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                                float f9 = jVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f9 = typedArrayG2.getFloat(12, f9);
                                }
                                jVar.h = f9;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayG2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = jVar.l;
                                if (i15 == 0) {
                                    cap = cap2;
                                } else if (i15 != 1) {
                                    cap = i15 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                jVar.l = cap;
                                int i16 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayG2.getInt(9, -1) : -1;
                                Paint.Join join3 = jVar.f4267m;
                                if (i16 == 0) {
                                    join = join2;
                                } else if (i16 != 1) {
                                    join = i16 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                jVar.f4267m = join;
                                float f10 = jVar.f4268n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f10 = typedArrayG2.getFloat(10, f10);
                                }
                                jVar.f4268n = f10;
                                jVar.f4260d = x1.b.b(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                                float f11 = jVar.f4263g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f11 = typedArrayG2.getFloat(11, f11);
                                }
                                jVar.f4263g = f11;
                                float f12 = jVar.f4261e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f12 = typedArrayG2.getFloat(4, f12);
                                }
                                jVar.f4261e = f12;
                                float f13 = jVar.f4265j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f13 = typedArrayG2.getFloat(6, f13);
                                }
                                jVar.f4265j = f13;
                                float f14 = jVar.f4266k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f14 = typedArrayG2.getFloat(7, f14);
                                }
                                jVar.f4266k = f14;
                                float f15 = jVar.f4264i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f15 = typedArrayG2.getFloat(5, f15);
                                }
                                jVar.f4264i = f15;
                                int i17 = jVar.f4281c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i17 = typedArrayG2.getInt(13, i17);
                                }
                                jVar.f4281c = i17;
                            }
                            typedArrayG2.recycle();
                            kVar.f4270b.add(jVar);
                            if (jVar.getPathName() != null) {
                                c1450e.put(jVar.getPathName(), jVar);
                            }
                            oVar3.f4296a = oVar3.f4296a;
                            z6 = false;
                            c7 = 5;
                            i10 = 1;
                            z9 = false;
                        } else {
                            nVar = nVar3;
                            if ("clip-path".equals(name)) {
                                i iVar = new i();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayG3 = x1.b.g(resources2, theme, attributeSet, a.f4240d);
                                    String string4 = typedArrayG3.getString(0);
                                    if (string4 != null) {
                                        iVar.f4280b = string4;
                                    }
                                    String string5 = typedArrayG3.getString(1);
                                    if (string5 != null) {
                                        iVar.f4279a = AbstractC1110d.u(string5);
                                    }
                                    iVar.f4281c = !x1.b.d(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                                    typedArrayG3.recycle();
                                }
                                kVar.f4270b.add(iVar);
                                if (iVar.getPathName() != null) {
                                    c1450e.put(iVar.getPathName(), iVar);
                                }
                                oVar3.f4296a = oVar3.f4296a;
                            } else if ("group".equals(name)) {
                                k kVar2 = new k();
                                TypedArray typedArrayG4 = x1.b.g(resources2, theme, attributeSet, a.f4238b);
                                float f16 = kVar2.f4271c;
                                if (x1.b.d(xmlPullParser, "rotation")) {
                                    c7 = 5;
                                    f16 = typedArrayG4.getFloat(5, f16);
                                } else {
                                    c7 = 5;
                                }
                                kVar2.f4271c = f16;
                                i10 = 1;
                                kVar2.f4272d = typedArrayG4.getFloat(1, kVar2.f4272d);
                                kVar2.f4273e = typedArrayG4.getFloat(2, kVar2.f4273e);
                                float f17 = kVar2.f4274f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f17 = typedArrayG4.getFloat(3, f17);
                                }
                                kVar2.f4274f = f17;
                                float f18 = kVar2.f4275g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f18 = typedArrayG4.getFloat(4, f18);
                                }
                                kVar2.f4275g = f18;
                                float f19 = kVar2.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f19 = typedArrayG4.getFloat(6, f19);
                                }
                                kVar2.h = f19;
                                float f20 = kVar2.f4276i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f20 = typedArrayG4.getFloat(7, f20);
                                }
                                kVar2.f4276i = f20;
                                z6 = false;
                                String string6 = typedArrayG4.getString(0);
                                if (string6 != null) {
                                    kVar2.f4278k = string6;
                                }
                                kVar2.c();
                                typedArrayG4.recycle();
                                kVar.f4270b.add(kVar2);
                                arrayDeque.push(kVar2);
                                if (kVar2.getGroupName() != null) {
                                    c1450e.put(kVar2.getGroupName(), kVar2);
                                }
                                oVar3.f4296a = oVar3.f4296a;
                            }
                            z6 = false;
                            c7 = 5;
                            i10 = 1;
                        }
                        i9 = i10;
                        i8 = 3;
                    } else {
                        nVar = nVar3;
                        z6 = z8;
                        i7 = depth;
                        i8 = i12;
                        i9 = 1;
                        if (eventType == i8 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    z8 = z6;
                    i12 = i8;
                    i13 = i9;
                    nVar3 = nVar;
                    depth = i7;
                    i14 = 2;
                    resources2 = resources;
                }
                if (!z9) {
                    this.f4309q = a(oVar.f4298c, oVar.f4299d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public q(o oVar) {
        this.f4312t = true;
        this.f4313u = new float[9];
        this.f4314v = new Matrix();
        this.f4315w = new Rect();
        this.f4308p = oVar;
        this.f4309q = a(oVar.f4298c, oVar.f4299d);
    }
}
