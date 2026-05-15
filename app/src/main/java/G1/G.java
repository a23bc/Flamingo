package G1;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0139f b(View view, C0139f c0139f) {
        ContentInfo contentInfoL = c0139f.f2708a.l();
        Objects.requireNonNull(contentInfoL);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoL);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoL ? c0139f : new C0139f(new A.b(contentInfoPerformReceiveContent));
    }
}
