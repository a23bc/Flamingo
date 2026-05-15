package L3;

import j5.AbstractC1110d;
import y1.C1995d;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1995d[] f4279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4281c;

    public m() {
        this.f4279a = null;
        this.f4281c = 0;
    }

    public C1995d[] getPathData() {
        return this.f4279a;
    }

    public String getPathName() {
        return this.f4280b;
    }

    public void setPathData(C1995d[] c1995dArr) {
        if (!AbstractC1110d.r(this.f4279a, c1995dArr)) {
            this.f4279a = AbstractC1110d.v(c1995dArr);
            return;
        }
        C1995d[] c1995dArr2 = this.f4279a;
        for (int i7 = 0; i7 < c1995dArr.length; i7++) {
            c1995dArr2[i7].f20276a = c1995dArr[i7].f20276a;
            int i8 = 0;
            while (true) {
                float[] fArr = c1995dArr[i7].f20277b;
                if (i8 < fArr.length) {
                    c1995dArr2[i7].f20277b[i8] = fArr[i8];
                    i8++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f4279a = null;
        this.f4281c = 0;
        this.f4280b = mVar.f4280b;
        this.f4279a = AbstractC1110d.v(mVar.f4279a);
    }
}
