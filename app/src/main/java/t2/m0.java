package t2;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class m0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public HashMap f16526A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public HashSet f16527B;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16532e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16533f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16534g;
    public int h;
    public E4.b0 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public E4.b0 f16539n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16540o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public E4.b0 f16543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l0 f16544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public E4.b0 f16545t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16546u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16547v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f16548w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f16549x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16550y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f16551z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16528a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16529b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16530c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16531d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16535i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16536j = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16537k = true;

    public m0() {
        E4.G g6 = E4.I.f1870p;
        E4.b0 b0Var = E4.b0.f1913s;
        this.l = b0Var;
        this.f16538m = 0;
        this.f16539n = b0Var;
        this.f16540o = 0;
        this.f16541p = Integer.MAX_VALUE;
        this.f16542q = Integer.MAX_VALUE;
        this.f16543r = b0Var;
        this.f16544s = l0.f16515d;
        this.f16545t = b0Var;
        this.f16546u = 0;
        this.f16547v = 0;
        this.f16548w = false;
        this.f16549x = false;
        this.f16550y = false;
        this.f16551z = false;
        this.f16526A = new HashMap();
        this.f16527B = new HashSet();
    }

    public static E4.b0 e(String[] strArr) {
        E4.F fO = E4.I.o();
        for (String str : strArr) {
            str.getClass();
            fO.a(w2.t.E(str));
        }
        return fO.f();
    }

    public void a(j0 j0Var) {
        this.f16526A.put(j0Var.f16497a, j0Var);
    }

    public n0 b() {
        return new n0(this);
    }

    public m0 c() {
        this.f16526A.clear();
        return this;
    }

    public final void d(n0 n0Var) {
        this.f16528a = n0Var.f16584a;
        this.f16529b = n0Var.f16585b;
        this.f16530c = n0Var.f16586c;
        this.f16531d = n0Var.f16587d;
        this.f16532e = n0Var.f16588e;
        this.f16533f = n0Var.f16589f;
        this.f16534g = n0Var.f16590g;
        this.h = n0Var.h;
        this.f16535i = n0Var.f16591i;
        this.f16536j = n0Var.f16592j;
        this.f16537k = n0Var.f16593k;
        this.l = n0Var.l;
        this.f16538m = n0Var.f16594m;
        this.f16539n = n0Var.f16595n;
        this.f16540o = n0Var.f16596o;
        this.f16541p = n0Var.f16597p;
        this.f16542q = n0Var.f16598q;
        this.f16543r = n0Var.f16599r;
        this.f16544s = n0Var.f16600s;
        this.f16545t = n0Var.f16601t;
        this.f16546u = n0Var.f16602u;
        this.f16547v = n0Var.f16603v;
        this.f16548w = n0Var.f16604w;
        this.f16549x = n0Var.f16605x;
        this.f16550y = n0Var.f16606y;
        this.f16551z = n0Var.f16607z;
        this.f16527B = new HashSet(n0Var.f16583B);
        this.f16526A = new HashMap(n0Var.f16582A);
    }

    public m0 f(int i7, int i8) {
        this.f16535i = i7;
        this.f16536j = i8;
        this.f16537k = true;
        return this;
    }
}
