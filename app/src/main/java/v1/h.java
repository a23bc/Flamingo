package V1;

import android.text.InputFilter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class h extends M3.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f7405c;

    public h(TextView textView) {
        this.f7405c = new g(textView);
    }

    @Override // M3.a
    public final InputFilter[] R(InputFilter[] inputFilterArr) {
        return !T1.j.d() ? inputFilterArr : this.f7405c.R(inputFilterArr);
    }

    @Override // M3.a
    public final void d0(boolean z6) {
        if (T1.j.d()) {
            this.f7405c.d0(z6);
        }
    }

    @Override // M3.a
    public final void e0(boolean z6) {
        boolean zD = T1.j.d();
        g gVar = this.f7405c;
        if (zD) {
            gVar.e0(z6);
        } else {
            gVar.f7404e = z6;
        }
    }
}
