package V1;

import N2.z;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final EditText f7394a;

    /* JADX INFO: renamed from: b */
    public final z f7395b;

    public c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        z zVar = new z();
        super(inputConnection, false);
        this.f7394a = editText;
        this.f7395b = zVar;
        if (T1.j.d()) {
            T1.j.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        Editable editableText = this.f7394a.getEditableText();
        this.f7395b.getClass();
        return z.s(this, editableText, i7, i8, false) || super.deleteSurroundingText(i7, i8);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        Editable editableText = this.f7394a.getEditableText();
        this.f7395b.getClass();
        return z.s(this, editableText, i7, i8, true) || super.deleteSurroundingTextInCodePoints(i7, i8);
    }
}
