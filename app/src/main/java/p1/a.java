package p1;

import X.C0469c0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static String a(List list, String str, C0469c0 c0469c0, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String str2 = (i7 & 2) != 0 ? "" : "[\n\t";
        String str3 = (i7 & 4) == 0 ? "\n]" : "";
        if ((i7 & 32) != 0) {
            c0469c0 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            i8++;
            if (i8 > 1) {
                sb.append((CharSequence) str);
            }
            if (c0469c0 != null) {
                sb.append((CharSequence) c0469c0.b(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static final void b(String str) {
        throw new UnsupportedOperationException(str);
    }
}
