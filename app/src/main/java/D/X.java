package D;

import android.graphics.Matrix;
import android.graphics.Path;
import b1.C0616a;
import c1.C0724j;
import h1.AbstractC0996a;
import l5.InterfaceC1182c;
import y0.C1976i;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f1282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f1283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1284r;

    public /* synthetic */ X(Object obj, int i7, int i8, int i9) {
        this.f1281o = i9;
        this.f1282p = obj;
        this.f1283q = i7;
        this.f1284r = i8;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f1281o) {
            case 0:
                O0.l0.h((O0.l0) obj, (O0.m0) this.f1282p, this.f1283q, this.f1284r);
                break;
            case 1:
                O0.l0.h((O0.l0) obj, (O0.m0) this.f1282p, this.f1283q, this.f1284r);
                break;
            default:
                b1.q qVar = (b1.q) obj;
                C0616a c0616a = qVar.f9996a;
                int iD = qVar.d(this.f1283q);
                int iD2 = qVar.d(this.f1284r);
                CharSequence charSequence = c0616a.f9956e;
                if (iD < 0 || iD > iD2 || iD2 > charSequence.length()) {
                    AbstractC0996a.a("start(" + iD + ") or end(" + iD2 + ") is out of range [0.." + charSequence.length() + "], or start > end!");
                }
                Path path = new Path();
                C0724j c0724j = c0616a.f9955d;
                c0724j.f10641f.getSelectionPath(iD, iD2, path);
                int i7 = c0724j.h;
                if (i7 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i7);
                }
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(qVar.f10001f)) & 4294967295L);
                Matrix matrix = new Matrix();
                matrix.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                path.transform(matrix);
                int i8 = (int) 0;
                ((C1976i) this.f1282p).f20241a.addPath(path, Float.intBitsToFloat(i8), Float.intBitsToFloat(i8));
                break;
        }
        return Y4.o.f8736a;
    }
}
