package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0550x extends IOException {
    public static C0550x a() {
        return new C0550x("Protocol message had invalid UTF-8.");
    }

    public static C0549w b() {
        return new C0549w("Protocol message tag had invalid wire type.");
    }

    public static C0550x c() {
        return new C0550x("CodedInputStream encountered a malformed varint.");
    }

    public static C0550x d() {
        return new C0550x("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0550x e() {
        return new C0550x("Failed to parse the message.");
    }

    public static C0550x f() {
        return new C0550x("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
