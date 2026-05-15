package P;

import Z1.l;
import l5.InterfaceC1182c;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1182c f5692d;

    public d(Object obj, String str, int i7, InterfaceC1182c interfaceC1182c) {
        super(obj);
        this.f5690b = str;
        this.f5691c = i7;
        this.f5692d = interfaceC1182c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.f5687a);
        sb.append(", label=\"");
        sb.append(this.f5690b);
        sb.append("\", leadingIcon=");
        return l.r(sb, this.f5691c, ')');
    }
}
