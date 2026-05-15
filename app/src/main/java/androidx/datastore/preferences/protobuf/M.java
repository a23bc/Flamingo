package androidx.datastore.preferences.protobuf;

import d2.C0821i;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a */
    public static final a0 f9400a = new a0();

    /* JADX INFO: renamed from: b */
    public static final b0 f9401b = new b0();

    public static void a(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i7) throws C0550x {
        if (!h(b8)) {
            if ((((b8 + 112) + (b7 << 28)) >> 30) == 0 && !h(b9) && !h(b10)) {
                int i8 = ((b7 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
                cArr[i7] = (char) ((i8 >>> 10) + 55232);
                cArr[i7 + 1] = (char) ((i8 & 1023) + 56320);
                return;
            }
        }
        throw C0550x.a();
    }

    public static void b(byte b7, byte b8, char[] cArr, int i7) throws C0550x {
        if (b7 < -62 || h(b8)) {
            throw C0550x.a();
        }
        cArr[i7] = (char) (((b7 & 31) << 6) | (b8 & 63));
    }

    public static void c(byte b7, byte b8, byte b9, char[] cArr, int i7) throws C0550x {
        if (h(b8) || ((b7 == -32 && b8 < -96) || ((b7 == -19 && b8 >= -96) || h(b9)))) {
            throw C0550x.a();
        }
        cArr[i7] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
    }

    public static final String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char cCharAt = str.charAt(i7);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static String g(C0533f c0533f) {
        StringBuilder sb = new StringBuilder(c0533f.size());
        for (int i7 = 0; i7 < c0533f.size(); i7++) {
            byte b7 = c0533f.f9462p[i7];
            if (b7 == 34) {
                sb.append("\\\"");
            } else if (b7 == 39) {
                sb.append("\\'");
            } else if (b7 != 92) {
                switch (b7) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case C0821i.HASACTION_FIELD_NUMBER /* 9 */:
                        sb.append("\\t");
                        break;
                    case C0821i.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                        sb.append("\\n");
                        break;
                    case C0821i.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b7 < 32 || b7 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b7 >>> 6) & 3) + 48));
                            sb.append((char) (((b7 >>> 3) & 7) + 48));
                            sb.append((char) ((b7 & 7) + 48));
                        } else {
                            sb.append((char) b7);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean h(byte b7) {
        return b7 > -65;
    }

    public static final void j(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                j(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                j(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            C0533f c0533f = C0533f.f9459q;
            sb.append(g(new C0533f(((String) obj).getBytes(AbstractC0548v.f9521a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C0533f) {
            sb.append(": \"");
            sb.append(g((C0533f) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0546t) {
            sb.append(" {");
            k((AbstractC0546t) obj, sb, i7 + 2);
            sb.append("\n");
            while (i8 < i7) {
                sb.append(' ');
                i8++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i10 = i7 + 2;
        j(sb, i10, "key", entry.getKey());
        j(sb, i10, "value", entry.getValue());
        sb.append("\n");
        while (i8 < i7) {
            sb.append(' ');
            i8++;
        }
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(androidx.datastore.preferences.protobuf.AbstractC0546t r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.k(androidx.datastore.preferences.protobuf.t, java.lang.StringBuilder, int):void");
    }

    public abstract String e(byte[] bArr, int i7, int i8);

    public abstract int f(String str, byte[] bArr, int i7, int i8);

    public abstract int i(byte[] bArr, int i7, int i8);

    public abstract void l(byte[] bArr, int i7, int i8);
}
