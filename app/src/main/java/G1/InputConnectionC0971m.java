package g1;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: g1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class InputConnectionC0971m implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B0.b f12369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V.v f12370b;

    public InputConnectionC0971m(V.v vVar, B0.b bVar) {
        this.f12369a = bVar;
        this.f12370b = vVar;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.clearMetaKeyStates(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() throws Exception {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            if (vVar != null) {
                a(vVar);
                this.f12370b = null;
            }
            this.f12369a.b(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.commitText(charSequence, i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.deleteSurroundingText(i7, i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.getCursorCapsMode(i7);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.getExtractedText(extractedTextRequest, i7);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.getSelectedText(i7);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i8) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.getTextAfterCursor(i7, i8);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i8) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.getTextBeforeCursor(i7, i8);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.performContextMenuAction(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i7) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.performEditorAction(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z6) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i7) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.requestCursorUpdates(i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i8) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.setComposingRegion(i7, i8);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.setComposingText(charSequence, i7);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        V.v vVar = this.f12370b;
        if (vVar != null) {
            return vVar.setSelection(i7, i8);
        }
        return false;
    }

    public void a(V.v vVar) {
    }
}
