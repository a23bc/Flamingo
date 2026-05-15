package P;

import Z1.l;
import android.view.textclassifier.TextClassification;

/* JADX INFO: loaded from: classes.dex */
public final class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClassification f5699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5700c;

    public h(Object obj, TextClassification textClassification, int i7) {
        super(obj);
        this.f5699b = textClassification;
        this.f5700c = i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.f5687a);
        sb.append(", textClassification=");
        sb.append(this.f5699b);
        sb.append(", index=");
        return l.r(sb, this.f5700c, ')');
    }
}
