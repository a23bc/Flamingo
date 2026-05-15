package X;

import A2.AbstractC0002c;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import b1.AbstractC0607C;
import d5.EnumC0830a;
import e5.AbstractC0871i;
import m5.AbstractC1209k;

/* JADX INFO: renamed from: X.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0504x extends AbstractC0871i implements l5.e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public E5.d f8191o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0505y f8192p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f8193q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f8194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8195s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f8196t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ CharSequence f8197u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f8198v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0505y f8199w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0504x(long j3, C0505y c0505y, c5.d dVar, CharSequence charSequence) {
        super(2, dVar);
        this.f8197u = charSequence;
        this.f8198v = j3;
        this.f8199w = c0505y;
    }

    @Override // e5.AbstractC0863a
    public final c5.d create(Object obj, c5.d dVar) {
        C0504x c0504x = new C0504x(this.f8198v, this.f8199w, dVar, this.f8197u);
        c0504x.f8196t = obj;
        return c0504x;
    }

    @Override // l5.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0504x) create(AbstractC0002c.p(obj), (c5.d) obj2)).invokeSuspend(Y4.o.f8736a);
    }

    @Override // e5.AbstractC0863a
    public final Object invokeSuspend(Object obj) {
        long j3;
        E5.d dVar;
        CharSequence charSequence;
        TextSelection textSelectionL;
        C0505y c0505y;
        EnumC0830a enumC0830a = EnumC0830a.f11264o;
        int i7 = this.f8195s;
        if (i7 == 0) {
            android.support.v4.media.session.b.K(obj);
            TextClassifier textClassifierP = AbstractC0002c.p(this.f8196t);
            AbstractC0496q.y();
            long j7 = this.f8198v;
            int iF = b1.L.f(j7);
            int iE = b1.L.e(j7);
            CharSequence charSequence2 = this.f8197u;
            TextSelection.Request.Builder builderL = AbstractC0496q.l(charSequence2, iF, iE);
            C0505y c0505y2 = this.f8199w;
            TextSelection.Request.Builder defaultLocales = builderL.setDefaultLocales(c0505y2.b());
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifierP.suggestSelection(defaultLocales.build());
            long jB = AbstractC0607C.b(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i8 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f8194r = jB;
                this.f8195s = 2;
                if (C0505y.a(this.f8199w, this.f8197u, jB, textClassifierP, this) != enumC0830a) {
                    j3 = jB;
                }
            } else {
                this.f8196t = textSelectionSuggestSelection;
                E5.d dVar2 = c0505y2.f8209e;
                this.f8191o = dVar2;
                this.f8192p = c0505y2;
                this.f8193q = charSequence2;
                this.f8194r = jB;
                this.f8195s = 1;
                if (dVar2.d(this) != enumC0830a) {
                    dVar = dVar2;
                    charSequence = charSequence2;
                    textSelectionL = textSelectionSuggestSelection;
                    c0505y = c0505y2;
                    j3 = jB;
                    TextClassification textClassification = textSelectionL.getTextClassification();
                    AbstractC1209k.c(textClassification);
                    c0505y.f8211g.setValue(new y0(charSequence, j3, textClassification));
                }
            }
            return enumC0830a;
        }
        if (i7 == 1) {
            j3 = this.f8194r;
            charSequence = this.f8193q;
            c0505y = this.f8192p;
            dVar = this.f8191o;
            textSelectionL = r.l(this.f8196t);
            android.support.v4.media.session.b.K(obj);
            try {
                TextClassification textClassification2 = textSelectionL.getTextClassification();
                AbstractC1209k.c(textClassification2);
                c0505y.f8211g.setValue(new y0(charSequence, j3, textClassification2));
            } finally {
                dVar.f(null);
            }
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = this.f8194r;
            android.support.v4.media.session.b.K(obj);
        }
        return new b1.L(j3);
    }
}
