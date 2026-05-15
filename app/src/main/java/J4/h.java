package j4;

import N2.z;
import S5.u;
import android.webkit.MimeTypeMap;
import java.io.File;
import m5.AbstractC1209k;
import u5.AbstractC1545g;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f13712a;

    public h(File file) {
        this.f13712a = file;
    }

    @Override // j4.g
    public final Object a(c5.d dVar) {
        String str = u.f6810p;
        File file = this.f13712a;
        g4.m mVar = new g4.m(z.o(file), S5.l.f6793a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String name = file.getName();
        AbstractC1209k.e(name, "getName(...)");
        return new m(mVar, singleton.getMimeTypeFromExtension(AbstractC1545g.p0(name, '.', "")), g4.f.f12510q);
    }
}
