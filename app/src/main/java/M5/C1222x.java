package m5;

/* JADX INFO: renamed from: m5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1222x {
    public static String a(InterfaceC1206h interfaceC1206h) {
        String string = interfaceC1206h.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }
}
