package androidx.glance.appwidget.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0574w extends IOException {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9658o;

    public static C0574w a() {
        return new C0574w("Protocol message had invalid UTF-8.");
    }

    public static C0573v b() {
        return new C0573v("Protocol message tag had invalid wire type.");
    }

    public static C0574w c() {
        return new C0574w("CodedInputStream encountered a malformed varint.");
    }

    public static C0574w d() {
        return new C0574w("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0574w e() {
        return new C0574w("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
