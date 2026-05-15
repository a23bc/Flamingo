package L3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import t.C1450e;
import y1.C1995d;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: p */
    public static final Matrix f4282p = new Matrix();

    /* JADX INFO: renamed from: a */
    public final Path f4283a;

    /* JADX INFO: renamed from: b */
    public final Path f4284b;

    /* JADX INFO: renamed from: c */
    public final Matrix f4285c;

    /* JADX INFO: renamed from: d */
    public Paint f4286d;

    /* JADX INFO: renamed from: e */
    public Paint f4287e;

    /* JADX INFO: renamed from: f */
    public PathMeasure f4288f;

    /* JADX INFO: renamed from: g */
    public final k f4289g;
    public float h;

    /* JADX INFO: renamed from: i */
    public float f4290i;

    /* JADX INFO: renamed from: j */
    public float f4291j;

    /* JADX INFO: renamed from: k */
    public float f4292k;
    public int l;

    /* JADX INFO: renamed from: m */
    public String f4293m;

    /* JADX INFO: renamed from: n */
    public Boolean f4294n;

    /* JADX INFO: renamed from: o */
    public final C1450e f4295o;

    public n() {
        this.f4285c = new Matrix();
        this.h = 0.0f;
        this.f4290i = 0.0f;
        this.f4291j = 0.0f;
        this.f4292k = 0.0f;
        this.l = 255;
        this.f4293m = null;
        this.f4294n = null;
        this.f4295o = new C1450e(0);
        this.f4289g = new k();
        this.f4283a = new Path();
        this.f4284b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(k kVar, Matrix matrix, Canvas canvas, int i7, int i8) {
        char c7;
        float f7;
        float f8;
        int i9;
        k kVar2 = kVar;
        char c8 = 1;
        kVar2.f4269a.set(matrix);
        Matrix matrix2 = kVar2.f4269a;
        matrix2.preConcat(kVar2.f4277j);
        canvas.save();
        char c9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = kVar2.f4270b;
            if (i10 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            l lVar = (l) arrayList.get(i10);
            if (lVar instanceof k) {
                a((k) lVar, matrix2, canvas, i7, i8);
            } else if (lVar instanceof m) {
                m mVar = (m) lVar;
                float f9 = i7 / this.f4291j;
                float f10 = i8 / this.f4292k;
                float fMin = Math.min(f9, f10);
                Matrix matrix3 = this.f4285c;
                matrix3.set(matrix2);
                matrix3.postScale(f9, f10);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c9], fArr[c8]);
                boolean z6 = c8;
                boolean z7 = c9;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f11 = (fArr[z7 ? 1 : 0] * fArr[3]) - (fArr[z6 ? 1 : 0] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f11) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    mVar.getClass();
                    Path path = this.f4283a;
                    path.reset();
                    C1995d[] c1995dArr = mVar.f4279a;
                    if (c1995dArr != null) {
                        C1995d.b(c1995dArr, path);
                    }
                    Path path2 = this.f4284b;
                    path2.reset();
                    if (mVar instanceof i) {
                        path2.setFillType(mVar.f4281c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        j jVar = (j) mVar;
                        float f12 = jVar.f4264i;
                        if (f12 != 0.0f || jVar.f4265j != 1.0f) {
                            float f13 = jVar.f4266k;
                            float f14 = (f12 + f13) % 1.0f;
                            float f15 = (jVar.f4265j + f13) % 1.0f;
                            if (this.f4288f == null) {
                                this.f4288f = new PathMeasure();
                            }
                            this.f4288f.setPath(path, z7);
                            float length = this.f4288f.getLength();
                            float f16 = f14 * length;
                            float f17 = f15 * length;
                            path.reset();
                            if (f16 > f17) {
                                this.f4288f.getSegment(f16, length, path, z6);
                                f7 = 0.0f;
                                this.f4288f.getSegment(0.0f, f17, path, z6);
                            } else {
                                f7 = 0.0f;
                                this.f4288f.getSegment(f16, f17, path, z6);
                            }
                            path.rLineTo(f7, f7);
                        }
                        path2.addPath(path, matrix3);
                        D4.i iVar = jVar.f4262f;
                        if ((((Shader) iVar.f1583q) == null && iVar.f1582p == 0) ? false : true) {
                            if (this.f4287e == null) {
                                i9 = 16777215;
                                Paint paint = new Paint(1);
                                this.f4287e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i9 = 16777215;
                            }
                            Paint paint2 = this.f4287e;
                            Shader shader = (Shader) iVar.f1583q;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(jVar.h * 255.0f));
                                f8 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i11 = iVar.f1582p;
                                float f18 = jVar.h;
                                PorterDuff.Mode mode = q.f4307x;
                                f8 = 255.0f;
                                paint2.setColor((i11 & i9) | (((int) (Color.alpha(i11) * f18)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(jVar.f4281c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f8 = 255.0f;
                            i9 = 16777215;
                        }
                        D4.i iVar2 = jVar.f4260d;
                        if (((Shader) iVar2.f1583q) != null || iVar2.f1582p != 0) {
                            if (this.f4286d == null) {
                                Paint paint3 = new Paint(1);
                                this.f4286d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f4286d;
                            Paint.Join join = jVar.f4267m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = jVar.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(jVar.f4268n);
                            Shader shader2 = (Shader) iVar2.f1583q;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix3);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(jVar.f4263g * f8));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i12 = iVar2.f1582p;
                                float f19 = jVar.f4263g;
                                PorterDuff.Mode mode2 = q.f4307x;
                                paint4.setColor((i12 & i9) | (((int) (Color.alpha(i12) * f19)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(jVar.f4261e * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                c7 = 1;
                i10++;
                kVar2 = kVar;
                c8 = c7;
                c9 = 0;
            }
            c7 = c8;
            i10++;
            kVar2 = kVar;
            c8 = c7;
            c9 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f7) {
        setRootAlpha((int) (f7 * 255.0f));
    }

    public void setRootAlpha(int i7) {
        this.l = i7;
    }

    public n(n nVar) {
        this.f4285c = new Matrix();
        this.h = 0.0f;
        this.f4290i = 0.0f;
        this.f4291j = 0.0f;
        this.f4292k = 0.0f;
        this.l = 255;
        this.f4293m = null;
        this.f4294n = null;
        C1450e c1450e = new C1450e(0);
        this.f4295o = c1450e;
        this.f4289g = new k(nVar.f4289g, c1450e);
        this.f4283a = new Path(nVar.f4283a);
        this.f4284b = new Path(nVar.f4284b);
        this.h = nVar.h;
        this.f4290i = nVar.f4290i;
        this.f4291j = nVar.f4291j;
        this.f4292k = nVar.f4292k;
        this.l = nVar.l;
        this.f4293m = nVar.f4293m;
        String str = nVar.f4293m;
        if (str != null) {
            c1450e.put(str, this);
        }
        this.f4294n = nVar.f4294n;
    }
}
