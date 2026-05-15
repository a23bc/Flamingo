package V1;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class i extends T1.g implements Runnable {

    /* JADX INFO: renamed from: o */
    public final WeakReference f7406o;

    public i(EditText editText) {
        this.f7406o = new WeakReference(editText);
    }

    @Override // T1.g
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f7406o.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.a((EditText) this.f7406o.get(), 1);
    }
}
