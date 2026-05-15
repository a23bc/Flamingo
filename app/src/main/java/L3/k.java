package L3;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import t.C1450e;

/* JADX INFO: loaded from: classes.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a */
    public final Matrix f4269a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f4270b;

    /* JADX INFO: renamed from: c */
    public float f4271c;

    /* JADX INFO: renamed from: d */
    public float f4272d;

    /* JADX INFO: renamed from: e */
    public float f4273e;

    /* JADX INFO: renamed from: f */
    public float f4274f;

    /* JADX INFO: renamed from: g */
    public float f4275g;
    public float h;

    /* JADX INFO: renamed from: i */
    public float f4276i;

    /* JADX INFO: renamed from: j */
    public final Matrix f4277j;

    /* JADX INFO: renamed from: k */
    public String f4278k;

    public k() {
        this.f4269a = new Matrix();
        this.f4270b = new ArrayList();
        this.f4271c = 0.0f;
        this.f4272d = 0.0f;
        this.f4273e = 0.0f;
        this.f4274f = 1.0f;
        this.f4275g = 1.0f;
        this.h = 0.0f;
        this.f4276i = 0.0f;
        this.f4277j = new Matrix();
        this.f4278k = null;
    }

    @Override // L3.l
    public final boolean a() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f4270b;
            if (i7 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(i7)).a()) {
                return true;
            }
            i7++;
        }
    }

    @Override // L3.l
    public final boolean b(int[] iArr) {
        int i7 = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.f4270b;
            if (i7 >= arrayList.size()) {
                return zB;
            }
            zB |= ((l) arrayList.get(i7)).b(iArr);
            i7++;
        }
    }

    public final void c() {
        Matrix matrix = this.f4277j;
        matrix.reset();
        matrix.postTranslate(-this.f4272d, -this.f4273e);
        matrix.postScale(this.f4274f, this.f4275g);
        matrix.postRotate(this.f4271c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.f4272d, this.f4276i + this.f4273e);
    }

    public String getGroupName() {
        return this.f4278k;
    }

    public Matrix getLocalMatrix() {
        return this.f4277j;
    }

    public float getPivotX() {
        return this.f4272d;
    }

    public float getPivotY() {
        return this.f4273e;
    }

    public float getRotation() {
        return this.f4271c;
    }

    public float getScaleX() {
        return this.f4274f;
    }

    public float getScaleY() {
        return this.f4275g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.f4276i;
    }

    public void setPivotX(float f7) {
        if (f7 != this.f4272d) {
            this.f4272d = f7;
            c();
        }
    }

    public void setPivotY(float f7) {
        if (f7 != this.f4273e) {
            this.f4273e = f7;
            c();
        }
    }

    public void setRotation(float f7) {
        if (f7 != this.f4271c) {
            this.f4271c = f7;
            c();
        }
    }

    public void setScaleX(float f7) {
        if (f7 != this.f4274f) {
            this.f4274f = f7;
            c();
        }
    }

    public void setScaleY(float f7) {
        if (f7 != this.f4275g) {
            this.f4275g = f7;
            c();
        }
    }

    public void setTranslateX(float f7) {
        if (f7 != this.h) {
            this.h = f7;
            c();
        }
    }

    public void setTranslateY(float f7) {
        if (f7 != this.f4276i) {
            this.f4276i = f7;
            c();
        }
    }

    public k(k kVar, C1450e c1450e) {
        m iVar;
        this.f4269a = new Matrix();
        this.f4270b = new ArrayList();
        this.f4271c = 0.0f;
        this.f4272d = 0.0f;
        this.f4273e = 0.0f;
        this.f4274f = 1.0f;
        this.f4275g = 1.0f;
        this.h = 0.0f;
        this.f4276i = 0.0f;
        Matrix matrix = new Matrix();
        this.f4277j = matrix;
        this.f4278k = null;
        this.f4271c = kVar.f4271c;
        this.f4272d = kVar.f4272d;
        this.f4273e = kVar.f4273e;
        this.f4274f = kVar.f4274f;
        this.f4275g = kVar.f4275g;
        this.h = kVar.h;
        this.f4276i = kVar.f4276i;
        String str = kVar.f4278k;
        this.f4278k = str;
        if (str != null) {
            c1450e.put(str, this);
        }
        matrix.set(kVar.f4277j);
        ArrayList arrayList = kVar.f4270b;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            Object obj = arrayList.get(i7);
            if (obj instanceof k) {
                this.f4270b.add(new k((k) obj, c1450e));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    j jVar2 = new j(jVar);
                    jVar2.f4261e = 0.0f;
                    jVar2.f4263g = 1.0f;
                    jVar2.h = 1.0f;
                    jVar2.f4264i = 0.0f;
                    jVar2.f4265j = 1.0f;
                    jVar2.f4266k = 0.0f;
                    jVar2.l = Paint.Cap.BUTT;
                    jVar2.f4267m = Paint.Join.MITER;
                    jVar2.f4268n = 4.0f;
                    jVar2.f4260d = jVar.f4260d;
                    jVar2.f4261e = jVar.f4261e;
                    jVar2.f4263g = jVar.f4263g;
                    jVar2.f4262f = jVar.f4262f;
                    jVar2.f4281c = jVar.f4281c;
                    jVar2.h = jVar.h;
                    jVar2.f4264i = jVar.f4264i;
                    jVar2.f4265j = jVar.f4265j;
                    jVar2.f4266k = jVar.f4266k;
                    jVar2.l = jVar.l;
                    jVar2.f4267m = jVar.f4267m;
                    jVar2.f4268n = jVar.f4268n;
                    iVar = jVar2;
                } else if (obj instanceof i) {
                    iVar = new i((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f4270b.add(iVar);
                Object obj2 = iVar.f4280b;
                if (obj2 != null) {
                    c1450e.put(obj2, iVar);
                }
            }
        }
    }
}
