package I1;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f3444a = new String[0];

    public static void a(EditorInfo editorInfo, CharSequence charSequence) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            b.a(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i7 >= 30) {
            b.a(editorInfo, charSequence);
            return;
        }
        int i8 = editorInfo.initialSelStart;
        int i9 = editorInfo.initialSelEnd;
        int i10 = i8 > i9 ? i9 : i8;
        if (i8 <= i9) {
            i8 = i9;
        }
        int length = charSequence.length();
        if (i10 < 0 || i8 > length) {
            b(editorInfo, null, 0, 0);
            return;
        }
        int i11 = editorInfo.inputType & 4095;
        if (i11 == 129 || i11 == 225 || i11 == 18) {
            b(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            b(editorInfo, charSequence, i10, i8);
            return;
        }
        int i12 = i8 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int iMin = Math.min(charSequence.length() - i8, i14 - Math.min(i10, (int) (((double) i14) * 0.8d)));
        int iMin2 = Math.min(i10, i14 - iMin);
        int i15 = i10 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i15))) {
            i15++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i8 + iMin) - 1))) {
            iMin--;
        }
        int i16 = iMin2 + i13;
        b(editorInfo, i13 != i12 ? TextUtils.concat(charSequence.subSequence(i15, i15 + iMin2), charSequence.subSequence(i8, iMin + i8)) : charSequence.subSequence(i15, i16 + iMin + i15), iMin2, i16);
    }

    public static void b(EditorInfo editorInfo, CharSequence charSequence, int i7, int i8) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i7);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i8);
    }
}
