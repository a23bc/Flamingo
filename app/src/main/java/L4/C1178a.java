package l4;

import java.io.File;
import p4.l;

/* JADX INFO: renamed from: l4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1178a implements InterfaceC1179b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14251a;

    public C1178a(boolean z6) {
        this.f14251a = z6;
    }

    @Override // l4.InterfaceC1179b
    public final String a(Object obj, l lVar) {
        File file = (File) obj;
        if (!this.f14251a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
