package s0;

import A2.AbstractC0002c;
import R0.C0415x;
import Y0.q;
import android.graphics.Rect;
import android.view.autofill.AutofillId;
import k.I;
import t.z;

/* JADX INFO: loaded from: classes.dex */
public final class c extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f15824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f15825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0415x f15826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z0.a f15827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f15828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f15829f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AutofillId f15830g;
    public final z h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15831i;

    public c(I i7, q qVar, C0415x c0415x, Z0.a aVar, String str) {
        this.f15824a = i7;
        this.f15825b = qVar;
        this.f15826c = c0415x;
        this.f15827d = aVar;
        this.f15828e = str;
        c0415x.setImportantForAutofill(1);
        U0.a aVarF = N5.d.F(c0415x);
        AutofillId autofillIdO = aVarF != null ? AbstractC0002c.o(aVarF.f7026a) : null;
        if (autofillIdO == null) {
            throw n1.c.p("Required value was null.");
        }
        this.f15830g = autofillIdO;
        this.h = new z();
    }
}
