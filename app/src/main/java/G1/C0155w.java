package G1;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: G1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0155w extends AbstractC0157y {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2740s;

    public C0155w(int i7, Class cls, int i8, int i9, int i10) {
        this.f2740s = i10;
        this.f2742o = i7;
        this.f2745r = cls;
        this.f2744q = i8;
        this.f2743p = i9;
    }

    @Override // G1.AbstractC0157y
    public final Object d(View view) {
        switch (this.f2740s) {
            case 0:
                return Boolean.valueOf(D.c(view));
            case 1:
                return D.a(view);
            default:
                return Boolean.valueOf(D.b(view));
        }
    }

    @Override // G1.AbstractC0157y
    public final void e(View view, Object obj) {
        switch (this.f2740s) {
            case 0:
                D.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                D.e(view, (CharSequence) obj);
                break;
            default:
                D.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // G1.AbstractC0157y
    public final boolean h(Object obj, Object obj2) {
        switch (this.f2740s) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
