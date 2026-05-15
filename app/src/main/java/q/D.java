package q;

import G1.C0137d;
import G1.InterfaceC0136c;
import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0136c bVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                bVar = new A.b(clipData, 3);
            } else {
                C0137d c0137d = new C0137d(0);
                c0137d.f2693p = clipData;
                c0137d.f2694q = 3;
                bVar = c0137d;
            }
            G1.I.f(textView, bVar.a());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0136c bVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            bVar = new A.b(clipData, 3);
        } else {
            C0137d c0137d = new C0137d(0);
            c0137d.f2693p = clipData;
            c0137d.f2694q = 3;
            bVar = c0137d;
        }
        G1.I.f(view, bVar.a());
        return true;
    }
}
