package D;

import O0.InterfaceC0298b0;
import android.media.AudioManager;
import b1.C0613I;
import f0.C0886f0;
import l5.InterfaceC1180a;
import l5.InterfaceC1182c;
import m5.AbstractC1209k;
import t.C1443E;
import x0.C1893c;
import z.EnumC2048l0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements InterfaceC1182c {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f1370o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f1371p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f1372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f1373r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f1374s;

    public /* synthetic */ p0(int i7, int i8, Object obj, Object obj2, Object obj3) {
        this.f1370o = i8;
        this.f1372q = obj;
        this.f1373r = obj2;
        this.f1374s = obj3;
        this.f1371p = i7;
    }

    @Override // l5.InterfaceC1182c
    public final Object b(Object obj) {
        switch (this.f1370o) {
            case 0:
                O0.l0 l0Var = (O0.l0) obj;
                O0.m0[] m0VarArr = (O0.m0[]) this.f1372q;
                int length = m0VarArr.length;
                int i7 = 0;
                int i8 = 0;
                while (i7 < length) {
                    O0.m0 m0Var = m0VarArr[i7];
                    int i9 = i8 + 1;
                    AbstractC1209k.c(m0Var);
                    Object objI = m0Var.i();
                    n0 n0Var = objI instanceof n0 ? (n0) objI : null;
                    q0 q0Var = (q0) this.f1373r;
                    q0Var.getClass();
                    AbstractC0060d abstractC0060d = n0Var != null ? n0Var.f1357c : null;
                    int i10 = this.f1371p;
                    O0.l0.h(l0Var, m0Var, ((int[]) this.f1374s)[i8], abstractC0060d != null ? abstractC0060d.e(i10 - m0Var.f5417p, n1.n.f14521o) : q0Var.f1383b.a(0, i10 - m0Var.f5417p));
                    i7++;
                    i8 = i9;
                }
                return Y4.o.f8736a;
            case 1:
                O0.l0 l0Var2 = (O0.l0) obj;
                M.P p7 = (M.P) this.f1372q;
                int i11 = p7.f4433b;
                M.E0 e02 = (M.E0) p7.f4435d.a();
                C0613I c0613i = e02 != null ? e02.f4386a : null;
                boolean z6 = ((InterfaceC0298b0) this.f1373r).getLayoutDirection() == n1.n.f14522p;
                O0.m0 m0Var2 = (O0.m0) this.f1374s;
                C1893c c1893cI = M.V.i(l0Var2, i11, p7.f4434c, c0613i, z6, m0Var2.f5416o);
                EnumC2048l0 enumC2048l0 = EnumC2048l0.f20895p;
                int i12 = m0Var2.f5416o;
                M.B0 b0 = p7.f4432a;
                b0.a(enumC2048l0, c1893cI, this.f1371p, i12);
                O0.l0.j(l0Var2, m0Var2, Math.round(-b0.f4365a.h()), 0);
                return Y4.o.f8736a;
            case 2:
                if (obj == ((f0.G) this.f1372q)) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof p0.y) {
                    int i13 = ((n0.f) this.f1373r).f14486a - this.f1371p;
                    C1443E c1443e = (C1443E) this.f1374s;
                    int iD = c1443e.d(obj);
                    c1443e.h(Math.min(i13, iD >= 0 ? c1443e.f15979c[iD] : Integer.MAX_VALUE), obj);
                }
                return Y4.o.f8736a;
            default:
                float fFloatValue = ((Float) obj).floatValue();
                C0886f0 c0886f0 = (C0886f0) this.f1372q;
                AbstractC1209k.f(c0886f0, "$sliderPosition");
                AudioManager audioManager = (AudioManager) this.f1373r;
                AbstractC1209k.f(audioManager, "$audioManager");
                InterfaceC1180a interfaceC1180a = (InterfaceC1180a) this.f1374s;
                AbstractC1209k.f(interfaceC1180a, "$onSlider");
                c0886f0.j(fFloatValue / this.f1371p);
                audioManager.setStreamVolume(3, (int) fFloatValue, 0);
                interfaceC1180a.a();
                return Y4.o.f8736a;
        }
    }

    public /* synthetic */ p0(C0886f0 c0886f0, int i7, AudioManager audioManager, InterfaceC1180a interfaceC1180a) {
        this.f1370o = 3;
        this.f1372q = c0886f0;
        this.f1371p = i7;
        this.f1373r = audioManager;
        this.f1374s = interfaceC1180a;
    }

    public /* synthetic */ p0(O0.m0[] m0VarArr, q0 q0Var, int i7, int[] iArr) {
        this.f1370o = 0;
        this.f1372q = m0VarArr;
        this.f1373r = q0Var;
        this.f1371p = i7;
        this.f1374s = iArr;
    }
}
