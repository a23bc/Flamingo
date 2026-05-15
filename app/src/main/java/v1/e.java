package V1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InputFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f7398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f7399b;

    public e(TextView textView) {
        this.f7398a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i7, int i8, Spanned spanned, int i9, int i10) {
        TextView textView = this.f7398a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iC = T1.j.a().c();
        if (iC != 0) {
            if (iC == 1) {
                if ((i10 == 0 && i9 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i7 != 0 || i8 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i7, i8);
                }
                return T1.j.a().g(0, charSequence.length(), 0, charSequence);
            }
            if (iC != 3) {
                return charSequence;
            }
        }
        T1.j jVarA = T1.j.a();
        if (this.f7399b == null) {
            this.f7399b = new d(textView, this);
        }
        jVarA.h(this.f7399b);
        return charSequence;
    }
}
