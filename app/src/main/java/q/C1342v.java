package q;

import L2.C0247a;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import j.AbstractC1089a;

/* JADX INFO: renamed from: q.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1342v {

    /* JADX INFO: renamed from: a */
    public final TextView f15409a;

    /* JADX INFO: renamed from: b */
    public final C0247a f15410b;

    public C1342v(TextView textView) {
        this.f15409a = textView;
        this.f15410b = new C0247a(textView);
    }

    public final void a(AttributeSet attributeSet, int i7) {
        TypedArray typedArrayObtainStyledAttributes = this.f15409a.getContext().obtainStyledAttributes(attributeSet, AbstractC1089a.f13601i, i7, 0);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            c(z6);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z6) {
        ((M3.a) this.f15410b.f4105p).d0(z6);
    }

    public final void c(boolean z6) {
        ((M3.a) this.f15410b.f4105p).e0(z6);
    }
}
