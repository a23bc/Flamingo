package q;

import L2.C0247a;
import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import j.AbstractC1089a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import z1.AbstractC2079b;
import z1.InterfaceC2078a;

/* JADX INFO: renamed from: q.A */
/* JADX INFO: loaded from: classes.dex */
public class C1299A {

    /* JADX INFO: renamed from: d */
    public static final int[] f15121d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15122a = 2;

    /* JADX INFO: renamed from: b */
    public View f15123b;

    /* JADX INFO: renamed from: c */
    public Object f15124c;

    public /* synthetic */ C1299A() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((V1.a) ((C0247a) this.f15124c).f4105p).getClass();
        if (keyListener instanceof V1.f) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new V1.f(keyListener);
    }

    public void b(AttributeSet attributeSet, int i7) {
        switch (this.f15122a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f15123b;
                S0 s0K = S0.k(absSeekBar.getContext(), attributeSet, f15121d, i7);
                Drawable drawableH = s0K.h(0);
                if (drawableH != null) {
                    if (drawableH instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) drawableH;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i8 = 0; i8 < numberOfFrames; i8++) {
                            Drawable drawableE = e(animationDrawable.getFrame(i8), true);
                            drawableE.setLevel(10000);
                            animationDrawable2.addFrame(drawableE, animationDrawable.getDuration(i8));
                        }
                        animationDrawable2.setLevel(10000);
                        drawableH = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(drawableH);
                }
                Drawable drawableH2 = s0K.h(1);
                if (drawableH2 != null) {
                    absSeekBar.setProgressDrawable(e(drawableH2, false));
                }
                s0K.l();
                return;
            default:
                TypedArray typedArrayObtainStyledAttributes = ((EditText) this.f15123b).getContext().obtainStyledAttributes(attributeSet, AbstractC1089a.f13601i, i7, 0);
                try {
                    boolean z6 = true;
                    if (typedArrayObtainStyledAttributes.hasValue(14)) {
                        z6 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                        break;
                    }
                    typedArrayObtainStyledAttributes.recycle();
                    d(z6);
                    return;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public V1.c c(InputConnection inputConnection, EditorInfo editorInfo) {
        C0247a c0247a = (C0247a) this.f15124c;
        if (inputConnection == null) {
            c0247a.getClass();
            inputConnection = null;
        } else {
            V1.a aVar = (V1.a) c0247a.f4105p;
            aVar.getClass();
            if (!(inputConnection instanceof V1.c)) {
                inputConnection = new V1.c((EditText) aVar.f7389o, inputConnection, editorInfo);
            }
        }
        return (V1.c) inputConnection;
    }

    public void d(boolean z6) {
        V1.j jVar = (V1.j) ((V1.a) ((C0247a) this.f15124c).f4105p).f7390p;
        if (jVar.f7409q != z6) {
            if (jVar.f7408p != null) {
                T1.j jVarA = T1.j.a();
                V1.i iVar = jVar.f7408p;
                jVarA.getClass();
                N5.d.r(iVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = jVarA.f6860a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    jVarA.f6861b.remove(iVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            jVar.f7409q = z6;
            if (z6) {
                V1.j.a(jVar.f7407o, T1.j.a().c());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable e(Drawable drawable, boolean z6) {
        if (drawable instanceof InterfaceC2078a) {
            ((AbstractC2079b) ((InterfaceC2078a) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i7 = 0; i7 < numberOfLayers; i7++) {
                    int id = layerDrawable.getId(i7);
                    drawableArr[i7] = e(layerDrawable.getDrawable(i7), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i8 = 0; i8 < numberOfLayers; i8++) {
                    layerDrawable2.setId(i8, layerDrawable.getId(i8));
                    layerDrawable2.setLayerGravity(i8, layerDrawable.getLayerGravity(i8));
                    layerDrawable2.setLayerWidth(i8, layerDrawable.getLayerWidth(i8));
                    layerDrawable2.setLayerHeight(i8, layerDrawable.getLayerHeight(i8));
                    layerDrawable2.setLayerInsetLeft(i8, layerDrawable.getLayerInsetLeft(i8));
                    layerDrawable2.setLayerInsetRight(i8, layerDrawable.getLayerInsetRight(i8));
                    layerDrawable2.setLayerInsetTop(i8, layerDrawable.getLayerInsetTop(i8));
                    layerDrawable2.setLayerInsetBottom(i8, layerDrawable.getLayerInsetBottom(i8));
                    layerDrawable2.setLayerInsetStart(i8, layerDrawable.getLayerInsetStart(i8));
                    layerDrawable2.setLayerInsetEnd(i8, layerDrawable.getLayerInsetEnd(i8));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.f15124c) == null) {
                    this.f15124c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z6 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public C1299A(AbsSeekBar absSeekBar) {
        this.f15123b = absSeekBar;
    }

    public C1299A(EditText editText) {
        this.f15123b = editText;
        this.f15124c = new C0247a(editText);
    }
}
