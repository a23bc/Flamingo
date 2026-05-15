package q;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: q.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1310e0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C1312f0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
