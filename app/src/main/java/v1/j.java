package V1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class j implements TextWatcher {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EditText f7407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f7408p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f7409q = true;

    public j(EditText editText) {
        this.f7407o = editText;
    }

    public static void a(EditText editText, int i7) {
        int length;
        if (i7 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            T1.j jVarA = T1.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = editableText.length();
            }
            jVarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i8, int i9) throws Throwable {
        EditText editText = this.f7407o;
        if (!editText.isInEditMode() && this.f7409q && T1.j.d() && i8 <= i9 && (charSequence instanceof Spannable)) {
            int iC = T1.j.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    T1.j.a().g(i7, i9 + i7, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            T1.j jVarA = T1.j.a();
            if (this.f7408p == null) {
                this.f7408p = new i(editText);
            }
            jVarA.h(this.f7408p);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i8, int i9) {
    }
}
